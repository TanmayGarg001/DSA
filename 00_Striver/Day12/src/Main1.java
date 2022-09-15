//https://www.programiz.com/dsa/heap-data-structure

import java.util.ArrayList;

public class Main1 {

    public static void main(String[] args) {//When we print ofc it won't look like a sorted arr coz it is being implemented as a tree at back end but first element will
        //always be the maximum one for maxHeap and vice versa for minHeap. Still always use PriorityQueue.
        Heap maxHeap = new Heap();
        maxHeap.add(12);
        maxHeap.add(880);
        maxHeap.add(15);
        maxHeap.add(18);
        maxHeap.add(90);
        maxHeap.add(-5);
        maxHeap.add(0);
        System.out.println(maxHeap);
    }

}

class Heap {

    ArrayList<Integer> heap;

    public Heap() {
        heap = new ArrayList<>();
    }

    public void heapify(int index) {
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < heap.size() && heap.get(left) > heap.get(largest)) {
            largest = left;
        }
        if (right < heap.size() && heap.get(right) > heap.get(largest)) {
            largest = right;
        }
        if (largest != index) {
            int temp = heap.get(largest);
            heap.set(largest, heap.get(index));
            heap.set(index, temp);
            heapify(largest);
        }

    }

    public void add(int value) {
        if (heap.size() == 0) {
            heap.add(value);
        } else {
            heap.add(value);
            for (int i = heap.size() / 2 - 1; i >= 0; i--) {
                heapify(i);
            }
        }
    }

    public void remove(int value) {
        int i;
        for (i = 0; i < heap.size(); i++) {
            if (value == heap.get(i)) {
                break;
            }
        }
        int temp = heap.get(i);
        heap.set(i, heap.get(heap.size() - 1));
        heap.set(heap.size() - 1, temp);
        heap.remove(heap.size() - 1);

        for (int j = heap.size() / 2 - 1; j >= 0; j--) {
            heapify(j);
        }
    }

    @Override
    public String toString() {
        String output = "[ ";
        for (int i = 0; i < heap.size(); i++) {
            output = output + heap.get(i) + " ";
        }
        output = output + "]";
        return output;
    }

}
