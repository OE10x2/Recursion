public class P8{
    private static int GCD(int a, int b){
        if (a == 0) return b;
        if (b == 0) return a;
        return a >= b ? GCD(a % b, b) : GCD(a, b % a);
    }
    public static void main(String[] args){
        System.out.println(GCD(72, 96));
    }
}
