package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int full_size = 11;
    public static final int starting_size = -1;
    private int[] NUMBERS = new int[12];

    public int total = starting_size;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == starting_size;
    }

    public boolean isFull() {
        return total == full_size;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[total--];
    }

}
