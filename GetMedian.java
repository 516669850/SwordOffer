package offer;

import java.util.Comparator;
import java.util.PriorityQueue;

public class GetMedian {
    PriorityQueue<Integer> minQueue = new PriorityQueue<>();
    PriorityQueue<Integer> maxQueue = new PriorityQueue<>(new Comparator<Integer>(){
        public int compare(Integer o1,Integer o2){
            return o2.compareTo(o1);
        }
    });
    int index = 0;
    public void Insert(Integer num) {
        if(index % 2 == 0){
            minQueue.offer(num);
            maxQueue.offer(minQueue.poll());
        }else{
            maxQueue.offer(num);
            minQueue.offer(maxQueue.poll());
        }
        index++;
    }

    public Double GetMedian() {
        if(index % 2 == 1)
            return (double)maxQueue.peek();
        else
            return ((double)maxQueue.peek() + (double)minQueue.peek()) / 2;
    }
}
