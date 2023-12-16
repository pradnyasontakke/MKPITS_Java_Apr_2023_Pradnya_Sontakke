/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mysql.cj.protocol.Resultset;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author LENOVO
 */
public class Statement extends HttpServlet {

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
            
            try{
                  Class.forName("com.mysql.cj.jdbc.Driver");
                   
                 Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_Application", "root", "root");
           
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Statement</title>");            
            out.println("</head>");
            out.println("<body>");
           PreparedStatement preparedStatement =connection.prepareStatement("Select * from transaction where userId=?");
            HttpSession httpsession=request.getSession(true);
            preparedStatement.setString(1, (String) httpsession.getAttribute("userId"));
            ResultSet resultset= preparedStatement.executeQuery();
               
            
        out.println("<h1><center>BANK STATEMENT</center></h1>");
             out.println(" <table align=center border=1 cellspacing=0 cellpadding=10>"
                    + "<tr>"
                    +"<th>userId</th>"
                    +"<th>Date</th>"
                    +"<th>balabce</th>"
                    +"<th>Type</th>"
                    +"</tr>");
                    while (resultset.next()) {       
                    out.println("<tr>"
                    +"<td>"+resultset.getString(1)+"</td>"
                 
                    +"<td>"+resultset.getDate(2)+"</td>"     
                    +"<td>"+resultset.getString(3)+"</td>"     
                    +"<td>"+resultset.getString(4)+"</td>"     
                    + "</tr>");
            }
                    
                    preparedStatement =connection.prepareStatement("Select balance from Registration where userId=?");
             preparedStatement.setString(1, (String) httpsession.getAttribute("userId")); 
          resultset=  preparedStatement.executeQuery();
           
                    while (resultset.next()) {       
                    out.println("<tr>"
                
                  +"<td colspan=2></td>"
                        
                    +"<td >"+"Total="+resultset.getDouble(1)+"</td>"
                            +"<td></td>"
                    + "</tr>");
            }
            
            out.println("</table");
           
            
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
