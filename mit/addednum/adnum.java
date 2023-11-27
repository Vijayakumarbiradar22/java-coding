package mit.addednum;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class adnum {
    public static int findAddedValue(int n,int[] A,int[] G){
        Map<Integer,Integer> countMap=new HashMap<>();

        for(int num:A){
            countMap.put(num,countMap.getOrDefault(num,0)+1);
        }

        for(int num:G){
            countMap.put(num,countMap.get(num)-1);
        }

        int removeElement1=0;
        int removeElement2=0;
        for(Map.Entry<Integer,Integer>entry:countMap.entrySet()){
            if(entry.getValue()>0){
                if(removeElement1==0){
                    removeElement1=entry.getKey();
                } else {
                    removeElement2=entry.getKey();
                    break;
                }
            }
        }

        int addedValue=Math.min(removeElement1,removeElement2);
        return addedValue;
    }
    public static void main(String args[]){
        int n=4;
        int[] A={4,3,1,2};
        int[] G={7,4};

        int addedValue=findAddedValue(n,A,G);
        System.out.println(addedValue);
    }
    
}
