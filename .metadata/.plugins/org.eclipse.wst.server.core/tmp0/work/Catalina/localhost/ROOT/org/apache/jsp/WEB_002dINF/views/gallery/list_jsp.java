/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.83
 * Generated at: 2022-11-22 08:51:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.gallery;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/eGovFrameDev-3.10.0-64bit/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/egovProj/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
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
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"/resources/js/jquery-3.6.0.js\"></script>\r\n");
      out.write("<div class=\"col-12\">\r\n");
      out.write("	<div class=\"card card-primary\">\r\n");
      out.write("		<div class=\"card-header\">\r\n");
      out.write("			<!-- ?????? ?????? ?????? -->\r\n");
      out.write("			<!-- ajax??? ?????? append\r\n");
      out.write("				<option value=\"1\">???????????????</option>\r\n");
      out.write("			 -->\r\n");
      out.write("			<select class=\"custom-select\">\r\n");
      out.write("         	</select>\r\n");
      out.write("			<!-- ?????? ?????? ??? -->\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"card-body\">\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<!--\r\n");
      out.write("				1. button?????? ????????? \r\n");
      out.write("				<button type=\"button\" class=\"btn btn-default\"\r\n");
      out.write("				data-toggle=\"modal\" data-target=\"#modal-default\">\r\n");
      out.write("				Launch Default Modal\r\n");
      out.write("				</button>\r\n");
      out.write("				\r\n");
      out.write("				2. a ????????? ?????????\r\n");
      out.write("				<a data-toggle=\"modal\" href=\"#modal-default\">Open Modal</a>\r\n");
      out.write("				\r\n");
      out.write("				3. ?????? ????????? ?????????\r\n");
      out.write("				<p data-toggle=\"modal\" data-target=\"#modal-default\">Open Modal</a>\r\n");
      out.write("				 -->\r\n");
      out.write("				<!-- bookVO -> attachVOList ???????????? -> List<AttachVO> -->\r\n");
      out.write("				");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Default Modal ?????? -->\r\n");
      out.write("<div class=\"modal fade\" id=\"modal-default\" style=\"display: none;\"\r\n");
      out.write("	aria-hidden=\"true\">\r\n");
      out.write("	<div class=\"modal-dialog\">\r\n");
      out.write("		<div class=\"modal-content\">\r\n");
      out.write("			<div class=\"modal-header\">\r\n");
      out.write("				<h4 class=\"modal-title\">????????? ????????????~</h4>\r\n");
      out.write("				<input type=\"hidden\" id=\"txtUserNo\" value=\"\" />\r\n");
      out.write("				<input type=\"hidden\" id=\"txtSeq\" value=\"\" />\r\n");
      out.write("				<input type=\"hidden\" id=\"txtFilename\" value=\"\" />\r\n");
      out.write("				<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("					aria-label=\"Close\">\r\n");
      out.write("					<span aria-hidden=\"true\">??</span>\r\n");
      out.write("				</button>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"modal-body\">\r\n");
      out.write("				<p id=\"body-content\" style=\"width:100%;\"></p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"modal-footer justify-content-between\">\r\n");
      out.write("				<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("				<div style=\"float:right;\">\r\n");
      out.write("					<!-- ?????? ?????? ?????? -->\r\n");
      out.write("					<span id=\"spn1\">\r\n");
      out.write("						<a class=\"btn btn-app\" onclick=\"fn_download()\">\r\n");
      out.write("							<i class=\"fas fa-save\"></i> Save\r\n");
      out.write("						</a>\r\n");
      out.write("						<button type=\"button\" id=\"edit\" class=\"btn btn-primary\">??????</button>\r\n");
      out.write("						<button type=\"button\" id=\"delete\" class=\"btn btn-danger\">??????</button>\r\n");
      out.write("					</span>\r\n");
      out.write("					<!-- ?????? ?????? ??? -->\r\n");
      out.write("					<!-- ?????? ?????? ?????? -->\r\n");
      out.write("					<span id=\"spn2\" style=\"display:none;\">\r\n");
      out.write("						<div class=\"input-group justify-content-between\">\r\n");
      out.write("								<div class=\"custom-file\" style=\"float:left;\">\r\n");
      out.write("									<input type=\"file\" class=\"custom-file-input\"\r\n");
      out.write("									 id=\"uploadFile\" name=\"uploadFile\" style=\"width:200px;\" />\r\n");
      out.write("									<label class=\"custom-file-label\" for=\"exampleInputFile\">Choose file</label>\r\n");
      out.write("								</div>\r\n");
      out.write("							<div style=\"float:rigth;\">\r\n");
      out.write("								<button type=\"button\" id=\"uploadBtn\" class=\"btn btn-success\">??????</button>\r\n");
      out.write("								<button type=\"button\" id=\"cancel\" class=\"btn btn-warning\">??????</button>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</span>\r\n");
      out.write("					<!-- ?????? ?????? ??? -->\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("<iframe id=\"ifrm\" name=\"ifrm\" style=\"display:none;\"></iframe>\r\n");
      out.write("<!-- Default Modal ??? -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("   $(function() {\r\n");
      out.write("      $(\".btn-modal\").click(function() {\r\n");
      out.write("                     //data-id=\".......\"\r\n");
      out.write("                     let data = $(this).data(\"id\");\r\n");
      out.write("                     //data-title=\"......\"\r\n");
      out.write("                     let title = $(this).data(\"title\");\r\n");
      out.write("                     //userId??? seq??? ATTACH ???????????? ????????? (composite key)????????? ?????????(primary key, ?????????)\r\n");
      out.write("                     //data-userNo=\"....\"\r\n");
      out.write("                     let userNo = $(this).data(\"userno\");\r\n");
      out.write("                     //data-seq=\"....\"\r\n");
      out.write("                     let seq = $(this).data(\"seq\");\r\n");
      out.write("                     //data-filename=\"...\r\n");
      out.write("                     let filename = $(this).data(\"filename\");\r\n");
      out.write("                     \r\n");
      out.write("                     //?????? ???????????? ??????\r\n");
      out.write("                     sessionStorage.setItem(\"filename\",filename);\r\n");
      out.write("                     \r\n");
      out.write("                     console.log(\"data : \" + data + \" , title : \"+ title + \r\n");
      out.write("                    		 \", userNo : \" + userNo + \" , seq : \" + seq + \" , filename : \" + filename);\r\n");
      out.write("                     \r\n");
      out.write("                     $(\"#body-content\").html(\"<img src=' \" + data + \" ' style='width:100%;' />\");\r\n");
      out.write("                     //modal??? ????????????, modal-title ????????? ?????? ?????????\r\n");
      out.write("                     $(\".modal-title\").text(title);\r\n");
      out.write("                     $(\"#txtUserNo\").val(userNo);\r\n");
      out.write("                     $(\"#txtSeq\").val(seq);\r\n");
      out.write("                     $(\"#txtFilename\").val(filename);\r\n");
      out.write("                     \r\n");
      out.write("                  });\r\n");
      out.write("      //el ????????? j/s  ????????? ??????\r\n");
      out.write("      let currentBookId = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.bookId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("      let sel = \"\";\r\n");
      out.write("      //?????? ?????? ???????????? select??? ?????? ??????\r\n");
      out.write("      //datatype : ?????? ????????? ??????\r\n");
      out.write("      //??????????????? ???????????????\r\n");
      out.write("      $.ajax({\r\n");
      out.write("         url : \"/gallery/bookList\",\r\n");
      out.write("         datatype : \"json\",\r\n");
      out.write("         type : \"get\",\r\n");
      out.write("         success : function(data) {\r\n");
      out.write("            //data : List<BookVO>\r\n");
      out.write("            //          console.log(\"data : \" + JSON.stringify(data))\r\n");
      out.write("            //item : BookVO\r\n");
      out.write("            $.each(data, function(index, item) {\r\n");
      out.write("               //             console.log(\"item.bookId : \" + item.bookId);\r\n");
      out.write("               //             console.log(\"item.bookId : \" + item.title);\r\n");
      out.write("\r\n");
      out.write("               if (item.bookId == currentBookId) {\r\n");
      out.write("                  sel = \"selected='selected' \"\r\n");
      out.write("               } else {\r\n");
      out.write("                  sel = \"\";\r\n");
      out.write("               }\r\n");
      out.write("               //option?????? ??????\r\n");
      out.write("               $(\".custom-select\").append(\r\n");
      out.write("                     \"<option value=' \" + \r\n");
      out.write("                                       item.bookId + \" '  \" + sel + \">\"\r\n");
      out.write("                           + item.title + \"</option>\");\r\n");
      out.write("            });\r\n");
      out.write("         }\r\n");
      out.write("      });\r\n");
      out.write("      //.custom-select??? ????????? ????????? ????????? ?????? ?????????\r\n");
      out.write("      $(\".custom-select\").on(\"change\", function() {\r\n");
      out.write("         //????????? option??? value??? ???????????????\r\n");
      out.write("         let bookId = $(this).val();\r\n");
      out.write("         console.log(\"bookId : \" + bookId);\r\n");
      out.write("\r\n");
      out.write("         location.href = \"/gallery/list?bookId=\" + bookId;\r\n");
      out.write("      });\r\n");
      out.write("      //?????? ?????? ?????? -> spn:hidden / spn2: block\r\n");
      out.write("      $(\"#edit\").on(\"click\", function() {\r\n");
      out.write("         $(\"#spn1\").css(\"display\", \"none\");\r\n");
      out.write("         $(\"#spn2\").css(\"display\", \"block\");\r\n");
      out.write("      });\r\n");
      out.write("      //?????? ?????? ?????? -> spn1:block / spn2: none\r\n");
      out.write("      $(\"#cancel\").on(\"click\", function() {\r\n");
      out.write("         $(\"#spn2\").css(\"display\", \"none\");\r\n");
      out.write("         $(\"#spn1\").css(\"display\", \"block\");\r\n");
      out.write("      });\r\n");
      out.write("      \r\n");
      out.write("      //ajax ?????? ????????? ?????? ??????\r\n");
      out.write("      //????????? ??????\r\n");
      out.write("      let regex  = new RegExp(\"(.*?)\\.(exe|sh|zip|alz)$\"); //?????????\r\n");
      out.write("      let maxSize = 5242880; //5MB\r\n");
      out.write("      \r\n");
      out.write("      function checkExtension(fileName, fileSize){ //?????????. ?????? ??????\r\n");
      out.write("         if(fileSize >= maxSize){\r\n");
      out.write("            alert(\"?????? ???????????? ?????????????????????\");\r\n");
      out.write("            //?????? ?????? \r\n");
      out.write("            return false;\r\n");
      out.write("         }\r\n");
      out.write("         //fileName : ?????????.zip\r\n");
      out.write("         if(regex.test(fileName)){\r\n");
      out.write("            alert(\"?????? ????????? ????????? ????????? ??? ??? ????????????.\");\r\n");
      out.write("            return false;\r\n");
      out.write("         }\r\n");
      out.write("         return true;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      //e : ?????? ?????????\r\n");
      out.write("      $(\"#uploadBtn\").on(\"click\", function(e){\r\n");
      out.write("         //????????? form ?????? ?????? <form></form>\r\n");
      out.write("         let formData = new FormData();\r\n");
      out.write("         //<input type=\"file\" name=\"uploadFile\"....\r\n");
      out.write("         let inputFile = $(\"input[name='uploadFile']\");\r\n");
      out.write("         //?????? object ?????? ???????????? ???????????????\r\n");
      out.write("         //inputFile[0] : input type=\"file\"\r\n");
      out.write("         let files = inputFile[0].files;\r\n");
      out.write("         //files : [object FileList]\r\n");
      out.write("         console.log(\"files : \" + files);\r\n");
      out.write("         \r\n");
      out.write("         //????????? form??? formData Object??? filedata??? ???????????????\r\n");
      out.write("         for(let i=0;i<files.length;i++){\r\n");
      out.write("            //?????? ?????????/?????? ??????(???????????? exe, sh,  zip, alz ??????? ????????????..)\r\n");
      out.write("            if(!checkExtension(files[i].name, files[i].size)){\r\n");
      out.write("               //????????? ?????? ??? ?????? ??????\r\n");
      out.write("               return false;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            //<form><input type='file' name='uploadFIle' /></form>\r\n");
      out.write("            formData.append(\"uploadFile\",files[i]);\r\n");
      out.write("         }\r\n");
      out.write("         \r\n");
      out.write("         /*\r\n");
      out.write("            <form>\r\n");
      out.write("               <input type=\"file\" name=\"uploadFile\" />\r\n");
      out.write("               <input type=\"text\" name=\"userNo\" value=\"3\"/>\r\n");
      out.write("               <input type=\"text\" name=\"seq\" value=\"5\" />\r\n");
      out.write("            </form>\r\n");
      out.write("         */\r\n");
      out.write("         formData.append(\"userNo\",$(\"#txtUserNo\").val());\r\n");
      out.write("         formData.append(\"seq\",$(\"#txtSeq\").val());\r\n");
      out.write("         \r\n");
      out.write("         console.log(\"formData : \" + formData);\r\n");
      out.write("         \r\n");
      out.write("         //????????????????????? ???????????????\r\n");
      out.write("         $.ajax({\r\n");
      out.write("            url:\"/gallery/updatePost\",\r\n");
      out.write("            processData:false,\r\n");
      out.write("            contentType:false,\r\n");
      out.write("            data:formData,\r\n");
      out.write("            type:\"post\",\r\n");
      out.write("            success:function(result){\r\n");
      out.write("               console.log(\"result : \" + JSON.stringify(result));\r\n");
      out.write("               console.log(\"uploaded\");\r\n");
      out.write("               let filename = result.filename;\r\n");
      out.write("               alert(\"????????? ?????? ??????!\");\r\n");
      out.write("               location.href=\"/gallery/list?bookId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.bookId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("//                $(\"#body-content img\").attr(\"src\",\"/resources/upload\" + filename);\r\n");
      out.write("            }\r\n");
      out.write("         })\r\n");
      out.write("      });\r\n");
      out.write("      //ajax ?????? ????????? ?????? ???\r\n");
      out.write("      \r\n");
      out.write("      //????????? ???????????? ?????? ////////////////////\r\n");
      out.write("       let sel_file = [];\r\n");
      out.write("      $(\"#uploadFile\").on(\"change\",handleImgFileSelect);\r\n");
      out.write("      //e : onchange ????????? ??????\r\n");
      out.write("      function handleImgFileSelect(e){\r\n");
      out.write("         //???????????? ?????? ??? ?????? ?????? ???????????? ????????? ???????????? ???????????????\r\n");
      out.write("         let files = e.target.files;\r\n");
      out.write("         //???????????? ????????? ?????? ??? ???????????? ??????????????? ?????? ???????????? ????????? ??????\r\n");
      out.write("         let fileArr = Array.prototype.slice.call(files);\r\n");
      out.write("         //?????? ????????? ?????? ??????. f : ?????? ?????? ???????????? ????????? ????????? ?????? ??????\r\n");
      out.write("         fileArr.forEach(function(f){\r\n");
      out.write("            //????????? ????????? ?????? ?????? ????????? ???????????? ?????? ??????\r\n");
      out.write("            if(!f.type.match(\"image.*\")){\r\n");
      out.write("               alert(\"????????? ???????????? ???????????????\");\r\n");
      out.write("               //?????? ??????\r\n");
      out.write("               return;\r\n");
      out.write("            }\r\n");
      out.write("            //????????? ????????? ?????? ???????????? ????????? ??????\r\n");
      out.write("            sel_file.push(f);\r\n");
      out.write("            //????????? ????????? ?????? ????????????????????? reader ?????? ??????\r\n");
      out.write("            let reader = new FileReader();\r\n");
      out.write("            //e : reader??? ????????? ????????? ?????? ?????????\r\n");
      out.write("            reader.onload = function(e){\r\n");
      out.write("               console.log(\"?????????\")\r\n");
      out.write("               //e.target : f(????????? ??????)\r\n");
      out.write("               //e.target.result : reader??? ???????????? ??? ?????? ??????\r\n");
      out.write("               let img_html = \"<img src=\\\"\"+ e.target.result +\"\\\" style='width:100%;' />\";\r\n");
      out.write("               //p ????????? ???????????? ??????????????? ????????? ??????\r\n");
      out.write("               //??????.append : ??????, .html : ????????????, .innerHTML : J/S\r\n");
      out.write("               $(\"#body-content\").html(img_html);\r\n");
      out.write("            }\r\n");
      out.write("            //f : ????????? ?????? ????????? ?????? ??? ?????? ????????? ??????(f)??? ?????? ????????? ???\r\n");
      out.write("            reader.readAsDataURL(f);\r\n");
      out.write("         }); //end forEach\r\n");
      out.write("      }\r\n");
      out.write("      //????????? ???????????? ??? ////////////////////\r\n");
      out.write("      \r\n");
      out.write("      //????????? ?????? ??????\r\n");
      out.write("      $(\"#delete\").on(\"click\",function() {\r\n");
      out.write("    	  let userNo = $(\"#txtUserNo\").val();\r\n");
      out.write("    	  let seq = $(\"#txtSeq\").val();\r\n");
      out.write("    	  \r\n");
      out.write("    	  console.log(\"userNo : \" + userNo + \", seq : \" + seq);\r\n");
      out.write("    	  \r\n");
      out.write("    	  let data = {\"userNo\":userNo,\"seq\":seq};\r\n");
      out.write("    	  \r\n");
      out.write("    	  console.log(\"data : \" + JSON.stringify(data));\r\n");
      out.write("    	  \r\n");
      out.write("    	  //ajax\r\n");
      out.write("    	  $.ajax({\r\n");
      out.write("    		 url:\"/gallery/deletePost\",\r\n");
      out.write("    		 contentType:\"application/json;charset=utf-8\",\r\n");
      out.write("    		 data:JSON.stringify(data),\r\n");
      out.write("    		 dataType:\"json\",\r\n");
      out.write("    		 type:\"post\",\r\n");
      out.write("    		 success:function(result) {\r\n");
      out.write("    			 console.log(\"result : \" + JSON.stringify(result));\r\n");
      out.write("    			 //result??? 0?????? ?????? ??????, ????????? ??????\r\n");
      out.write("    			 //?????? ??? : /gallery/list?bookId=3 / ?????? ??? : ?????? ????????? alert\r\n");
      out.write("    			 if(str>0) {\r\n");
      out.write("    				 location.href=\"/gallery/list?bookId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.bookId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("    			 } else {\r\n");
      out.write("    				 alert(\"????????? ?????? ???????????????.\");\r\n");
      out.write("    			 }\r\n");
      out.write("    		 }\r\n");
      out.write("    	  });\r\n");
      out.write("      });\r\n");
      out.write("      //????????? ?????? ???\r\n");
      out.write("      \r\n");
      out.write("   });\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("//?????? ???????????? ??????\r\n");
      out.write("function fn_download() {\r\n");
      out.write("	  //?????? ???????????? ??????\r\n");
      out.write("	  let filename = sessionStorage.getItem(\"filename\");\r\n");
      out.write("	  console.log(\"filename : \" + filename);\r\n");
      out.write("	  \r\n");
      out.write("	  let vIfrm = document.getElementById(\"ifrm\");\r\n");
      out.write("	  console.log(\"vIfrm : \" + vIfrm);\r\n");
      out.write("	  vIfrm.src = \"/download?fileName=\"+filename;\r\n");
      out.write("}\n");
      out.write("</script>");
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
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/gallery/list.jsp(32,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("attachVO");
      // /WEB-INF/views/gallery/list.jsp(32,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/gallery/list.jsp(32,4) '${bookVO.attachVOList}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${bookVO.attachVOList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("				<div class=\"col-sm-2\">\r\n");
            out.write("					<a class=\"btn btn-modal\"\r\n");
            out.write("						data-toggle=\"modal\" href=\"#modal-default\"\r\n");
            out.write("						data-id=\"/resources/upload");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attachVO.filename}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"\r\n");
            out.write("						data-title=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bookVO.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"\r\n");
            out.write("						data-userno=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bookVO.bookId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"\r\n");
            out.write("						data-seq=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attachVO.seq}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"\r\n");
            out.write("						data-filename=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attachVO.filename}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" > <img\r\n");
            out.write("						src=\"/resources/upload");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${attachVO.filename}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"\r\n");
            out.write("						class=\"img-fluid mb-2\" alt=\"white sample\">\r\n");
            out.write("					</a>\r\n");
            out.write("				</div>\r\n");
            out.write("				");
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
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
