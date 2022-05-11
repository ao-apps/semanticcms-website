/*
 * semanticcms-website - The semanticcms.com website.
 * Copyright (C) 2021, 2022  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of semanticcms-website.
 *
 * semanticcms-website is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * semanticcms-website is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with semanticcms-website.  If not, see <https://www.gnu.org/licenses/>.
 */
module com.semanticcms.website {
  requires com.aoapps.taglib; // <groupId>com.aoapps</groupId><artifactId>ao-taglib</artifactId>
  requires com.semanticcms.all.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-all-book</artifactId>
  requires com.semanticcms.autogit.all.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-autogit-all-book</artifactId>
  requires com.semanticcms.autogit.bom.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-autogit-bom-book</artifactId>
  requires com.semanticcms.autogit.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-autogit-book</artifactId>
  requires com.semanticcms.autogit.model.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-autogit-model-book</artifactId>
  requires com.semanticcms.autogit.servlet.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-autogit-servlet-book</artifactId>
  requires com.semanticcms.autogit.style.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-autogit-style-book</artifactId>
  requires com.semanticcms.autogit.taglib.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-autogit-taglib-book</artifactId>
  requires com.semanticcms.autogit.view.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-autogit-view-book</artifactId>
  requires com.semanticcms.bom.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-bom-book</artifactId>
  requires com.semanticcms.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-book</artifactId>
  requires com.semanticcms.changelog.taglib.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-changelog-taglib-book</artifactId>
  requires com.semanticcms.core.all; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-all</artifactId>
  requires com.semanticcms.core.all.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-all-book</artifactId>
  requires com.semanticcms.core.bom.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-bom-book</artifactId>
  requires com.semanticcms.core.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-book</artifactId>
  requires com.semanticcms.core.breadcrumblist.jsonld.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-breadcrumblist-json-ld-book</artifactId>
  requires com.semanticcms.core.canonical.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-canonical-book</artifactId>
  requires com.semanticcms.core.controller.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-controller-book</artifactId>
  requires com.semanticcms.core.docs.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-docs-book</artifactId>
  requires com.semanticcms.core.model.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-model-book</artifactId>
  requires com.semanticcms.core.pages.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-pages-book</artifactId>
  requires com.semanticcms.core.pages.jsp.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-pages-jsp-book</artifactId>
  requires com.semanticcms.core.pages.jspx.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-pages-jspx-book</artifactId>
  requires com.semanticcms.core.pages.local.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-pages-local-book</artifactId>
  requires com.semanticcms.core.pages.servlet.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-pages-servlet-book</artifactId>
  requires com.semanticcms.core.pages.union.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-pages-union-book</artifactId>
  requires com.semanticcms.core.renderer.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-renderer-book</artifactId>
  requires com.semanticcms.core.renderer.html.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-renderer-html-book</artifactId>
  requires com.semanticcms.core.renderer.servlet.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-renderer-servlet-book</artifactId>
  requires com.semanticcms.core.resources.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-resources-book</artifactId>
  requires com.semanticcms.core.resources.servlet.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-resources-servlet-book</artifactId>
  requires com.semanticcms.core.servlet.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-servlet-book</artifactId>
  requires com.semanticcms.core.sitemap.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-sitemap-book</artifactId>
  requires com.semanticcms.core.style.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-style-book</artifactId>
  requires com.semanticcms.core.taglib.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-taglib-book</artifactId>
  requires com.semanticcms.core.theme.base.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-theme-base-book</artifactId>
  requires com.semanticcms.core.view.content.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-view-content-book</artifactId>
  requires com.semanticcms.dia.all.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-dia-all-book</artifactId>
  requires com.semanticcms.dia.bom.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-dia-bom-book</artifactId>
  requires com.semanticcms.dia.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-dia-book</artifactId>
  requires com.semanticcms.dia.model.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-dia-model-book</artifactId>
  requires com.semanticcms.dia.renderer.html.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-dia-renderer-html-book</artifactId>
  requires com.semanticcms.dia.servlet.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-dia-servlet-book</artifactId>
  requires com.semanticcms.dia.style.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-dia-style-book</artifactId>
  requires com.semanticcms.dia.taglib.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-dia-taglib-book</artifactId>
  requires com.semanticcms.dia.view.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-dia-view-book</artifactId>
  requires com.semanticcms.file.all.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-file-all-book</artifactId>
  requires com.semanticcms.file.bom.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-file-bom-book</artifactId>
  requires com.semanticcms.file.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-file-book</artifactId>
  requires com.semanticcms.file.model.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-file-model-book</artifactId>
  requires com.semanticcms.file.renderer.html.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-file-renderer-html-book</artifactId>
  requires com.semanticcms.file.servlet.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-file-servlet-book</artifactId>
  requires com.semanticcms.file.style.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-file-style-book</artifactId>
  requires com.semanticcms.file.taglib.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-file-taglib-book</artifactId>
  requires com.semanticcms.file.view.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-file-view-book</artifactId>
  requires com.semanticcms.googleanalytics.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-google-analytics-book</artifactId>
  requires com.semanticcms.news.all; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-all</artifactId>
  requires com.semanticcms.news.all.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-all-book</artifactId>
  requires com.semanticcms.news.bom.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-bom-book</artifactId>
  requires com.semanticcms.news.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-book</artifactId>
  requires com.semanticcms.news.model.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-model-book</artifactId>
  requires com.semanticcms.news.renderer.html.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-renderer-html-book</artifactId>
  requires com.semanticcms.news.rss.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-rss-book</artifactId>
  requires com.semanticcms.news.servlet.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-servlet-book</artifactId>
  requires com.semanticcms.news.style.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-style-book</artifactId>
  requires com.semanticcms.news.taglib.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-taglib-book</artifactId>
  requires com.semanticcms.news.view.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-view-book</artifactId>
  requires com.semanticcms.openfile.all.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-openfile-all-book</artifactId>
  requires com.semanticcms.openfile.bom.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-openfile-bom-book</artifactId>
  requires com.semanticcms.openfile.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-openfile-book</artifactId>
  requires com.semanticcms.openfile.servlet.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-openfile-servlet-book</artifactId>
  requires com.semanticcms.openfile.taglib.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-openfile-taglib-book</artifactId>
  requires com.semanticcms.pagegraph.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-pagegraph-book</artifactId>
  requires com.semanticcms.pages.all.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-pages-all-book</artifactId>
  requires com.semanticcms.pages.bom.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-pages-bom-book</artifactId>
  requires com.semanticcms.pages.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-pages-book</artifactId>
  requires com.semanticcms.pages.unavailable.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-pages-unavailable-book</artifactId>
  requires com.semanticcms.parent.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-parent-book</artifactId>
  requires com.semanticcms.resources.all.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-resources-all-book</artifactId>
  requires com.semanticcms.resources.bom.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-resources-bom-book</artifactId>
  requires com.semanticcms.resources.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-resources-book</artifactId>
  requires com.semanticcms.resources.empty.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-resources-empty-book</artifactId>
  requires com.semanticcms.resources.filesystem.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-resources-filesystem-book</artifactId>
  requires com.semanticcms.resources.unavailable.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-resources-unavailable-book</artifactId>
  requires com.semanticcms.resources.union.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-resources-union-book</artifactId>
  requires com.semanticcms.section.all; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-all</artifactId>
  requires com.semanticcms.section.all.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-all-book</artifactId>
  requires com.semanticcms.section.bom.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-bom-book</artifactId>
  requires com.semanticcms.section.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-book</artifactId>
  requires com.semanticcms.section.model.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-model-book</artifactId>
  requires com.semanticcms.section.renderer.html.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-renderer-html-book</artifactId>
  requires com.semanticcms.section.servlet.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-servlet-book</artifactId>
  requires com.semanticcms.section.style.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-style-book</artifactId>
  requires com.semanticcms.section.taglib.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-taglib-book</artifactId>
  requires com.semanticcms.tagreference.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-tag-reference-book</artifactId>
  requires com.semanticcms.theme.documentation.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-theme-documentation-book</artifactId>
  requires com.semanticcms.theme.documentation.style.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-theme-documentation-style-book</artifactId>
  requires com.semanticcms.view.all.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-view-all-book</artifactId>
  requires com.semanticcms.view.tree.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-view-tree-book</artifactId>
  requires com.semanticcms.view.whatlinkshere.book; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-view-what-links-here-book</artifactId>
} // TODO: Avoiding rewrite-maven-plugin-4.22.2 truncation
