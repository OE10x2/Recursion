public class P7{
    private static boolean palindrome(String N){
        if (N.length() == 0 || N.length() == 1) return true;
<<<<<<< HEAD
        char first = N.charAt(0);
=======
        char first = N.charAt(0));
>>>>>>> 5b945776e98966129bc0c6382bfe6ef0ebc10ad0
        char last = N.charAt(N.length()-1);
        if (first != last) return false;
        return palindrome(N.substring(1, N.length()-1));
    }
    public static void main(String[] args){
        System.out.println(palindrome("77abcba77"));
    }
}