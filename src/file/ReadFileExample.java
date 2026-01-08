package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {

    public static void main(String[] args) {

        // Try-with-resources ensures automatic closing of the file
        try (BufferedReader br = new BufferedReader(
                new FileReader("sample.txt"))) {

            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            // Handles FileNotFoundException and IOException
            e.printStackTrace();
        }
    }
}
