package warmups;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NestedArrays {

    public static void main(String[] args) {
        NestedArrays nest=new NestedArrays();
        int [][] origin={{1,6,3},{},{5,4},{7,8,2,9},{}};
        IntStream intStream=Stream.of(origin).
                flatMap((int[] ints)->Arrays.stream(ints).boxed())
                .mapToInt(x->x)
                .sorted();

        IntSummaryStatistics st=intStream.summaryStatistics();

        System.out.println(st.getMax());
        System.out.println(st.getMin());
        System.out.println(st.getAverage());
        System.out.println(st.getSum());
        System.out.println(st.getCount());
    }
}