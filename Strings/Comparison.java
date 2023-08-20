package Strings;

public class Comparison {
    public static void main(String[] args) {
        String a = "Akanksha";
        String b = "Akanksha";
        String c = a;

        System.out.println(c == a);

        // ==
        System.out.println(a==b);

        String name  = new String("Akanksha");
        String name1 = new String("Akanksha");

        System.out.println(name.equals(name1));//to check values
        System.out.println(name1 == name);

        System.out.println(name1.charAt(1 ));
    }
    
}
