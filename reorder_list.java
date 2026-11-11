class Solution {
        public void reorderList(ListNode head) {
                ListNode slow_itr = head;
                ListNode fast_itr = head;
                ListNode prev = null;

                if (head==null || head.next==null){
                    return;
                }
                
                while (fast_itr!=null){
                        if (fast_itr.next==null){
                            break;
                        }
                        fast_itr = fast_itr.next.next;
                        prev = slow_itr;
                        slow_itr = slow_itr.next;
                }
                
                ListNode start = slow_itr.next;
                ListNode temp2, itr, temp;
                slow_itr.next = null;
                if (start==null){
                    return;
                }
                temp2 = start.next;
                start.next = null;
                temp = start;
                itr = temp2;
                while (itr!=null){
                    temp2 = itr.next;
                    itr.next = temp;
                    temp = itr;
                    itr = temp2;
                }
                
                
                ListNode head_of_rev = temp;
                ListNode itr2 = head_of_rev;
                fast_itr = head;
                
                while (itr2!=null){
                        temp = fast_itr.next;
                        temp2 = itr2.next;
                        fast_itr.next = itr2;
                        itr2.next = temp;
                        fast_itr = temp;
                        itr2 = temp2;
                }

        }
}
