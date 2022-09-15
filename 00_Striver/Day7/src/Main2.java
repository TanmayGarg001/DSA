//https://leetcode.com/problems/copy-list-with-random-pointer/

import java.util.HashMap;

public class Main2 {

    public Node copyRandomList(Node head) {//O(n),O(n)
        HashMap<Node, Node> hmap = new HashMap<>();
        Node temp = head;
        while (temp != null) {
            hmap.put(temp, new Node(temp.val));
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            hmap.get(temp).next = hmap.get(temp.next);
            hmap.get(temp).random = hmap.get(temp.random);
            temp = temp.next;
        }
        return hmap.get(head);
    }

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

}