class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");  // Split the string into words
        
        if (pattern.length() != words.length) {
            return false;  // If pattern length and number of words don't match
        }
        
        // Two maps to track character-to-word and word-to-character mappings
        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();
        
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            
            // Check if the pattern character is already mapped to a word
            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(word)) {
                    return false;  // Mismatch in mapping
                }
            } else {
                charToWord.put(c, word);  // Create a new mapping
            }
            
            // Check if the word is already mapped to a pattern character
            if (wordToChar.containsKey(word)) {
                if (wordToChar.get(word) != c) {
                    return false;  // Mismatch in mapping
                }
            } else {
                wordToChar.put(word, c);  // Create a new mapping
            }
        }       
        return true;
    }
}
