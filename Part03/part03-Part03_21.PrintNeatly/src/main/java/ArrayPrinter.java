public class ArrayPrinter {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        for (int index = 0; index < array.length; index++) {
            if (index == array.length - 1) {
                System.out.print(array[index]);
            } else {
                System.out.print(array[index] + ", ");
            }
        }
    }
}
