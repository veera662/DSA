package com.datastructures.linkedlist;

public class TestLinkedList {
    public static void main(String[] args) {
        TestLinkedList testLinkedList=new TestLinkedList();
        testLinkedList.createSinglyLinkedList(5);
       // System.out.println(testLinkedList.head.value);
        testLinkedList.insertInLinkedList(6,1);
        testLinkedList.insertInLinkedList(7,2);
        testLinkedList.insertInLinkedList(8,3);
        testLinkedList.insertInLinkedList(9,0);
        testLinkedList.insertInLinkedList(10,4);
        testLinkedList.insertInLinkedList(11,5);
        System.out.println(testLinkedList.head.value);

        testLinkedList.deletionOfNode(5);
        testLinkedList.traverseSinglyLinkedList();
    }

    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeVale){
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


    public void insertInLinkedList(int nodeVale,int location) {
       Node node=new Node();
       node.value=nodeVale;
       if(head==null){
           createSinglyLinkedList(nodeVale); //O(1)
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

    //traversal

    public void traverseSinglyLinkedList() {
        if(head==null){
            System.out.print("SLL doestnot exist");
        }
        else {
            Node tempNode =head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size-1) {
                    System.out.print(" -> ");
                }
                tempNode =tempNode.next;
            }
        }
        System.out.println("\n");
    }

    boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i=0; i<size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.print("Found the node at location: " +i+"\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("Node not found! ");
        return false;
    }

    public void deletionOfNode(int location) {
        if (head == null) {
            System.out.println("The SLL does not exist");
            return;
        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i <location-1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

}
