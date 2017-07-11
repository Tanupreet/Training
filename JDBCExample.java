package com.tanu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
	public static String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	public static String DATABASE_URL = "jdbc:mysql://localhost:4444/test";
	public static String USER_NAME = "root";
	public static String PASSWORD = "root";

	   
	   public static void main(String[] args) {
	   Connection conn = null;
	   Statement stmt = null;
	   
	   
	   try{
	      //STEP 2: Register JDBC driver
	      Class.forName("com.mysql.jdbc.Driver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to a selected database...");
	      conn = DriverManager.getConnection(DATABASE_URL, USER_NAME, PASSWORD);
	      System.out.println("Connected database successfully...");
	      
	      //STEP 4: Execute a query
	      System.out.println("Inserting records into the table...");
	      stmt = conn.createStatement();
	      
	      String sql = "CREATE TABLE Registration " +
                  "(id INTEGER not NULL, " +
                  " first VARCHAR(255), " + 
                  " last VARCHAR(255), " + 
                  " age INTEGER, " + 
                  " PRIMARY KEY ( id ))"; 

     stmt.executeUpdate(sql);
     System.out.println("Created table in given database...");
  }catch(SQLException se){
     //Handle errors for JDBC
     se.printStackTrace();
  }catch(Exception e){
     //Handle errors for Class.forName
     e.printStackTrace();
  }finally{
     //finally block used to close resources
     try{
        if(stmt!=null)
           conn.close();
     }catch(SQLException se){
     }// do nothing
     try{
        if(conn!=null)
           conn.close();
     }catch(SQLException se){
        se.printStackTrace();
     }//end finally try
  }
	      
	      String sql1 = "INSERT INTO Registration " +
	                   "VALUES (100, 'Zara', 'Ali', 18)";
	      stmt.executeUpdate(sql1);
	      sql1 = "INSERT INTO Registration " +
	                   "VALUES (101, 'Mahnaz', 'Fatma', 25)";
	      stmt.executeUpdate(sql1);
	      sql1 = "INSERT INTO Registration " +
	                   "VALUES (102, 'Zaid', 'Khan', 30)";
	      stmt.executeUpdate(sql1);
	      sql1 = "INSERT INTO Registration " +
	                   "VALUES(103, 'Sumit', 'Mittal', 28)";
	      stmt.executeUpdate(sql1);
	      System.out.println("Inserted records into the table...");
	   }

	   System.out.println("I WAS HERE");
}
	   /*catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{
	      //finally block used to close resources
	      try{
	         if(stmt!=null)
	            conn.close();
	      }catch(SQLException se){
	      }// do nothing
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }//end finally try
*/	   //end try
	   
	//end main
	//end JDBCExample