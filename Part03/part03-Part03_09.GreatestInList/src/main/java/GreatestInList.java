import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Integer> list = new ArrayList<>();

            while (true) {
                int input = Integer.valueOf(scanner.nextLine());

                if (input == -1) {
                    break;
                }

                list.add(input);
            }

            if (list.isEmpty()) {
                System.out.println("No numbers entered.");
                return;
            }

            int greatest = list.get(0);

            for (int number : list) {
                if (greatest < number) {
                    greatest = number;
                }
            }

            System.out.println("The greatest number: " + greatest);
        }
    }
}
