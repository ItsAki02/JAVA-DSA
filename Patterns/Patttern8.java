package Patterns;

public class Patttern8 {
    public static void main(String[] args) {
        pattern8(4);
    }

    static void pattern8(int n){
        int originalN = n;
        n = 2 * n;
        for(int row = 0; row <= n; row++){
            for(int col = 0; col <= n; col++){
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n-row, n-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();

        }
    }
}
