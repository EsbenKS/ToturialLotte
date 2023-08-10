import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {



        List<String> l1 = new ArrayList<>();
        l1.add("1");
        l1.add("2");

        List<String> l2 = new ArrayList<>();
        l2.add("3");
        l2.add("4");
        l2.add("5");

        List<ArrayList<String>> arrayOfList = new ArrayList<>();
        arrayOfList.add((ArrayList<String>) l1);
        arrayOfList.add((ArrayList<String>) l2);

        System.out.println(arrayOfList );

        for(int i =0; i< arrayOfList.size(); i++){
            ArrayList<String> s = arrayOfList.get(i);
            int index = i+1;
            System.out.print("No of list: " +index + " ");
            System.out.print(s);
            System.out.println();
        }

        System.out.println(arrayOfList.indexOf(l1)+1);
        System.out.println(arrayOfList.indexOf(l2)+1);



//        Scanner scn = new Scanner(System.in);
//
//
//            System.out.println("Enter name: ");
//            String name = scn.next();
//
//            System.out.println("Enter Address: ");
//            String address = scn.nextLine();
//
//            Member m1 = new Member(name, address);
//            System.out.println(m1);
//
    }

}