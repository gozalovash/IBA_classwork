package warmups;

public class Solution {
    public  int solution(String S){
        int pairs=0;
        int lcount=0;
        int rcount=0;
        for(int i=0; i<S.length(); i++) {
            if (S.charAt(i) == 'L')
                lcount++;
            if (S.charAt(i) == 'R')
                rcount++;
            if (lcount == rcount) {
                pairs++;
            }

        }
        return pairs;
    }

    public static void main(String[] args) {
        Solution result=new Solution();
        System.out.println(result.solution("RLLLRRRLLR"));
    }

}
