package Hash;
import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        
        //creating
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //print all elements
        System.out.println(set);

        //size
        System.out.println("Size of the Set : " + set.size());

        //search- contains

        if(set.contains(1)){
            System.out.println("set contains 1");
        }

        if(!set.contains(5)){
            System.out.println("doesn't contain");
        }

        //Iterator
        Iterator it = set.iterator();
        //hasnext(),  next

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
