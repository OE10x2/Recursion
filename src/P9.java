public class P9{
    private static double sin(int n, double x){
        if (n == 1) return Math.sin(x);
        return Math.sin(x) * cos(n-1, x) + Math.cos(x) * sin(n-1, x);
    }
    private static double cos(int n, double x){
        if (n == 1) return Math.cos(x);
        return Math.cos(x) * cos(n-1, x) - Math.sin(x) * sin(n-1, x);
    }
    public static void main(String[] args){
        System.out.println(sin(6, Math.PI/2));
    }
}
