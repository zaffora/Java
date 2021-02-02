package sample;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

public class MySQL {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/goog?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";

    //  Database credentials
   private static final String USER = "root";
   private static final String PASS = "q1w2e3r4t5y6";

    public static ArrayList<database> getCategories(double rating){

        ArrayList<database> tempList = new ArrayList<>();

        try (
                // Step 1: Allocate a database 'Connection' object
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/goog?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "q1w2e3r4t5y6");   // For MySQL only
                // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"

                // Step 2: Allocate a 'Statement' object in the Connection
                Statement stmt = conn.createStatement();
        ) {
            // Step 3: Execute a SQL SELECT query. The query result is returned in a 'ResultSet' object.
            String strSelect = "select app_name, rating, reviews from apps where rating = " + rating;
            System.out.println("The SQL statement is: " + strSelect + "\n"); // Echo For debugging

            ResultSet rset = stmt.executeQuery(strSelect);

            // Step 4: Process the ResultSet by scrolling the cursor forward via next().
            //  For each row, retrieve the contents of the cells with getXxx(columnName).
            System.out.println("The records selected are:");
            int rowCount = 0;
            while(rset.next()) {   // Move the cursor to the next row, return false if no more row
                String category = rset.getString("app_name");
                //double price = rset.getDouble("price");
                double id  = rset.getInt("rating");
                // System.out.println(title + ", " + qty);
                String review = rset.getString("reviews");

                database c = new database(id, category);

                tempList.add(c);
                ++rowCount;
            }
            // System.out.println("Total number of records = " + rowCount);

        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        return tempList;

    }

    public void insert(String insertValues) {

        Connection conn = null;
        Statement stmt = null;
        String sql = " ";

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

            sql = "INSERT INTO apps " + "(app_name, reviews)" + " VALUES (" + insertValues + ")";
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
    }

    public void modify(String appName, String review) {
        Connection conn = null;
        Statement stmt = null;
        String sql = " ";

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

            sql = "UPDATE INTO " + "apps " + "SET reviews = " + review + "WHERE  app_name - " + appName;
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
    }

    public void addUser(String userName, String password){
        Connection conn = null;
        Statement stmt = null;
        String sql = " ";

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

            sql = "INSERT INTO users " + "(user_name, user_password)" + " VALUES (" + userName + " , " + password + ")";
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
    }

}
