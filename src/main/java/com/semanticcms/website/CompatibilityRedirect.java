/*
 * semanticcms-website - The semanticcms.com website.
 * Copyright (C) 2023  AO Industries, Inc.
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

package com.semanticcms.website;

import com.aoapps.servlet.http.HttpServletUtil;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// TODO: Can we set as a 404 handler only, then dispatch to default handler?
//       Would hate to cover up something that came back in the generated javadocs
// TODO: Implement like brands/aoindustries.com/CompatibilityRedirect.java as a filter, maybe a shared base class
@WebServlet(urlPatterns = {
  "/core/view-contents/apidocs/",
  "/core/theme-base/apidocs/constant-values.html",
  "/dia/view/apidocs/deprecated-list.html",
})
public class CompatibilityRedirect extends HttpServlet {

  private static final long serialVersionUID = 1L;

  private static final Map<String, String> redirects = new HashMap<>();

  static {
    // Seen in Google Search Console
    redirects.put("/core/view-contents/apidocs/", "/core/view-content/apidocs/com.semanticcms.core.view.content/module-summary.html");
    redirects.put("/core/theme-base/apidocs/constant-values.html", "/core/theme-base/apidocs/com.semanticcms.core.theme.base/module-summary.html");
    redirects.put("/dia/view/apidocs/deprecated-list.html", "/core/theme-base/apidocs/com.semanticcms.core.theme.base/module-summary.html");
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String servletPath = request.getServletPath();
    String redirectPath = redirects.get(servletPath);
    if (redirectPath == null) {
      throw new ServletException("Redirect not found in redirects map: " + servletPath);
    }
    String pathInfo = request.getPathInfo();
    if (pathInfo != null) {
      redirectPath += pathInfo;
    }
    String query = request.getQueryString();
    if (query != null) {
      redirectPath += query;
    }
    HttpServletUtil.sendRedirect(HttpServletResponse.SC_MOVED_PERMANENTLY,
        request, response, servletPath, redirectPath, null, true,
        false // true for canonical?
    );
  }
}
