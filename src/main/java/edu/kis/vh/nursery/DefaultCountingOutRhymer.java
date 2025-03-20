package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int CAPACITY = 11;
    public static final int EMPTY = -1;
    public static final int EMPTY_RHYMER_INDICATOR = -1;
    private final int[] NUMBERS = new int[CAPACITY + 1];

    public int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == CAPACITY;
    }

    protected int peekaboo() {
        if (callCheck())
            return INDEX;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return INDEX;
        return NUMBERS[total--];
    }

}
