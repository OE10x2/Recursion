public class P7{
    private static boolean palindrome(String N){
        if (N.length() == 0 || N.length() == 1) return true;
        char first = N.charAt(0));
        char last = N.charAt(N.length()-1);
        if (first != last) return false;
        return palindrome(N.substring(1, N.length()-1));
    }
    public static void main(String[] args){
        System.out.println(palindrome("77abcba77"));
    }
}
