/*
 * ao-oss-website - The oss.aoapps.com website.
 * Copyright (C) 2025  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of ao-oss-website.
 *
 * ao-oss-website is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ao-oss-website is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with ao-oss-website.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.aoapps.website;

import com.aoapps.net.EmptyURIParameters;
import com.aoapps.net.URIEncoder;
import com.aoapps.servlet.http.HttpServletUtil;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Redirects the old paths to new paths.
 *
 * <p>TODO: Or... have this be the 404 handler, and log 404's.
 *       and also record the last time a request was seen for each redirect, so it can be removed once no longer relevant.</p>
 *
 * <p>TODO: This should share a base class implementation, along with
 * <code>com.aoindustries.website.CompatibilityRedirect</code>, inside ao-servlet-util, possibly called
 * <code>MappedRedirectsFilter</code>.</p>
 *
 * @author  AO Industries, Inc.
 */
@WebFilter("/*")
public class CompatibilityRedirect implements Filter {

  /**
   * Mapping from context-relative path to context-relative new location.
   * This map is checked for exact matches only.
   *
   * @see  HttpServletRequest#getRequestURI()  These are matched on the non-decoded request
   */
  private static final Map<String, String> exactMap;

  /**
   * Mapping from context-relative path to context-relative new location.
   * This map is search sequentially for the first prefix match.  All of the
   * path after the prefix match will be appended to the redirect location.
   */
  private static final Map<String, String> prefixMap;

  static {
    final Map<String, String> exactx = new HashMap<>();
    final Map<String, String> prefix = new LinkedHashMap<>(); // Ordering matters for this one

    // 2025-11-22: /javaee-web-api-bom moved to /jakartaee-web-profile-bom
    exactx.put("/javaee-web-api-bom",  "/jakartaee-web-profile-bom");
    prefix.put("/javaee-web-api-bom/", "/jakartaee-web-profile-bom/*");

    // Store now that all initialized
    exactMap = exactx;
    prefixMap = prefix;
  }

  @Override
  public void init(FilterConfig fc) {
    // Do nothing
  }

  @Override
  public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
    if (req instanceof HttpServletRequest) {
      HttpServletRequest httpReq = (HttpServletRequest) req;
      String requestUri = httpReq.getRequestURI();
      String contextPath = URIEncoder.encodeURI(httpReq.getContextPath());
      if (requestUri.startsWith(contextPath + "/")) {
        String requestUriInContext = requestUri.substring(contextPath.length());
        String redirectTo;
        {
          // Check exact matches first
          redirectTo = exactMap.get(requestUriInContext);
          // Check for any prefix match if not yet found
          if (redirectTo == null) {
            for (Map.Entry<String, String> entry : prefixMap.entrySet()) {
              String prefix = entry.getKey();
              if (requestUriInContext.startsWith(prefix)) {
                String target = entry.getValue();
                if (target.endsWith("*")) {
                  redirectTo = target.substring(0, target.length() - 1) + requestUriInContext.substring(prefix.length());
                } else {
                  redirectTo = target;
                }
                break;
              }
            }
          }
        }
        if (
            redirectTo != null
                && (resp instanceof HttpServletResponse)
        ) {
          HttpServletResponse httpResp = (HttpServletResponse) resp;
          // Send permanent redirect
          String query = httpReq.getQueryString();
          if (query != null) {
            redirectTo += "?" + query;
          }
          HttpServletUtil.sendRedirect(
              HttpServletResponse.SC_MOVED_PERMANENTLY,
              httpReq,
              httpResp,
              redirectTo,
              EmptyURIParameters.getInstance(),
              true,
              false
          );
          return;
        }
      }
    }
    chain.doFilter(req, resp);
  }

  @Override
  public void destroy() {
    // Do nothing
  }
}
