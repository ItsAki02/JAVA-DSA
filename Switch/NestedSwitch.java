import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) { 
        try(Scanner in = new Scanner(System.in)){
        int empID = in.nextInt();
        String dept = in.next();

        switch(empID){
            case 1:
            System.out.println("Akanksha");
            break;
            case 2:
            System.out.println("Monish Kumar");
            break;
            case 3:
            System.out.println("Emp name 3");
            switch(dept){
                case " IT":
                System.out.println("Information Technology");
                break;
                case "CSE":
                System.out.println("Computer Science and Engineering");
                break;
                default:
                System.out.println("No department");
                
            }
            break;
                default:
                System.out.println("Enter correct EmpID");

            }
        }
    }
        
    }
    

