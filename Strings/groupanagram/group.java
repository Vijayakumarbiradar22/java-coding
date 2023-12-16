package Strings.groupanagram;
import java.util.Scanner;
import java.util.*;
public class group {
    public static List<List<String>> groupAnagrams(String[] strs){
        if(strs.length==0){
            return new ArrayList<>();
        }
        Map<String,List<String>> map = new HashMap<>();

        for(String i:strs){
            char[] chars = i.toCharArray();
            Arrays.sort(chars);

            String sortedStr=String.valueOf(chars);

            if(!map.containsKey(sortedStr)){
                map.put(sortedStr,new ArrayList<>());
            }
            map.get(sortedStr).add(i);
        }
        return new ArrayList<>(map.values());
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        String strs[]=new String[n];
        System.out.println("Enter the array of strings:");
        for(int i=0;i<n;i++){
            strs[i]=sc.nextLine();
        }
        List<List<String>> result = groupAnagrams(strs);
        for(List<String> s:result){
            System.out.println(s);
        }
        sc.close();
        
    }
    
}