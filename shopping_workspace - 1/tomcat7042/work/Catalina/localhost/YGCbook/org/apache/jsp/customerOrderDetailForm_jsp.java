/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.42
 * Generated at: 2018-08-24 09:45:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class customerOrderDetailForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=gbk");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("<!--\r\n");
      out.write(".wr{font-size: 12pt; line-height: 22px}\r\n");
      out.write(".wr1 {\tFONT-SIZE: 12px; LINE-HEIGHT: 200%}\r\n");
      out.write(".wr2 {\tFONT-SIZE: 14px; LINE-HEIGHT: 150%}\r\n");
      out.write(".wr3 {\tFONT-SIZE: 12px}\r\n");
      out.write(".wr4 {\tFONT-SIZE: 12px; LINE-HEIGHT: 150%}\r\n");
      out.write("// -->\r\n");
      out.write("</style>\r\n");
      out.write("<title>我的详细订单 - 云工厂网上书店</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("</head>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "fgLeft.jsp", out, false);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("    <td bgcolor=\"#F8FEE8\">\r\n");
      out.write("      <table width=\"500\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("        <tr> \r\n");
      out.write("          <td>&nbsp;</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td class=\"wr1\">\r\n");
      out.write("            <div align=\"center\"><b><font color=\"#F68217\">我的详细订单</font></b></div>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td> <b></b></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr> \r\n");
      out.write("          <td class=\"wr4\"> </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("\t  <table width=\"500\" border=\"0\" cellspacing=\"1\" cellpadding=\"2\" align=\"center\" bgcolor=\"#000000\">\r\n");
      out.write("        <tr align=\"center\" bgcolor=\"#F8FEE8\"> \r\n");
      out.write("                \r\n");
      out.write("          <td width=\"70\" class=\"wr4\">名称</td>\r\n");
      out.write("                \r\n");
      out.write("          <td width=\"79\" class=\"wr4\">数量</td>\r\n");
      out.write("                \r\n");
      out.write("          <td width=\"73\" class=\"wr4\">云工厂价</td>\r\n");
      out.write("          \r\n");
      out.write("          <td width=\"73\" class=\"wr4\">订单编号</td>\r\n");
      out.write("                \r\n");
      out.write("          <td width=\"73\" class=\"wr4\">小计</td>\r\n");
      out.write("                \r\n");
      out.write("          <td width=\"73\" class=\"wr4\">订单日期</td>\r\n");
      out.write("                \r\n");
      out.write("       </tr>\r\n");
      out.write("       ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("     </table>\r\n");
      out.write("          \r\n");
      out.write("      ");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("      <p>&nbsp;</p>\r\n");
      out.write("      <p>&nbsp;</p>\r\n");
      out.write("      <p>&nbsp;</p>\r\n");
      out.write("      <p>&nbsp;</p>\r\n");
      out.write("      <p>&nbsp;</p>\r\n");
      out.write("      <p>&nbsp;</p>\r\n");
      out.write("      <p>&nbsp;</p>\r\n");
      out.write("      <p>&nbsp;</p>\r\n");
      out.write("      <p>&nbsp;</p>\r\n");
      out.write("      <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("        <tr> \r\n");
      out.write("          <td> \r\n");
      out.write("            <div align=\"right\"><img src=\"images/daodu36.gif\" width=\"593\" height=\"58\" alt=\"广告区\"></div>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>  \r\n");
      out.write("      <p align=\"center\" class=\"wr1\">淘书秀 | 寻书登记 | 好书快讯 | 文化沙龙 | 书店平台<br>\r\n");
      out.write("        关于书店 | 意见箱 | 联系我们</p>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"770\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"22\" background=\"images/dd-m09.gif\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("  <tr> \r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td class=\"wr1\" width=\"10\">&nbsp;</td>\r\n");
      out.write("    <td class=\"wr1\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr> \r\n");
      out.write("    <td><a href=\"http://www.qybook.com\"><img src=\"images/dd-009.gif\" width=\"36\" height=\"40\" alt=\"logo\" border=\"0\"></a></td>\r\n");
      out.write("    <td class=\"wr4\" width=\"10\">&nbsp;</td>\r\n");
      out.write("    <td class=\"wr4\"> 版权所有：<a href=\"http://www.qingyun.com\" target=\"_blank\">西安云工厂科技文化图书有限责任公司</a><br>\r\n");
      out.write("      地址：西安市高新一路25号创新大厦一楼　服务电话：029-8326696</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<script ></script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
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
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /customerOrderDetailForm.jsp(53,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("orderDetail");
    // /customerOrderDetailForm.jsp(53,7) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.orderDetails}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t       <tr bgcolor=\"#F8FEE8\" align=\"center\"> \r\n");
          out.write("\t                \r\n");
          out.write("\t          <td width=\"70\" class=\"wr4\">\r\n");
          out.write("\t          \t\t<a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("/ShowBookInfoByIdServlet?bookId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderDetail.bookId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderDetail.bookName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</a>\r\n");
          out.write("\t          </td>\r\n");
          out.write("\t                \r\n");
          out.write("\t          <td width=\"79\" class=\"wr4\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderDetail.num}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t                \r\n");
          out.write("\t          <td width=\"73\" class=\"wr4\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderDetail.ygcprice}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t          \r\n");
          out.write("\t          <td width=\"73\" class=\"wr4\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderDetail.oid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t                \r\n");
          out.write("\t          <td width=\"73\" class=\"wr4\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderDetail.ygcprice * orderDetail.num}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t                \r\n");
          out.write("\t          <td width=\"81\" class=\"wr4\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderDetail.oid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t       </tr>\r\n");
          out.write("       \r\n");
          out.write("       ");
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
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}