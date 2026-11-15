class Solution {
	public boolean isPalindrome(String s) {
		s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		int siz = s.length();
		for (int i=0;i<siz/2;i++){
			if (s.charAt(i)!=s.charAt(siz-i)){
				return false;
			}
		}
		return true;
	}
}
