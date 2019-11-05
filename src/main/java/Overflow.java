public class Overflow {

    static long add(long a, long b) {
        long r = a + b;
        if ((a < 0 && b < 0 && r > 0) || (a > 0 && b > 0 && r < 0))
            throw new IllegalArgumentException("Long overflow");
        return r;
    }


    public static void main(String[] args) {
        long a = 9223372036854775774L;
        long b = 34;
        long c = add(a, b);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
