import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        try ( Scanner scanner = new Scanner(System.in)) {
            ArrayList<Integer> numbers = new ArrayList<>();

            while (true) {
                int input = Integer.valueOf(scanner.nextLine());

                if (input == 9999) {
                    break;
                }

                numbers.add(input);
            }

            if (numbers.isEmpty()) {
                System.out.println("No numbers entered.");
                return;
            }

            int smallest = numbers.get(0);

            for (int index = 0; index < numbers.size(); index++) {
                if (smallest > numbers.get(index)) {
                    smallest = numbers.get(index);
                }
            }
            
            System.out.println("Smallest number: " + smallest);

            for (int index = 0; index < numbers.size(); index++) {                
                if (smallest == numbers.get(index)) {
                    System.out.println("Found at index: " + index);
                }
            }
        }
    }
}
