package File;

import java.io.*;

public class File8 {
    public static void main(String[] args) throws IOException {

        File inputFile = new File("input");
        File outputFile = new File("output");

        FileInputStream fileInputStream = new FileInputStream(inputFile);
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);

        int numberCount = dataInputStream.available() / 8;

        double first = dataInputStream.readDouble();

        dataInputStream.skipBytes((numberCount - 2) * 8);
        double last = dataInputStream.readDouble();

        fileInputStream.close();
        dataInputStream.close();

        FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

        dataOutputStream.writeDouble(first);
        dataOutputStream.writeDouble(last);

        fileOutputStream.close();
        dataOutputStream.close();

    }
}
