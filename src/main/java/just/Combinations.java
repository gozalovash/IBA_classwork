package just;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Combinations {
        public static void main(String[] args) {
        List<String> letters=Arrays.asList("A","B","C","D");

        List<String> combinations=letters.stream().flatMap(f1->
                letters.stream().map(f2->f1+f2)).collect(Collectors.toList());
        combinations.forEach(System.out::println);
    }
}
