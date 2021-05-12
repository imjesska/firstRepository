import java.sql.*;
import java.util.Scanner;

public class InClassNotesWeek6Continued {

    public static void main(String[] args) throws SQLException {
        final String URL =  "jdbc:mariadb://localhost:3306/classicmodels";
        final String USER = "root";
        final String PASS = "root";
        Connection conn = DriverManager.getConnection(URL,USER,PASS);

        System.out.println(conn.isValid(1000)); //checking to see if there is a connection
    /*
        Scanner input = new Scanner(System.in);
        PreparedStatement mystmt = conn.prepareStatement(SqlQueries.getEmployeeById); //separate class for queries
        mystmt.setInt(1, 1002);
        ResultSet result = mystmt.excuteQuery();
*/
        String selectSQL = "SELECT * FROM employees";
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(selectSQL);
        conn.close();
        result.afterLast(); //goes to after the last line
        while(result.previous()){ //cursor moves up one to get the last result
            String name = result.getString("lastname");
            String email = result.getString("email");
            System.out.printf("%-5s | %10s%n", name, email);

            //prepared statement, making it interactive
        result.first(); //cursor needs to be moved to look at first result
        String SQL= "SELECT * FROM employees WHERE employeeNumber = ?";
        PreparedStatement ps = conn.prepareStatement(SQL);
        ps.setInt(1,1056);
        result = ps.executeQuery();
            conn.close();

        String selectemp= "SELECT * FROM employees where officeCode = ? or officeCode = ?";
        String cancelled = "SELECT * FROM orders where status = ?";

        PreparedStatement preS = conn.prepareStatement(cancelled);
        PreparedStatement preS2 = conn.prepareStatement(selectemp);
        preS.setString(1,"Cancelled");
        preS2.setString();
        ResultSet rs = preS.executeQuery();
        conn.close();
        while(resultEmp.next()){
            String status = resultEmp.getString("status");
            System.out.println();
        }
        }

    }

}
