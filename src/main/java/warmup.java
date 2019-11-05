public class warmup {
    //compare
    public static void main(String[] args) {
        String s1 = "I am a girl";
        String s2 = "I am girl";
        compare(s1, s2);
    }
    static boolean compare(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
