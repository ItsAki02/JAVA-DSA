package Patterns;

public class Pattern6 {
    public static void main(String[] args) {
         pattern6(5);
    }

    static void pattern6(int n){
        for(int row = 0; row < 2 * n ; row++){
            int totalColsinRow = row > n ? 2 * n - row -1 : row;
            int  noOfSpaces = n - totalColsinRow;
            for(int s = 0; s < noOfSpaces; s++){
                System.out.print(" ");
            }
            for(int col = 0; col <= totalColsinRow; col++){
                System.out.print("* ");
            }
            System.out.println();
         }
    }
}
