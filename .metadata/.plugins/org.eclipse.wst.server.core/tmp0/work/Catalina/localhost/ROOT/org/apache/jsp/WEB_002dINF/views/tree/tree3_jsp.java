/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.83
 * Generated at: 2022-11-21 01:40:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.tree;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tree3_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jstree/3.2.1/jstree.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jstree/3.2.1/themes/default/style.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/css/bootstrap.min.css\" />\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("    #sidetree input { width:150px; color:#000; }\r\n");
      out.write("    #sidetree i { margin:0px; }\r\n");
      out.write("    #sidetree button { height:30px; vertical-align:-1px; }\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(document).ready(function(){\r\n");
      out.write("        var tree_list = $.parseJSON('{\"tree_1\":{\"tree_id\":\"tree_1\",\"tree_value\":\"\\uc6b4\\uc601\\ud300\"},\"tree_1_1\":{\"tree_id\":\"tree_1_1\",\"tree_value\":\"\\uc6b4\\uc601\\uc9c0\\uc6d0\\ud300\"},\"tree_2\":{\"tree_id\":\"tree_2\",\"tree_value\":\"\\uc9c0\\uc6d0\\ud300\"},\"tree_2_1\":{\"tree_id\":\"tree_2_1\",\"tree_value\":\"\\uac1c\\ubc1c\\ud300\"},\"tree_2_2\":{\"tree_id\":\"tree_2_2\",\"tree_value\":\"\\ub514\\uc790\\uc778\\ud300\"},\"tree_3\":{\"tree_id\":\"tree_3\",\"tree_value\":\"\\uc0c1\\ub2f4\\ud300\"}}');\r\n");
      out.write("        for(var key in tree_list)\r\n");
      out.write("        {\r\n");
      out.write("            var row = tree_list[key];\r\n");
      out.write("            add_tree_tag(row['tree_id'], row['tree_value']);\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    function add_tree(parent_tree_id)\r\n");
      out.write("    {\r\n");
      out.write("        var parent_depth = parent_tree_id.split(\"_\").length;\r\n");
      out.write("        var tree_id_last = \"\";\r\n");
      out.write("        $(\"#tree li\").each(function(){\r\n");
      out.write("            if($(this).attr(\"id\").indexOf(parent_tree_id + \"_\") != -1)\r\n");
      out.write("            {\r\n");
      out.write("                if($(this).attr(\"id\").split(\"_\").length == parent_depth + 1){\r\n");
      out.write("                    tree_id_last = $(this).attr(\"id\");\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        var next_tree_number = \"\";\r\n");
      out.write("        if(tree_id_last == \"\"){ //1depth\r\n");
      out.write("            next_tree_number = \"1\";\r\n");
      out.write("        }\r\n");
      out.write("        else\r\n");
      out.write("        {\r\n");
      out.write("            var tree_id_last_split = tree_id_last.split(\"_\");\r\n");
      out.write("            var next_tree_number = parseInt(tree_id_last_split[tree_id_last_split.length - 1]) + 1;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        var create_tree_id = parent_tree_id + \"_\" + next_tree_number;\r\n");
      out.write("        tree_value = \"\";\r\n");
      out.write("        //var tree_value = create_tree_id;\r\n");
      out.write("\r\n");
      out.write("        add_tree_tag(create_tree_id, tree_value);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function add_tree_tag(create_tree_id, tree_value)\r\n");
      out.write("    {\r\n");
      out.write("        var parent_tree_id = new Array();\r\n");
      out.write("        var create_tree_id_split = create_tree_id.split(\"_\");\r\n");
      out.write("        create_tree_id_split.pop();\r\n");
      out.write("        for(var key in create_tree_id_split){\r\n");
      out.write("            parent_tree_id.push(create_tree_id_split[key]);\r\n");
      out.write("        }\r\n");
      out.write("        parent_tree_id = parent_tree_id.join(\"_\");\r\n");
      out.write("\r\n");
      out.write("        var btn_tag = \"\";\r\n");
      out.write("        btn_tag += \"<button type='button' class='btn btn-info' onclick=\\\"add_tree('\"+create_tree_id+\"')\\\">+</button>\";\r\n");
      out.write("        btn_tag += \"<button type='button' class='btn btn-danger' onclick=\\\"del_tree('\"+create_tree_id+\"','del')\\\">-</button>\";\r\n");
      out.write("\r\n");
      out.write("        var tree_tag = \"<li id='\"+create_tree_id+\"'><input type='text' name='\"+create_tree_id+\"' value='\"+tree_value+\"' /> \"+btn_tag+\"</li>\";\r\n");
      out.write("\r\n");
      out.write("        //console.log(parent_tree_id + \" => \" + create_tree_id);\r\n");
      out.write("        $(\"#\" + parent_tree_id).append(tree_tag);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function del_tree(tree_id){\r\n");
      out.write("        $(\"#\" + tree_id).remove();\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div id=\"sidetree\">\r\n");
      out.write("		<div class=\"panel panel-default\">\r\n");
      out.write("			<div class=\"panel-heading\">\r\n");
      out.write("				<h6 class=\"panel-title\">\r\n");
      out.write("					<i class=\"fa fa-building-o\" aria-hidden=\"true\"\r\n");
      out.write("						style=\"margin-right: 5px;\"></i>\r\n");
      out.write("				</h6>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"panel-body\">\r\n");
      out.write("				<!--<div id=\"sidetreecontrol\"><a href=\"?#\">전체 닫기</a> | <a href=\"?#\">전체 열기</a></div>-->\r\n");
      out.write("				<div class=\"form-group\">\r\n");
      out.write("					<label class=\"col-sm-1 control-label\"><button type=\"button\"\r\n");
      out.write("							class=\"btn btn-info\" onclick=\"add_tree('tree');\">\r\n");
      out.write("							<i class=\"fa fa-plus\"></i> 부서추가\r\n");
      out.write("						</button></label>\r\n");
      out.write("					<div class=\"col-sm-11\">\r\n");
      out.write("						<form id=\"organ_form\">\r\n");
      out.write("							<ul id=\"tree\"></ul>\r\n");
      out.write("						</form>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-sm-12\">\r\n");
      out.write("						<button type=\"button\" class=\"btn btn-success\"\r\n");
      out.write("							onclick=\"set_organ();\">\r\n");
      out.write("							<i class=\"fa fa-save\"></i> 저장\r\n");
      out.write("						</button>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
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
}