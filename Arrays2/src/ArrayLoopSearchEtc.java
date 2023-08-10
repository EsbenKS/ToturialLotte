import java.util.Arrays;

public class ArrayLoopSearchEtc {
    public static void main(String[] args) {

        int[] list = buildOddArray(10);

        for(int i=0; i<list.length; i++){
            System.out.print(list[i] + " ");
        }
        double sum =0;
        for(int n : list){
            sum += n;
        }

        System.out.println(" sum: "+sum);
        double avg = sum/ list.length;
        System.out.println("avg: "+avg);

        int above=0;
        for(int n : list){
            if(n > avg){
                above++;
            }
        }

        System.out.println("Above avg: " + above);

        System.out.println();
        incrementAll(list);
        System.out.println("Copy of Range: "+Arrays.toString(Arrays.copyOfRange(list, 0, 10)));
        System.out.println("Count a target: " + count(list, 8));
        System.out.println("Index of Target: " + indexOf(list, 8));

        int position = indexOf(list,16);
        System.out.println("Position of Target: "+position);
        System.out.print("Replacement method: ");
        replaceAll(list,8,800);
        System.out.println();

    }

    public static int[] buildOddArray(int insert){
        int[] data = new int[insert];
        for(int i=0; i< data.length; i++){
            data[i] = 2*i+1;
        }
        return data;
    }

    public static void incrementAll(int[] data){
        for(int i=0; i< data.length;i++){
            data[i]++;
        }
        System.out.println(Arrays.toString(data));
    }
    public static int count(int[] list, int target){
        int count=0;
        for(int n : list) {
            if (n==target){
                count++;
            }
        }
        return count;
    }

    public static int indexOf(int[] list, int target){
        for(int i=0; i<list.length; i++){
            if(list[i]==target){
                return i;
            }
        }
        return -1; //returnerer denne værdi, hvis den indtastede Targetværdi ikke findes i Array!
    }

    public static void replaceAll(int[] list, int target, int replacement){
        for(int i=0; i<list.length; i++){
            if(list[i]==target){
                list[i]=replacement;
            }
        }
        System.out.println(Arrays.toString(list));
    }
}