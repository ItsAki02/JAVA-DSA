package Arrays;
import java.util.*;

public class ArrayOfobjects {
    public static void main(String[] args) {
         try (Scanner in = new Scanner(System.in)) {
            String[] str = new String[4];
             for (int i = 0; i < str.length; i++){
                str[i] = in.next();
             }
              System.out.println(Arrays.toString(str));

              //modify
              str[1] = "Akanksha";

              System.out.println(Arrays.toString(str));
        }

    }
    
}
