import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchAndRemoveWords {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> stopWords = new ArrayList<>();

        stopWords.add("a");
        stopWords.add("be");
        stopWords.add("by");
        //etc, add hvad man ønsker udeladt fra teksten speech.txt

        Scanner scn = new Scanner(new File("c:\\Datamatiker\\Toturial\\ArrayListBasic1\\src\\speech.txt"));

        while(scn.hasNext()){
            String next = scn.next();
            if(!stopWords.contains(next.toLowerCase())){
                System.out.print(next + " ");
            }
        }
        System.out.println();
        System.out.println("------------------------------");

        ArrayList<String> words = new ArrayList<>();
        words.add("four");
        words.add("score");
        words.add("and");
        words.add("seven");
        words.add("years");
        words.add("ago");

        System.out.println("words: " +words);

        //Iterere fra start til slut
        for(int i =0; i< words.size(); i+=2){
            words.add(i, "~");
        }
        System.out.println("Added tiles: "+words);

        for(int i=0; i< words.size(); i++){
            words.remove(i);
        }
        System.out.println("Remove tiles: "+words);

        //Iterere bagfra.
        for(int i = words.size()-1; i>=0; i--){
            words.add(i, "~");
        }
        System.out.println("Added tiles backwards: "+words);

        for(int i = words.size()-2; i>=0; i-=2){
            words.remove(i);
        }
        System.out.println("Remove tiles backwards: "+words);

        //For Each Loop
        int sum = 0;
        for(String s:words){
            sum+=s.length();
        }
        System.out.println("Total length of ArrayList: "+ sum);

        //Wrapperclasses!
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(3);
        System.out.println(numbers);

        int sum1 =0;
        for(int n:numbers){
            sum1 += n;
        }
        System.out.println("For Each Loop sum up: "+sum1);

        int product = numbers.get(0) * numbers.get(1);
        System.out.println("Simple multiply: "+product);

    }
}