
package serv;

import Daolib.LibRegisterDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class libregisterservlet extends HttpServlet {




    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        
       String fname   = request.getParameter("name");
        String id    = request.getParameter("id");
         String add  = request.getParameter("address");
        String unames = request.getParameter("uname");
        String pwd = request.getParameter("password");
        
        PrintWriter out=response.getWriter();
        LibRegisterDao rb = new LibRegisterDao();
        
        try {
            rb.input(fname,id,add,unames,pwd);
           response.sendRedirect("liblogin.jsp");
        } 
        catch (Exception e) {
           out.println(e);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
