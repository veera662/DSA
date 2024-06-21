package com.datastructures.queue;

public class CircularQueue {
    public static void main(String[] args) {
        CircularQueue  queueArray=new CircularQueue(3);
        boolean result2=queueArray.isFull();
        System.out.println(result2);
        boolean result1=queueArray.isEmpty();
        System.out.println("Is Empty : "+result1);
        queueArray.enQueue(1);
        queueArray.enQueue(2);
        queueArray.enQueue(3);
       /* int result;
        result=queueArray.deQueue();
        System.out.println(result);
        result=queueArray.deQueue();
        System.out.println(result);

        result=queueArray.peek();
        System.out.println(result);
        queueArray.delete();*/
    }

    int[] arr;
    int topOfQueue;
    int biginingOfQueue;
    int size;

    public CircularQueue(int size){
        this.arr =new int[size];
        this.topOfQueue=-1;
        this.biginingOfQueue =-1;
        this.size=size;
        System.out.println("this queue is successfull created with size : "+size);
    }

    public boolean isEmpty(){
        if(topOfQueue==-1){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isFull(){
        if(topOfQueue +1== biginingOfQueue){
            return true;
        } else if (biginingOfQueue==0 && topOfQueue+1 == size) {
            return true;
        } else {
            return false;
        }
    }
    public void enQueue(int value){
        if(isFull()){
            System.out.println("This queue is full");
        }else if(isEmpty()){
            biginingOfQueue=0;
            topOfQueue++;
            arr[topOfQueue]=value;
            System.out.println("Sucessfully inserted in the queue : "+ value);
        }
        else{
            if(topOfQueue++ == size){
                topOfQueue=0;
            }else {
                topOfQueue++;
            }
            arr[topOfQueue]=value;
            System.out.println("Sucessfully creates");
        }
    }
}
