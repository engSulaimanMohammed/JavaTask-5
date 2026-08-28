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
        boolean isWindows = Path.contains("\\");
        Path = Path.replace('\\', '/');
        int slashIndex = Path.lastIndexOf('/');
        String folder = Path.substring(0, slashIndex);
        String fileName = Path.substring(slashIndex + 1);


    }
}