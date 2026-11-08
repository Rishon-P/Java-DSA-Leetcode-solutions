class Solution {
	public int[][] merge(int[][] intervals) {
		ArrayList<int[]> results = new ArrayList<>();
		Arrays.sort(intervals, (a,b)-> Integer.compare(a[0], b[0]));
		int present = 0;
		for (int[] interval:intervals){
			if (results.isEmpty()){
				results.add(interval);
			}
			int[] result_arr = results.get(present);
			if (result_arr[1] >= interval[0]){
				int upperlimit = Math.max(interval[1], result_arr[1]);
				results.get(present)[1] = upperlimit;
			} else {
				int[] new_arr = {interval[0], interval[1]};
				results.add(new_arr);
				present++;
			}	
		}
		return results.toArray(new int[0][]);
	}
} 
