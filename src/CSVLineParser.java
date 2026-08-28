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
        String name = fields[0].trim();
        String ageText = fields[1].trim();
        String city = fields[2].trim();

        int age = Integer.parseInt(ageText);
        String ageGroup;

        if (age < 18) {
            ageGroup = "Minor";
        } else if (age <= 64) {
            ageGroup = "Adult";
        } else {
            ageGroup = "Senior";
        }
        IO.println("Name: " + name);
        IO.println("Age: " + age);
        IO.println("City: " + city);
        IO.println("Age Group: " + ageGroup);
        input.close();
    }
}

