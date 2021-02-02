package sample;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
//import java.util.Date;
public class DataAccess{

    /**
     * Call this method to print out the records from category table in goog database
     */
    public static void Printout(){
        // write your code here

        ArrayList<Category> result = GetCategories();

        result.forEach(
                category -> System.out.println(category)
        );


        //ArrayList<Apps> result2 = GetApps();

    }

    public static ArrayList<Apps> GetApps() {
        ArrayList<Apps> temp = new ArrayList<>();
        return temp;
    }

    public static Connection Connect(String database, String userName, String password) throws Exception {

        // form a database connection string
        String db = "jdbc:mysql://localhost:3306/" + database + "?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";

        // try to create a connection string with valid user name and password
        try {
            //  Create  a database 'Connection' object
            Connection conn = DriverManager.getConnection(
                    db,
                    userName, password);   // For MySQL only
            return conn;
        } catch (Exception err) {
         throw err;
        }
    }


    /**
     *
     * @param conn  connection string
     * @param statement  String, a valid SQL Statement.
     * @return  Resultset, hold the data from database
     * @throws Exception
     */
    public static ResultSet QueryDatabase(Connection conn, String statement) throws Exception {

        try{
        Statement stmt = conn.createStatement();
         return stmt.executeQuery(statement);
        }
        catch(Exception err) {

            throw err;
        }
    }

    /**
     * @param
     * @param category
     * @throws Exception
     */
    public static void CreateCategory(String category) throws Exception {

        Connection conn = Connect("goog", "itndbadmin", "itnstudent");

       // String insertqsl = "INSERT INTO category  VALUES ( " + category + ")" ;


        String insertsql  = "insert into category(category_id, category) value (1058 ,'"  + category + "');";

        try{
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(insertsql);
        }
        catch(Exception err) {

            throw err;
        }

    }

    /**
     *
     *
     * @param cat
     * @throws Exception
     */

    public static void UpdateCategory(Category cat) throws Exception {

        Connection conn = Connect("goog", "itndbadmin", "itnstudent");

        //String updateqsl = "UPDATE category  SET category = ""+ cat.category  + "" WHERE category_id = " + cat.category_id;

        String update2 = "update category set category = '" + cat.category + "' where category_id = " + cat.category_id;

        try{
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(update2);
        }
        catch(Exception err) {

            throw err;
        }

    }


    /**
     *
     * @return returns an Arraylist for records from category in goog database
     */
    public static ArrayList<Category> GetCategories(){

        ArrayList<Category> tempList = new ArrayList<>();
        try

        {
            // Step 1: Execute a SQL SELECT query. The query result is returned in a 'ResultSet' object.
            String strSelect = "select * from category";
            System.out.println("The SQL statement is: " + strSelect + "\n"); // Echo For debugging

            Connection con = Connect("goog", "itndbadmin", "itnstudent");

            ResultSet rset = QueryDatabase( con,  strSelect);

            // Step 2 Process the ResultSet by scrolling the cursor forward via next().
            //  For each row, retrieve the contents of the cells with getXxx(columnName).
            System.out.println("The records selected are:");
            int rowCount = 0;
            while(rset.next()) {   // Move the cursor to the next row, return false if no more row
                String category = rset.getString("category");
                //double price = rset.getDouble("price");
                int id  = rset.getInt("category_id");
                Category c = new Category(id, category);
                tempList.add(c);
                ++rowCount;
            }
           // System.out.println("Total number of records = " + rowCount);

        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        catch (Exception err)
        {
            err.printStackTrace();
        }
        return tempList;
    }
}
