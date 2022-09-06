//https://leetcode.com/problems/find-median-from-data-stream/

import java.util.Collections;
import java.util.PriorityQueue;

public class Main4 {//O(nlogk),O(n)

    PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> large = new PriorityQueue<>();

    public void addNum(int num) {
        small.add(num);
        large.add(small.poll());
        while (small.size() < large.size()) {
            small.add(large.poll());
        }
    }

    public double findMedian() {
        if (small.size() == large.size()) {
            return small.peek() / 2.0 + large.peek() / 2.0;
        } else {
            return small.peek();
        }
    }

}
