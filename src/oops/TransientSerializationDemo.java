package oops;

import java.io.*;

/*
 * Demonstrates transient keyword
 * transient variables are NOT serialized
 */

class TestData implements Serializable {

    int x = 10;          // will be serialized
    transient int y = 20; // will NOT be serialized
}

public class TransientSerializationDemo {

    public static void main(String[] args) throws Exception {

        TestData obj = new TestData();

        // Serialization
        ObjectOutputStream out =
                new ObjectOutputStream(new FileOutputStream("data.ser"));
        out.writeObject(obj);
        out.close();

        // Deserialization
        ObjectInputStream in =
                new ObjectInputStream(new FileInputStream("data.ser"));
        TestData result = (TestData) in.readObject();
        in.close();

        System.out.println("x (serialized): " + result.x);
        System.out.println("y (transient): " + result.y); // default value 0
    }
}
