package DataBase.JDBC;

import java.sql.*;

public class Test {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/labor_sql?serverTimezone=UTC&useSSL=false";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "1111";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database labor_sql...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement to get all laptops...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM laptop";
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while(rs.next()){
                //Retrieve by column name
                int code  = rs.getInt("code");
                int model = rs.getInt("model");
                int speed = rs.getInt("speed");
                int ram = rs.getInt("ram");
                int hd = rs.getInt("hd");
                int price = rs.getInt("price");
                int screen = rs.getInt("screen");

                //Display values
                System.out.print("code: " + code);
                System.out.print(", model: " + model);
                System.out.print(", speed: " + speed);
                System.out.print(", ram: " + ram);
                System.out.print(", hd: " + hd);
                System.out.print(", price: " + price);
                System.out.println(", screen: " + screen);
            }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
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
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main

}
