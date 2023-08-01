package Methods;

import java.util.Scanner;

public class ArmstrongNos {
    public static void main(String[] args) {
       try( Scanner in = new Scanner(System.in)){
        //int n= in.nextInt();

        for(int i= 100; i <= 1000; i++){
            if (isArmstrongOrNot(i)){
                System.out.print( i + " ");
            }
        }

        }
    }

    static boolean isArmstrongOrNot(int n){
        int original = n;
        int sum = 0;

        while(n>0)
{
    int rem = n % 10;
    n = n/10;
    sum = sum + rem * rem * rem;
}  
  return sum == original;
    }
    
}
