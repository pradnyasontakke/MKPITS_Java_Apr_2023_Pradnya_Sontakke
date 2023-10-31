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
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author LENOVO
 */
public class LoginPage extends HttpServlet {

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
             String user = request.getParameter("uid");
            String password = request.getParameter("pw");
            try{
                   Class.forName("com.mysql.cj.jdbc.Driver");
                   
                 Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_Application", "root", "root");
   PreparedStatement preparedStatement =connection.prepareStatement("select * from Registration where userID=? and password=?");
            preparedStatement.setString(1,user);
            preparedStatement.setString(2,password);
            
            
             out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginPage</title>");            
            out.println("</head>");
            out.println("<body>");
            
              ResultSet resultSet= preparedStatement.executeQuery();
                 if(resultSet.next()){
            out.println("Successfully login");
            
            
            //get user id using session trcking
            HttpSession httpsession=request.getSession(true);            
            httpsession.setAttribute("f",user);
            
            
            
          RequestDispatcher sendrequest=request.getRequestDispatcher("welcome.html");
            sendrequest.forward(request, response);
            }
            else{
            out.println("Incorrect Password ");
            }
            
            }catch(Exception e){out.println(e);}
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
