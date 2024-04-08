package com.datastructures.doublelinkedlist;

public class DLLTest {

    public static void main(String[] args) {
        DLLTest test =new DLLTest();
        test.createDLL(1);
        test.insertDLL(10,1);
        test.insertDLL(20,2);
        test.insertDLL(30,3);
        test.insertDLL(40,4);
        test.insertDLL(50,5);
        test.insertDLL(60,6);
        System.out.println(test.head.value);
        test.traversalDLL();
        test.reverseTraveseDLL();

    }

    DoublyNode head;
    DoublyNode tail;
    int size;

    public DoublyNode createDLL(int nodeValue) {
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }

    // Insertion Method
    public void insertDLL(int nodeValue, int location) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if (head == null) {
            createDLL(nodeValue);
            return;
        } else if (location == 0) {
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = null;
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location-1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }

    public void traversalDLL(){
        if (head != null) {
            DoublyNode tempNode=head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if(i!=size){
                    System.out.print(" -> ");
                }
                tempNode=tempNode.next;
            }
        }else {
            System.out.println("The DLL does not exist");
        }
        System.out.println("\n");
    }

    //p

    public void reverseTraveseDLL() {
       if(head!=null){
           DoublyNode tempNode=tail;
           for (int i = 0; i < size; i++) {
               System.out.print(tempNode.value);
               if(i!=size){
                   System.out.print(" <-> ");
               }
               tempNode=tempNode.prev;
           }
        }else {
           System.out.println("DLL Not exisr");
       }
        System.out.println("\n");
    }
}
