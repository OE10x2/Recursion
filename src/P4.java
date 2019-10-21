public class P4{
    private static void recursive(int N){
        System.out.print(N + " ");
        if (N != 1) recursive(N - 1);
    }
    public static void main(String[] args){
        recursive(12);
    }
}
