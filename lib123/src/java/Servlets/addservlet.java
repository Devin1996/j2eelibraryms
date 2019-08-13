package Servlets;


import DAO.adddao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "addservlet", urlPatterns = {"/addservlet"})
public class addservlet extends HttpServlet {


    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String bname = request.getParameter("bname");
            String bauthor = request.getParameter("author");
            String blocation= request.getParameter("location");
            String bcategory  = request.getParameter("category");
            
            
            adddao signup = new adddao();
            signup.input3(bname, bauthor, blocation, bcategory);
            response.sendRedirect("view.jsp");
        } catch (Exception ex) {
            Logger.getLogger(libregister.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    

}