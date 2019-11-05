import static java.lang.Integer.parseInt;

public class Summarizer {
    boolean isNumber(String src){
        try {
            Integer.parseInt(src);
            return true;
        }
        catch(NumberFormatException ex){
            return false;
        }
    }

    int sum(String origin) {
        String[] items = origin.split(" ");
        int total = 0;
        for (String item : items) {
            if (isNumber(item)) {
                total += Integer.parseInt(item);
            }
        }
       return total;
    }
}