import java.util.ArrayList;

public class ShiftNegatives {
    public static void main(String[] args) {
        ShiftNegatives shift = new ShiftNegatives();
        int[] array = {7, -6, 1, 2, -3, 3, 4, 5, -1, 6, 7, -2, 8, 9, -3, 8};
        int[] arrayShifted = shift.shiftRight(array);
        for (int i = 0; i < arrayShifted.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }

    private void  swap(int[] data, int i1, int i2){
        int temp=data[i2];
        data[i2]=data[i1];
        data[i1]=temp;
    }


    private int[] shiftRight(int[] array) {
        int[] cloned=array.clone();
        ArrayList<Integer> neg_Pos=new ArrayList<Integer>();
        for(int pos=0; pos<array.length; pos++){
            if(array[pos]<0){
                neg_Pos.add(array[pos]);
            }
        }
        for(int i=0; i<neg_Pos.size()-1; i++){
            swap(cloned, neg_Pos.get(i), neg_Pos.get(i+1));
        }

        return cloned;
    }
}
