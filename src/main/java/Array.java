import java.util.Random;

public class Array
{
    public static void main(String[] args) {
        Random obj=new Random();
        String[] array=new String[20];
        for (int i=0; i<20;i++) {
            int num = obj.nextInt(20);
            String var = "";
            if (num % 2 == 0) {
                var = var + "fizz";
            }
            if (num % 3 == 0) {
                var = var + "buzz";
            }
            array[i] = var;
            System.out.println(array[i]);
        }
    }
}
