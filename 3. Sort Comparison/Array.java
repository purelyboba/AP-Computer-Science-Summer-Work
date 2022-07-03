import java.util.*;

public class Array {
    public int[] array;

    public Array() {
        array = createArray();
    }

    public static int[] createArray(){
        int[] arr = new int[10000];
        
        for(int i = 0; i < arr.length; i++){
            Random random = new Random();
            int randomNum = random.nextInt(100);
            arr[i] = randomNum;
        }

        return arr;
    }

    public void printArray(){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public void bubbleSort(){
        long start = 0;
        long end = 0;
        long diff = 0;
        start = System.currentTimeMillis();

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - 1; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        end = System.currentTimeMillis();
        diff = end - start;

        System.out.println("\nBubble Sort: " + diff + "ms");
    }

    public void utilSort(){
        long start = 0;
        long end = 0;
        long diff = 0;
        start = System.currentTimeMillis();
        Arrays.sort(array);
        end = System.currentTimeMillis();
        diff = end - start;
        System.out.println("\nUtil Sort: " + diff + "ms");
    }  
}