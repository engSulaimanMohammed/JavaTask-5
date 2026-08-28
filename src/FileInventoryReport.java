public class FileInventoryReport {
    public static void main(String[] args) {
        String[] records = {"report.pdf,120", "photo.png,340", "music.mp3,5000", "app.java,8",
                "data.xlsx,250", "script.py,15", "unknown.xyz,50", "broken-record" };

        int totalSize = 0;
        int documentCount = 0;
        int imageCount = 0;
        int audioCount = 0;
        int codeCount = 0;
        int otherCount = 0;
        String largestFile = "";
        int largestSize = 0;

        for (String record : records) {
            String[] parts = record.split(",");
            if (parts.length != 2) {
                System.out.println("Invalid record: " + record);
                continue;
            }
            String fileName = parts[0].trim();
            int size = Integer.parseInt(parts[1].trim());
            int dotIndex = fileName.lastIndexOf('.');
        }
    }
}
