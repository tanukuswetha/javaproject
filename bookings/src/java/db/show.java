/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package db;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Tanuku Swetha
 */
public class show extends HttpServlet {

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
        PrintWriter out=response.getWriter();
         out.println("<html>\n" +"<head>");
         out.println("<title>Arena</title>");
         out.println("<style>\n" +
"            div.a{\n" +
"        text-align: left;\n" +
"        float: left;\n" +
"    }\n" +
"     div.b{\n" +
"                text-decoration: none;\n" +
"                text-align: right;\n" +
"            }\n" +
"            div.c{\n" +
"                text-align: center;\n" +
"                position: center;\n" +
"            }\n" +
"            div.d{\n" +
"                text-align: center;\n" +
"                position: center;\n" +
"                margin-top: 80px;\n" +
"            }\n" +
"            b{\n" +
"                font-family: Verdana, Geneva, Tahoma, sans-serif;\n" +
"                font-size: 16pt;\n" +
"            }\n" +
"            a.jan{\n" +
"               color:black;\n" +
"        font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;\n" +
"        text-decoration: none;\n" +
"        font-size: 17.5pt;\n" +
"        text-align: right;\n" +
"        position: right; \n" +
"            }\n" +
"            a.feb{\n" +
"                       color:black;\n" +
"                font-family: Brush Script MT, Brush Script Std, cursive;\n" +
"                font-size: 25pt;\n" +
"                text-decoration: none;\n" +
"                margin-left: 20px;\n" +
"            }\n" +
"             button.a{\n" +
"                width: 75px;\n" +
"                height: 25px;\n" +
                 "font-size:12pt;\n"+
"            }  \n" +
                 "a.mar{\n" +
                "text-decoration: none;\n" +
                "font-size: 12pt;\n" +
            "}\n" +
                  "i{\n" +
                "font-size: 15pt;\n" +
            "}\n" +
"            input.apple{\n" +
"                width:200px;\n" +
"                height: 30px;\n" +
"            }\n" +
"        </style>\n" +
"    </head>");
         out.println(" <body>\n" +
"         <div class=\"a\">\n" +
"             <a class=\"feb\" href=\"index.html\" target=\"_self\">Arena</a>\n" +
"        </div>\n" +
"       <div class=\"b\">\n" +
"            <a class=\"jan\" href=\"index.html\">Logout</a>\n" +
"        </div>\n" +
"        <div class=\"d\">\n" +
"            <h1>Seat booking in Chidabaram Stadium for </h1>\n" +
"        </div>\n" +
"        <div class=\"c\">\n" +
"        <form action=\"show\" method=\"post\">\n" +
"            \n" +
"            </div>\n" +
"        </form>");
         String mid=request.getParameter("id");
        try {
            /* TODO output your page here. You may use following sample code. */
            Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/srkr","root","Server@22");
           PreparedStatement ps=con.prepareStatement("select * from dates where mid=?;");
           Double a=Double.parseDouble(mid);
          ps.setDouble(1,a);
           ResultSet rs=ps.executeQuery();
           while(rs.next()){
           int matchid=rs.getInt(1);
           String ta=rs.getString(2);
           String tb=rs.getString(3);
           String ty=rs.getString(4);
           String date=rs.getString(5);
           
           out.print("<div class=\"d\">\n" +
"            <form action=\"pay\" method=\"post\">");
           
           out.print("<b>Match id</b>&emsp;<i>"+matchid+"<br><b>Team A</b>&emsp;<i>"+ta+"<br><b>Team B</b>&emsp;<i>"+tb+"<br><b>Match type</b>&emsp;<i>"+ty+"<br><b>Match date</b>&emsp;<i>"+date+"<br><br>");
           out.println("<b>Name:</b>&emsp;<input type=\"text\" name=\"nam\" placeholder=\"Enter your name\"><br><br>\n" +
                   "<b>Match id</b>&emsp;<input type=\"text\" name=\"id\" placeholder=\"Enter the match id\"><br><br>\n" +
"             <b>No. of seats:</b>&emsp;<input type=\"tel\" name=\"seats\" placeholder=\"Enter no of seats\"><br><br>\n" +
"             <b>Email Id:</b>&emsp;<input type=\"text\" name=\"phn\" placeholder=\"Enter Mail Id\"><br><br>");
           out.println("<b>Amount per seat:550Rs</b><br><br>");
           out.println("<button class=\"a\" type=\"button\"><a class=\"mar\" href=\"matches.jsp\">Cancel</a></button>&emsp;&emsp;\n" +
"             <button class=\"a\" type=\"submit\">Submit</button>");
           
           }
           out.println("</form></div>");  
             out.println("</html></body>");  
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
