package warmups;

import java.util.*;
import java.util.stream.Collectors;

public class StringFilter {
    public String filter(String origin){
        Set<String> letters = Collections.<String> emptySet();
        Collections.addAll(letters =
                new HashSet<String>(Arrays.asList(origin)));
        String filtered=String.join( "",letters);
        return filtered;
    }
    public String filter2(String origin){
        String filtered=origin.chars().distinct().mapToObj(l->String.valueOf((char)l)).collect(Collectors.joining());
        return filtered;
    }

    public static void main(String[] args) {
        StringFilter sg=new StringFilter();
        String origin="abdsa";
        System.out.println(sg.filter2(origin));
    }
}
