package Servlets;


import DAO.locationdao;
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


@WebServlet(name = "locationservlet", urlPatterns = {"/locationservlet"})
public class locationservlet extends HttpServlet {

    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String bname = request.getParameter("bname");
          String location = request.getParameter("locations");
         
            locationdao log = new locationdao();
            
            
            if (log.check3(bname))
            {
                HttpSession session = request.getSession();
                session.setAttribute("bname", bname);
                response.sendRedirect("locationview.jsp");
            }
            else{
                HttpSession session2 = request.getSession();
                session2.setAttribute("errorMessage", "Invalid update");
                response.sendRedirect("menu.jsp");
            }
        } catch (Exception ex) {
            Logger.getLogger(loginservlert.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
