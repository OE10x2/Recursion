public class P5{
    private static int factorial(int N){
        if (N == 0) return 1;
        return N * factorial(N - 1);
    }
    public static void main(String[] args){
        System.out.println(factorial(6));
        //NOTE: Input can only be <= 12 with int; <= 20 with long
    }
}
