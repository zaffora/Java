package zaffora;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Category> result = GetCategories();

        result.forEach(

                category -> System.out.println("Category ID: " + category.getCategory_id() + "  Category Name: " + category.getCategory())

        );

    }


    public static ArrayList<Category> GetCategories(){

        ArrayList<Category> tempList = new ArrayList<>();

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
            String strSelect = "select * from category";
            System.out.println("The SQL statement is: " + strSelect + "\n"); // Echo For debugging

            ResultSet rset = stmt.executeQuery(strSelect);

            // Step 4: Process the ResultSet by scrolling the cursor forward via next().
            //  For each row, retrieve the contents of the cells with getXxx(columnName).
            System.out.println("The records selected are:");
            int rowCount = 0;
            while(rset.next()) {   // Move the cursor to the next row, return false if no more row
                String category = rset.getString("category");
                //double price = rset.getDouble("price");
                int id  = rset.getInt("category_id");
               // System.out.println(title + ", " + qty);

                Category c = new Category(id, category);

                tempList.add(c);
                ++rowCount;
            }
           // System.out.println("Total number of records = " + rowCount);

        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        return tempList;

    }

}
