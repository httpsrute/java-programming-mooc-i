import java.util.Scanner;
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        try ( Scanner scanner = new Scanner(System.in)) {
            ArrayList<Integer> numbers = new ArrayList<>();

            while (true) {
                int input = Integer.valueOf(scanner.nextLine());

                if (input == 0000) {
                    break;
                }

                numbers.add(input);
            }

            if (numbers.isEmpty()) {
                System.out.println("No numbers entered.");
                return;
            }

            System.out.println("The numbers in the range [0, 5]");
            printNumbersInRange(numbers, 0, 5);
        }
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int number : numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }
}
