package Leetcode;

public class Leetcode328 {

	class Solution {
	    public ListNode oddEvenList(ListNode head) {
	        return OddEvenlist(head);
	    }

	    public static ListNode OddEvenlist(ListNode header)
		{
			if(header == null || header.next == null)
				return header;
			
			ListNode odd = header;
			ListNode even = header.next;
			ListNode temp = even;
			
			while(even!=null && even.next!= null)
			{
				odd.next=even.next;
				odd = odd.next;
				
				even.next = odd.next;
				even = even.next;
			}
			
			odd.next = temp;
			
			return header;
		}
	}
}
