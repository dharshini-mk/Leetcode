import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); 
        Arrays.sort(s); 

        int child = 0, cookie = 0;
        while (child < g.length && cookie < s.length) {
            if (s[cookie] >= g[child]) {
                child++; // content child
            }
            cookie++; // move to next cookie
        }

        return child;
    }
}
