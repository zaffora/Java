package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaInsertSample {
	
	 // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost:3306/goog?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "q1w2e3r4t5y6";
	   
	   public static void main(String[] args) {
	   Connection conn = null;
	   Statement stmt = null;

	   try{
	      //STEP 2: Register JDBC driver
	      Class.forName("com.mysql.jdbc.Driver");

	      //STEP 3: Open a connection
	      System.out.println("goog");
	      conn = DriverManager.getConnection(DB_URL, USER, PASS);
	      System.out.println("Connected database successfully...");
	      
	      //STEP 4: Execute a query
	      System.out.println("Inserting records into the table...");
	      stmt = conn.createStatement();
	      
	      String sql = "INSERT INTO Registration " +
	                   "VALUES (100, 'Zara', 'Ali', 18)";
	      stmt.executeUpdate(sql);
	      sql = "INSERT INTO Registration " +
	                   "VALUES (101, 'Mahnaz', 'Fatma', 25)";
	      stmt.executeUpdate(sql);
	      sql = "INSERT INTO Registration " +
	                   "VALUES (102, 'Zaid', 'Khan', 30)";
	      stmt.executeUpdate(sql);
	      sql = "INSERT INTO Registration " +
	                   "VALUES(103, 'Sumit', 'Mittal', 28)";
	      stmt.executeUpdate(sql);
	      System.out.println("Inserted records into the table...");

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
	   }//end try
	   System.out.println("Goodbye!");
	}//end main
	}//end JDBCExample


