package warmups;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FillingTheArray {
    public static void main(String[] args) {
        FillingTheArray fill=new FillingTheArray();
        int size=7;
        int[] array=fill.gen(size);
        fill.printArray(array);
    }
    public void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.printf("%d", array[i]);
        }
    }

    public int[] gen(int size){
        int[] array={};
        //int v=size%2!=0 ? size/2 : size/2-1;
        /*if(size%2==0){ v=size/2;}
        else{v=size/2-1;}*/
        /*int v=size/2;
        if(size%2==0) v--;
         */
        int v=size/2 -1 + (size % 2);

        for(int i=0; i<size/2+1; i++, v--) {
            array[i] = v;
            array[size - 1 - i] = v;
        }
        return array;
    }


}
