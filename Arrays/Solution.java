package Arrays;
import java.util.*;
public class Solution {
public static void isPrime(int num){
int count = 0;// 1
for(int i = 2;  i <= Math.sqrt(num); i++){//sqrt(n)
if(num%i==0) count++;
}
if(count==0) System.out.println("YES");//f(n) = 1+1+n/2=1
else  System.out.println("No");
}  //time:O(sqrt(n))
public static void main(String []args){
try (Scanner sc = new Scanner(System.in)) {
    int num = sc.nextInt();
    isPrime(num);
}
}
}

