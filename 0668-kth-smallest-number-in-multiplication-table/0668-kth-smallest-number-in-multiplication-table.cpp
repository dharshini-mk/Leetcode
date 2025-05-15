class Solution {
public:

/*
Example table :
1   2   3   4   5
2   4   6   8   10
3   6   9   12  15
4   8   12  16  20
Lets say, mid:x = 10 (20/2) , row:m = 4 , col:n = 5 , k -> kth element = 9

Initially, i = m = 4, j = 1
'i' here also represents number of numbers in jth column.
example, i = 4, j =1 => 4 numbers in 1st column (1,2,3,4)
Since, i*j = 4, less than mid received as parameter (10 in this case)
we increment j and count +=4.

Now i = 4, j = 2.
i*j still less than 10.
so all numbers in jth column must be less than 10. (2,4,6,8)
so count += i which is count += 4, makes it 8. (means count of (1,2,3,4,2,4,6,8))
j++

Now i = 4, j = 3 => i*j not <= 10
Means, not all numbers in jth column can be <=10.
so decrement i.

Now i = 3, j = 3 => i*j <=10
means, (3,6,9) are <=10.
so count += 3  => count = 11
j++

Now i = 3, j = 4 .. 12 not <=10. i--

Now i = 2, j = 4 => i*j <= 10
means (4,8) in jth column can be counted. 
count += i => count = 13
j++

Now i = 2, j = 5 => i*j <= 10
means (5,10) in jth column can be counted.
count += i => count = 15
j++

j=6, loop exits

Now count is further compared to asked kth value. if count is less, then update low to mid + 1 , else hi = mid

Now, why low  = mid+ 1 and hi  = mid ?

Reasons:
1. it relies on how mid is calculated. mid of (1+10)/2 = 5, (5.5 is floored to 5). if low was also kept as mid, then say in case of 
low = 6, hi  = 7, mid is always 6. So, if it reaches low=mid, then low will remain unchanged. infinite loop
2. why not low = mid + 1 and hi  = mid -1? Again, if hi is mid-1, then further calculation of mid reduces by 1.
example.. low = 1, hi = 9. mid = 5. but if hi = 8, then mid  = 4. This further propagates. Hence, if mid  = 5 was the ans, it would have been missed
3. Why not use low = mid-1 and hi = mid +1 , and simply return when count  == mid ? 
Say, when multiplication table is seen as 1D array in increasing order
5       6       6       8
9th     10th    11th    12th
 and we want 11th number, it should return 6.
 if mid becomes 7, and  CountOfNumbersTillMid is called, it would still give count as 11 and return 7 which is wrong
 it should still continue with hi = 7, find mid again, may be this time mid  = 6.
 then CountOfNumbersTillMid would give 11 again and this value to correct.

*/
	int CountOfNumbersTillMid(int x, int m, int n) {
		int count = 0;
		int i = m;
		int j = 1;
		while (i >= 1 && j <= n)         // i goes from m to 1, j goes from 1 to n
		{
			if (i*j <= x)
			{
				count += i;
				j++;
			}
			else
				i--;
		}
		return count;
	}

	int findKthNumber(int m, int n, int k) {
		int low = 1, hi = m * n;
		while (low < hi) {
			int mid = low + (hi - low) / 2;
			int count = CountOfNumbersTillMid(mid, m, n);
			if (count < k)
				low = mid + 1;
			else
				hi = mid;
		}
		return low;
	}
};