public class P3{
    private static void recursive(int N){
        if (N != 1) recursive(N - 1);
        System.out.print(N + " ");
    }
    public static void main(String[] args){
        recursive(12);
    }
}
