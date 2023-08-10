import java.io.File;
import java.io.FileNotFoundException;
import java.io.PushbackInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrListBasic {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String> list = new ArrayList<>();
        list.add("Music");
        list.add("Fan");

        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        int sum =0;
        for(int i=0; i< list.size(); i++){
            String s = list.get(i);
            sum += s.length();
        }
        System.out.println("List length: "+sum);

        list.add("Love");
        list.set(1,"Hello"); //Redigerer et index, men skal være oprettet med add.
        System.out.println(list);

        Scanner scn = new Scanner(new File("c:\\Datamatiker\\Toturial\\ArrayListBasic\\src\\NameList.txt"));
        ArrayList<String> names = new ArrayList<>();

        //Normal scan af fil, tilføjer alt fra fil.
        while(scn.hasNext()){
            String name = scn.next();
            names.add(name);
        }
        System.out.println("Name list: "+ names);

        //Remove Dublicates
//        while (scn.hasNext()){
//            String name = scn.next();
//            if (!names.contains(name)) {
//                names.add(name);
//            }
//        }
//        System.out.println("Name list, no dublicates: " + names);

        System.out.println(names.indexOf("Jack"));

        //Udskifter et søgt ord med at andet ord. Men kun det første af det søgte ord der findes!
        replace(names,"Jack", "Julie");
        System.out.println(names);

    }
    //Metode til at finde en specifik String og udskifte den med en ny værdi.
    public static void replace(ArrayList<String> temp, String target, String replacement){
        int index = temp.indexOf(target);
        if(index >= 0){
            temp.set(index, replacement);
        }
    }
}