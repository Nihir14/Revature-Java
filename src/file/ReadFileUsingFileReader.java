package file;

import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingFileReader {

    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("sampleFile.txt");

        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }

        reader.close();
    }
}
