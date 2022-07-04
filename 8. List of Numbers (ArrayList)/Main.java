import java.util.*;

class Main {
    public static boolean integer;
    public static int size;
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        getInput();
        List list = new List(integer, size);
        list.createList();
        list.printList();
        list.printLowerBound();
        list.printUpperBound();
        list.printMostFrequent();
        scanner.close();
    }

    public static void getInput() {
        System.out.print("Enter list type (integer/double): ");
        String isInteger = scanner.nextLine();
        if(isInteger.equals("integer")) {
            integer = true;
        }
        else {
            integer = false;
        }
        System.out.println();
        System.out.print("Enter list size: ");
        size = scanner.nextInt();
    }
}