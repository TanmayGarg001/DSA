package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;

//LRU
//https://leetcode.com/problems/lru-cache/
public class Main10 {


}

class LRUCacheFAST {
    LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
    int capacity;

    public LRUCacheFAST(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        int val = map.get(key);
        map.remove(key);
        map.put(key, val);
        return val;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            map.remove(key);
            map.put(key, value);
        } else {
            map.put(key, value);
            if (map.size() > capacity) {
                int lru = map.keySet().iterator().next();//page data fot the LRU frame
                map.remove(lru);
            }
        }
    }
}

class LRUCache {

    Node head;
    Node tail;
    int capacity;
    HashMap<Integer, Node> map;

    public LRUCache(int capacity) {
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        this.capacity = capacity;
        map = new HashMap<>();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        Node curr = map.get(key);
        deleteLinks(curr);
        addInFront(curr);
        return curr.value;
    }

    public void addInFront(Node curr) {
        map.put(curr.key, curr);
        curr.next = head.next;
        head.next.prev = curr;
        curr.prev = head;
        head.next = curr;
    }

    public void deleteLinks(Node curr) {
        map.remove(curr.key);
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            deleteLinks(map.get(key));
        }
        if (map.size() == capacity) {
            deleteLinks(tail.prev);
        }
        addInFront(new Node(key, value));
    }
}

class Node {
    int value;
    int key;
    Node prev;
    Node next;

    Node(int key, int value) {
        this.value = value;
        this.key = key;
        prev = null;
        next = null;
    }
}