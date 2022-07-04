import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class List {
    public static String[] list;

    public List() {
        list = new String[20];
        try {
            File myObj = new File("words.txt");
            Scanner myReader = new Scanner(myObj);
            int i = 0;
            while (myReader.hasNextLine()) {
                list[i] = myReader.nextLine();
                i++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void printList() {
        for(int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public boolean isInList(String word) {
        for(int i = 0; i < list.length; i++) {
            if(list[i].equals(word)) {
                return true;
            }
        }
        return false;
    }

    public String isSimilar(String word) {
        for(int i = 0; i < list.length; i++) {
            if(list[i].length() == word.length()) {
                if(list[i].compareTo(word) < 0) {
                    return list[i];
                }
            }
        }
        return null;
    }
}
