import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

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
            
            int sum = 0;
            int count = 0;
            
            for (int number : numbers) {
                sum += number;
                count++;
            }
            
            System.out.println("Average: " + (double) sum/count);
        }       
    }
}
