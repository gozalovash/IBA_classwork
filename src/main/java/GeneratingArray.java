import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.Random;

public class GeneratingArray {

    private static int[] generatingArray(){
        int [] array=new int[20];
        Random obj=new Random();
        for(int i=0; i<array.length; i++){
            array[i]=obj.nextInt(100);
        }
        return array;
    }

    private static int[] sortingArray(int[] array){
        for (int i=0; i<array.length; i++){
            for (int j=i+1; j<array.length; j++){
                if(array[i]>array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    private static void print_array(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] origin_array=generatingArray();
        print_array(origin_array);
        print_array(sortingArray(origin_array));
    }
}