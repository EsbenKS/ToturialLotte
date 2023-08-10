import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scnFile = new Scanner(new FileReader("c:\\Datamatiker\\Toturial\\ArrayListLoops\\src\\list.txt"));

        ArrayList<String> l1 = new ArrayList<>();

        while(scnFile.hasNext()){
            l1.add(scnFile.next());
        }
        System.out.println(l1);

        for (int i =0; i< l1.size(); i++){
            ArrayList<ArrayList<String> l1>
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter name: ");


        }




    }
}