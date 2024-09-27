class Solution
{
    public int minMovesToSeat(int[] seats, int[] students)
    {
        Arrays.sort(seats);
        Arrays.sort(students);
        int c=0,i=0,j=0;
        while(i<seats.length&&j<students.length)
        {
            c+=Math.abs(seats[i]-students[j]);
            i++;
            j++;
        }
        return c;
    }
}