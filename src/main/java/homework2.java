import java.util.Random;
import java.util.Scanner;

public class homework2 {
    public static void main(String[] args){
        char[][] array=create_array();
        int[] randomly_selected=getRandom(array);
        System.out.println(randomly_selected);
        System.out.println("All set. Get ready to rumble!");


        while(true){

            print_array(array);
            Scanner shot=new Scanner(System.in);
            System.out.println("Choose a line to shoot: ");
            int line=shot.nextInt();
            System.out.println("Choose a row to shoot: ");
            int row=shot.nextInt();


            if((line-1)==randomly_selected[0] && (row-1)==randomly_selected[1]){
                array[line-1][row-1]='X';
                print_array(array);
                System.out.println("You have won!");
                break;
            }
            else{
                array[line-1][row-1]='*';
            }
        }

    }

    private static char[][] create_array(){
        char [][] array;
        array= new char[5][5];
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                array[i][j]='-';
            }
        }
        return array;
    }


    private static int[] getRandom(char[][] array){
        int rnd1=new Random().nextInt(array.length);
        int rnd2=new Random().nextInt(array[rnd1].length);
        int[] chosen_obj={rnd1, rnd2};
        return chosen_obj;
    }



    static void print_array(char[][]array){
        for(int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}

