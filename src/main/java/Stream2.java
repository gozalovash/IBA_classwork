import java.util.ArrayList;
import java.util.List;

public class Stream2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");

        Stream stream= (Stream) list.stream();
        //stream.filter(x-> x.toString().length()==3).forEach(System.out::print);


    }
}
