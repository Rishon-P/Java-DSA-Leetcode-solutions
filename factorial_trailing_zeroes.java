class Solution{
	public int trailingZeroes(int n){
		int initial = 5;
		int p = n;
		int count = 0;	
		while (initial<n){
			count = count + n/initial;
			initial = initial*5;
		}
		return count; 
	}
}
