public class P6{
    private static int fibonacci(int N){
        if (N == 1 || N == 2) return 1;
        return fibonacci(N-1) + fibonacci(N-2);
    }
    public static void main(String[] args){
        System.out.println(fibonacci(45));
        //Only works for <= 45 values
    }
}
