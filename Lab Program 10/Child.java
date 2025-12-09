import java.io.*;

public class Child {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String message = br.readLine();   // Receive message from parent
        System.out.println("Child received: " + message);
    }
}
