import java.util.*;

class Main {
    public static void main(String[] args) {
        List list = new List();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a word or type 'quit' to exit.");
            scanner = new Scanner(System.in);
            String word = scanner.nextLine();
            if(word.equals("quit")) {
                break;
            }
            if(list.isInList(word)) {
                System.out.println("The word is in the list.");
            } 
            else {
                String similar = list.isSimilar(word);
                if(similar != null) {
                    System.out.println("The word is similar to " + similar + ".");
                } 
                else {
                    System.out.println("The word is not in the list.");
                }
            }
        }
        scanner.close();
    }
}