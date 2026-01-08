package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {
    static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("sampleFile.txt");

        fileWriter.write("Hello java file handling");

        fileWriter.close();

        System.out.println("File has been written");


    }
}
