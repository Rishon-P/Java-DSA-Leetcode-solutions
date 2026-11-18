class Solution {
	public boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length()-1;
		while (left<=right){
			char ch = s.charAt(left);
			if (!Character.isLetterOrDigit(ch)){
				left++;
				continue;
			}
			char ch2 = s.charAt(right);
			if (!Character.isLetterOrDigit(ch)){
				right--;
				continue;
			}
			ch = Character.toLowerCase(ch);
			ch2 = Character.toLowerCase(ch2);
			
			if (ch==ch2){
				left++;
				right--;
				continue;
			} else {
				return false;																									
			}
		}
		return true;
	}
}
