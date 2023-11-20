package Arrays.subarrayeven;

public class onlyeven {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int even=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even+=1;
            }
        }

        int arr1[]=new int[even];
        int x=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arr1[x]=arr[i];
                x++;
            }
        }
        
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
    
}
