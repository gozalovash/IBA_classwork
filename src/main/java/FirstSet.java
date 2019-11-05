import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class FirstSet {
    public static void main(String[] args) {
        Set<Integer> hash_Set=new HashSet<Integer>();
        int count=0;

        while(true){
            Random obj=new Random();
            int num=obj.nextInt(20)-10;
            if(hash_Set.size()<20) {
                hash_Set.add(num);
                continue;
            }
            break;
        }
        System.out.println(hash_Set);
    }
}
