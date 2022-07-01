import java.util.*;
import java.nio.file.*;

public class Student {
    private int lineNumber;
    
    public Student(int line) {
        lineNumber = line;
    }

    public String getAllInfo() {
        try {
            String info = Files.readAllLines(Paths.get("grades.txt")).get(lineNumber - 1);
            return info;
        }
        catch(Exception e){
            return "";
        }
    }
    
    public String getName() {
        String info = getAllInfo();
        String[] infoArray = info.split(" ");
        return infoArray[0];
    }

    public double getAverage() {
        String info = getAllInfo();
        String[] infoArray = info.split(" ");

        double average = 0;
        for(int i = 1; i < infoArray.length; i++){
            average += Double.parseDouble(infoArray[i]);
        }
        average = average / (infoArray.length - 1);
        return average;
    }
}
