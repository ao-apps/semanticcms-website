#!/usr/bin/env groovy
/*
 * semanticcms-website - The semanticcms.com website.
 * Copyright (C) 2021, 2022, 2023, 2024, 2025, 2026  AO Industries, Inc.
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

// Parent, Extensions, Plugins, Direct and BOM Dependencies
binding.setVariable('upstreamProjects', [
  // Parent
  'parent', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-parent</artifactId>

  // "development" profile
  // Runtime Direct
  'openfile/all', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-openfile-all</artifactId>
  'view-all', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-view-all</artifactId>
  'view-tree', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-view-tree</artifactId>
  'view-what-links-here', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-view-what-links-here</artifactId>

  // "publish" profile
  // Dependencies for javadocs
  // No apidocs: <groupId>com.semanticcms</groupId><artifactId>semanticcms-all</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.semanticcms</groupId><artifactId>semanticcms-autogit-all</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.semanticcms</groupId><artifactId>semanticcms-autogit-bom</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.semanticcms</groupId><artifactId>semanticcms-autogit</artifactId><classifier>javadoc</classifier>
  'autogit/model', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-autogit-model</artifactId><classifier>javadoc</classifier>
  'autogit/servlet', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-autogit-servlet</artifactId><classifier>javadoc</classifier>
  'autogit/style', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-autogit-style</artifactId><classifier>javadoc</classifier>
  'autogit/taglib', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-autogit-taglib</artifactId><classifier>javadoc</classifier>
  'autogit/view', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-autogit-view</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.semanticcms</groupId><artifactId>semanticcms-bom</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.semanticcms</groupId><artifactId>semanticcms</artifactId><classifier>javadoc</classifier>
  'changelog-taglib', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-changelog-taglib</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-all</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-bom</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.semanticcms</groupId><artifactId>semanticcms-core</artifactId><classifier>javadoc</classifier>
  'core/breadcrumblist-json-ld', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-breadcrumblist-json-ld</artifactId><classifier>javadoc</classifier>
  'core/canonical', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-canonical</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-docs</artifactId><classifier>javadoc</classifier>
  'core/model', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-model</artifactId><classifier>javadoc</classifier>
  'core/servlet', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-servlet</artifactId><classifier>javadoc</classifier>
  'core/sitemap', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-sitemap</artifactId><classifier>javadoc</classifier>
  'core/style', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-style</artifactId><classifier>javadoc</classifier>
  'core/taglib', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-taglib</artifactId><classifier>javadoc</classifier>
  'core/theme-base', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-theme-base</artifactId><classifier>javadoc</classifier>
  'core/view-content', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-view-content</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.semanticcms</groupId><artifactId>semanticcms-dia-all</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.semanticcms</groupId><artifactId>semanticcms-dia-bom</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.semanticcms</groupId><artifactId>semanticcms-dia</artifactId><classifier>javadoc</classifier>
  'dia/model', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-dia-model</artifactId><classifier>javadoc</classifier>
  'dia/servlet', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-dia-servlet</artifactId><classifier>javadoc</classifier>
  'dia/style', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-dia-style</artifactId><classifier>javadoc</classifier>
  'dia/taglib', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-dia-taglib</artifactId><classifier>javadoc</classifier>
  'dia/view', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-dia-view</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.semanticcms</groupId><artifactId>semanticcms-file-all</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.semanticcms</groupId><artifactId>semanticcms-file-bom</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.semanticcms</groupId><artifactId>semanticcms-file</artifactId><classifier>javadoc</classifier>
  'file/model', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-file-model</artifactId><classifier>javadoc</classifier>
  'file/servlet', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-file-servlet</artifactId><classifier>javadoc</classifier>
  'file/style', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-file-style</artifactId><classifier>javadoc</classifier>
  'file/taglib', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-file-taglib</artifactId><classifier>javadoc</classifier>
  'file/view', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-file-view</artifactId><classifier>javadoc</classifier>
  'google-analytics', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-google-analytics</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-all</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-bom</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.semanticcms</groupId><artifactId>semanticcms-news</artifactId><classifier>javadoc</classifier>
  'news/model', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-model</artifactId><classifier>javadoc</classifier>
  'news/rss', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-rss</artifactId><classifier>javadoc</classifier>
  'news/servlet', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-servlet</artifactId><classifier>javadoc</classifier>
  'news/style', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-style</artifactId><classifier>javadoc</classifier>
  'news/taglib', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-taglib</artifactId><classifier>javadoc</classifier>
  'news/view', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-view</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.semanticcms</groupId><artifactId>semanticcms-openfile-all</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.semanticcms</groupId><artifactId>semanticcms-openfile-bom</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.semanticcms</groupId><artifactId>semanticcms-openfile</artifactId><classifier>javadoc</classifier>
  'openfile/servlet', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-openfile-servlet</artifactId><classifier>javadoc</classifier>
  'openfile/taglib', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-openfile-taglib</artifactId><classifier>javadoc</classifier>
  'pagegraph', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-pagegraph</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.semanticcms</groupId><artifactId>semanticcms-parent</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-all</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-bom</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.semanticcms</groupId><artifactId>semanticcms-section</artifactId><classifier>javadoc</classifier>
  'section/model', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-model</artifactId><classifier>javadoc</classifier>
  'section/servlet', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-servlet</artifactId><classifier>javadoc</classifier>
  'section/style', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-style</artifactId><classifier>javadoc</classifier>
  'section/taglib', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-taglib</artifactId><classifier>javadoc</classifier>
  'tag-reference', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-tag-reference</artifactId><classifier>javadoc</classifier>
  'theme-documentation', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-theme-documentation</artifactId><classifier>javadoc</classifier>
  'theme-documentation-style', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-theme-documentation-style</artifactId><classifier>javadoc</classifier>
  'view-all', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-view-all</artifactId><classifier>javadoc</classifier>
  'view-tree', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-view-tree</artifactId><classifier>javadoc</classifier>
  'view-what-links-here', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-view-what-links-here</artifactId><classifier>javadoc</classifier>

  // Direct
  '../oss/taglib-javaee', // <groupId>com.aoapps</groupId><artifactId>ao-taglib</artifactId>
  'all-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-all-book</artifactId>
  'autogit/all-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-autogit-all-book</artifactId>
  'autogit/bom-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-autogit-bom-book</artifactId>
  'autogit/book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-autogit-book</artifactId>
  'autogit/model-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-autogit-model-book</artifactId>
  'autogit/servlet-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-autogit-servlet-book</artifactId>
  'autogit/style-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-autogit-style-book</artifactId>
  'autogit/taglib-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-autogit-taglib-book</artifactId>
  'autogit/view-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-autogit-view-book</artifactId>
  'bom-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-bom-book</artifactId>
  'book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-book</artifactId>
  'changelog-taglib-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-changelog-taglib-book</artifactId>
  'core/all', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-all</artifactId>
  'core/all-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-all-book</artifactId>
  'core/bom-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-bom-book</artifactId>
  'core/book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-book</artifactId>
  'core/breadcrumblist-json-ld-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-breadcrumblist-json-ld-book</artifactId>
  'core/canonical-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-canonical-book</artifactId>
  'core/docs-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-docs-book</artifactId>
  'core/model-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-model-book</artifactId>
  'core/servlet-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-servlet-book</artifactId>
  'core/sitemap-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-sitemap-book</artifactId>
  'core/style-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-style-book</artifactId>
  'core/taglib-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-taglib-book</artifactId>
  'core/theme-base-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-theme-base-book</artifactId>
  'core/view-content-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-view-content-book</artifactId>
  'dia/all-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-dia-all-book</artifactId>
  'dia/bom-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-dia-bom-book</artifactId>
  'dia/book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-dia-book</artifactId>
  'dia/model-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-dia-model-book</artifactId>
  'dia/servlet-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-dia-servlet-book</artifactId>
  'dia/style-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-dia-style-book</artifactId>
  'dia/taglib-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-dia-taglib-book</artifactId>
  'dia/view-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-dia-view-book</artifactId>
  'file/all-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-file-all-book</artifactId>
  'file/bom-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-file-bom-book</artifactId>
  'file/book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-file-book</artifactId>
  'file/model-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-file-model-book</artifactId>
  'file/servlet-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-file-servlet-book</artifactId>
  'file/style-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-file-style-book</artifactId>
  'file/taglib-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-file-taglib-book</artifactId>
  'file/view-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-file-view-book</artifactId>
  'google-analytics-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-google-analytics-book</artifactId>
  'news/all', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-all</artifactId>
  'news/all-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-all-book</artifactId>
  'news/bom-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-bom-book</artifactId>
  'news/book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-book</artifactId>
  'news/model-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-model-book</artifactId>
  'news/rss-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-rss-book</artifactId>
  'news/servlet-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-servlet-book</artifactId>
  'news/style-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-style-book</artifactId>
  'news/taglib-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-taglib-book</artifactId>
  'news/view-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-view-book</artifactId>
  'openfile/all-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-openfile-all-book</artifactId>
  'openfile/bom-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-openfile-bom-book</artifactId>
  'openfile/book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-openfile-book</artifactId>
  'openfile/servlet-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-openfile-servlet-book</artifactId>
  'openfile/taglib-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-openfile-taglib-book</artifactId>
  'pagegraph-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-pagegraph-book</artifactId>
  'parent-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-parent-book</artifactId>
  'section/all', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-all</artifactId>
  'section/all-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-all-book</artifactId>
  'section/bom-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-bom-book</artifactId>
  'section/book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-book</artifactId>
  'section/model-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-model-book</artifactId>
  'section/servlet-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-servlet-book</artifactId>
  'section/style-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-style-book</artifactId>
  'section/taglib-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-taglib-book</artifactId>
  'tag-reference-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-tag-reference-book</artifactId>
  'theme-documentation-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-theme-documentation-book</artifactId>
  'theme-documentation-style-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-theme-documentation-style-book</artifactId>
  'view-all-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-view-all-book</artifactId>
  'view-tree-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-view-tree-book</artifactId>
  'view-what-links-here-book', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-view-what-links-here-book</artifactId>

  // Runtime Direct
  '../oss/mime-mappings', // <groupId>com.aoapps</groupId><artifactId>ao-mime-mappings</artifactId>
  '../oss/servlet-filter-javaee', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-filter</artifactId>
  '../oss/servlet-util-javaee', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-util</artifactId>
  'google-analytics', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-google-analytics</artifactId>
  'theme-documentation', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-theme-documentation</artifactId>

  // BOM
  '../oss/javaee-web-api-bom', // <groupId>com.aoapps</groupId><artifactId>javaee-web-api-bom</artifactId>
])

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
    cron(cron)
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
            values '11', '17', '21' // buildJdks
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
            values '11', '17', '21' // buildJdks
          }
          axis {
            name 'testJdk'
            values '11', '17', '21' // testJdks
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
