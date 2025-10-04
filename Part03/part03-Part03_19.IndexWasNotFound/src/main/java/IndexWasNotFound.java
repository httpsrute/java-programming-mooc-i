import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] array = new int[10];

            array[0] = 6;
            array[1] = 2;
            array[2] = 8;
            array[3] = 1;
            array[4] = 3;
            array[5] = 0;
            array[6] = 9;
            array[7] = 7;
                       
            System.out.println("Search for? ");
            int searching = Integer.valueOf(scanner.nextLine());
            
            System.out.println("");
            
            int index = 0;
            int indexFounded = -1;

            while (index < array.length) {
                if (array[index] == searching) {
                    indexFounded = index;
                    break;
                }                
                index++;
            }
            
            System.out.println("");
            
            if (indexFounded == -1) {
                System.out.println(searching + " was not found.");
            } else {
                System.out.println(searching + " is at index " + indexFounded + ".");
            }
        }
    }
}
