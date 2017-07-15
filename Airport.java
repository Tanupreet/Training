package com.tanu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Airport {

	String city_name;
	String airport_code;
	String airport_name;
	public Airport(String city_name, String airport_code, String airport_name) {
		super();
		this.city_name = city_name;
		this.airport_code = airport_code;
		this.airport_name = airport_name;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getAirport_code() {
		return airport_code;
	}
	public void setAirport_code(String airport_code) {
		this.airport_code = airport_code;
	}
	public String getAirport_name() {
		return airport_name;
	}
	public void setAirport_name(String airport_name) {
		this.airport_name = airport_name;
	}
	
	public static void main(String args[]) throws IOException, ClassNotFoundException, SQLException
	{
		String conString="jdbc:mysql://localhost:4444/mysql";
		Connection con = DriverManager.getConnection(conString, "root", "root");
        String query = "Insert into airport values(?,?,?,?)";
                PreparedStatement st = con.prepareStatement(query);
                st.executeUpdate(query);        


try { 
        BufferedReader bReader = new BufferedReader(new FileReader("airport.csv"));
        String line = ""; 
        while ((line = bReader.readLine()) != null) {
            try {

                if (line != null) 
                {
                    String[] array = line.split(",+");
                    for(String result:array)
                    {
                        System.out.println(result);
 //Create preparedStatement here and set them and excute them
                PreparedStatement ps = con.createPreparedStatement(query);
                 ps.setString(1,);
                 ps.setString(2,);
                 ps.setString(3,);
                
                 ps.excuteUpdate();
                 ps. close();
   //Assuming that your line from file after split will folllow that sequence

                    }
                } 
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            finally
            {
               if (bReader == null) 
                {
                    bReader.close();
                }
            }
        }
    } catch (FileNotFoundException ex) {
        ex.printStackTrace();
    }
}
}