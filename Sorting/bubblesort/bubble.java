package Sorting.bubblesort;

public class bubble {
    public static void bubbleSort(int array[], int size){
        int temp;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<=size;j++){
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int[] array ={1,7,3,6,5};
        int size=array.length;
        bubbleSort(array,size);

        for(int i=0;i<size;i++){
            System.out.println(array[i]);
        }
    }
    
}
