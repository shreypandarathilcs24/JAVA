import java.io.*;

public class Parent {
    public static void main(String[] args) throws Exception {

        ProcessBuilder pb = new ProcessBuilder("java", "Child");
        Process child = pb.start();

        // Send a message to the child
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(child.getOutputStream()));
        writer.write("Hello Child Process!");
        writer.newLine();
        writer.flush();

        // Read the child's response (optional)
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(child.getInputStream()));
        System.out.println(reader.readLine());
    }
}
