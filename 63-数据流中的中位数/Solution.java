import java.util.*;

public class Solution {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer a, Integer b) {
            return b - a;
        }
    });

    public void Insert(Integer num) {
        if (maxHeap.size() > minHeap.size()) {
            minHeap.add(num);
        } else {
            maxHeap.add(num);
        }
        
        if (!maxHeap.isEmpty() && !minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
            int tmp = maxHeap.poll();
            maxHeap.add(minHeap.poll());
            minHeap.add(tmp);
        }
    }

    public Double GetMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return maxHeap.peek() + (minHeap.peek() - maxHeap.peek()) / 2.0;
        } else {
            return Double.valueOf(maxHeap.peek());
        }
    }
}