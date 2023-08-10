import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scnFile = new Scanner(new File("c:\\Datamatiker\\Toturial\\ArrayListEx\\src\\names.txt"));
        ArrayList<String>  list = new ArrayList<>();

        while(scnFile.hasNext()){
            list.add(scnFile.next());
        }
        scnFile.close();

        System.out.println(list);

        Scanner scn = new Scanner(System.in);

        System.out.println("1: See list of names");
        System.out.println("2: Add a name to list");
        System.out.println("3: Edit a name from the list");
        System.out.println("4: Remove a name from the list");


        int input = scn.nextInt();
        switch (input){
            case 1:
                System.out.println(list);
                break;

            case 2:
                System.out.print("Enter name to add to the list: ");

                Scanner scnIn = new Scanner(System.in);
                list.add(scnIn.next());
                System.out.println(list);

                addToList(list);

                break;

            case 3:
                System.out.println(list);

                System.out.print("Enter name from list to replace: ");
                Scanner scnTarget = new Scanner(System.in);
                String target = scnTarget.next();
                System.out.print("Enter new name added to name list: ");
                Scanner scnRepl = new Scanner(System.in);
                String repl = scnRepl.next();

                replace(list, target, repl);
                addToList(list);
                System.out.println(list);
                break;

            case 4:
                System.out.println(list);
                System.out.print("Enter name to delete from the list: ");
                Scanner scnDelete = new Scanner(System.in);
                String delete = scnDelete.next();

                delete(list, delete);
                addToList(list);
                System.out.println(list);

            default:
                System.out.println("Please enter a number between 1-??");
        }
    }
    public static void addToList(ArrayList<String> tempList)throws IOException{
        FileWriter writer = new FileWriter("c:\\Datamatiker\\Toturial\\ArrayListEx\\src\\names.txt");
        for(String s: tempList){
            writer.write(s + System.lineSeparator());
        }
        writer.close();
    }

    public static void replace(ArrayList<String> tempList, String target, String replacement){

        int index = tempList.indexOf(target);
        if(index >=0){
            tempList.set(index, replacement);
        }
    }

    public static void delete(ArrayList<String> tempList, String toDelete){
        int index = tempList.indexOf(toDelete);
        if(index>=0){
            tempList.remove(toDelete);
        }
    }
}