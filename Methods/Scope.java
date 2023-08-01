package Methods;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = " Akanksha "; 
        {
            a= 100;
            System.out.println(a);
            int c = 99;
            System.out.print(c);
            name = "Riya";
            System.out.println(name);
            //values initialized in this block will remain in this block

        }

        int c = 900;
        System.out.println(a);
        System.out.println(name);
        System.out.println(c);
                System.out.println(b);

        // System.out.println(c); //cannot use outside the block

            //scoping in loops
            for( int i = 0; i < 4; i++){
                // System.out.println(i);
                int num = 90;
                a = 10000;
             System.out.println(num + " " + a);

            }
            System.out.println();
       }
     
       static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
       }
}
