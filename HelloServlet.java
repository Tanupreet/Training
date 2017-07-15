package com.tanu;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.setContentType("text/html");
        String conString = "jdbc:mysql://localhost:4444/mysql";
       
        PrintWriter out = response.getWriter();
        String Name = request.getParameter("name");
        System.out.println(Name);
        String name = String.valueOf(Name);
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        try (Connection con = DriverManager.getConnection(conString, "root", "root")) {
 
            // Connection con = DriverManager.getConnection();
            Statement ps = con.createStatement();
            String query = "select * from person where name =\'" + name +"\'";
            ResultSet rs = ps.executeQuery(query);
            System.out.println(rs);
         //   out.print("helloooo \n");
 
            while (rs.next()) {
                System.out.println("HellO" + name);
                out.print(rs.getString(1));
                out.print("-----------");
                out.print(rs.getInt(2));
              /*  out.print("-----------");
                out.print(rs.getString(3));*/
            }
        } catch (Exception e) {
            e.printStackTrace();
        }                                      
    }
 
}