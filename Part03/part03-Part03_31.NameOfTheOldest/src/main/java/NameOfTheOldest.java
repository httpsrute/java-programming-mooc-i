import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            int age = 0;
            int oldest = 0;
            
            String name = "";
            String oldestPersonName = "";
            
            while (true) {
                String input = scanner.nextLine();
                
                if (input.equals("")) {
                    break;
                }
                
                String[] parts = input.split(",");
                               
                name = parts[0];
                age = Integer.valueOf(parts[1]);
                
                if (age > oldest) {
                    oldest = age;
                    oldestPersonName = name;
                }
            }
            System.out.println("Name of the oldest: " + oldestPersonName);
        }
    }
}