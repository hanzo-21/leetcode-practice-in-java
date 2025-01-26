import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        int n = 10; // Total number of seats
        int countA = 5; // Number of 'A'
        int countB = n - countA; // Number of 'B'
        AlphabetArrangement obj =new AlphabetArrangement();

        // Generate unique arrangements
        List<String> arrangements = new ArrayList<>();
        AlphabetArrangement.generateArrangements("", countA, countB, arrangements);

        // Print the arrangements
        System.out.println("Unique Arrangements:");
        for (String arrangement : arrangements) {
            System.out.println(arrangement);
        }
    }
}