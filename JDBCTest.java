package com.tanu;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	public static String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	public static String DATABASE_URL = "jdbc:mysql://localhost:4444/mysql";
	public static String USER_NAME = "root";
	public static String PASSWORD = "root";

	public static void main(String args[]) {
		Connection con = null;
		
		try {
			con = getConnection();
			System.out.println(con);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 insert();

		// delete();
		//update();
	}

	/*
	 * finally{ if(con != null) { try{ con.close(); }catch (SQLException e){
	 * e.printStackTrace(); } } }
	 */

	/*
	 * try { Class.forName("DRIVER_CLASS"); Connection con =
	 * DriverManager.getConnection("DATABASE_URL");
	 * 
	 * Statement stmt = con.createStatement(); ResultSet rs =
	 * stmt.executeQuery("select * from emp"); while (rs.next())
	 * System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " +
	 * rs.getString(3)); con.close(); } catch (Exception e) {
	 * System.out.println(e); } }
	 */

	/*public static void insert(final Person person) {
		Connection con = null;
		Statement stmt = null;
		final String INSERT = "INSERT INTO person VALUES(\'" + person.getName() + "\'," + person.getAge() + ",\'"
				+ person.getGender() + "\')";

		System.out.println(INSERT);
		try {
			con = getConnection();
			stmt = con.createStatement();
			stmt.execute(INSERT);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					close(con);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
*/
	
	/*public static void select(){
		Connection con = null;
		Statement stmt = null;
	    PreparedStatement pstmt=con.prepareStatement("select * from person");  
	    ResultSet rs=stmt.executeQuery();  
	    while(rs.next()){  
	    System.out.println(rs.getInt(1)+" "+rs.getString(2));  
	    }  	
	}*/
	
	
	public static void insert()
	{
		Connection con=null;
		try {
			CallableStatement stmt= con.prepareCall("{?= call sum(?,?)}");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void update() {

		Connection con = null;
		Statement stmt = null;
		PreparedStatement pstmt=null;
		String sql="update person set name=? where age=?";
		try {
			try {
				con = getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, "ABCD");
				pstmt.setInt(2, 23);
			//	int i=stmt.executeUpdate(sql);
				int rs = pstmt.executeUpdate();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Person getAllPerson() {
		Connection connection;
		return null;
	}

	public static void delete() {
		Connection con = null;
		Statement stmt = null;
		

		try {
			try {
				con = getConnection();
				stmt = con.createStatement();
				stmt.execute("delete from person where age=23");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER_CLASS);
		Connection connection = DriverManager.getConnection(DATABASE_URL, USER_NAME, PASSWORD);
		return connection;
	}

	public static Person get(final String personName) {
		final String GET_PERSON = "SELECT * FROM TEST WHERE NAME=" + personName;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			stmt = con.createStatement();

		} catch (Exception e) {
		}
		return null;
	}

	public static void close(final Connection con) throws SQLException {
		if (con != null) {
			con.close();
		}
	}

	public static void printPersons(final ResultSet rs) {
		if (rs == null) {
			System.out.println("No record fetched. ");
			return;
		}
		System.out.println(rs);
	}

}
