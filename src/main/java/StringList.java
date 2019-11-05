import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class StringList {
    private static final String Alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        List<String> myList=new ArrayList<String>();

        for(int i=0; i<30; i++) {
            myList.add(generateString(10,30));
        }

        saveToFile((ArrayList) myList);
        //readFromFile()

    }


    private static String generateString(int min, int max){
        Random letter=new Random();
        int length=(int)Math.random()*20+11;
        String s1="";
        char[] c1=new char[length];
        for(int i=0; i<length; i++) {
            c1[i] = Alphabet.charAt(letter.nextInt(Alphabet.length()));
            s1+=(c1[i]);
        }
        return s1;
    }

    private static void saveToFile(ArrayList list){
        try{
            FileWriter myFile=new FileWriter("myFile.txt");
            myFile.write(String.valueOf(list));
            myFile.close();
        }
        catch (IOException e){
            System.out.println("error occurred while writing list to file");
        }
    }









}
