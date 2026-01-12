package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {

    private Socket socket;
    private BufferedReader input;
    private ObjectOutputStream output;

    public Client(String address, int port) {
        try {
            // Establish connection
            socket = new Socket(address, port);
            System.out.println("Connected to server");

            // Read from console
            input = new BufferedReader(new InputStreamReader(System.in));

            // Send data to server
            output = new ObjectOutputStream(socket.getOutputStream());

            String message = "";

            // Keep reading until "Over"
            while (!message.equalsIgnoreCase("Over")) {
                message = input.readLine();
                output.writeObject(message);
                output.flush();
            }

            closeConnection();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void closeConnection() {
        try {
            if (input != null) input.close();
            if (output != null) output.close();
            if (socket != null) socket.close();
            System.out.println("Connection closed");
        } catch (IOException e) {
            System.out.println("Error while closing resources");
        }
    }

    public static void main(String[] args) {
        new Client("127.0.0.1", 5000);
    }
}
