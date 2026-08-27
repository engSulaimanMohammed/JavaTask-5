import java.util.Scanner;

public class FilePathSplitter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        IO.println("Enter File Path: ");
        String Path = input.nextLine();
        if (Path.isBlank()) {
            IO.println("Invalid path.");
            return;
        }
        input.close();
    }
}
