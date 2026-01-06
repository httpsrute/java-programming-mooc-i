import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int entryCount = 0;
            int sumBirthYears = 0;

            String longestName = "";

            while (true) {
                String input = scanner.nextLine();

                if (input.isEmpty()) {
                    break;
                }

                String[] fields = input.split(",");

                String name = fields[0].trim();
                int birthYear = Integer.parseInt(fields[1].trim());

                if (name.length() > longestName.length()) {
                    longestName = name;
                }

                sumBirthYears += birthYear;
                entryCount++;
            }

            if (entryCount > 0) {
                double averageBirthYear = (double) sumBirthYears / entryCount;

                System.out.println("Longest name: " + longestName);
                System.out.println("Average of the birth years: " + averageBirthYear);
            }
        }
    }
}
