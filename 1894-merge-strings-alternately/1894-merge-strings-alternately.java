class Solution
{
    public String mergeAlternately(String word1, String word2)
    {
        StringBuilder sb=new StringBuilder();
        int i=0,j=0;
        while(j<word2.length()&&i<word1.length())
        {
            if(i<word1.length()){
                sb.append(word1.charAt(i));
                i++;
            }
            sb.append(word2.charAt(j));
            j++;
        }
        while(i<word1.length())
        {
            sb.append(word1.charAt(i));
            i++;
        }
        while(j<word2.length())
        {
            sb.append(word2.charAt(j));
            j++;
        }
        String s=sb.toString();
        return s;
    }
}