import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                for (int i = 0; i < numbers.size(); i++) {
                    System.out.println(numbers.get(i));
                }
                
                break;
            }
            
            numbers.add(input);
        }

    }
}
