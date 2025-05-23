import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)) {
            System.out.println("Connected to server.");

            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader userInput = new BufferedReader(
                new InputStreamReader(System.in));

            String serverMsg, clientMsg;

            while (true) {
                // Read server message
                serverMsg = in.readLine();
                if (serverMsg == null || serverMsg.equalsIgnoreCase("bye")) {
                    System.out.println("Server disconnected.");
                    break;
                }
                System.out.println("Server: " + serverMsg);

                // Read client message from console
                System.out.print("Client: ");
                clientMsg = userInput.readLine();
                out.println(clientMsg);
                if (clientMsg.equalsIgnoreCase("bye")) {
                    System.out.println("Connection closed by client.");
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
