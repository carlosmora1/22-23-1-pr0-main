package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.QueueArrayImpl;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class PR0Queue {

    public final int CAPACITY = 9;

    private Queue<Integer> queue;

    public PR0Queue() {
        newQueue();
    }
    public void newQueue() {
        queue = new QueueArrayImpl<>(CAPACITY);
    }

    public void fillQueue() {
        for (int c = 0; c < 9; c++) {
            queue.add(c);
        }
    }

    public int[] clearFullQueue() {
        int[] ib = new int[9];
        int idx = 0;

        while (!queue.isEmpty()) {
            ib[idx++]=queue.poll();
        }
        return ib;
    }

    public Queue<Integer> getQueue() {
        return this.queue;
    }

}
