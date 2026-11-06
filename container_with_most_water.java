class Solution {
	public int maxArea(int[] height){
		int left = 0;
		int size = height.length;
		int right = size - 1;
		int temp = 0;
		int max = -1;
		int min_line;
		while (left<right){
			min_line = Math.min(height[left], height[right]);
			temp = min_line*(right-left);
			if (temp>max){
				max = temp;
			}
			if (min_line==height[left]){
				left++;
			}else {
				right--;
			}
			
		}
		return max;
	}
}
