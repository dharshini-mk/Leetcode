class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        
        // Two arrays to store mappings from s to t and t to s
        int[] sMap = new int[256];
        int[] tMap = new int[256];
        
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            // If the current character from s maps to a different character in t, return false
            if (sMap[sChar] != tMap[tChar]) {
                return false;
            }
            
            sMap[sChar] = i + 1;
            tMap[tChar] = i + 1;
        }
        
        return true;
    }
}
