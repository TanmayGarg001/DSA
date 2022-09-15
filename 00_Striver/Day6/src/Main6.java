//https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1#

import java.util.ArrayList;
import java.util.Collections;

public class Main6 {

    Node flatten(Node root) {//O(mn(logmn)),O(mn)
        ArrayList<Integer> al = new ArrayList<>();
        while (root != null) {
            al.add(root.data);
            Node temp = root;
            while (temp.bottom != null) {
                temp = temp.bottom;
                al.add(temp.data);
            }
            root = root.next;
        }
        Collections.sort(al);
        Node ans = new Node(0);
        Node ret = ans;
        for (int i = 0; i < al.size(); i++) {
            ret.bottom = new Node(al.get(i));
            ret = ret.bottom;
        }
        return ans.bottom;
    }

    static class Node {
        int data;
        Node next;
        Node bottom;

        Node(int d) {
            data = d;
            next = null;
            bottom = null;
        }
    }

}
