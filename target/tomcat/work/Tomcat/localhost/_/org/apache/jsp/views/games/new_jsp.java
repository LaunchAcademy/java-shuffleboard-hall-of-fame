/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-04-27 21:59:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.games;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class new_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>Add Shuffleboard Game!</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <h2>Add a Shuffleboard Game!</h2>\n");
      out.write("  <form action=\"/games\" method=\"post\">\n");
      out.write("    <div>\n");
      out.write("      <label for=\"redTeamPlayer1\">Red Team Player 1</label>\n");
      out.write("      <input type=\"text\" id=\"redTeamPlayer1\" name=\"redTeamPlayer1\">\n");
      out.write("    </div>\n");
      out.write("    <div>\n");
      out.write("      <label for=\"redTeamPlayer2\" >Red Team Player 2</label>\n");
      out.write("      <input type=\"text\" id=\"redTeamPlayer2\" name=\"redTeamPlayer2\">\n");
      out.write("    </div>\n");
      out.write("    <div>\n");
      out.write("      <label for=\"redTeamScore\" >Red Team Score</label>\n");
      out.write("      <input type=\"text\" id=\"redTeamScore\" name=\"redTeamScore\">\n");
      out.write("    </div>\n");
      out.write("    <div>\n");
      out.write("      <label for=\"blueTeamPlayer1\" >Blue Team Player 1</label>\n");
      out.write("      <input type=\"text\" id=\"blueTeamPlayer1\" name=\"blueTeamPlayer1\">\n");
      out.write("    </div>\n");
      out.write("    <div>\n");
      out.write("      <label for=\"blueTeamPlayer2\" >Blue Team Player 2</label>\n");
      out.write("      <input type=\"text\" id=\"blueTeamPlayer2\" name=\"blueTeamPlayer2\">\n");
      out.write("    </div>\n");
      out.write("    <div>\n");
      out.write("      <label for=\"blueTeamScore\" >Blue Team Score</label>\n");
      out.write("      <input type=\"text\" id=\"blueTeamScore\" name=\"blueTeamScore\">\n");
      out.write("    </div>\n");
      out.write("    <input type=\"submit\"/>\n");
      out.write("  </form>\n");
      out.write("</body>\n");
      out.write("</html>");
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
}
