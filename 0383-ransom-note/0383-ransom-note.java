class Solution
{
    public boolean canConstruct(String ransomNote, String magazine)
    {
        Map<Character, Integer> magazineMap = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++)
        {
            char ch = magazine.charAt(i);
            magazineMap.put(ch, magazineMap.getOrDefault(ch, 0) + 1);
        }        
        for (int i = 0; i < ransomNote.length(); i++)
        {
            char ch = ransomNote.charAt(i);
            if (!magazineMap.containsKey(ch) || magazineMap.get(ch) == 0)
                return false;    
            magazineMap.put(ch, magazineMap.get(ch) - 1);
        }        
        return true; 
    }
}
