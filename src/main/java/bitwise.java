import java.util.Scanner;

public class bitwise {
    public static void main(String[] args) {
        int check=255;
        Scanner obj=new Scanner(System.in);
        int c=obj.nextInt();
        String s1=new String();

        while(c>0){
            if((c&check)==1) {
                s1 += "1";
            }
            else {
                s1 += "0";
            }
            c=c>>1;


        }
        System.out.println(s1);




    }

}
