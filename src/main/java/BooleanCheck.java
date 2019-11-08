import java.util.ArrayList;
import java.util.List;

import static java.lang.StrictMath.sqrt;

public class BooleanCheck {
    boolean check_prime(int a){
        if(a==2) return false;
        for(int i=2; i<sqrt(a); i++){
            if(a%i==0)
                return false;

        }
        return true;
    }

    boolean check_palindrome(int a){
        int copy=a;
        int reverse=0, rem=0;
        while(copy>0){
            rem=copy%10;
            reverse=reverse*10+rem;
            copy/=10;
        }
        if(a==reverse) return true;
        return false;
    }

    List<Integer> gen_prime(int count){
        int k=0;
        List<Integer> prime=new ArrayList<Integer>(count);
        for(int i=0; i<count;){
            if(check_prime(k)){
                prime.add(k);
                i++;
            }
            k++;
        }
        return prime;

    }


    public static void main(String[] args) {
        BooleanCheck res=new BooleanCheck();
        System.out.println("is 13 prime?"+res.check_prime(13));
        System.out.println("is 101 palindrome?"+res.check_palindrome(101));

        System.out.println(res.gen_prime(10));
    }


}
