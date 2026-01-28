#!/usr/bin/env groovy
/*
 * ao-oss-website - The oss.aoapps.com website.
 * Copyright (C) 2021, 2022, 2023, 2024, 2025, 2026  AO Industries, Inc.
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

// Parent, Extensions, Plugins, Direct and BOM Dependencies
binding.setVariable('upstreamProjects', [
  // Parent
  'parent', // <groupId>com.aoapps</groupId><artifactId>ao-oss-parent</artifactId>
  // Parent Plugin Dependencies (Avoid cyclic dependency)
  'pgp-keys-map', // <groupId>com.aoapps</groupId><artifactId>pgp-keys-map</artifactId>
  'javadoc-offline', // <groupId>com.aoapps</groupId><artifactId>ao-javadoc-offline</artifactId>
  'javadoc-resources', // <groupId>com.aoapps</groupId><artifactId>ao-javadoc-resources</artifactId>
  'ant-tasks', // <groupId>com.aoapps</groupId><artifactId>ao-ant-tasks</artifactId>
  'checkstyle-config', // <groupId>com.aoapps</groupId><artifactId>ao-checkstyle-config</artifactId>

  // "development" profile
  // Runtime Direct
  '../semanticcms-2.x/openfile/all', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-openfile-all</artifactId>
  '../semanticcms-2.x/view-all', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-view-all</artifactId>
  '../semanticcms-2.x/view-tree', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-view-tree</artifactId>
  '../semanticcms-2.x/view-what-links-here', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-view-what-links-here</artifactId>

  // "publish" profile
  // Dependencies for javadocs
  'ant-tasks', // <groupId>com.aoapps</groupId><artifactId>ao-ant-tasks</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.aoapps</groupId><artifactId>ao-appcluster-all</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.aoapps</groupId><artifactId>ao-appcluster-bom</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.aoapps</groupId><artifactId>ao-appcluster</artifactId><classifier>javadoc</classifier>
  'appcluster/core', // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-core</artifactId><classifier>javadoc</classifier>
  'appcluster/csync2', // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-csync2</artifactId><classifier>javadoc</classifier>
  'appcluster/dnsonly', // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-dnsonly</artifactId><classifier>javadoc</classifier>
  'appcluster/imap', // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-imap</artifactId><classifier>javadoc</classifier>
  'appcluster/jdbc', // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-jdbc</artifactId><classifier>javadoc</classifier>
  'badges', // <groupId>com.aoapps</groupId><artifactId>ao-badges</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.aoapps</groupId><artifactId>ao-cdn</artifactId><classifier>javadoc</classifier>
  'cdn/data', // <groupId>com.aoapps</groupId><artifactId>ao-cdn-data</artifactId><classifier>javadoc</classifier>
  'cdn/servlet', // <groupId>com.aoapps</groupId><artifactId>ao-cdn-servlet</artifactId><classifier>javadoc</classifier>
  'cdn/webapp', // <groupId>com.aoapps</groupId><artifactId>ao-cdn-webapp</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.aoapps</groupId><artifactId>ao-checkstyle-config</artifactId><classifier>javadoc</classifier>
  'collections', // <groupId>com.aoapps</groupId><artifactId>ao-collections</artifactId><classifier>javadoc</classifier>
  'collections-transformers', // <groupId>com.aoapps</groupId><artifactId>ao-collections-transformers</artifactId><classifier>javadoc</classifier>
  'concurrent', // <groupId>com.aoapps</groupId><artifactId>ao-concurrent</artifactId><classifier>javadoc</classifier>
  'cron', // <groupId>com.aoapps</groupId><artifactId>ao-cron</artifactId><classifier>javadoc</classifier>
  'dao/api', // <groupId>com.aoapps</groupId><artifactId>ao-dao-api</artifactId><classifier>javadoc</classifier>
  'dao/base', // <groupId>com.aoapps</groupId><artifactId>ao-dao-base</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.aoapps</groupId><artifactId>ao-dao</artifactId><classifier>javadoc</classifier>
  'dao/dbc', // <groupId>com.aoapps</groupId><artifactId>ao-dao-dbc</artifactId><classifier>javadoc</classifier>
  'dbc', // <groupId>com.aoapps</groupId><artifactId>ao-dbc</artifactId><classifier>javadoc</classifier>
  'encoding', // <groupId>com.aoapps</groupId><artifactId>ao-encoding</artifactId><classifier>javadoc</classifier>
  'encoding-servlet', // <groupId>com.aoapps</groupId><artifactId>ao-encoding-servlet</artifactId><classifier>javadoc</classifier>
  'encoding-taglib', // <groupId>com.aoapps</groupId><artifactId>ao-encoding-taglib</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.aoapps</groupId><artifactId>ao-error-pages</artifactId><classifier>javadoc</classifier>
  'fluent-html-any', // <groupId>com.aoapps</groupId><artifactId>ao-fluent-html-any</artifactId><classifier>javadoc</classifier>
  'fluent-html', // <groupId>com.aoapps</groupId><artifactId>ao-fluent-html</artifactId><classifier>javadoc</classifier>
  'fluent-html-servlet', // <groupId>com.aoapps</groupId><artifactId>ao-fluent-html-servlet</artifactId><classifier>javadoc</classifier>
  'fluent-html-util', // <groupId>com.aoapps</groupId><artifactId>ao-fluent-html-util</artifactId><classifier>javadoc</classifier>
  'hodgepodge', // <groupId>com.aoapps</groupId><artifactId>ao-hodgepodge</artifactId><classifier>javadoc</classifier>
  'io-buffer', // <groupId>com.aoapps</groupId><artifactId>ao-io-buffer</artifactId><classifier>javadoc</classifier>
  'io-filesystems', // <groupId>com.aoapps</groupId><artifactId>ao-io-filesystems</artifactId><classifier>javadoc</classifier>
  'io-filesystems-posix', // <groupId>com.aoapps</groupId><artifactId>ao-io-filesystems-posix</artifactId><classifier>javadoc</classifier>
  'io-posix', // <groupId>com.aoapps</groupId><artifactId>ao-io-posix</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.aoapps</groupId><artifactId>ao-javadoc-offline</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.aoapps</groupId><artifactId>ao-javadoc-resources</artifactId><classifier>javadoc</classifier>
  'lang', // <groupId>com.aoapps</groupId><artifactId>ao-lang</artifactId><classifier>javadoc</classifier>
  'messaging/api', // <groupId>com.aoapps</groupId><artifactId>ao-messaging-api</artifactId><classifier>javadoc</classifier>
  'messaging/base', // <groupId>com.aoapps</groupId><artifactId>ao-messaging-base</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.aoapps</groupId><artifactId>ao-messaging-bom</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.aoapps</groupId><artifactId>ao-messaging</artifactId><classifier>javadoc</classifier>
  'messaging/http', // <groupId>com.aoapps</groupId><artifactId>ao-messaging-http</artifactId><classifier>javadoc</classifier>
  'messaging/http-client', // <groupId>com.aoapps</groupId><artifactId>ao-messaging-http-client</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.aoapps</groupId><artifactId>ao-messaging-client-js</artifactId><classifier>javadoc</classifier>
  'messaging/http-servlet', // <groupId>com.aoapps</groupId><artifactId>ao-messaging-http-servlet</artifactId><classifier>javadoc</classifier>
  'messaging/tcp', // <groupId>com.aoapps</groupId><artifactId>ao-messaging-tcp</artifactId><classifier>javadoc</classifier>
  'messaging/tcp-client', // <groupId>com.aoapps</groupId><artifactId>ao-messaging-tcp-client</artifactId><classifier>javadoc</classifier>
  'messaging/tcp-server', // <groupId>com.aoapps</groupId><artifactId>ao-messaging-tcp-server</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.aoapps</groupId><artifactId>ao-mime-mappings</artifactId><classifier>javadoc</classifier>
  'net-partial-url', // <groupId>com.aoapps</groupId><artifactId>ao-net-partial-url</artifactId><classifier>javadoc</classifier>
  'net-partial-url-servlet', // <groupId>com.aoapps</groupId><artifactId>ao-net-partial-url-servlet</artifactId><classifier>javadoc</classifier>
  'net-path-space', // <groupId>com.aoapps</groupId><artifactId>ao-net-path-space</artifactId><classifier>javadoc</classifier>
  'net-types', // <groupId>com.aoapps</groupId><artifactId>ao-net-types</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.aoapps</groupId><artifactId>ao-oss</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.aoapps</groupId><artifactId>ao-oss-parent</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.aoapps</groupId><artifactId>ao-payments-all</artifactId><classifier>javadoc</classifier>
  'payments/api', // <groupId>com.aoapps</groupId><artifactId>ao-payments-api</artifactId><classifier>javadoc</classifier>
  'payments/authorizeNet', // <groupId>com.aoapps</groupId><artifactId>ao-payments-authorizeNet</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.aoapps</groupId><artifactId>ao-payments-bom</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.aoapps</groupId><artifactId>ao-payments</artifactId><classifier>javadoc</classifier>
  'payments/payflowPro', // <groupId>com.aoapps</groupId><artifactId>ao-payments-payflowPro</artifactId><classifier>javadoc</classifier>
  'payments/stripe', // <groupId>com.aoapps</groupId><artifactId>ao-payments-stripe</artifactId><classifier>javadoc</classifier>
  'payments/test', // <groupId>com.aoapps</groupId><artifactId>ao-payments-test</artifactId><classifier>javadoc</classifier>
  'payments/usaepay', // <groupId>com.aoapps</groupId><artifactId>ao-payments-usaepay</artifactId><classifier>javadoc</classifier>
  'persistence', // <groupId>com.aoapps</groupId><artifactId>ao-persistence</artifactId><classifier>javadoc</classifier>
  'security', // <groupId>com.aoapps</groupId><artifactId>ao-security</artifactId><classifier>javadoc</classifier>
  'servlet-filter', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-filter</artifactId><classifier>javadoc</classifier>
  'servlet-firewall/api', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall-api</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall-bom</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall</artifactId><classifier>javadoc</classifier>
  'servlet-firewall/filter', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall-filter</artifactId><classifier>javadoc</classifier>
  'servlet-firewall/path-space', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall-path-space</artifactId><classifier>javadoc</classifier>
  'servlet-firewall/rules', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall-rules</artifactId><classifier>javadoc</classifier>
  'servlet-firewall/virtual-hosts', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall-virtual-hosts</artifactId><classifier>javadoc</classifier>
  'servlet-firewall/virtual-hosts-path-space', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall-virtual-hosts-path-space</artifactId><classifier>javadoc</classifier>
  'servlet-firewall/webjars', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall-webjars</artifactId><classifier>javadoc</classifier>
  'servlet-last-modified', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-last-modified</artifactId><classifier>javadoc</classifier>
  'servlet-subrequest', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-subrequest</artifactId><classifier>javadoc</classifier>
  'servlet-util', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-util</artifactId><classifier>javadoc</classifier>
  'sql', // <groupId>com.aoapps</groupId><artifactId>ao-sql</artifactId><classifier>javadoc</classifier>
  'sql-failfast', // <groupId>com.aoapps</groupId><artifactId>ao-sql-failfast</artifactId><classifier>javadoc</classifier>
  'sql-pool', // <groupId>com.aoapps</groupId><artifactId>ao-sql-pool</artifactId><classifier>javadoc</classifier>
  'sql-tracker', // <groupId>com.aoapps</groupId><artifactId>ao-sql-tracker</artifactId><classifier>javadoc</classifier>
  'sql-wrapper', // <groupId>com.aoapps</groupId><artifactId>ao-sql-wrapper</artifactId><classifier>javadoc</classifier>
  'style', // <groupId>com.aoapps</groupId><artifactId>ao-style</artifactId><classifier>javadoc</classifier>
  'taglib', // <groupId>com.aoapps</groupId><artifactId>ao-taglib</artifactId><classifier>javadoc</classifier>
  'tempfiles', // <groupId>com.aoapps</groupId><artifactId>ao-tempfiles</artifactId><classifier>javadoc</classifier>
  'tempfiles-servlet', // <groupId>com.aoapps</groupId><artifactId>ao-tempfiles-servlet</artifactId><classifier>javadoc</classifier>
  'tld-parser', // <groupId>com.aoapps</groupId><artifactId>ao-tld-parser</artifactId><classifier>javadoc</classifier>
  'tlds', // <groupId>com.aoapps</groupId><artifactId>ao-tlds</artifactId><classifier>javadoc</classifier>
  'web-framework', // <groupId>com.aoapps</groupId><artifactId>ao-web-framework</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.aoapps</groupId><artifactId>ao-web-resources</artifactId><classifier>javadoc</classifier>
  'web-resources/optimizer', // <groupId>com.aoapps</groupId><artifactId>ao-web-resources-optimizer</artifactId><classifier>javadoc</classifier>
  'web-resources/registry', // <groupId>com.aoapps</groupId><artifactId>ao-web-resources-registry</artifactId><classifier>javadoc</classifier>
  'web-resources/renderer', // <groupId>com.aoapps</groupId><artifactId>ao-web-resources-renderer</artifactId><classifier>javadoc</classifier>
  'web-resources/servlet', // <groupId>com.aoapps</groupId><artifactId>ao-web-resources-servlet</artifactId><classifier>javadoc</classifier>
  'web-resources/taglib', // <groupId>com.aoapps</groupId><artifactId>ao-web-resources-taglib</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.aoapps</groupId><artifactId>jakartaee-web-profile-bom-book</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.aoapps</groupId><artifactId>pgp-keys-map</artifactId><classifier>javadoc</classifier>

  // Direct
  'ant-tasks-book', // <groupId>com.aoapps</groupId><artifactId>ao-ant-tasks-book</artifactId>
  'appcluster/all-book', // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-all-book</artifactId>
  'appcluster/bom-book', // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-bom-book</artifactId>
  'appcluster/book', // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-book</artifactId>
  'appcluster/core-book', // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-core-book</artifactId>
  'appcluster/csync2-book', // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-csync2-book</artifactId>
  'appcluster/dnsonly-book', // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-dnsonly-book</artifactId>
  'appcluster/imap-book', // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-imap-book</artifactId>
  'appcluster/jdbc-book', // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-jdbc-book</artifactId>
  'badges-book', // <groupId>com.aoapps</groupId><artifactId>ao-badges-book</artifactId>
  'cdn/book', // <groupId>com.aoapps</groupId><artifactId>ao-cdn-book</artifactId>
  'cdn/data-book', // <groupId>com.aoapps</groupId><artifactId>ao-cdn-data-book</artifactId>
  'cdn/servlet-book', // <groupId>com.aoapps</groupId><artifactId>ao-cdn-servlet-book</artifactId>
  'cdn/webapp-book', // <groupId>com.aoapps</groupId><artifactId>ao-cdn-webapp-book</artifactId>
  'checkstyle-config-book', // <groupId>com.aoapps</groupId><artifactId>ao-checkstyle-config-book</artifactId>
  'collections-book', // <groupId>com.aoapps</groupId><artifactId>ao-collections-book</artifactId>
  'collections-transformers-book', // <groupId>com.aoapps</groupId><artifactId>ao-collections-transformers-book</artifactId>
  'concurrent-book', // <groupId>com.aoapps</groupId><artifactId>ao-concurrent-book</artifactId>
  'cron-book', // <groupId>com.aoapps</groupId><artifactId>ao-cron-book</artifactId>
  'dao/api-book', // <groupId>com.aoapps</groupId><artifactId>ao-dao-api-book</artifactId>
  'dao/base-book', // <groupId>com.aoapps</groupId><artifactId>ao-dao-base-book</artifactId>
  'dao/book', // <groupId>com.aoapps</groupId><artifactId>ao-dao-book</artifactId>
  'dao/dbc-book', // <groupId>com.aoapps</groupId><artifactId>ao-dao-dbc-book</artifactId>
  'dbc-book', // <groupId>com.aoapps</groupId><artifactId>ao-dbc-book</artifactId>
  'encoding-book', // <groupId>com.aoapps</groupId><artifactId>ao-encoding-book</artifactId>
  'encoding-servlet-book', // <groupId>com.aoapps</groupId><artifactId>ao-encoding-servlet-book</artifactId>
  'encoding-taglib-book', // <groupId>com.aoapps</groupId><artifactId>ao-encoding-taglib-book</artifactId>
  'error-pages-book', // <groupId>com.aoapps</groupId><artifactId>ao-error-pages-book</artifactId>
  'fluent-html-any-book', // <groupId>com.aoapps</groupId><artifactId>ao-fluent-html-any-book</artifactId>
  'fluent-html-book', // <groupId>com.aoapps</groupId><artifactId>ao-fluent-html-book</artifactId>
  'fluent-html-servlet-book', // <groupId>com.aoapps</groupId><artifactId>ao-fluent-html-servlet-book</artifactId>
  'fluent-html-util-book', // <groupId>com.aoapps</groupId><artifactId>ao-fluent-html-util-book</artifactId>
  'hodgepodge-book', // <groupId>com.aoapps</groupId><artifactId>ao-hodgepodge-book</artifactId>
  'io-buffer-book', // <groupId>com.aoapps</groupId><artifactId>ao-io-buffer-book</artifactId>
  'io-filesystems-book', // <groupId>com.aoapps</groupId><artifactId>ao-io-filesystems-book</artifactId>
  'io-filesystems-posix-book', // <groupId>com.aoapps</groupId><artifactId>ao-io-filesystems-posix-book</artifactId>
  'io-posix-book', // <groupId>com.aoapps</groupId><artifactId>ao-io-posix-book</artifactId>
  'javadoc-offline-book', // <groupId>com.aoapps</groupId><artifactId>ao-javadoc-offline-book</artifactId>
  'javadoc-resources-book', // <groupId>com.aoapps</groupId><artifactId>ao-javadoc-resources-book</artifactId>
  'lang-book', // <groupId>com.aoapps</groupId><artifactId>ao-lang-book</artifactId>
  'messaging/api-book', // <groupId>com.aoapps</groupId><artifactId>ao-messaging-api-book</artifactId>
  'messaging/base-book', // <groupId>com.aoapps</groupId><artifactId>ao-messaging-base-book</artifactId>
  'messaging/bom-book', // <groupId>com.aoapps</groupId><artifactId>ao-messaging-bom-book</artifactId>
  'messaging/book', // <groupId>com.aoapps</groupId><artifactId>ao-messaging-book</artifactId>
  'messaging/http-book', // <groupId>com.aoapps</groupId><artifactId>ao-messaging-http-book</artifactId>
  'messaging/http-client-book', // <groupId>com.aoapps</groupId><artifactId>ao-messaging-http-client-book</artifactId>
  'messaging/http-client-js-book', // <groupId>com.aoapps</groupId><artifactId>ao-messaging-client-js-book</artifactId>
  'messaging/http-servlet-book', // <groupId>com.aoapps</groupId><artifactId>ao-messaging-http-servlet-book</artifactId>
  'messaging/tcp-book', // <groupId>com.aoapps</groupId><artifactId>ao-messaging-tcp-book</artifactId>
  'messaging/tcp-client-book', // <groupId>com.aoapps</groupId><artifactId>ao-messaging-tcp-client-book</artifactId>
  'messaging/tcp-server-book', // <groupId>com.aoapps</groupId><artifactId>ao-messaging-tcp-server-book</artifactId>
  'mime-mappings-book', // <groupId>com.aoapps</groupId><artifactId>ao-mime-mappings-book</artifactId>
  'net-partial-url-book', // <groupId>com.aoapps</groupId><artifactId>ao-net-partial-url-book</artifactId>
  'net-partial-url-servlet-book', // <groupId>com.aoapps</groupId><artifactId>ao-net-partial-url-servlet-book</artifactId>
  'net-path-space-book', // <groupId>com.aoapps</groupId><artifactId>ao-net-path-space-book</artifactId>
  'net-types', // <groupId>com.aoapps</groupId><artifactId>ao-net-types</artifactId>
  'net-types-book', // <groupId>com.aoapps</groupId><artifactId>ao-net-types-book</artifactId>
  'book', // <groupId>com.aoapps</groupId><artifactId>ao-oss-book</artifactId>
  'parent-book', // <groupId>com.aoapps</groupId><artifactId>ao-oss-parent-book</artifactId>
  'payments/all-book', // <groupId>com.aoapps</groupId><artifactId>ao-payments-all-book</artifactId>
  'payments/api-book', // <groupId>com.aoapps</groupId><artifactId>ao-payments-api-book</artifactId>
  'payments/authorizeNet-book', // <groupId>com.aoapps</groupId><artifactId>ao-payments-authorizeNet-book</artifactId>
  'payments/bom-book', // <groupId>com.aoapps</groupId><artifactId>ao-payments-bom-book</artifactId>
  'payments/book', // <groupId>com.aoapps</groupId><artifactId>ao-payments-book</artifactId>
  'payments/payflowPro-book', // <groupId>com.aoapps</groupId><artifactId>ao-payments-payflowPro-book</artifactId>
  'payments/stripe-book', // <groupId>com.aoapps</groupId><artifactId>ao-payments-stripe-book</artifactId>
  'payments/test-book', // <groupId>com.aoapps</groupId><artifactId>ao-payments-test-book</artifactId>
  'payments/usaepay-book', // <groupId>com.aoapps</groupId><artifactId>ao-payments-usaepay-book</artifactId>
  'persistence-book', // <groupId>com.aoapps</groupId><artifactId>ao-persistence-book</artifactId>
  'security-book', // <groupId>com.aoapps</groupId><artifactId>ao-security-book</artifactId>
  'servlet-filter-book', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-filter-book</artifactId>
  'servlet-firewall/api-book', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall-api-book</artifactId>
  'servlet-firewall/bom-book', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall-bom-book</artifactId>
  'servlet-firewall/book', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall-book</artifactId>
  'servlet-firewall/filter-book', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall-filter-book</artifactId>
  'servlet-firewall/path-space-book', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall-path-space-book</artifactId>
  'servlet-firewall/rules-book', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall-rules-book</artifactId>
  'servlet-firewall/virtual-hosts-book', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall-virtual-hosts-book</artifactId>
  'servlet-firewall/virtual-hosts-path-space-book', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall-virtual-hosts-path-space-book</artifactId>
  'servlet-firewall/webjars-book', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-firewall-webjars-book</artifactId>
  'servlet-last-modified-book', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-last-modified-book</artifactId>
  'servlet-subrequest-book', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-subrequest-book</artifactId>
  'servlet-util', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-util</artifactId>
  'servlet-util-book', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-util-book</artifactId>
  'sql-book', // <groupId>com.aoapps</groupId><artifactId>ao-sql-book</artifactId>
  'sql-failfast-book', // <groupId>com.aoapps</groupId><artifactId>ao-sql-failfast-book</artifactId>
  'sql-pool-book', // <groupId>com.aoapps</groupId><artifactId>ao-sql-pool-book</artifactId>
  'sql-tracker-book', // <groupId>com.aoapps</groupId><artifactId>ao-sql-tracker-book</artifactId>
  'sql-wrapper-book', // <groupId>com.aoapps</groupId><artifactId>ao-sql-wrapper-book</artifactId>
  'style-book', // <groupId>com.aoapps</groupId><artifactId>ao-style-book</artifactId>
  'taglib-book', // <groupId>com.aoapps</groupId><artifactId>ao-taglib-book</artifactId>
  'tempfiles-book', // <groupId>com.aoapps</groupId><artifactId>ao-tempfiles-book</artifactId>
  'tempfiles-servlet-book', // <groupId>com.aoapps</groupId><artifactId>ao-tempfiles-servlet-book</artifactId>
  'tld-parser-book', // <groupId>com.aoapps</groupId><artifactId>ao-tld-parser-book</artifactId>
  'tlds-book', // <groupId>com.aoapps</groupId><artifactId>ao-tlds-book</artifactId>
  'web-framework-book', // <groupId>com.aoapps</groupId><artifactId>ao-web-framework-book</artifactId>
  'web-resources/book', // <groupId>com.aoapps</groupId><artifactId>ao-web-resources-book</artifactId>
  'web-resources/optimizer-book', // <groupId>com.aoapps</groupId><artifactId>ao-web-resources-optimizer-book</artifactId>
  'web-resources/registry-book', // <groupId>com.aoapps</groupId><artifactId>ao-web-resources-registry-book</artifactId>
  'web-resources/renderer-book', // <groupId>com.aoapps</groupId><artifactId>ao-web-resources-renderer-book</artifactId>
  'web-resources/servlet-book', // <groupId>com.aoapps</groupId><artifactId>ao-web-resources-servlet-book</artifactId>
  'web-resources/taglib-book', // <groupId>com.aoapps</groupId><artifactId>ao-web-resources-taglib-book</artifactId>
  // No Jenkins: <groupId>jakarta.servlet</groupId><artifactId>jakarta.servlet-api</artifactId>
  'jakartaee-web-profile-bom-book', // <groupId>com.aoapps</groupId><artifactId>jakartaee-web-profile-bom-book</artifactId>
  'pgp-keys-map-book', // <groupId>com.aoapps</groupId><artifactId>pgp-keys-map-book</artifactId>
  '../semanticcms-2.x/core/all', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-all</artifactId>
  '../semanticcms-2.x/news/all', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-all</artifactId>
  '../semanticcms-2.x/section/all', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-all</artifactId>

  // Runtime Direct
  'mime-mappings', // <groupId>com.aoapps</groupId><artifactId>ao-mime-mappings</artifactId>
  'servlet-filter', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-filter</artifactId>
  '../semanticcms-2.x/google-analytics', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-google-analytics</artifactId>
  '../semanticcms-2.x/theme-documentation', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-theme-documentation</artifactId>

  // BOM
  'jakartaee-web-profile-bom', // <groupId>com.aoapps</groupId><artifactId>jakartaee-web-profile-bom</artifactId>
])

// Java 17
binding.setVariable('buildJdks', ['17', '21']) // Changes must be copied to matrix axes!
binding.setVariable('testJdks', ['17', '21']) // Changes must be copied to matrix axes!

/******************************************************************************************
 *                                                                                        *
 * Everything below this line is identical for all projects, except the copied matrix     *
 * axes and any "Begin .*custom" / "End .*custom" blocks (see filter_custom script).      *
 *                                                                                        *
 *****************************************************************************************/

