
package Servlets;


import DAO.Regdao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "libregister", urlPatterns = {"/libregister"})
public class libregister extends HttpServlet {


    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String fname = request.getParameter("fname");
            String idno = request.getParameter("id");
            String addr = request.getParameter("add");
            String unames  = request.getParameter("uname");
            String passw = request.getParameter("pass");
            
            Regdao signup = new Regdao();
            signup.input2(fname, idno, addr, unames,passw);
            response.sendRedirect("liblogin.jsp");
        } catch (Exception ex) {
            Logger.getLogger(libregister.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    

}