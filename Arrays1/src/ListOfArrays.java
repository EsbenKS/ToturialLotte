import java.util.Arrays;

public class ListOfArrays {

    private int[] list;

    public ListOfArrays(int[] list){
        this.list = list;
    }

    public static void incrementAll(int[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i]++;
        }
        System.out.println(Arrays.toString(data));
    }

    public static void fillWithodds(int[] data){
        for(int i = 0; i < data.length; i++){
            data[i] = 2*i+1;
        }
        System.out.println(Arrays.toString(data));
    }
}
