package file;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileUsingFileInputStream {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("sampleFile.txt");

        int data;
        while ((data = fis.read()) != -1) {
            System.out.print((char) data);
        }

        fis.close();
    }
}
