public class P6{
    private static int fibonacci(int N){
        if (N == 0) return 0;
        if (N == 1) return 1;
        return fibonacci(N-1) + fibonacci(N-2);
    }
    public static void main(String[] args){
        System.out.println(fibonacci(45));
        //Only works for <= 45 values
    }
}
