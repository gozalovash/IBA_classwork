public class Fibonaci {
    public static void main(String[] args) {
        int res=fibonaci(7);
        System.out.printf("%d", res);
    }
    static int fibonaci(int n) {
        if (n == 1) return 0;
        if(n==2 || n==3) return 1;
        return fibonaci(n - 1) + fibonaci(n - 2);
    }
}
