import java.io.IOException;

public class p027 {
   
    static void validateData() throws IOException {
        throw new IOException("Unable to process file stream.");
    }

    public static void main(String[] args) {
        try {
            validateData(); 
        } catch (IOException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        System.out.println("Program execution continues normally.");
    }
}