class Solution {
	public boolean canAliceWin(int n) {
		if (n<10){
			return false;
		}
		n = n - 10;
		int alice = 0;
		int rem = 9;
		while (true){
			if (rem>n){
				break;		
			}
			n = n - rem;
			rem = rem - 1;
			alice++;
		}
		return alice%2==0;
	}
}
