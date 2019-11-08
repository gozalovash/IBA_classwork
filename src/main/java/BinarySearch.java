import java.util.Arrays;
import mergesort.*;

public class BinarySearch {

    int[]  generate_array(int size){
        int[] array=new int[size];
        for(int i=0; i<size; i++) {
            int val = (int) (Math.random() * 100);
            array[i] = val;
        }
        return array;
    }


    int binary_search(int[] array,int left, int right, int a){

        int middle=left+(right-left)/2;

        if(array[middle]==a)
            return middle;

        if(a>array[middle]){
            return binary_search(array, middle, right, a);
        }

        if(a<array[middle]){
            return binary_search(array, left, middle-2, a);
        }

        return -1;
    }
    void print_array(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.printf("%d ",array[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        BinarySearch obj=new BinarySearch();
        int num=33;
        int[] array=obj.generate_array(50);
        Arrays.sort(array);
        obj.print_array(array);
        int  res=obj.binary_search(array,0,array.length-1, num);
        if(res==-1){
            System.out.println("not found!");
        }
        else
            System.out.println(num+" is found at index "+res);

    }
}
