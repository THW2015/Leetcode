package ex;

public class AddTwoNumbers {
	//thw
	public static void main(String[] args) {
		ListNode l1=new ListNode(2);
		l1.next=new ListNode(4);
		l1.next.next=new ListNode(3);
		ListNode l2=new ListNode(5);
		l2.next=new ListNode(6);
		l2.next.next=new ListNode(4);
		ListNode lh=new ListNode(0);
		lh=new Solution().addTwoNumbers(l1, l2);
		while(lh.next!=null) {
			System.out.println(lh.next.val);
			lh=lh.next;
		}

		
	}

}

 class ListNode {
	 int val;
	 ListNode next;
	 ListNode(int x){
		 val=x;
		 
	 }
 }
 class Solution {
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode listHead=new ListNode(0);
	        ListNode q=l1,p=l2,h=listHead;
	        int cur=0;
	        while(q!=null||p!=null) {
	        	int num1=q!=null?q.val:0;
	        	int num2=p!=null?p.val:0;
	        	int sum=num1+num2+cur;
	        	cur=sum/10;
	        	h.next=new ListNode(sum%10);
	        	h=h.next;
	        	p=p.next;
	        	q=q.next;
	        }
	        if(cur>0) {
	        	h.next=new ListNode(1);
	        	h=h.next;
	        	h.next=null;
	        }
	        return listHead;
	    }
	}


