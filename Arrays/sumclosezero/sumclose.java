package Arrays.sumclosezero;
import java.util.Scanner;
public class sumclose {
    public static void sumClose(int arr[],int size){
        //int inv_count=0;
        int l,r,min_sum,sum,min_l,min_r;
        min_l=0;
        min_r=1;
        min_sum=arr[0]+arr[1];

        for(l=0;l<size-1;l++){
            for(r=l+1;r<size;r++){
                sum=arr[l]+arr[r];
                if(Math.abs(min_sum)>Math.abs(sum)){
                    min_sum=sum;
                    min_l=l;
                    min_r=r;
                }
            }
        }
        System.out.println("The 2 elements whose sum is minimum are "+arr[min_l]+" and "+arr[min_r]);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sumClose(arr,size);
        sc.close();
    }
    
}

//input:- 1 60 -10 70 -80 85  
//output:- -80 and 85