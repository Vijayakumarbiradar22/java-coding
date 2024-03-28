package mit.chemicals;
import java.util.HashMap;
import java.util.Map;
public class chem {
    public static int countExplosivePairs(int N, String[] chemicals) {
        int count = 0;
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String chemical : chemicals) {
            String doubledChemical = doubleCharacters(chemical);

            // Increment count for each occurrence of the original chemical
            count += frequencyMap.getOrDefault(chemical, 0);

            // Increment frequency of both original and doubled chemicals in the map
            frequencyMap.put(chemical, frequencyMap.getOrDefault(chemical, 0) + 1);
            frequencyMap.put(doubledChemical, frequencyMap.getOrDefault(doubledChemical, 0) + 1);
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
