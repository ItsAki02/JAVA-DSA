package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(isPalindrome(str));
    }
    static String isPalindrome(String str){
        if(str == null || str.length()== 0){
            return "String is palindrome";
        }
        str = str.toLowerCase();
        for(int i = 0; i <= str.length()/2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()- 1 -i);

            if(start != end){
                return "String is not palindrome";
            }

        }
        return "String is palindrome";
    }
}
