package com.datastructures.linkedlist;

public class TestLinkedList {
    public static void main(String[] args) {
    TestLinkedList testLinkedList=new TestLinkedList();
    testLinkedList.createSingleLinkedList(5);
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

}
