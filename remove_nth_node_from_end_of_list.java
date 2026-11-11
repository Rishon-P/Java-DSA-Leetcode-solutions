class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode front = head;
		ListNode rear = head;
		ListNode prev = null;
		if (head.next==null){
			return null;
		}
		int i = 0;
		while (i<n){
			if (front==null){
				return head;
			}
			front = front.next;
			i++;
		}
		while (front!=null){
			front = front.next;
			prev = rear;
			rear = rear.next;	
		}
		if (head==rear){
			head = rear.next;
		} else {
			prev.next = rear.next;
		}
		return head;
	}
}
