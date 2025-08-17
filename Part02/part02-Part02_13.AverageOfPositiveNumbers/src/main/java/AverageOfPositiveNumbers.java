import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        
        while (true) {
            double number = Double.valueOf(scanner.nextLine());
            
            if (number > 0) {
                count += 1;
                sum += number;
            } else if (number == 0) {
                if (count == 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                } else {
                    System.out.println(sum / count);
                    break;
                }
            }
        }
    }
}
