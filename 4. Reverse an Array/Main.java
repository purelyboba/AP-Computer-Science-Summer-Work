import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> array = new ArrayList<Integer>();

        while(true) {
            System.out.print("Enter a number (type 0 to exit): ");
            int number = scanner.nextInt();
            if(number == 0) {
                break;
            }
            else {
                array.add(number);
            }
        }

        System.out.println("The array is: ");
        for(int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }

        array = reverseArray(array);

        System.out.println("\nThe reversed array is: ");
        for(int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
    }

    public static ArrayList<Integer> reverseArray(ArrayList<Integer> arr) {
        ArrayList<Integer> reversed = new ArrayList<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            reversed.add(arr.get(arr.size() - i - 1));
        }
        return reversed;
    }
}