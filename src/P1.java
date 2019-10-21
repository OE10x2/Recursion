public class P1{
    private static void asterisk(int N){
        if (N == 0) return;
        System.out.print("*");
        asterisk(N-1);
    }
    public static void main(String[] args){
        asterisk(10);
    }
}
