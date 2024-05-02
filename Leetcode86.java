package Leetcode;

import java.util.Scanner;


public class Leetcode86 {

	class Solution {
	    public ListNode partition(ListNode head, int x) {
	        return SmallBigList(head,x);
	    }
	    public static ListNode SmallBigList(ListNode header,int x)
		{
			if(header == null || header.next == null)
				return header;
			
			ListNode small = Firstsmall(header, x);
			ListNode smallhead = small;
			ListNode big = Firstbig(header, x);
			ListNode bighead = big;
			ListNode n = header;
			
			if(big==null || small == null)
				return header;
			
			while(n!=null)
			{
				if(n.val<x && n!=smallhead)
				{
				small.next=n;
				small = small.next;
				}
				
				else if(n.val >=x && n!=bighead)
				{
				big.next = n;
				big = big.next;
				}
				
				n = n.next;
			}
			big.next=null;
			small.next = bighead;
			
			return smallhead;
		}
		
		
		
		public static ListNode Firstsmall(ListNode Header, int x)
		{
			ListNode temp = Header;
			while(temp!=null)
			{
				if(temp.val < x)
					return temp;
				
				temp=temp.next;
			}
			return null;
		}
		
		public static ListNode Firstbig(ListNode Header, int x)
		{
			ListNode temp = Header;
			while(temp!=null)
			{
				if(temp.val >= x)
					return temp;
				
				temp=temp.next;
			}
			return null;
		}
	}
}
