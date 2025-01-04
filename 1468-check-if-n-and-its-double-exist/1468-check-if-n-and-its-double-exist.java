class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=1;j<arr.length;j++)
            {
                if(i!=j&&(arr[j]*2==arr[i]||arr[i]*2==arr[j]))
                    return true;
            }
        }
        return false;
    }
}