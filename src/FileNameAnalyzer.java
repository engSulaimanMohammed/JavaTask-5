import java.util.Scanner;
public class FileNameAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        IO.print("Enter file name: ");
        String fileName = input.nextLine();

        int dotIndex = fileName.lastIndexOf('.');
        if (fileName.isBlank() || dotIndex == -1 || dotIndex == 0 || dotIndex == fileName.length() - 1) {
            IO.println("Invalid file name.");
            input.close();
            return;
        }

        String baseName = fileName.substring(0, dotIndex);
        String extension = fileName.substring(dotIndex + 1).toLowerCase();

        String classification;
        if (extension.equals("txt") || extension.equals("pdf") || extension.equals("docx")) {classification = "Document";
        } else if (extension.equals("jpg") || extension.equals("png") || extension.equals("gif")) {classification = "Image";
        } else if (extension.equals("mp3") || extension.equals("wav")) {
            classification = "Audio";
        } else {
            classification = "Other";
        }
        IO.println("File name: " + fileName);
        IO.println("Base name: " + baseName);
        IO.println("Extension: " + extension);
        IO.println("Classification: " + classification);
        input.close();
    }
}

