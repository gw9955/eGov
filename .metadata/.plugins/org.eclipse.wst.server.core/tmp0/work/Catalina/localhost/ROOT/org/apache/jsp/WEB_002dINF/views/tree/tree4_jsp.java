/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.83
 * Generated at: 2022-11-21 01:30:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.tree;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tree4_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1666247046900L));
    _jspx_dependants.put("jar:file:/C:/eGovFrameDev-3.10.0-64bit/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/egovProj/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	// li하위에 ul이 있는 element 클릭시  이벤트 실행\r\n");
      out.write("	$(function() {\r\n");
      out.write("		$('li:has(ul)').click(function(event) {\r\n");
      out.write("\r\n");
      out.write("			// 해당 li 밑에 ul 밑에 하위 li가 있는지 체크\r\n");
      out.write("			// 없으면  getSubData를 호출해서 ajax로 데이터 가져오기\r\n");
      out.write("			if ($(this).children(\"ul\").children(\"li\").size() <= 0) {\r\n");
      out.write("\r\n");
      out.write("				getSubData($(this)); // 현재 객체를 전달해 나중에 그 객체 하위에 추가를 해야지\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("\r\n");
      out.write("			// 밑에 ul 밑에 하위 li가 존재하면\r\n");
      out.write("\r\n");
      out.write("			// 숨김여부에 따라 보이고 안보이고 처리\r\n");
      out.write("			if ($(this).children().is(':hidden')) {\r\n");
      out.write("\r\n");
      out.write("				$(this).css('list-style-image', 'url(minus.gif)') // 스타일변경(현재 이미지가 없음)\r\n");
      out.write("				.children().slideDown(); // 효과를 줘서 보이기\r\n");
      out.write("			} else {\r\n");
      out.write("\r\n");
      out.write("				$(this).css('list-style-image', 'url(plus.gif)') // 스타일변경(현재 이미지가 없음)\r\n");
      out.write("				.children().slideUp(); // 효과를 줘서 숨기기\r\n");
      out.write("			}\r\n");
      out.write("		}).css({\r\n");
      out.write("			cursor : 'pointer',\r\n");
      out.write("			'list-style-image' : 'url(plus.gif)'\r\n");
      out.write("		}) // 스타일변경(현재 이미지가 없음)\r\n");
      out.write("		.children().hide(); // 하위를 시작하기점에 무조건 숨김처리\r\n");
      out.write("\r\n");
      out.write("		// li밑에 ul이 없는경우 스타일 변경\r\n");
      out.write("		$('li:not(:has(ul))').css({\r\n");
      out.write("			cursor : 'default',\r\n");
      out.write("			'list-style-image' : 'none'\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("\r\n");
      out.write("	// li하위에 ul은 존재하지만 그 밑에 li가 없을때는 ajax로 가져오자\r\n");
      out.write("	function getSubData($obj) {\r\n");
      out.write("\r\n");
      out.write("		jQuery.ajax({\r\n");
      out.write("			type : 'get',\r\n");
      out.write("			asyn : true,\r\n");
      out.write("			url : 'subtree.json',\r\n");
      out.write("			data : \"\",\r\n");
      out.write("			dataType : \"json\",\r\n");
      out.write("			contentType : \"application/x-www-form-urlencoded;charset=UTF-8\",\r\n");
      out.write("			success : function(jsonData) {\r\n");
      out.write("\r\n");
      out.write("				setSubTree($obj, jsonData);\r\n");
      out.write("\r\n");
      out.write("			},\r\n");
      out.write("			error : function(xhr, textStatus) {\r\n");
      out.write("				alert(textStatus + \"/\" + xhr.status);\r\n");
      out.write("			},\r\n");
      out.write("			complete : function(xhr, textStatus) {\r\n");
      out.write("\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	// ajax를 통해서 가져온 json 데이터를 해당하는 li 객체 밑에 추가를 하자\r\n");
      out.write("	function setSubTree($obj, jsonData) {\r\n");
      out.write("\r\n");
      out.write("		$(jsonData).each(function() {\r\n");
      out.write("\r\n");
      out.write("			// 하위에 들어갈 a 및 li객체를 만들어서\r\n");
      out.write("			$a = $(\"<a></a>\").text(this.name).attr(\"href\", this.url);\r\n");
      out.write("			$li = $(\"<li></li>\");\r\n");
      out.write("			$li.append($a);\r\n");
      out.write("\r\n");
      out.write("			//상위 li객체에 추가하자\r\n");
      out.write("			$obj.children(\"ul\").append($li);\r\n");
      out.write("\r\n");
      out.write("		});\r\n");
      out.write("\r\n");
      out.write("		// 마지막으로 다시 클릭된것처럼 이벤트를 실행해서 하위를 보이도록~\r\n");
      out.write("		$obj.trigger(\"click\");\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("fieldset {\r\n");
      out.write("	width: 320px\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<fieldset>\r\n");
      out.write("		<legend>트리</legend>\r\n");
      out.write("		<form action=\"/tree4\" method=\"post\">\r\n");
      out.write("		<ul>\r\n");
      out.write("				<li class=\"globalNav\">(주)대덕인재개발원\r\n");
      out.write("			");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("				</li>\r\n");
      out.write("		</ul>\r\n");
      out.write("		</form>\r\n");
      out.write("	</fieldset>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/tree/tree4.jsp(100,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("row");
      // /WEB-INF/views/tree/tree4.jsp(100,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/tree/tree4.jsp(100,3) '${data}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${data}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/tree/tree4.jsp(100,3) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVarStatus("stat");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("					<ul id=\"menu01_sub\" class=\"localNav\">\r\n");
            out.write("						<li><a href=\"#\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.orgname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</a>\r\n");
            out.write("							<ul>\r\n");
            out.write("								<li><a href=\"#\">경영관리실</a></li>\r\n");
            out.write("								<li><a href=\"#\">경영전략실</a></li>\r\n");
            out.write("								<li><a href=\"#\">글로벌사업실</a></li>\r\n");
            out.write("							</ul>\r\n");
            out.write("						</li>\r\n");
            out.write("					</ul>\r\n");
            out.write("			");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
