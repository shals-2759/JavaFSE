import java.sql.*;
import java.util.Scanner;

public class StudentJDBCOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "msec@123");

            while (true) {
                System.out.println("\nChoose an operation:");
                System.out.println("1. Insert student");
                System.out.println("2. Update student grade");
                System.out.println("3. Exit");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                if (choice == 1) {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Grade: ");
                    int grade = sc.nextInt();

                    String insertSQL = "INSERT INTO students (id, name, grade) VALUES (?, ?, ?)";
                    PreparedStatement ps = conn.prepareStatement(insertSQL);
                    ps.setInt(1, id);
                    ps.setString(2, name);
                    ps.setInt(3, grade);
                    ps.executeUpdate();
                    ps.close();
                    System.out.println("Student inserted successfully.");
                } else if (choice == 2) {
                    System.out.print("Enter Student ID to update: ");
                    int id = sc.nextInt();
                    System.out.print("Enter new grade: ");
                    int newGrade = sc.nextInt();

                    String updateSQL = "UPDATE students SET grade = ? WHERE id = ?";
                    PreparedStatement ps = conn.prepareStatement(updateSQL);
                    ps.setInt(1, newGrade);
                    ps.setInt(2, id);
                    int rows = ps.executeUpdate();
                    ps.close();

                    if (rows > 0) {
                        System.out.println("Grade updated successfully.");
                    } else {
                        System.out.println("No student found with the given ID.");
                    }
                } else if (choice == 3) {
                    System.out.println("Exiting...");
                    break;
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) conn.close();
                sc.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
