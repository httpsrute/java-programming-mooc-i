import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Integer> numbers = new ArrayList<>();
            
            while (true) {
                int input = Integer.valueOf(scanner.nextLine());
                
                if (input == -1) {
                    break;
                }

                numbers.add(input);
            }

            if (numbers.isEmpty()) {
                System.out.println("No numbers entered.");
                return;
            }
            
            System.out.println("Search for?");
            int search = Integer.valueOf(scanner.nextLine());
            
            for (int index = 0; index < numbers.size(); index++) {
                if (search == numbers.get(index)) {
                    System.out.println(search + " is at index " + index);
                }
            }
        }
    }

}
