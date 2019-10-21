public class P1{
    private static void recursive(int N){
        if (N == 1) System.out.print("*");
        else{
            recursive(N-1);
            System.out.print("*");
        }
    }
    public static void main(String[] args){
        recursive(4);
    }
}
