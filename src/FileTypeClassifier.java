import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileTypeClassifier {
    public static void main(String[] args) {
        List<String> FileNames = new ArrayList<>();
        FileNames.add("report.pdf");
        FileNames.add("photo.jpg");
        FileNames.add("program.java");
        FileNames.add("notes.txt");
        FileNames.add("image.png");
        FileNames.add("script.py");
        FileNames.add("document.docx");
        FileNames.add("music.mp3");
        FileNames.add("README");

        int Document = 0;
        int Image = 0;
        int Code = 0;
        int other = 0;
        for (String fileName : FileNames) {
            int dotIndex = fileName.lastIndexOf('.');
            String type;
            if (dotIndex == -1) {
                type = "Other";
                other++;
            }
        }

    }
}