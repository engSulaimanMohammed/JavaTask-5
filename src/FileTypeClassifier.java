import java.util.ArrayList;
import java.util.List;

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
            } else {
                String extension = fileName.substring(dotIndex + 1).toLowerCase();
                if (extension.equals("txt") || extension.equals("pdf") || extension.equals("docx")) {
                    type = "Document";
                    Document++;
                } else if (extension.equals("jpg") || extension.equals("png")) {
                    type = "Image";
                    Image++;
                } else if (extension.equals("java") || extension.equals("py") || extension.equals("js")) {
                    type = "Code";
                    Code++;
                } else {
                    type = "Other";
                    other++;
                }
            }
            IO.println(fileName + " : " + type);
        }

        IO.println("\nTotal files: " + FileNames.size());
        IO.println("Document: " + Document);
        IO.println("Image: " + Image);
        IO.println("Code: " + Code);
        IO.println("Other: " + other);
    }
}
