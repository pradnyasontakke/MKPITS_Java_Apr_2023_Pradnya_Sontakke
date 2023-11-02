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

/**
 *
 * @author LENOVO
 */
public class Regishtration extends HttpServlet {

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
          String uId=request.getParameter("u");    //uID is the object and second uid is the name where we write in html page
          String pw=request.getParameter("pw");
          String name=request.getParameter("nm");
           String add=request.getParameter("add");
            String city1 =request.getParameter("ct");
            String emailid =request.getParameter("emal");
             String balance1=request.getParameter("bal");
             
             try{
                 Class.forName("com.mysql.cj.jdbc.Driver");
                 Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_Application", "root", "root");
                   PreparedStatement preparedStatement = connection.prepareStatement("insert into Registration values(?,?,?,?,?,?,?)");
                     preparedStatement.setString(1,uId);
                     preparedStatement.setString(2,pw);
                     preparedStatement.setString(3,name);
                     preparedStatement.setString(4,add);
                     preparedStatement.setString(5,city1);
                     preparedStatement.setString(6,emailid);
                     preparedStatement.setString(7,balance1);

                          preparedStatement.executeUpdate();
                          out.println("Registered Successfully");
            out.println("<a href="+"index.html"+">"+"click here"+"</a>");
                          
             }catch(Exception e){
                   out.println(e);
               }
              
           
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
