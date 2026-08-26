package day15;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class HandsOnDeque {
     public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.offer(45); que.offer(92);que.offer(128);que.offer(98);
        System.out.println(que.peek());
        Queue<Integer> pQueue = new PriorityQueue<>(Comparator.reverseOrder());
        pQueue.addAll(que);
        while(pQueue.peek()!= null){ System.out.println(pQueue.poll());
        }
     }
    
}
