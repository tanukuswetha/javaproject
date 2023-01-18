/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package db;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Tanuku Swetha
 */
public class pay extends HttpServlet{

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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
         out.println("<html>\n" +"<head>");
         out.println("<title>Arena</title>");
         out.println("<style>");
         out.println("div.zero{\n" +
"        text-align: center;\n" +
"        margin-top: 230px;\n" +
"    \n" +
"    }\n" +
 

"               a.second{\n" +
"                       color:black;\n" +
"                font-family: Brush Script MT, Brush Script Std, cursive;\n" +
"                font-size: 24pt;\n" +
"                text-decoration: none;\n" +
"                margin-left: 20px;\n" +
"            }\n" +
                 " a.mango{\n" +
               " text-decoration: none;\n" +
           " }\n" +
                "  div.one{\n" +
       "  text-align: center;\n" +
       "  position: center;\n" +
   "  }\n" +
"        </style>\n" +
"    </head>");
         out.print("<body>\n" +
"        <div class=\"zero\">\n" +
"            <a class=\"second\" href=\"index.html\" target=\"_self\">Arena</a>\n" +"<b>Payment Proceeding</b>\n"+
"        </div>");
         Double capacity=50000.0;
         String name=request.getParameter("nam");
         String mid=request.getParameter("id");
         String phone=request.getParameter("phn");
         String no=request.getParameter("seats");
        Double i=Double.parseDouble(mid);
         
          Double b=Double.parseDouble(no);
         
        try {
            /* TODO output your page here. You may use following sample code. */
            Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/srkr","root","Server@22");
           PreparedStatement ps=con.prepareStatement("insert into booking values(?,?,?,?);");
           ps.setDouble(1, i);
           ps.setString(2, name);
           ps.setString(3,phone);
           ps.setDouble(4,b);
           
           int k=ps.executeUpdate();
            if(k>0){
                capacity=capacity-b;
                if(capacity>b){
               out.println("<div class=\"one\">");
               out.println("<b>Total Price for </b>"+b+"<b> no. of seats is:</b>"+(b*550)+"<br>");
               out.println(" <button type=\"button\"><a class=\"mango\" href=\"matches.jsp\">Done</a></button>");
               out.println("</div>"); 
            }
                else{
                    out.println("<script type=\"text/javascript\">");
                out.println("alert('All Seats are sold out!!!');");
                 out.println("</script>");
                }
           }
            
             out.println("</body></html>");  
             con.close();
           
        }
        catch(Exception e)
        {
            e.printStackTrace();
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
