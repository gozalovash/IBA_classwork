package warmups;

import java.util.ArrayList;
import java.util.List;

import static java.lang.StrictMath.sqrt;

public class BooleanCheck {
    boolean check_prime(long a){
        if(a==2) return false;
        for(int i=2; i<sqrt(a); i++){
            if(a%i==0)
                return false;

        }
        return true;
    }

    boolean check_palindrome(long a){
        long copy=a;
        long reverse=0, rem=0;
        while(copy>0){
            rem=copy%10;
            reverse=reverse*10+rem;
            copy/=10;
        }
        if(a==reverse) return true;
        return false;
    }

    List<Long> gen_prime(int count){
        long k=10000;
        List<Long> prime=new ArrayList<Long>(count);
        for(int i=0; i<count;){
            if(check_prime(k)){
                prime.add(k);
                i++;
            }
            k++;
        }
        return prime;

    }
    long maxPalindrome(){
        long[] products=new long[2018];
        int k=0;
        for(long i=10000;i<100000; i++){
            if(check_prime(i)){
                for(long j=i; j<100000; j++){
                    if(check_prime(j)){
                        long product=i*j;
                        if(check_palindrome(product)) {
                            products[k] = product;
                            k++;
                        }
                    }
                }
            }
        }
        return findMax(products);
    }
    long findMax(long[] nums){
        long max=nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        BooleanCheck res=new BooleanCheck();
        //System.out.println("is 13 prime?"+res.check_prime(13));
        //System.out.println("is 101 palindrome?"+res.check_palindrome(101));
        System.out.println(res.gen_prime(8403));

        //System.out.println(res.maxPalindrome());

    }


}
