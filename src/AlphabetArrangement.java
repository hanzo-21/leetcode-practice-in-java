import java.util.ArrayList;
import java.util.List;

public class AlphabetArrangement {


    public static void generateArrangements(String current, int countA, int countB, List<String> arrangements) {
        // Base case: when no more characters to add
        if (countA == 0 && countB == 0) {
            arrangements.add(current);
            return;
        }

        // Add 'A' if available
        if (countA > 0) {
            generateArrangements(current + "A", countA - 1, countB, arrangements);
        }

        // Add 'B' if available
        if (countB > 0) {
            generateArrangements(current + "P", countA, countB - 1, arrangements);
        }
    }
}
