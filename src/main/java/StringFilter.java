public class StringFilter {
    public static void main(String[] args) {
        char[] vowels={'a','o','u','e','i'};
        String s1="name";
        String s2="";
        for(int i=0; i<s1.length(); i++){
            for(char vowel: vowels){
                if(s1.charAt(i)==vowel){
                    break;
                }

            }
            new StringBuilder(s2).append(s1.charAt(i));
        }
        System.out.println(s2);

    }


}
