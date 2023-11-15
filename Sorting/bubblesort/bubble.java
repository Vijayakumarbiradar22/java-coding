package Sorting.bubblesort;

public class bubble {
    public static void main(String args[]){
        int[] array ={1,7,3,6,5};
        int size=array.length;
        bubbleSort(array,size);

        for(int i=0;i<size;i++){
            System.out.println(array[i]);
        }
    }
    
}
