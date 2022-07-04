import java.util.*;

public class List {
    public static boolean integer;
    public static int size;
    ArrayList<Integer> integerList = new ArrayList<Integer>();
    ArrayList<Double> doubleList = new ArrayList<Double>();
    public Random random;

    public List(boolean inInteger, int inSize) {
        integer = inInteger;
        size = inSize;
        random = new Random();
    }

    public void createList() {
        if(integer) {
            for(int i = 0; i < size; i++) {
                integerList.add(i, random.nextInt(19) + 1);
            }
        }
        else {
            for(int i = 0; i < size; i++) {
                doubleList.add(i, random.nextDouble());
            }
        }
    }

    public void printList() {
        if(integer) {
            for(int i = 0; i < size; i++) {
                System.out.println(integerList.get(i));
            }
        }
        else {
            for(int i = 0; i < size; i++) {
                System.out.println(doubleList.get(i));
            }
        }
    }

    public void printLowerBound() {
        if(integer) {
            System.out.println("Lowest: " + Collections.min(integerList));
        }
        else {
            System.out.println("Lowest: " + Collections.min(doubleList));
        }
    }

    public void printUpperBound() {
        if(integer) {
            System.out.println("Highest: " + Collections.max(integerList));
        }
        else {
            System.out.println("Highest: " + Collections.max(doubleList));
        }
    }

    public void printMostFrequent() {
        if(integer) {
            int max = 0;
            int maxIndex = 0;
            for(int i = 0; i < size; i++) {
                int count = 0;
                for(int j = 0; j < size; j++) {
                    if(integerList.get(i) == integerList.get(j)) {
                        count++;
                    }
                }
                if(count > max) {
                    max = count;
                    maxIndex = i;
                }
            }
            System.out.println("Most Frequent: " + integerList.get(maxIndex));
        }
        else {
            int max = 0;
            int maxIndex = 0;
            for(int i = 0; i < size; i++) {
                int count = 0;
                for(int j = 0; j < size; j++) {
                    if(doubleList.get(i) == doubleList.get(j)) {
                        count++;
                    }
                }
                if(count > max) {
                    max = count;
                    maxIndex = i;
                }
            }
            System.out.println("Most Frequent: " + doubleList.get(maxIndex));
        }
    }
}
