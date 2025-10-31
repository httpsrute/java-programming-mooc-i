import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter with your name and age separated by a comma, e.g., 'Rute,27':");
            
            ArrayList<Integer> ages = new ArrayList<>();

            while (true) {

                String input = scanner.nextLine();

                if (input.equals("")) {
                    break;
                }

                String[] parts = input.split(",");

                int age = Integer.valueOf(parts[1]);               

                ages.add(age);
            }

            int older = ages.get(0);

            for (int currentAge : ages) {
                System.out.println(currentAge);
                if (older < currentAge) {
                    older = currentAge;
                }
            }

            System.out.println(older);
        }
    }
}
