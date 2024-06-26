package com.datastructures.queue;

public class QueueArray {
    public static void main(String[] args) {
    QueueArray  queueArray=new QueueArray(3);
    boolean result2=queueArray.isFull();
        System.out.println(result2);
        boolean result1=queueArray.isEmpty();
        System.out.println("Is Empty : "+result1);
        queueArray.enQueue(1);
        queueArray.enQueue(2);
        queueArray.enQueue(3);
        int result;
        result=queueArray.deQueue();
        System.out.println(result);
        result=queueArray.deQueue();
        System.out.println(result);

        result=queueArray.peek();
        System.out.println(result);
        queueArray.delete();

    }

    int[] arr;
    int topOfQueue;
    int biginingOfQueue;

    public QueueArray(int size){
        this.arr =new int[size];
        this.topOfQueue=-1;
        this.biginingOfQueue =-1;
        System.out.println("this queue is successfull created with size : "+size);
    }
    public boolean isFull(){
        if(topOfQueue == arr.length-1){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isEmpty(){
        if(biginingOfQueue ==-1 || biginingOfQueue== arr.length){
            return true;
        }
        else {
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
            System.out.println("Sucessfully creates");
        }
        else{
            topOfQueue++;
            arr[topOfQueue]=value;
            System.out.println("Sucessfully creates");
        }
    }
    public int  deQueue(){
       if(isEmpty()){

            System.out.println("This queue is empty");
            return -1;
        }
        else{
            int result =arr[biginingOfQueue];
            biginingOfQueue++;
            if(biginingOfQueue>topOfQueue){
                biginingOfQueue =topOfQueue=-1;
            }
            System.out.println("Sucessfully creates");
            return result;
        }
    }
    public int peek(){
        if (!isEmpty()) {
            return arr[biginingOfQueue];
        }
        return -1;
    }
    public void delete(){
        arr =null;
        System.out.println("Deleted");
    }
}
