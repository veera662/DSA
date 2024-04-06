package com.datastructures.circularlinkedlist.leetcode;

public class CLLInsertToHeadMain {
    public static void main(String[] args) {
        CLLInsertToHead cllInsertToHead=new CLLInsertToHead();
        cllInsertToHead.append(5);
        cllInsertToHead.append(6);
        System.out.println(cllInsertToHead.length);
        System.out.println(cllInsertToHead.countNodes());
    }
}
