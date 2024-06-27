package com.datastructures.pc;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode ls1=new ListNode(5);
        ListNode ls2=new ListNode(4,ls1);
        ListNode ls3=new ListNode(9,ls2);

        ListNode ls4=new ListNode(4);
        ListNode ls5=new ListNode(3,ls4);
        ListNode ls6=new ListNode(2,ls5);
        System.out.println(ls3.toString());
        AddTwoNumbers addNumbers =new AddTwoNumbers();
        ListNode listNode = addNumbers.addTwoNumbers(ls3, ls6);
        System.out.println(listNode.toString());

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dumyNode=new ListNode(0);
        ListNode current= dumyNode;
        int carry=0;
        while (l1!=null || l2!=null || carry!=0){
            int x= (l1!=null) ? l1.val:0;
            int y = (l2!=null)?l2.val:0;
            int sum =carry+x+y;
            carry =sum/10;
            current.next=new ListNode(sum%10);
            current=current.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;

        }
        return dumyNode.next;
    }
}
