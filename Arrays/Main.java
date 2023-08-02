package Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        //syntax
        // datatype[] ref_var = new datatype[size];

        //print 5 rollnos
        int[] arr = {1, 3, 23, 9, 18};
        swap(arr, 1,3);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
}
