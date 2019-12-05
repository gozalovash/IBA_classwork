import java.util.ArrayList;
import java.util.List;

public class XGraph {
    private int v_count;
    private List<Integer>[] links;

    public XGraph(int v_count) {
        this.v_count = v_count;
        this.links = new ArrayList[v_count];
        for (int i = 0; i < v_count; i++) {
            links[i] = new ArrayList<>();
        }
    }

    public void add(int from, int to) {
        links[from].add(to);
    }

    public void remove(int from, int to) {
        links[from].remove(Integer.valueOf(to));
    }
    public void printBFS(){
        if(links==null)
            return;
        for(List<Integer> xi:links){
            System.out.println();
        }
        printBFS();
    }
}

