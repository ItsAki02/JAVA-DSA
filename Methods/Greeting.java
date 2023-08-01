package Methods;

public class Greeting {
    public static void main(String[] args) {
       // greet();
       String msg = greet();
       System.out.println(msg);
    }
    //static void greet(){
   //     System.out.println("Hello World");
    //}

    static String greet(){
        String greeting = "how are you?";
        return greeting;
    }
    
}
