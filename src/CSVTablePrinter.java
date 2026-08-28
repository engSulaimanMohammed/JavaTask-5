import java.util.Arrays;
import java.util.List;

public class CSVTablePrinter {
    public static void main(String[] args) {
        List<String> rows = Arrays.asList(
                "Name,Age,City",
                "Ali,25,Muscat",
                "Sara,30,Nizwa",
                "Ahmed,22,Salalah",
                "Fatma,28,Sohar",
                "Khalid,35,Sur",
                "Wrong,Row");

        String[] headers = rows.get(0).split(",");
        String format = "%-12s %-8s %-12s%n";
        System.out.printf(format, headers[0], headers[1], headers[2]);
        IO.println("-".repeat(34));
        int shownRows = 0;

    }
}