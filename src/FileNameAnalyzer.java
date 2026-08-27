import java.util.Scanner;
public class FileNameAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        IO.print("Enter file name: ");
        String fileName = input.nextLine();

        int dotIndex = fileName.lastIndexOf('.');
        if (fileName.isBlank() || dotIndex == -1 ||
                dotIndex == 0 || dotIndex == fileName.length() - 1) {
            IO.println("Invalid file name.");
            input.close();
            return;
        }
    }
}

