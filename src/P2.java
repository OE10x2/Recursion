public class P2{
    private static void recursive(int N){
        if (N < 10) System.out.print(N);
        else{
            System.out.print(N % 10);
            recursive(N / 10);
        }
    }
    public static void main(String[] args){
        recursive(1085);
    }
}
