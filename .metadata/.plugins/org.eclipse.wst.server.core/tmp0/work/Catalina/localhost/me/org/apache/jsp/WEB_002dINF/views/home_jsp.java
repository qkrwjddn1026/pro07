/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.60
 * Generated at: 2023-01-19 03:21:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/D:/PJW/pro07_1/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/pro07/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/D:/PJW/pro07_1/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/pro07/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1668994676356L));
    _jspx_dependants.put("jar:file:/D:/PJW/pro07_1/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/pro07/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/head.jsp", out, false);
      out.write("\n");
      out.write("	<meta charset=\"UTF-8\">\n");
      out.write("	<title>Home</title>\n");
      out.write("<style>\n");
      out.write(".carousel-inner img{height: 750px;}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<header id=\"header\">\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./include/header.jsp", out, false);
      out.write("\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<div class=\"container px-4 px-lg-5 nimg\">\n");
      out.write("	<div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-bs-ride=\"carousel\">\n");
      out.write("	  <div class=\"carousel-indicators\">\n");
      out.write("	    <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\"></button>\n");
      out.write("	    <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\n");
      out.write("	    <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\n");
      out.write("	  </div>\n");
      out.write("	  <div class=\"carousel-inner\">\n");
      out.write("	    <div class=\"carousel-item active\">\n");
      out.write("	      <img src=\"http://me.go.kr/upload/1/board/202301/18/20230118150709.png\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("	    </div>\n");
      out.write("	    <div class=\"carousel-item\">\n");
      out.write("	      <img src=\"http://me.go.kr/upload/1/board/202301/18/20230118165843.png\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("	    </div>\n");
      out.write("	    <div class=\"carousel-item\">\n");
      out.write("	      <img src=\"http://me.go.kr/upload/1/banner/202301/02/20230102172806.png\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("	    </div>\n");
      out.write("	  </div>\n");
      out.write("	  <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide=\"prev\">\n");
      out.write("	    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("	    <span class=\"visually-hidden\">Previous</span>\n");
      out.write("	  </button>\n");
      out.write("	  <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide=\"next\">\n");
      out.write("	    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("	    <span class=\"visually-hidden\">Next</span>\n");
      out.write("	  </button>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write(" <section class=\"slider-three\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("    <div class=\"slider-items-wrapper\">\n");
      out.write("        <div class=\"row slider-items-active\">\n");
      out.write("          <div class=\"col-lg-4\">\n");
      out.write("            <div class=\"single-items-one\">\n");
      out.write("              <img src=\"https://www.mss.go.kr/common/board/ThumbnailPopupZone.do?mzIdx=MZ01000510&width=460&height=350\" alt=\"Image\" />\n");
      out.write("            </div>\n");
      out.write("            <!-- single-items-one -->\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-4\">\n");
      out.write("            <div class=\"single-items-one\">\n");
      out.write("              <img src=\"https://www.mss.go.kr/common/board/ThumbnailPopupZone.do?mzIdx=MZ01000921&width=460&height=350\" alt=\"Image\" />\n");
      out.write("            </div>\n");
      out.write("            <!-- single-items-one -->\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-4\">\n");
      out.write("            <div class=\"single-items-one\">\n");
      out.write("              <img src=\"https://www.mss.go.kr/common/board/ThumbnailPopupZone.do?mzIdx=MZ01000960&width=460&height=350\" alt=\"Image\" />\n");
      out.write("            </div>\n");
      out.write("            <!-- single-items-one -->\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-4\">\n");
      out.write("            <div class=\"single-items-one\">\n");
      out.write("              <img src=\"https://www.mss.go.kr/common/board/ThumbnailPopupZone.do?mzIdx=MZ01000951&width=460&height=350\" alt=\"Image\" />\n");
      out.write("            </div>\n");
      out.write("            <!-- single-items-one -->\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- row -->\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- container -->\n");
      out.write("  </section>\n");
      out.write("<script src=\"https://cdn.ayroui.com/1.0/js/tiny-slider.js\"></script>\n");
      out.write("<script>\n");
      out.write("      \n");
      out.write("      tns({\n");
      out.write("         autoplay: true,\n");
      out.write("         autoplayButtonOutput: false,\n");
      out.write("         mouseDrag: true,\n");
      out.write("         gutter: 0,\n");
      out.write("         container: \".slider-items-active\",\n");
      out.write("         center: false,\n");
      out.write("         nav: true,\n");
      out.write("         navPosition: \"bottom\",\n");
      out.write("         controls: false,\n");
      out.write("         speed: 400,\n");
      out.write("         controlsText: [\n");
      out.write("            '<i class=\"lni lni-arrow-left-circle\"></i>',\n");
      out.write("            '<i class=\"lni lni-arrow-right-circle\"></i>',\n");
      out.write("         ],\n");
      out.write("         responsive: {\n");
      out.write("            0: {\n");
      out.write("               items: 1,\n");
      out.write("            },\n");
      out.write("            768: {\n");
      out.write("               items: 2,\n");
      out.write("            },\n");
      out.write("            992: {\n");
      out.write("               items: 3,\n");
      out.write("            },\n");
      out.write("         },\n");
      out.write("      });\n");
      out.write("   </script>\n");
      out.write("    <div class=\"row gx-4 gx-lg-5 align-items-center my-5 nimg\">\n");
      out.write("                <div class=\"col-lg-5\"><img class=\"img-fluid rounded mb-4 mb-lg-0\"\n");
      out.write("                        src=\"resources/img/b1.png\" alt=\"...\" /></div>\n");
      out.write("                <div class=\"col-lg-7\">\n");
      out.write("                    <table class=\"table\">\n");
      out.write("                        <thead>\n");
      out.write("                          <tr>\n");
      out.write("                            <th scope=\"col\">공지사항</th>\n");
      out.write("                          </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                          <tr>\n");
      out.write("                            <td><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path1 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/detail.do?seq=11\">글 쓰기 기능1</a></td>\n");
      out.write("                            <td>2022-11-25</td>\n");
      out.write("                          </tr>\n");
      out.write("                          <tr>\n");
      out.write("                            <td><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path1 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/detail.do?seq=10\">테스트 제목11</a></td>\n");
      out.write("                            <td>2022-11-23</td>\n");
      out.write("                          </tr>\n");
      out.write("                          <tr>\n");
      out.write("                            <td><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path1 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/detail.do?seq=9\">테스트 제목10</a></td>\n");
      out.write("                            <td>2022-11-23</td>\n");
      out.write("                          </tr>\n");
      out.write("                          <tr>\n");
      out.write("                            <td><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path1 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/detail.do?seq=8\">테스트 제목9</a></td>\n");
      out.write("                            <td>2022-11-23</td>\n");
      out.write("                          </tr>\n");
      out.write("                          <tr>\n");
      out.write("                            <td><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path1 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/detail.do?seq=7\">테스트 제목8</a></td>\n");
      out.write("                            <td>2022-11-23</td>\n");
      out.write("                          </tr>\n");
      out.write("                          <tr>\n");
      out.write("                            <td><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path1 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/detail.do?seq=6\">테스트 제목7</a></td>\n");
      out.write("                            <td>2022-11-23</td>\n");
      out.write("                          </tr>\n");
      out.write("                        </tbody>\n");
      out.write("                      </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Content Row-->\n");
      out.write("        \n");
      out.write("        </div>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/views/home.jsp(6,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("path1");
      // /WEB-INF/views/home.jsp(6,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/home.jsp(6,0) '${pageContext.request.contextPath }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }
}
