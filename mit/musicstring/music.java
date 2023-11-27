package mit.musicstring;

import java.util.HashMap;

public class music {
     public static int minDaysToTeach(String song) {
        // Initialize a map to store the frequency of each character
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each character in the song
        for (char ch : song.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Use a set to store unique melodies
        int uniqueMelodies = 0;

        // Iterate through the song and create melodies based on character frequencies
        StringBuilder currentMelody = new StringBuilder();
        for (char ch : song.toCharArray()) {
            currentMelody.append(ch);
            frequencyMap.put(ch, frequencyMap.get(ch) - 1);

            // Check if the current melody is complete (frequency of each character is 0)
            boolean isMelodyComplete = frequencyMap.values().stream().allMatch(frequency -> frequency == 0);
            if (isMelodyComplete) {
                uniqueMelodies++;
                currentMelody.setLength(0);
            }
        }

        // The number of unique melodies is the minimum number of days required
        return uniqueMelodies;
    }

    public static void main(String args[]){
        String song1 = "abbaabed";
        System.out.println(minDaysToTeach(song1)); 

        String song2 = "abcd";
        System.out.println(minDaysToTeach(song2)); 
    }
    
}
