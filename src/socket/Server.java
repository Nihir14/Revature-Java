package socket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private ServerSocket serverSocket;
    private Socket socket;
    private ObjectInputStream input;

    public Server(int port) {
        try {
            // Start server
            serverSocket = new ServerSocket(port);
            System.out.println("Server started");
            System.out.println("Waiting for a client...");

            // Accept client
            socket = serverSocket.accept();
            System.out.println("Client accepted");

            // Read data from client
            input = new ObjectInputStream(socket.getInputStream());

            String message = "";

            // Read until "Over"
            while (!message.equalsIgnoreCase("Over")) {
                message = (String) input.readObject();
                System.out.println("Client says: " + message);
            }

            System.out.println("Closing connection");
            closeConnection();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void closeConnection() {
        try {
            if (input != null) input.close();
            if (socket != null) socket.close();
            if (serverSocket != null) serverSocket.close();
        } catch (IOException e) {
            System.out.println("Error while closing resources");
        }
    }

    public static void main(String[] args) {
        new Server(5000);
    }
}
