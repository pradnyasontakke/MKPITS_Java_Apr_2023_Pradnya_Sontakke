/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author LENOVO
 */
public class withdraw extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String str="withraw";
            int wd=Integer.parseInt(request.getParameter("withdraw"));
            
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_Application", "root", "root");
                
                PreparedStatement preparedstatement=connection.prepareStatement("insert into transaction values(?,?,?,?)");
            
               
                HttpSession httpsession =request.getSession(true);
                long time=httpsession.getCreationTime();
                
                
               // preparedstatement.setParameter
                preparedstatement.setString(1, (String) httpsession.getAttribute("f"));  //get userId
                 preparedstatement.setDate(2,new java.sql.Date(time));                      //get date
                 preparedstatement.setInt(3,wd);
                // preparedstatement.setString(3, "withdraw"); 
                preparedstatement.setString(4,str);
                
                preparedstatement=connection.prepareStatement("update  Registration set balance=balance-? where userID=?");
                                 preparedstatement.setInt(1,wd);
// preparedstatement.setString(1, "withdraw"); 
                preparedstatement.setString(2, (String) httpsession.getAttribute("f"));  //get userId
                int u=preparedstatement.executeUpdate();
                out.println("bye");
            }catch(Exception e){out.println (e);}
             
           

            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet withdraw</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("Amount Withdraw Successfully");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
