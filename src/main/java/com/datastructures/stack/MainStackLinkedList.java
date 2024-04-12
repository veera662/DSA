package com.datastructures.stack;



class Main {
  public static void main(String[] args) {
    com.datastructures.stack.Stack newStack = new Stack(4);
    newStack.push(1);
    newStack.push(2);
    newStack.push(3);

    //newStack.deleteStack();
    int pop = newStack.pop();
    System.out.println(pop);
  }
}
