package Arrays.firstnlargest;

public class fnlarge {
    public static void bubbleSort(int arr[],int size){
        int temp;
        for(int i=0;i<size;i++){
            for(int j=i+1;i<size;i++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[]={4,1,6,2,8,3,9};
        int size=arr.length;
        bubbleSort(arr,size);

        for(int i=0;i<size;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        int sum = arr[size-1]+arr[size-2];
        System.out.println("Sum of last two element is: "+sum);
    }
    
}
