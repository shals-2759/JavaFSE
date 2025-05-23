import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionHandlingExample {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bankdb"; 
        String user = "root"; 
        String password = "msec@123"; 

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            conn.setAutoCommit(false);
            int fromAccountId = 1;
            int toAccountId = 2;
            double amount = 500.0;
            boolean success = transferMoney(conn, fromAccountId, toAccountId, amount);

            if (success) {
                conn.commit();
                System.out.println("Transaction committed successfully.");
            } else {
                conn.rollback();
                System.out.println("Transaction rolled back due to insufficient funds.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static boolean transferMoney(Connection conn, int fromId, int toId, double amount) throws SQLException {
        double fromBalance = getBalance(conn, fromId);
        if (fromBalance < amount) {
        }
        String debitSQL = "UPDATE accounts SET balance = balance - ? WHERE id = ?";
        try (PreparedStatement debitStmt = conn.prepareStatement(debitSQL)) {
            debitStmt.setDouble(1, amount);
            debitStmt.setInt(2, fromId);
            debitStmt.executeUpdate();
        }

        String creditSQL = "UPDATE accounts SET balance = balance + ? WHERE id = ?";
        try (PreparedStatement creditStmt = conn.prepareStatement(creditSQL)) {
            creditStmt.setDouble(1, amount);
            creditStmt.setInt(2, toId);
            creditStmt.executeUpdate();
        }

        return true;
    }

    private static double getBalance(Connection conn, int accountId) throws SQLException {
        String sql = "SELECT balance FROM accounts WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, accountId);
            var rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getDouble("balance");
            }
        }
        return 0;
    }
}
