import java.sql.*;

public class JdbcMySQLExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root"; 
        String password = "msec@123"; 

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int grade = rs.getInt("grade");

                System.out.println("ID: " + id + ", Name: " + name + ", Grade: " + grade);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
