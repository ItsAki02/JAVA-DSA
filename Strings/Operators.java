package Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        
        System.out.println('a'+ 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 'b'));

        System.out.println("a" + 1);
        //this is same as after few steps: "a" + "1"
        //integer will be coverted to integer that will call toString()

        System.out.println("Akanksha" + new ArrayList<>());
        
    }
}
