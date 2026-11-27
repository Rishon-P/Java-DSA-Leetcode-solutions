class Solution {
	
	public int maximumSaleItems(int[][] items, int budget) {
		int[] arr = new int[budget+1];
		int siz = items.length;
		int price, factor;
		int[] benefit = new int[siz];
		for (int i=0;i<budget+1;i++){
			arr[i] = Integer.MIN_VALUE;
		}
		arr[0] = 0;
		for (int i=0;i<siz;i++){
			benefit[i] = 1 + eligible_free(items[i][0], i, items, siz);
		}
		int min = 1501;
		for (int i=0;i<siz;i++){
                        price  = items[i][1];
                        factor = items[i][0];
                        if (min>price){
                                min = price;
                        }
                        for (int j=budget;j>=price;j--){
				if (arr[j-price] !=  Integer.MIN_VALUE){		
					arr[j] = Math.max(arr[j], arr[j-price] + benefit[i]);
				} 
                        }
                }
		int max_copies = 0; 
		for (int i=0;i<budget+1;i++){
			if (arr[i]==Integer.MIN_VALUE){
				continue;	
			}
			max_copies = Math.max(max_copies, arr[i] + ((budget-i)/min));
		}
		return max_copies; 
		
	}

	int eligible_free(int factor, int i, int[][] items, int siz){
		int count = 0;
		for (int j=0;j<siz;j++){
			if (i==j){
				continue;
			}
			if (items[j][0]%factor==0){
				count++;
			}
		}	
		return count;
	}	
}
