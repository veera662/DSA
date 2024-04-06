package com.datastructures.linkedlist;

public class TestLinkedList {
    public static void main(String[] args) {
    TestLinkedList testLinkedList=new TestLinkedList();
    testLinkedList.createSingleLinkedList(5);
        System.out.println(testLinkedList.head.value);
        testLinkedList.insertLinkedList(6,0);
        System.out.println(testLinkedList.head.value);
    }

    public Node head;
    public Node tail;
    public int size;

    public Node createSingleLinkedList(int nodeVale){
        head =new Node(); //O(1)
        Node node=new Node();//O(1)
        node.next =null;//O(1)
        node.value=nodeVale;//O(1) ////O(1)
        head =node;//O(1)
        tail =node;//O(1)
        size=1;//O(1)
        return head;
    }

    //Insert


    public void insertLinkedList(int nodeVale,int location) {
       Node node=new Node();
       node.value=nodeVale;
       if(head==null){
           createSingleLinkedList(nodeVale); //O(1)
           return;
       }else if(location ==0){
           node.next=head;//O(1)
           head=node;//O(1)
       }else if (location>=size){//O(1)
           node.next=null;//O(1)
           tail.next=node;//O(1)
           tail=node;//O(1)
       }
       else{
           Node tempNode=head;
           int index =0;
           while(index<location-1){//O(N)
               tempNode=tempNode.next;
               index++;
           }
           Node nextNode=tempNode.next;
           tempNode.next=node;
           node.next=nextNode;

       }
       size++;
    }
}
