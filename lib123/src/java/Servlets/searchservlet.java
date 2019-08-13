package Servlets;


import DAO.searchdao;
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


@WebServlet(name = "searchservlet", urlPatterns = {"/searchservlet"})
public class searchservlet extends HttpServlet {

    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String bname = request.getParameter("bname");
          
         
            searchdao log = new searchdao();
            
            
            if (log.check1(bname))
            {
                HttpSession session = request.getSession();
                session.setAttribute("bname", bname);
                response.sendRedirect("viewsearch.jsp");
            }
            else{
                HttpSession session2 = request.getSession();
                session2.setAttribute("errorMessage", "Invalid Search");
                response.sendRedirect("menu.jsp");
            }
        } catch (Exception ex) {
            Logger.getLogger(loginservlert.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
