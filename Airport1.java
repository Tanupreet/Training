package com.tanu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
 
public class Airport1 {
 
    public static final String delimiter = ",";
 
    public static void read(String csvFile) {
        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
 
            String line = "";
 
            String[] tempArr;
            while ((line = br.readLine()) != null) {
               tempArr = line.split(delimiter);
               // for (String tempStr : tempArr) {
                	
                	//String[] strArray = new String[] {tempStr};
                	List list = Arrays.asList(tempArr);
                	
                	  // System.out.println(tempArr);
                    //get an iterator
                    Iterator itr = list.iterator();
                 //   System.out.print(tempStr + " ");
              
                	   while(itr.hasNext())
                		      System.out.println(itr.next());
                	   System.out.println();
                }
                System.out.println();
            
            br.close();
    
        } catch (IOException ex) {
            ex.printStackTrace();
        }
 
    }
 
   /* @Override
	public String toString() {
		System.out.println(+" "+" "+" ");;
	}*/

	public static void main(String[] args) {
        // csv file to read
        String csvFile = "C:\\Users\\Training\\Downloads/airport.csv";
       Airport1.read(csvFile);
      Airport1 obj=new Airport1(); 
      
      
      
      
      
    }
  /*  public static void put() {
       Connection con = null;
       PreparedStatement pstmt = null;
       String sql = "INSERT INTO airport VALUES (?, ?)";
       pstmt = con.prepareStatement(sql);
       
       pstmt.setString(1, "city_name" );
       pstmt.setArray(2, tempArr );
       pstmt.executeUpdate();
    }*/
 
}