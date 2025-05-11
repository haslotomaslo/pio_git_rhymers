package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int MAX_SIZE = 12;
    private final int[] NUMBERS = new int[MAX_SIZE];
    final private int EMPTY = -1;
    final private int DEFAULT_RETURN = -1;

    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == MAX_SIZE -1;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_RETURN;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_RETURN;
        return NUMBERS[total--];
    }

}
