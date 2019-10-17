import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class homework1 {
    //i have to generate random number form 0 to 100
    //infinite loop
    // user enters his name
    //user enters number
    // if not a number ask again
    //program compares two numbers
    //if less print too less  um
    //if higher too big
    //enter again
    //write all guesses in array
    //at the end show list of numbers
    private static int generateRandom(){
        //int low=0;
        //int high=100;
        Random obj=new Random();
        return obj.nextInt(100);
    }

    private static String getName(){
        Scanner gamer=new Scanner(System.in);
        return gamer.nextLine();
    }

    private static int getNum(){
        Scanner gamer=new Scanner(System.in);
        return gamer.nextInt();
    }

    private static boolean compare(int num, int rand){
        if (num==rand){
            System.out.println("Congratulations!");
            return true;
        }
        else if(num>rand) {
            System.out.println("Your num is too big");
            return false;
        }
        else {
            System.out.println("Your num is too small");
            return false;
        }
    }
    public static void main(String[] args){

        int rand=generateRandom();
        System.out.print("Enter a name: ");
        String name=getName();
        System.out.println("Let the game begin!");

        int index=0;
        int [] guesses=new int[64];
        while(true){
            System.out.print("Enter a number: ");
            int num=getNum();
            guesses[index]=num;
            index++;
            if(compare(num, rand)) break;
        }
        System.out.println("List of your numbers");
        printList(guesses, index);
    }

    private static void printList(int[] array, int index){
        for (int i=0; i<index; i++)
        {
            System.out.printf("%d ", array[i]);
        }
    }
}
