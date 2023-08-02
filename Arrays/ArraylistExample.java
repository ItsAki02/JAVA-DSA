package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExample {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Integer> list = new ArrayList<>();

            list.add(23);
            list.add(454);
            list.add(68);
            list.add(44);
            list.add(56);        
            list.add(987);       
            list.add(4054);    
            list.add(454);

      System.out.println(list.contains(454));
     
      list.set(0, 99);
      list.remove(4);
      
      System.out.println(list);

      //input
      for(int i =0; i < 5; i++){
            list.add(sc.nextInt());
      }
      //get item at any index
      for(int i = 0; i < 5; i++){
            System.out.println(list.get(i));//list index syntax doesn't work here
      }


      System.out.println(list);
        }
        
        //syntax
        // ArrayList<Integer> list = new ArrayList<>();







    }
    
}
