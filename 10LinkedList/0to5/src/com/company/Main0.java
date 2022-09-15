//0.Implement Linked List
package com.company;

public class Main0 {

    public static void main(String[] args) {
        JavaLinkedList<Integer> linkedList = new JavaLinkedList<>();
        System.out.println(linkedList.size());
        System.out.println(linkedList.isEmpty());
        linkedList.add(45);
        linkedList.add(405);
        linkedList.add(-4);
        System.out.println(linkedList);
        System.out.println(linkedList.isEmpty());
        linkedList.remove();
        linkedList.set(0, 585);
        linkedList.add(8);
        linkedList.add(-5);
        System.out.println(linkedList);
        System.out.println(linkedList.get(linkedList.size() - 1));
        linkedList.remove(linkedList.size() - 1);
        System.out.println(linkedList.get(2));
        System.out.println(linkedList);
        linkedList.add(2, 25);
        linkedList.add(1, -425);
        System.out.println(linkedList);
    }

}