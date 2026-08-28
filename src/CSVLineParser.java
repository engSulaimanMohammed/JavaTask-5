import java.util.Scanner;
import static java.lang.IO.*;

public class CSVLineParser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        print("Enter record: ");
        String line = input.nextLine();
        String[] fields = line.split(",");
        if (fields.length != 3) {
            println("Invalid record.");
            return;
        }
        input.close();
    }
}

