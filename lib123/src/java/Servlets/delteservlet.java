/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DAO.deletedao;
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


@WebServlet(name = "delteservlet", urlPatterns = {"/delteservlet"})
public class delteservlet extends HttpServlet {


   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            
            throws ServletException, IOException {
        DAO.deletedao del = new deletedao();
        try {
            HttpSession ac= request.getSession(); 
           del.delete((String) ac.getAttribute("bname"));
           ac.removeAttribute("bname");
           ac.invalidate(); 
           response.sendRedirect("view.jsp");
            
            
            
        } 
        
        
        catch (Exception ex) {
           Logger.getLogger(loginservlert.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}