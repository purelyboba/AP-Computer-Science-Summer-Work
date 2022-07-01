import java.util.*;

class Main {
    double[] grades;
    
    public static void main(String[] args){

        double[] grades = new double[3];
        
        for(int i = 0; i < 3; i++){
            Student s = new Student(i + 1);
            grades[i] = s.getAverage();
        }

        utilSort(grades);
        System.out.println(" ");
        bubbleSort(grades);
    }

    public static void bubbleSort(double[] grades){
        int n = grades.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (grades[j] > grades[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    double temp = grades[j];
                    grades[j] = grades[j + 1];
                    grades[j + 1] = temp;
                }

        for(double i : grades){
            System.out.print(i + " ");
        }
    }

    public static void utilSort(double[] grades){
        Arrays.sort(grades);

        for(double i : grades){
            System.out.print(i + " ");
        }
    }
}