package mit.chemicals;
import java.util.HashMap;
import java.util.Map;
public class chem {
    public static int countExplosivePairs(int n,String[] chemicals){
        int count=0;
        Map<String,Integer> frequencyMap=new HashMap<>();
        for(String chemical:chemicals){
            String doubledchemical=doubleCharacters(chemical);

            if(frequencyMap.containsKey(chemical)){
                count+=frequencyMap.get(chemical);
            }

            frequencyMap.put(doubledchemical,frequencyMap.getOrDefault(doubledchemical,0)+1);

        }
        return count;
    }

    public static String doubleCharacters(String s){
        StringBuilder doubledString=new StringBuilder(s.length()*2);
        for(char c:s.toCharArray()){
            doubledString.append(c).append(c);
        }
        return doubledString.toString();
    }
    public static void main(String args[]){
        int n=5;
        String[] chemicals={"hacker","int","niitnt","hackhackerer","long"};
        int result=countExplosivePairs(n,chemicals);
        System.out.println(result);
    }
    
}
