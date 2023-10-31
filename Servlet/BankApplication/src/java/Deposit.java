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
public class Deposit extends HttpServlet {

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
        try (PrintWriter out = response.getWriter())
        {
            /* TODO output your page here. You may use following sample code. */
            String str="deposite";       //i want to show the msg in database which type of amount is inserted
              int add_amount=Integer.parseInt(request.getParameter("amt"));
                     try{
                         
                 Class.forName("com.mysql.cj.jdbc.Driver");
                 Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_Application", "root", "root");
                 PreparedStatement preparedStatement = connection.prepareStatement("insert into transaction values(?,?,?,?)");
                 //preparedStatement is the interface and prepareStatement is the method of that
  
                //session tracking for the call
               HttpSession httpsession=request.getSession(true);
                long Time=httpsession.getCreationTime();
                  
              
               preparedStatement.setString(1, (String) httpsession.getAttribute("f"));
        preparedStatement.setDate(2,new java.sql.Date(Time));
              preparedStatement.setInt(3,add_amount);
               preparedStatement.setString(4,str);
               preparedStatement.executeUpdate();
                          

          preparedStatement =connection.prepareStatement("update  Registration set balance=balance+? where userID=?");               
          preparedStatement.setInt(1,add_amount);
         preparedStatement.setString(2, (String) httpsession.getAttribute("f"));
          int r=preparedStatement.executeUpdate();

                     }catch (Exception e)
            {out.println(e);}
              
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Deposit</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>successfully deposited</h2>");
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
