package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Stack;
import edu.uoc.ds.adt.sequential.StackArrayImpl;

public class PR0Stack {

    // Capacitat màxima de la seqüència.
    public final int CAPACITY = 9;

    private Stack<Integer> stack;

    public PR0Stack() {
        newStack();
    }

    public void newStack() {
        stack = new StackArrayImpl<Integer>(CAPACITY);
    }


    public void fillStack() {
        for (int c = 0; c < 9; c++) {
            stack.push(c);
        }
    }

    public int[] clearAllStack() {
        int[] ib = new int[9];
        int idx = 0;

        while (!stack.isEmpty())
            ib[idx++]=stack.pop();
        return ib;
    }

    public Stack<Integer> getStack() {
        return this.stack;
    }
}
