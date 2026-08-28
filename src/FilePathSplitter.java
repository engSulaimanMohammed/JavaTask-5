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

        int dotIndex = fileName.lastIndexOf('.');
        String extension;

        if (dotIndex != -1) {
            extension = fileName.substring(dotIndex + 1).toLowerCase();
        } else {
            extension = "none";
        }

        String pathStyle;
        if (isWindows) {
            pathStyle = "Windows Path";
        } else {
            pathStyle = "Unix Path";
        }
        IO.println("Path: " + Path);
        IO.println("Folder: " + folder);
        IO.println("File Name: " + fileName);
        IO.println("Extension: " + extension);
        IO.println("Path Style: " + pathStyle);
        input.close();
    }
}