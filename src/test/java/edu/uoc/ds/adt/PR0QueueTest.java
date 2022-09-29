package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Before;

import java.util.concurrent.atomic.AtomicIntegerArray;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0QueueTest {

    PR0Queue pr0q;

    @Before
    public void setUp() {
        this.pr0q = new PR0Queue();

        assertNotNull(this.pr0q.getQueue());
    }

    @After
    public void release() {
        this.pr0q = null;
    }


    @org.junit.Test
    public void queueTest() {
        int[] expected = new int[9];

        this.pr0q.fillQueue();
        assertEquals(Integer.valueOf(this.pr0q.getQueue().size()), Integer.valueOf(this.pr0q.CAPACITY));

        expected=this.pr0q.clearFullQueue();
        for (int i = 0; i < 9; i++) {
            assertEquals(expected[i], i);
        }

        assertEquals(Integer.valueOf(this.pr0q.getQueue().size()), Integer.valueOf(0));
    }

}
