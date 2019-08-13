package Servlets;


import DAO.logdao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "loginservlet", urlPatterns = {"/loginservlet"})
public class loginservlert extends HttpServlet {

    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String uname = request.getParameter("uname");
            String pass = request.getParameter("pass");
            
            logdao log = new logdao();
            
            
            if (log.check(uname, pass))
            {
                HttpSession session = request.getSession();
                session.setAttribute("uname", uname);
                response.sendRedirect("menu.jsp");
            }
            else{
                HttpSession session2 = request.getSession();
                session2.setAttribute("errorMessage", "Invalid Username OR Password");
                response.sendRedirect("liblogin.jsp");
            }
        } catch (Exception ex) {
            Logger.getLogger(loginservlert.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
