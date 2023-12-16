//in the transfer money firstly doing that where we want to out the money and in which user id  we want to in the money 




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
public class TransferAmount extends HttpServlet {

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
            //out amount
           String amount_out ="debit";
              //in amount  (added amount)
            String amount_in="credit";
            
            String transferamountout=request.getParameter("amt");   //kuthe add hot ahe
                   
            String transferinid=request.getParameter("uid");
            
     
           
                Class.forName("com.mysql.cj.jdbc.Driver");
                 Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_Application", "root", "root");
                 PreparedStatement preparedStatement = connection.prepareStatement("insert into transaction values(?,?,?,?)");
                 
                   //  for the out amount
                   HttpSession httpsession=request.getSession(true);
                    String id=(String) httpsession.getAttribute("f");     //using getAttibrute we can get the id of session
                       long Time=httpsession.getCreationTime();
                       
         //this code for the transfer html  page    where amount is inn (add) this is transaction user where amount inn           
        preparedStatement.setString(1,transferinid);
        preparedStatement.setDate(2,new java.sql.Date(Time));
              preparedStatement.setString(3,transferamountout);
               preparedStatement.setString(4,amount_in);
               preparedStatement.executeUpdate();
               
               //write code in which user id amount is  deducted (main login user id)
              preparedStatement= connection.prepareStatement("update Registration set balance=balance+? where userId=?");
                    preparedStatement.setString(1,transferamountout);  //where we want to add
                   preparedStatement.setString(2, transferinid);
                      preparedStatement.executeUpdate();
                   
                   PreparedStatement preparedStatement1= connection.prepareStatement("insert into transaction values(?,?,?,?)");
                         preparedStatement1.setString(1,id);
                         preparedStatement1.setDate(2, new java.sql.Date(Time));
                         preparedStatement1.setString(3,transferamountout);
                         preparedStatement1.setString(4,amount_out);
                         preparedStatement1.executeUpdate();
           
                   preparedStatement= connection.prepareStatement("update Registration set balance=balance-? where userId=?");
                    preparedStatement.setString(1,transferamountout);  //where we want to add
                   preparedStatement.setString(2,id);
                      preparedStatement.executeUpdate();


               out.println("money transfer successfully");

            }catch(Exception e){
            out.println(e);}

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("</head>");
            out.println("<body>");
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
 