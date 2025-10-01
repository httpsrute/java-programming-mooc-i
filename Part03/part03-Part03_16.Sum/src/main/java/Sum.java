import java.util.Scanner;   
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
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

            System.out.println(sum(numbers));
        }
    }

    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        
        for (int number : numbers) {
            sum += number;
        }
        
        return sum;
    }
}
