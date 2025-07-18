class Solution {
    public boolean isValid(String a) {
        Stack<Character> s = new Stack<>();
        for (char ch : a.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            } else {
                if (s.isEmpty()) return false;
                char top = s.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
}
