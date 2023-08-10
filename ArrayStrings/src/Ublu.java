import java.util.Arrays;

public class Ublu {
    public static void main(String[] args) {
      String[] words = new String[5];
      String[] words1 = {"hej", "med", "dig", "jeg", "hedder:"};


      words[0] = "hej";
      words[1] = "med";
      words[2] = "dig";
      words[3] = "jeg";
      words[4] = "hedder:";

        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(words1));
        if(Arrays.equals(words, words1)){
            System.out.println("Lists are equal!");
        } else System.out.println("Lists are not equal!!");

        System.out.println("Are Arrays same length and have same insertion: "+equals(words,words1));

        System.out.println();

        replace(words, "hej","hi");
        System.out.println(Arrays.toString(words1));
        if(Arrays.equals(words, words1)){
            System.out.println("Lists are equal!");
        } else System.out.println("Lists are not equal!!");

        System.out.println("Are Arrays same length and have same insertion: "+equals(words,words1));


        System.out.println();

        replace(words1, "hej","hi");
        System.out.println(Arrays.toString(words1));
        if(Arrays.equals(words, words1)){
            System.out.println("Lists are equal!");
        } else System.out.println("Lists are not equal!!");


        System.out.println("Are Arrays same length and have same insertion: "+equals(words,words1));



    }

    public static void replace(String[] temp, String target, String replacement){
        for(int i=0; i< temp.length; i++){
            if(temp[i].equals(target)){
                temp[i]=replacement;
            }
        }
        System.out.println(Arrays.toString(temp));
    }

    public static boolean equals(String[] list1, String[] list2){
        //Tester for samme længde.
        if(list1.length != list2.length){
            return false;
        }
        //Tester for samme indhold
        for(int i=0; i<list1.length; i++){
            if(list1[i] != list2[i]){
                return false;
            }
        }
        return true;
    }


}