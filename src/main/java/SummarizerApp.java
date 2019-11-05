import java.util.Scanner;
public class SummarizerApp {

    public static void main(String[] args) {
        Summarizer s= new Summarizer();
        Scanner in=new Scanner(System.in);
        String line =in.nextLine();
        int result=s.sum(line);
        System.out.printf("the sum is: %d\n", result);
    }
}
