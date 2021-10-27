/*
 * ao-oss-website - The oss.aoapps.com website.
 * Copyright (C) 2021  AO Industries, Inc.
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
 * along with ao-oss-website.  If not, see <http://www.gnu.org/licenses/>.
 */
module com.aoapps.oss.website {
	// Direct
	requires com.aoapps.appcluster.all.book; // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-all-book</artifactId>
	requires com.aoapps.appcluster.bom.book; // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-bom-book</artifactId>
	requires com.aoapps.appcluster.book; // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-book</artifactId>
	requires com.aoapps.appcluster.core.book; // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-core-book</artifactId>
	requires com.aoapps.appcluster.csync2.book; // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-csync2-book</artifactId>
	requires com.aoapps.appcluster.dnsonly.book; // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-dnsonly-book</artifactId>
	requires com.aoapps.appcluster.imap.book; // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-imap-book</artifactId>
	requires com.aoapps.appcluster.jdbc.book; // <groupId>com.aoapps</groupId><artifactId>ao-appcluster-jdbc-book</artifactId>
	requires com.aoapps.badges.book; // <groupId>com.aoapps</groupId><artifactId>ao-badges-book</artifactId>
	requires com.aoapps.collections.book; // <groupId>com.aoapps</groupId><artifactId>ao-collections-book</artifactId>
	requires com.aoapps.collections.transformers.book; // <groupId>com.aoapps</groupId><artifactId>ao-collections-transformers-book</artifactId>
	requires com.aoapps.concurrent.book; // <groupId>com.aoapps</groupId><artifactId>ao-concurrent-book</artifactId>
	requires com.aoapps.cron.book; // <groupId>com.aoapps</groupId><artifactId>ao-cron-book</artifactId>
	requires com.aoapps.dao.api.book; // <groupId>com.aoapps</groupId><artifactId>ao-dao-api-book</artifactId>
	requires com.aoapps.dao.base.book; // <groupId>com.aoapps</groupId><artifactId>ao-dao-base-book</artifactId>
	requires com.aoapps.dao.book; // <groupId>com.aoapps</groupId><artifactId>ao-dao-book</artifactId>
	requires com.aoapps.dao.dbc.book; // <groupId>com.aoapps</groupId><artifactId>ao-dao-dbc-book</artifactId>
	requires com.aoapps.dbc.book; // <groupId>com.aoapps</groupId><artifactId>ao-dbc-book</artifactId>
	requires com.aoapps.encoding.book; // <groupId>com.aoapps</groupId><artifactId>ao-encoding-book</artifactId>
	requires com.aoapps.encoding.servlet.book; // <groupId>com.aoapps</groupId><artifactId>ao-encoding-servlet-book</artifactId>
	requires com.aoapps.encoding.taglib.book; // <groupId>com.aoapps</groupId><artifactId>ao-encoding-taglib-book</artifactId>
	requires com.aoapps.error.pages.book; // <groupId>com.aoapps</groupId><artifactId>ao-error-pages-book</artifactId>
	requires com.aoapps.html.any.book; // <groupId>com.aoapps</groupId><artifactId>ao-fluent-html-any-book</artifactId>
	requires com.aoapps.html.book; // <groupId>com.aoapps</groupId><artifactId>ao-fluent-html-book</artifactId>
	requires com.aoapps.html.servlet.book; // <groupId>com.aoapps</groupId><artifactId>ao-fluent-html-servlet-book</artifactId>
	requires com.aoapps.html.util.book; // <groupId>com.aoapps</groupId><artifactId>ao-fluent-html-util-book</artifactId>
	requires com.aoapps.hodgepodge.book; // <groupId>com.aoapps</groupId><artifactId>ao-hodgepodge-book</artifactId>
	requires com.aoapps.io.buffer.book; // <groupId>com.aoapps</groupId><artifactId>ao-io-buffer-book</artifactId>
	requires com.aoapps.io.filesystems.book; // <groupId>com.aoapps</groupId><artifactId>ao-io-filesystems-book</artifactId>
	requires com.aoapps.io.filesystems.posix.book; // <groupId>com.aoapps</groupId><artifactId>ao-io-filesystems-posix-book</artifactId>
	requires com.aoapps.io.posix.book; // <groupId>com.aoapps</groupId><artifactId>ao-io-posix-book</artifactId>
	requires com.aoapps.javadoc.offline.book; // <groupId>com.aoapps</groupId><artifactId>ao-javadoc-offline-book</artifactId>
	requires com.aoapps.javadoc.resources.book; // <groupId>com.aoapps</groupId><artifactId>ao-javadoc-resources-book</artifactId>
	requires com.aoapps.lang.book; // <groupId>com.aoapps</groupId><artifactId>ao-lang-book</artifactId>
	requires com.aoapps.messaging.api.book; // <groupId>com.aoapps</groupId><artifactId>ao-messaging-api-book</artifactId>
	requires com.aoapps.messaging.base.book; // <groupId>com.aoapps</groupId><artifactId>ao-messaging-base-book</artifactId>
	requires com.aoapps.messaging.bom.book; // <groupId>com.aoapps</groupId><artifactId>ao-messaging-bom-book</artifactId>
	requires com.aoapps.messaging.book; // <groupId>com.aoapps</groupId><artifactId>ao-messaging-book</artifactId>
	requires com.aoapps.messaging.http.book; // <groupId>com.aoapps</groupId><artifactId>ao-messaging-http-book</artifactId>
	requires com.aoapps.messaging.http.client.book; // <groupId>com.aoapps</groupId><artifactId>ao-messaging-http-client-book</artifactId>
	requires com.aoapps.messaging.http.client.js.book; // <groupId>com.aoapps</groupId><artifactId>ao-messaging-http-client-js-book</artifactId>
	requires com.aoapps.messaging.http.servlet.book; // <groupId>com.aoapps</groupId><artifactId>ao-messaging-http-servlet-book</artifactId>
	requires com.aoapps.messaging.tcp.book; // <groupId>com.aoapps</groupId><artifactId>ao-messaging-tcp-book</artifactId>
	requires com.aoapps.messaging.tcp.client.book; // <groupId>com.aoapps</groupId><artifactId>ao-messaging-tcp-client-book</artifactId>
	requires com.aoapps.messaging.tcp.server.book; // <groupId>com.aoapps</groupId><artifactId>ao-messaging-tcp-server-book</artifactId>
	requires com.aoapps.mime.mappings.book; // <groupId>com.aoapps</groupId><artifactId>ao-mime-mappings-book</artifactId>
	requires com.aoapps.net.partialurl.book; // <groupId>com.aoapps</groupId><artifactId>ao-net-partial-url-book</artifactId>
	requires com.aoapps.net.partialurl.servlet.book; // <groupId>com.aoapps</groupId><artifactId>ao-net-partial-url-servlet-book</artifactId>
	requires com.aoapps.net.pathspace.book; // <groupId>com.aoapps</groupId><artifactId>ao-net-path-space-book</artifactId>
	requires com.aoapps.net.types.book; // <groupId>com.aoapps</groupId><artifactId>ao-net-types-book</artifactId>
	requires com.aoapps.oss.book; // <groupId>com.aoapps</groupId><artifactId>ao-oss-book</artifactId>
	requires com.aoapps.oss.parent.book; // <groupId>com.aoapps</groupId><artifactId>ao-oss-parent-book</artifactId>
	requires com.aoapps.payments.all.book; // <groupId>com.aoapps</groupId><artifactId>ao-payments-all-book</artifactId>
	requires com.aoapps.payments.api.book; // <groupId>com.aoapps</groupId><artifactId>ao-payments-api-book</artifactId>
	requires com.aoapps.payments.authorizeNet.book; // <groupId>com.aoapps</groupId><artifactId>ao-payments-authorizeNet-book</artifactId>
	requires com.aoapps.payments.bom.book; // <groupId>com.aoapps</groupId><artifactId>ao-payments-bom-book</artifactId>
	requires com.aoapps.payments.book; // <groupId>com.aoapps</groupId><artifactId>ao-payments-book</artifactId>
	requires com.aoapps.payments.payflowPro.book; // <groupId>com.aoapps</groupId><artifactId>ao-payments-payflowPro-book</artifactId>
	requires com.aoapps.payments.stripe.book; // <groupId>com.aoapps</groupId><artifactId>ao-payments-stripe-book</artifactId>
	requires com.aoapps.payments.test.book; // <groupId>com.aoapps</groupId><artifactId>ao-payments-test-book</artifactId>
	requires com.aoapps.payments.usaepay.book; // <groupId>com.aoapps</groupId><artifactId>ao-payments-usaepay-book</artifactId>
	requires com.aoapps.persistence.book; // <groupId>com.aoapps</groupId><artifactId>ao-persistence-book</artifactId>
	requires com.aoapps.security.book; // <groupId>com.aoapps</groupId><artifactId>ao-security-book</artifactId>
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
	requires com.aoapps.servlet.util.book; // <groupId>com.aoapps</groupId><artifactId>ao-servlet-util-book</artifactId>
	requires com.aoapps.sql.book; // <groupId>com.aoapps</groupId><artifactId>ao-sql-book</artifactId>
	requires com.aoapps.sql.failfast.book; // <groupId>com.aoapps</groupId><artifactId>ao-sql-failfast-book</artifactId>
	requires com.aoapps.sql.pool.book; // <groupId>com.aoapps</groupId><artifactId>ao-sql-pool-book</artifactId>
	requires com.aoapps.sql.tracker.book; // <groupId>com.aoapps</groupId><artifactId>ao-sql-tracker-book</artifactId>
	requires com.aoapps.sql.wrapper.book; // <groupId>com.aoapps</groupId><artifactId>ao-sql-wrapper-book</artifactId>
	requires com.aoapps.style.book; // <groupId>com.aoapps</groupId><artifactId>ao-style-book</artifactId>
	requires com.aoapps.taglib.book; // <groupId>com.aoapps</groupId><artifactId>ao-taglib-book</artifactId>
	requires com.aoapps.tempfiles.book; // <groupId>com.aoapps</groupId><artifactId>ao-tempfiles-book</artifactId>
	requires com.aoapps.tempfiles.servlet.book; // <groupId>com.aoapps</groupId><artifactId>ao-tempfiles-servlet-book</artifactId>
	requires com.aoapps.tldparser.book; // <groupId>com.aoapps</groupId><artifactId>ao-tld-parser-book</artifactId>
	requires com.aoapps.tlds.book; // <groupId>com.aoapps</groupId><artifactId>ao-tlds-book</artifactId>
	requires com.aoapps.web.framework.book; // <groupId>com.aoapps</groupId><artifactId>ao-web-framework-book</artifactId>
	requires com.aoapps.web.resources.book; // <groupId>com.aoapps</groupId><artifactId>ao-web-resources-book</artifactId>
	requires com.aoapps.web.resources.optimizer.book; // <groupId>com.aoapps</groupId><artifactId>ao-web-resources-optimizer-book</artifactId>
	requires com.aoapps.web.resources.registry.book; // <groupId>com.aoapps</groupId><artifactId>ao-web-resources-registry-book</artifactId>
	requires com.aoapps.web.resources.renderer.book; // <groupId>com.aoapps</groupId><artifactId>ao-web-resources-renderer-book</artifactId>
	requires com.aoapps.web.resources.servlet.book; // <groupId>com.aoapps</groupId><artifactId>ao-web-resources-servlet-book</artifactId>
	requires com.aoapps.web.resources.taglib.book; // <groupId>com.aoapps</groupId><artifactId>ao-web-resources-taglib-book</artifactId>
	requires com.aoapps.javaee.webapi.bom.book; // <groupId>com.aoapps</groupId><artifactId>javaee-web-api-bom-book</artifactId>
	requires com.aoapps.pgp.keys.map.book; // <groupId>com.aoapps</groupId><artifactId>pgp-keys-map-book</artifactId>
	requires com.semanticcms.core.all; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-all</artifactId>
	requires com.semanticcms.news.all; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-all</artifactId>
	requires com.semanticcms.section.all; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-all</artifactId>
}
