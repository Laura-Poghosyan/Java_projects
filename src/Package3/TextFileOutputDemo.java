package Package3;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class TextFileOutputDemo {
    public static void main(String[] args) {
        PrintWriter outputStream = null;

        try{
            outputStream = new PrintWriter(new FileOutputStream("C:\\Java_projects\\src\\test.txt", true));
            System.out.println("Writing to file.");
            outputStream.println("The quick brown fox");
            outputStream.println("Hello everyone");
            outputStream.println("Third run.");
        } catch(FileNotFoundException e) {
            System.out.println("Error opening  the file test.txt");
            System.exit(0);
        }
        outputStream.close( );
        System.out.println("End of program.");
    }
}
