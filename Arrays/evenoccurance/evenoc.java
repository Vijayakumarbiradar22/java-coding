package Arrays.evenoccurance;

public class evenoc {
    public static int getOccurance(int arr[], int len){
        for(int i=0;i<len;i++){
            int count=0;
            for(int j=0;j<len;j++){
                
            }
        }
        // for(int i=0;i<len;i++){
        //     int count=0;
        //     for(int j=0;j<len;j++){
        //         if(arr[i]==arr[j]){
        //             count++;
        //         }
        //     }
        //     if(count%2==0){
        //       return arr[i];  
        //     }
        // }
        // return -1;
    }
    public static void main(String rags[]){
        int[] arr = {5,3,4,5,4,1,5};
        int len=arr.length;

        int result = getOccurance(arr,len);
        System.out.println(result);
    }
    
}