// Load ao-jenkins-shared-library
// TODO: Put @Library on import once we have our first library class
// TODO: Replace master with a specific tag version number once working
@Library('ao@master') _
ao.setVariables(binding, currentBuild, scm, params)

pipeline {
  agent any
  options {
    ansiColor('xterm')
    disableConcurrentBuilds(abortPrevious: true)
    quietPeriod(quietPeriod)
    skipDefaultCheckout()
    timeout(time: PIPELINE_TIMEOUT, unit: TIMEOUT_UNIT)
    // Only allowed to copy build artifacts from self
    // See https://plugins.jenkins.io/copyartifact/
    copyArtifactPermission("/${JOB_NAME}")
  }
  parameters {
    string(
      name: 'BuildPriority',
      defaultValue: "$buildPriority",
      description: BuildPriority_description
    )
    booleanParam(
      name: 'abortOnUnreadyDependency',
      defaultValue: true,
      description: abortOnUnreadyDependency_description
    )
    booleanParam(
      name: 'requireLastBuild',
      defaultValue: true,
      description: requireLastBuild_description
    )
    booleanParam(
      name: 'mavenDebug',
      defaultValue: false,
      description: mavenDebug_description
    )
    choice(
      name: 'sonarQubeAnalysis',
      choices: sonarQubeAnalysis_choices,
      description: sonarQubeAnalysis_description
    )
  }
  triggers {
    upstream(
      threshold: hudson.model.Result.SUCCESS,
      upstreamProjects: "${prunedUpstreamProjects.join(', ')}"
    )
  }
  stages {
    stage('Setup') {
      steps {
        script {
          // Additional setup that cannot be done in options inside declarative pipeline
          ao.setupBuildDiscarder()
        }
      }
    }
    stage('Check Ready') {
      when {
        expression {
          return (params.abortOnUnreadyDependency == null) ? true : params.abortOnUnreadyDependency
        }
      }
      steps {
        script {
          ao.checkReadySteps()
        }
      }
    }
    stage('Workaround Git #27287') {
      when {
        expression {
          ao.continueCurrentBuild() && projectDir != '.' && fileExists('.gitmodules')
        }
      }
      steps {
        script {
          ao.workaroundGit27287Steps(scmUrl, scmBranch, scmBrowser, sparseCheckoutPaths, disableSubmodules)
        }
      }
    }
    stage('Checkout SCM') {
      when {
        expression {
          ao.continueCurrentBuild()
        }
      }
      steps {
        script {
          ao.checkoutScmSteps(projectDir, niceCmd, scmUrl, scmBranch, scmBrowser, sparseCheckoutPaths, disableSubmodules)
        }
      }
    }
    stage('Builds') {
      matrix {
        when {
          expression {
            ao.continueCurrentBuild()
          }
        }
        axes {
          axis {
            name 'jdk'
            values '17', '21' // buildJdks
          }
        }
        stages {
          stage('Build') {
            steps {
              script {
                ao.buildSteps(projectDir, niceCmd, maven, deployJdk, mavenOpts, mvnCommon, jdk, buildPhases, testWhenExpression, testJdks)
              }
            }
          }
        }
      }
    }
    stage('Tests') {
      matrix {
        when {
          expression {
            ao.continueCurrentBuild() && testWhenExpression.call()
          }
        }
        axes {
          axis {
            name 'jdk'
            values '17', '21' // buildJdks
          }
          axis {
            name 'testJdk'
            values '17', '21' // testJdks
          }
        }
        stages {
          stage('Test') {
            steps {
              script {
                ao.testSteps(projectDir, niceCmd, deployJdk, maven, mavenOpts, mvnCommon, jdk, testJdk)
              }
            }
          }
        }
      }
    }
    stage('Deploy') {
      when {
        expression {
          ao.continueCurrentBuild()
        }
      }
      steps {
        script {
          ao.deploySteps(projectDir, niceCmd, deployJdk, maven, mavenOpts, mvnCommon)
        }
      }
    }
    stage('SonarQube analysis') {
      when {
        expression {
          ao.continueCurrentBuild() && sonarqubeWhenExpression.call()
        }
      }
      steps {
        script {
          ao.sonarQubeAnalysisSteps(projectDir, niceCmd, deployJdk, maven, mavenOpts, mvnCommon)
        }
      }
    }
    stage('Quality Gate') {
      when {
        expression {
          ao.continueCurrentBuild() && sonarqubeWhenExpression.call()
        }
      }
      steps {
        script {
          ao.qualityGateSteps()
        }
      }
    }
    stage('Analysis') {
      when {
        expression {
          ao.continueCurrentBuild()
        }
      }
      steps {
        script {
          ao.analysisSteps()
        }
      }
    }
  }
  post {
    failure {
      script {
        ao.postFailure(failureEmailTo)
      }
    }
  }
}
