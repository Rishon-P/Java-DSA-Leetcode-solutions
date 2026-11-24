class Solution {
	public int maxLength(int[] nums) {
		ArrayList<Integer> list = new ArrayList<>();
		int starting = 0, ending = 0;
		int siz = nums.length;
		int siz_list = list.size();
		int hcf_total = nums[0];
		int lcm_total = nums[0];
		int temp;
		int max_length = 1;
		int prod = nums[0];
		if (siz==1){
			return 1;
		}
		list.add(nums[0]);
		siz_list++;
		for (int i=1;i<siz;i++){
			list.add(nums[i]);
			hcf_total = gcd_recursive(hcf_total, nums[i]);
			lcm_total = lcm_recursive(lcm_total, nums[i]);
			prod = prod*nums[i];
			siz_list++;
			if (prod==hcf_total*lcm_total){
				continue;
			} else {
				if (max_length<siz_list-1){
					max_length = siz_list-1;
				}
				starting = 0;
				while (siz_list!=1){
					temp = list.remove(starting);
					prod = prod/temp;
					hcf_total = gcd(list);
					lcm_total = lcm(list);
					siz_list--;
					if (prod==hcf_total*lcm_total){
						break;
					}
				}
				if (siz_list==1){
					hcf_total = list.get(0);
					lcm_total = list.get(0);
					prod = list.get(0);
				}	
			}
		}	
		if (max_length<siz_list){
			max_length = siz_list;
		}
		return max_length;
	}

	int gcd(List<Integer> list){
		int siz = list.size();
		int gcd_val = list.get(0);
		if (siz==1){
			return gcd_val;
		}
		for (int i=1;i<siz;i++){
			gcd_val = gcd_recursive(gcd_val, list.get(i));	
		}	
		return gcd_val;
	}

	int gcd_recursive(int a, int b){
		if (b==0){
			return a;
		}
		return gcd_recursive(b, a%b);
	}

	int lcm(List<Integer> list){
		int siz = list.size();
		int lcm_val = 1;
		for (int i=0;i<siz;i++){
			lcm_val = lcm_recursive(lcm_val, list.get(i));	
		}
		return lcm_val;
	}

	int lcm_recursive(int a, int b){
		return (a*b)/gcd_recursive(a, b);
	}
}
