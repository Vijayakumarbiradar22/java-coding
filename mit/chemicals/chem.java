package mit.chemicals;
import java.util.HashMap;
import java.util.Map;
public class chem {
    public static int countExplosivePairs(int n,String[] chemicals){
        int count=0;
        Map<String,Integer> frequencyMap=new HashMap<>();
        for(String chemical:chemicals){
            String doubledchemical=doubledCharacters(chemical);

            if(frequencyMap.containsKey(doubledchemical)){
                count+=frequencyMap.get(doubledchemical);
            }

            frequencyMap.put(chemical,frequencyMap.getOrDefault(chemical,0)+1);

        }
        return count;
    }

    public static String doubledCharacters(String s){
        StringBuilder doubledString=new StringBuilder(s.length());
        for(char c:s.toCharArray()){
            doubledString.append(c).append(c);
        }
        return doubledString.toString();
    }
    public static void main(String args[]){
        int n=5;
        String chemicals[]={"hacker","int","niitnt","hackhackerer","long"};
        int result=countExplosivePairs(n,chemicals);
        System.out.println(result);
    }
    
}
