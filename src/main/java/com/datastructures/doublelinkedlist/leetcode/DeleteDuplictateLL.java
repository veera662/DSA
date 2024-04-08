package com.datastructures.doublelinkedlist.leetcode;

import java.util.HashSet;

public class DeleteDuplictateLL {

    //Delete duplicates
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.createLL((1));
        ll.insertNode((2));
        ll.insertNode((3));
        ll.insertNode((2));
        ll.insertNode((5));
        ll.traversalLL();
        DeleteDuplictateLL duplictateLL=new DeleteDuplictateLL();
        duplictateLL.deleteDups(ll);
        ll.traversalLL();
    }
    public void deleteDups(LinkedList list){

        HashSet<Integer> hs=new HashSet<>();
        Node curentNode=list.head;
        Node prev=null;

        while (curentNode!=null){
            int curval=curentNode.value;
            if(hs.contains(curval)){
                prev.next=curentNode.next;
                list.size--;
            }else{
                hs.add((curval));
                prev=curentNode;
            }
            curentNode=curentNode.next;
        }


    }
}
