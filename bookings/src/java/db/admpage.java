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
public class admpage extends HttpServlet {

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
"       div.first{\n" +
"           text-align: center;\n" +
"           position: center;\n" +
"           border-style: none;\n" +
"           height: 110px;\n" +
"\n" +
"       }\n" +
"       \n" +
"       div.third{\n" +
"           \n" +
"           float: left;\n" +
"           margin-left: 300px;\n" +
"           margin-top: 50px;\n" +
"       }\n" +
"       div.fourth{\n" +
"           \n" +
"           float:right;\n" +
"           margin-right: 340px;\n" +
"           margin-top: 50px;\n" +
"       }\n" +
"       div.second{\n" +
"        text-align: center;\n" +
"           position: center;\n" +
"           border-style:none;\n" +
"           margin-top: 140px;\n" +
"       }\n" +
"       a.one{\n" +
"           color: black;\n" +
"           font-family: Verdana, Geneva, Tahoma, sans-serif;\n" +
"           font-size: 14pt;\n" +
"           text-decoration: none;\n" +
"       }\n" +
"       sub{\n" +
"           font-size: 14pt;\n" +
"       }\n" +
"        a.jan{\n" +
"               color:black;\n" +
"        font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;\n" +
"        text-decoration: none;\n" +
"        font-size: 17.5pt;\n" +
"        text-align: right;\n" +
"        position: right; \n" +
"            }\n" +
"            button.a{\n" +
"                width: 190px;\n" +
"                height: 50px;\n" +
"            }\n" +
"            a.feb{\n" +
"                       color:black;\n" +
"                font-family: Brush Script MT, Brush Script Std, cursive;\n" +
"                font-size: 25pt;\n" +
"                text-decoration: none;\n" +
"                margin-left: 20px;\n" +
"            }\n" +
"            i{\n" +
"                font-size: 14pt;\n" +
"            }\n" +
"        </style>\n" +
"    </head>");
         out.println("<body>\n" +
"        \n" +
"        <div class=\"a\">\n" +
"             <a class=\"feb\" href=\"index.html\" target=\"_self\">Arena</a>\n" +
"        </div>\n" +
"       <div class=\"b\">\n" +
"            \n" +
"            <a class=\"jan\" href=\"index.html\">Logout</a>\n" +
"        </div>\n" +
"        <div class=\"third\">\n" +
"            \n" +
"            <button  class=\"a\" type=\"submit\"><a class=\"one\" href=\"adding.jsp\"> Add Match</a></button>\n" +
"           \n" +
"        </div>\n" +
"        <div class=\"fourth\">\n" +
"            \n" +
"                <button  class=\"a\" type=\"submit\"><a class=\"one\" href=\"deleting.jsp\">Remove Match</a></button>\n" +
"\n" +
"        </div>\n" +
"        <div class=\"second\">\n" +
"            <form action=\"admpage\" method=\"post\">\n" +
"                <button  class=\"a\" type=\"submit\"><i>Show the Matches</i></button>\n" +
"            </form>\n" +
"        </div> ");
        try{
            /* TODO output your page here. You may use following sample code. */
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/srkr","root","Server@22");
           PreparedStatement ps=con.prepareStatement("select * from dates;");
           ResultSet rs=ps.executeQuery();
           out.println("<div class=\"first\"><table align='center' border=1 width=50% height=50%>");  
             out.println("<tr><th>MatchId</th><th>Team A</th><th>Team B</th><th>Match type</th><th>Date</th><tr>");  
             while (rs.next()) 
             {  
                 int id = rs.getInt(1);  
                 String t1 = rs.getString(2);
                 String t2 = rs.getString(3);
                 String type=rs.getString(4);
                 String date = rs.getString(5);   
                 out.println("<tr><td>" + id + "</td><td>" + t1+ "</td><td>" + t2+ "</td><td>" + type +  "</td><td>" + date + "</td></tr>");  
        }
             out.println("</table></div>");  
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
