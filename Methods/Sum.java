package Methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
      int ans =  sum();
      System.out.println(ans);
        
    }

   static int sum(){
    try(Scanner sc = new Scanner(System.in)){ 
        System.out.println("Enter two nos.: ");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b =");
        int  b = sc.nextInt(); 
        int sum = a + b;
        return sum;
}
    }
    
    
}


/* 
 * return_type  name(){
   //body
   return statement;
  }
 */