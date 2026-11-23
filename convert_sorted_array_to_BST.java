class Solution {
	public TreeNode sortedArrayToBST(int[] nums) {
        int left = 0;
		int siz = nums.length;
        int right = siz - 1;
        int mid = left+ ((right-left)/2);
		if (siz%2==0){
			mid = mid + 1;
		}  
        TreeNode root = new TreeNode(nums[mid], null, null);
	recursive_addition(nums, left, mid-1, root);
        recursive_addition(nums, mid+1, right, root);
	return root;
    	}

    void recursive_addition(int[] nums, int left, int right, TreeNode root){
        if (left>right){
            return;
        }
        if (left==right){
            insert_number(nums[left], root);
            return;
        }
        int mid = left + (right-left)/2;
        if ((right-left+1)%2==0){
            mid = mid + 1;
        }
        insert_number(nums[mid], root);
        recursive_addition(nums, left, mid-1, root);
        recursive_addition(nums, mid+1, right, root);

    }
	void insert_number(int num, TreeNode root){
		TreeNode temp = new TreeNode(num, null, null);
		while (true){
			if (num>root.val){
				if (root.right==null){
					root.right = temp;
					return;
				} else {
					root = root.right;
				}
			} else {
				if (root.left==null){
					root.left = temp;
					return;
				} else {
					root = root.left;
				}
			}
		}
	}

}
