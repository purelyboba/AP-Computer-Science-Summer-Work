import java.util.*;

class Main {

    int[][] array;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[4][5];

        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                System.out.print("Enter value for ROW = " + i + " COLUMN = " + j + " (enter PASS to skip): ");
                String input = scanner.nextLine();
                if(input == "PASS"){}
                else
                {
                    int inputInt = Integer.parseInt(input);
                    array[i][j] = inputInt;
                }
            }
        }

        printArray(array);
        sumArray(array);

        scanner.close();
    }

    public static void printArray(int[][] arr)
    {
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    public static void sumArray(int[][] arr)
    {
        int totalSum = 0;
        for(int i = 0; i < 4; i++)
        {
            int sum = 0;
            for(int j = 0; j < 5; j++)
            {
                sum += arr[i][j];
            }
            System.out.println("Row " + (i+1) + ": " + sum);
            totalSum += sum;
        }
        System.out.println("SUM: " + totalSum);

        System.out.println("AVG: " + ((double)totalSum/(double)20));
    }
}