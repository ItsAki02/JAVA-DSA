package Arrays;

import java.util.Scanner;

public class InputUsingForLoops {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr =  new int[5];
             for(int i = 0; i< arr.length; i++){
                arr[i] = sc.nextInt();
             }

            for(int i = 0; i< arr.length; i++){
                System.out.print(arr[i]+ " ");
            }


        }
        
    
    }
    
}
