package Arrays.oddoccurance;

public class oddoc {
    public static int getOccurance(int arr[], int len){
        for(int i=0;i<len;i++){
            int count=0;
            for(int j=0;j<len;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
                if(count%2!=0){
                    return arr[i];
                }
            }
                return -1; 
    }
    public static void main(String args[]){
        int arr[]={2,5,3,2,1,2,5,3,1};
        int len=arr.length;

        System.out.println(getOccurance(arr,len));
    }
    
}
