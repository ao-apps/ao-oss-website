/*
 * ao-oss-website - The oss.aoapps.com website.
 * Copyright (C) 2021, 2022, 2023, 2025  AO Industries, Inc.
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
module com.aoapps.oss.website {
  // Direct
  requires com.aoapps.ant.tasks.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-ant-tasks-book-javaee</artifactId>
  requires com.aoapps.appcluster.all.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-all-book-javaee</artifactId>
  requires com.aoapps.appcluster.bom.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-bom-book-javaee</artifactId>
  requires com.aoapps.appcluster.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-book-javaee</artifactId>
  requires com.aoapps.appcluster.core.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-core-book-javaee</artifactId>
  requires com.aoapps.appcluster.csync2.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-csync2-book-javaee</artifactId>
  requires com.aoapps.appcluster.dnsonly.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-dnsonly-book-javaee</artifactId>
  requires com.aoapps.appcluster.imap.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-imap-book-javaee</artifactId>
  requires com.aoapps.appcluster.jdbc.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-jdbc-book-javaee</artifactId>
  requires com.aoapps.badges.book; // <groupId>com.aoapps</groupId><artifactId>ao-badges-book</artifactId>
  requires com.aoapps.cdn.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-cdn-book-javaee</artifactId>
  requires com.aoapps.cdn.data.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-cdn-data-book-javaee</artifactId>
  requires com.aoapps.cdn.servlet.book; // <groupId>com.aoapps</groupId><artifactId>ao-cdn-servlet-book</artifactId>
  requires com.aoapps.cdn.webapp.book; // <groupId>com.aoapps</groupId><artifactId>ao-cdn-webapp-book</artifactId>
  requires com.aoapps.checkstyle.config.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-checkstyle-config-book-javaee</artifactId>
  requires com.aoapps.collections.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-collections-book-javaee</artifactId>
  requires com.aoapps.collections.transformers.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-collections-transformers-book-javaee</artifactId>
  requires com.aoapps.concurrent.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-concurrent-book-javaee</artifactId>
  requires com.aoapps.cron.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-cron-book-javaee</artifactId>
  requires com.aoapps.dao.api.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-dao-api-book-javaee</artifactId>
  requires com.aoapps.dao.base.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-dao-base-book-javaee</artifactId>
  requires com.aoapps.dao.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-dao-book-javaee</artifactId>
  requires com.aoapps.dao.dbc.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-dao-dbc-book-javaee</artifactId>
  requires com.aoapps.dbc.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-dbc-book-javaee</artifactId>
  requires com.aoapps.encoding.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-encoding-book-javaee</artifactId>
  requires com.aoapps.encoding.servlet.book; // <groupId>com.aoapps</groupId><artifactId>ao-encoding-servlet-book</artifactId>
  requires com.aoapps.encoding.taglib.book; // <groupId>com.aoapps</groupId><artifactId>ao-encoding-taglib-book</artifactId>
  requires com.aoapps.error.pages.book; // <groupId>com.aoapps</groupId><artifactId>ao-error-pages-book</artifactId>
  requires com.aoapps.html.any.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-fluent-html-any-book-javaee</artifactId>
  requires com.aoapps.html.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-fluent-html-book-javaee</artifactId>
  requires com.aoapps.html.servlet.book; // <groupId>com.aoapps</groupId><artifactId>ao-fluent-html-servlet-book</artifactId>
  requires com.aoapps.html.util.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-fluent-html-util-book-javaee</artifactId>
  requires com.aoapps.hodgepodge.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-hodgepodge-book-javaee</artifactId>
  requires com.aoapps.io.buffer.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-io-buffer-book-javaee</artifactId>
  requires com.aoapps.io.filesystems.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-io-filesystems-book-javaee</artifactId>
  requires com.aoapps.io.filesystems.posix.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-io-filesystems-posix-book-javaee</artifactId>
  requires com.aoapps.io.posix.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-io-posix-book-javaee</artifactId>
  requires com.aoapps.javadoc.offline.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-javadoc-offline-book-javaee</artifactId>
  requires com.aoapps.javadoc.resources.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-javadoc-resources-book-javaee</artifactId>
  requires com.aoapps.lang.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-lang-book-javaee</artifactId>
  requires com.aoapps.messaging.api.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-messaging-api-book-javaee</artifactId>
  requires com.aoapps.messaging.base.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-messaging-base-book-javaee</artifactId>
  requires com.aoapps.messaging.bom.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-messaging-bom-book-javaee</artifactId>
  requires com.aoapps.messaging.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-messaging-book-javaee</artifactId>
  requires com.aoapps.messaging.http.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-messaging-http-book-javaee</artifactId>
  requires com.aoapps.messaging.http.client.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-messaging-http-client-book-javaee</artifactId>
  requires com.aoapps.messaging.http.client.js.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-messaging-http-client-js-book-javaee</artifactId>
  requires com.aoapps.messaging.http.servlet.book; // <groupId>com.aoapps</groupId><artifactId>ao-messaging-http-servlet-book</artifactId>
  requires com.aoapps.messaging.tcp.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-messaging-tcp-book-javaee</artifactId>
  requires com.aoapps.messaging.tcp.client.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-messaging-tcp-client-book-javaee</artifactId>
  requires com.aoapps.messaging.tcp.server.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-messaging-tcp-server-book-javaee</artifactId>
  requires com.aoapps.mime.mappings.book; // <groupId>com.aoapps</groupId><artifactId>ao-mime-mappings-book</artifactId>
  requires com.aoapps.net.partialurl.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-net-partial-url-book-javaee</artifactId>
  requires com.aoapps.net.partialurl.servlet.book; // <groupId>com.aoapps</groupId><artifactId>ao-net-partial-url-servlet-book</artifactId>
  requires com.aoapps.net.pathspace.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-net-path-space-book-javaee</artifactId>
  requires com.aoapps.net.types; // <groupId>com.aoapps</groupId><artifactId>ao-net-types</artifactId>
  requires com.aoapps.net.types.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-net-types-book-javaee</artifactId>
  requires com.aoapps.oss.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-oss-book-javaee</artifactId>
  requires com.aoapps.oss.parent.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-oss-parent-book-javaee</artifactId>
  requires com.aoapps.payments.all.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-payments-all-book-javaee</artifactId>
  requires com.aoapps.payments.api.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-payments-api-book-javaee</artifactId>
  requires com.aoapps.payments.authorizeNet.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-payments-authorizeNet-book-javaee</artifactId>
  requires com.aoapps.payments.bom.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-payments-bom-book-javaee</artifactId>
  requires com.aoapps.payments.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-payments-book-javaee</artifactId>
  requires com.aoapps.payments.payflowPro.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-payments-payflowPro-book-javaee</artifactId>
  requires com.aoapps.payments.stripe.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-payments-stripe-book-javaee</artifactId>
  requires com.aoapps.payments.test.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-payments-test-book-javaee</artifactId>
  requires com.aoapps.payments.usaepay.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-payments-usaepay-book-javaee</artifactId>
  requires com.aoapps.persistence.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-persistence-book-javaee</artifactId>
  requires com.aoapps.security.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-security-book-javaee</artifactId>
  requires com.aoapps.servlet.filter.book; // <groupId>com.aoapps</groupId><artifactId>ao-servlet-filter-book</artifactId>
  requires com.aoapps.servlet.firewall.api.book; // <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall-api-book</artifactId>
  requires com.aoapps.servlet.firewall.bom.book; // <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall-bom-book</artifactId>
  requires com.aoapps.servlet.firewall.book; // <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall-book</artifactId>
  requires com.aoapps.servlet.firewall.filter.book; // <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall-filter-book</artifactId>
  requires com.aoapps.servlet.firewall.pathspace.book; // <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall-path-space-book</artifactId>
  requires com.aoapps.servlet.firewall.rules.book; // <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall-rules-book</artifactId>
  requires com.aoapps.servlet.firewall.virtualhosts.book; // <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall-virtual-hosts-book</artifactId>
  requires com.aoapps.servlet.firewall.virtualhosts.pathspace.book; // <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall-virtual-hosts-path-space-book</artifactId>
  requires com.aoapps.servlet.firewall.webjars.book; // <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall-webjars-book</artifactId>
  requires com.aoapps.servlet.lastmodified.book; // <groupId>com.aoapps</groupId><artifactId>ao-servlet-last-modified-book</artifactId>
  requires com.aoapps.servlet.subrequest.book; // <groupId>com.aoapps</groupId><artifactId>ao-servlet-subrequest-book</artifactId>
  requires com.aoapps.servlet.util; // <groupId>com.aoapps</groupId><artifactId>ao-servlet-util</artifactId>
  requires com.aoapps.servlet.util.book; // <groupId>com.aoapps</groupId><artifactId>ao-servlet-util-book</artifactId>
  requires com.aoapps.sql.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-sql-book-javaee</artifactId>
  requires com.aoapps.sql.failfast.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-sql-failfast-book-javaee</artifactId>
  requires com.aoapps.sql.pool.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-sql-pool-book-javaee</artifactId>
  requires com.aoapps.sql.tracker.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-sql-tracker-book-javaee</artifactId>
  requires com.aoapps.sql.wrapper.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-sql-wrapper-book-javaee</artifactId>
  requires com.aoapps.style.book; // <groupId>com.aoapps</groupId><artifactId>ao-style-book</artifactId>
  requires com.aoapps.taglib.book; // <groupId>com.aoapps</groupId><artifactId>ao-taglib-book</artifactId>
  requires com.aoapps.tempfiles.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-tempfiles-book-javaee</artifactId>
  requires com.aoapps.tempfiles.servlet.book; // <groupId>com.aoapps</groupId><artifactId>ao-tempfiles-servlet-book</artifactId>
  requires com.aoapps.tldparser.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-tld-parser-book-javaee</artifactId>
  requires com.aoapps.tlds.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-tlds-book-javaee</artifactId>
  requires com.aoapps.web.framework.book; // <groupId>com.aoapps</groupId><artifactId>ao-web-framework-book</artifactId>
  requires com.aoapps.web.resources.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-web-resources-book-javaee</artifactId>
  requires com.aoapps.web.resources.optimizer.book; // <groupId>com.aoapps</groupId><artifactId>ao-web-resources-optimizer-book</artifactId>
  requires com.aoapps.web.resources.registry.book.javaee; // <groupId>com.aoapps</groupId><artifactId>ao-web-resources-registry-book-javaee</artifactId>
  requires com.aoapps.web.resources.renderer.book; // <groupId>com.aoapps</groupId><artifactId>ao-web-resources-renderer-book</artifactId>
  requires com.aoapps.web.resources.servlet.book; // <groupId>com.aoapps</groupId><artifactId>ao-web-resources-servlet-book</artifactId>
  requires com.aoapps.web.resources.taglib.book; // <groupId>com.aoapps</groupId><artifactId>ao-web-resources-taglib-book</artifactId>
  requires com.aoapps.javaee.webapi.bom.book; // <groupId>com.aoapps</groupId><artifactId>javaee-web-api-bom-book</artifactId>
  requires javax.servlet.api; // <groupId>javax.servlet</groupId><artifactId>javax.servlet-api</artifactId>
  requires com.aoapps.pgp.keys.map.book.javaee; // <groupId>com.aoapps</groupId><artifactId>pgp-keys-map-book-javaee</artifactId>
  requires com.semanticcms.core.all; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-all</artifactId>
  requires com.semanticcms.news.all; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-all</artifactId>
  requires com.semanticcms.section.all; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-all</artifactId>
}
