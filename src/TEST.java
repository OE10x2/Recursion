public class TEST{
    public static void p(int N){
        if (N < 10) System.out.println(N);
        else{
            p(N / 10);
            System.out.println(N % 10);
        }
    }

    public static void main(String[] args){
        p(114236);
    }
}
