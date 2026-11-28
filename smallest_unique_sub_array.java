class Solution {
	public int smallestUniqueSubarray(int[] nums) {
		int left = 1;
		int right = nums.length;
		int ans = nums.length;
		int temp;
		while (left<=right){
			int mid = left + (right-left)/2;
			temp = hasUnique(nums, mid);
			if (temp!=-1){
				ans = mid;
				right = mid - 1;	
			} else {
				left = mid+1;
			}
		}	
		return ans;
	}		
	int hasUnique(int[] nums, int i){
		Map<Long, Integer> mapped = new HashMap<>();
		int leng = 1;
		int mod = 1000000007, base = 1000000;
		int siz = nums.length;
		long hashed;
		long power;
		int temp;
		hashed = (long) nums[0];
		power = 1;
		for (int j=1; j<i; j++){
			hashed = (hashed*base + nums[j])%mod; 		
			power = (power*base)%mod;
		}
		mapped.put(hashed, 1);
			
		int ul = siz-i+1;
		for (int k=1; k<ul; k++){
			temp = nums[k-1]; 
			hashed = (hashed - (power*temp)%mod + mod)%mod;
			hashed = (hashed*base + nums[k+i-1]) % mod;
			if (mapped.containsKey(hashed)){
				mapped.put(hashed, mapped.get(hashed)+1);
			} else {
				mapped.put(hashed, 1);
			}
		}

		for (long key: mapped.keySet()){
			if (mapped.get(key)==1){
				return i;
			}
		}
		return -1;
	}	
}
