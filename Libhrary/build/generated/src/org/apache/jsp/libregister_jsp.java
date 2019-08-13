package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class libregister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>Register</title>\n");
      out.write("\t</head>\n");
      out.write("\n");
      out.write("\t<body>\n");
      out.write("\n");
      out.write("             \n");
      out.write("\t\t<h1 align=\"center\">Register</h1>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<form action=\"libregisterservlet\" method=\"post\" >\n");
      out.write("\t\n");
      out.write("\t\t\t Name:\t<input type=\"text\" name=\"name\" placeholder=\"Enter your name\"> <br>\n");
      out.write("\n");
      out.write("\t\t\t ID no:\t<input type=\"text\" name=\"id\" placeholder=\"Enter your ID number\"> <br>\n");
      out.write("\n");
      out.write("\t\t\t Address:\t<input type=\"text\" name=\"address\" placeholder=\"Enter your Address\"> <br>\n");
      out.write("\n");
      out.write("\t\t\t User name :\t<input type=\"text\" name=\"uname\" placeholder=\"Enter your User name\"> <br>\n");
      out.write("\n");
      out.write("\t\t\tPassword :\t<input type=\"password\" name=\"lpassword\" placeholder=\"Enter Your password\"><br>\n");
      out.write("\t\n");
      out.write("                        <input type=\"submit\" value=\"Create Account\" />\n");
      out.write("                        \n");
      out.write("\t\t\t</form>\n");
      out.write("\t</body>\n");
      out.write("\n");
      out.write("\t</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
