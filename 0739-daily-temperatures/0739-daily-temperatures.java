class Solution
{
    public int[] dailyTemperatures(int[] temperatures)
    {
        Stack<Integer> stack = new Stack<>();
        int[] a = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++)
        {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()])
            {
                int idx = stack.pop();
                a[idx] = i - idx;
            }
            stack.push(i);
        }
        return a;        
    }
}