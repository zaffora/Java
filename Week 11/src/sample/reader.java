package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

// reads the MySQL database

public class reader {

    database database = new database();

    public static ArrayList<database> GetCategories(double rating){

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
            String strSelect = "select app_name, rating from apps where rating = " + rating;
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

    @Override
    public String toString(){
        return String.format("Application Name: %s , Rating: %d", database.getApp(), database.getRating());
    }

}
