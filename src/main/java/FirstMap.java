import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class FirstMap {
    public static void main(String[] args) {
        Map<Integer,String> myMap=new HashMap<Integer, String>();
        int count=1;
        while(myMap.size()<20){
            Random obj=new Random();
            //StringBuilder buffer=new StringBuilder()
            myMap.put(count++,FirstMap.randomString(10,30));
        }
        int len_min=Integer.MAX_VALUE;
        int len_max=Integer.MIN_VALUE;
        String shortest;
        String longest;
        for(Map.Entry<Integer,String> item : myMap.entrySet()){
            System.out.printf("k: %d, v:%s\n", item.getKey(), item.getValue());
        }
    }

    private static String randomString(int min, int max){
        int len=(int)(Math.random()*(max-min+1)+min);
        String outcome="";
        while (outcome.length()<len){
            int ch=(int)(Math.random()*(122-97+1)+97);
            outcome+=(char)ch;
        }
        return outcome;
    }
}
