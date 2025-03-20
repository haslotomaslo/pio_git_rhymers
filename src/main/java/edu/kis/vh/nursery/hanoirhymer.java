package edu.kis.vh.nursery;


public class HanoiRhymer extends defaultCountingOutRhymer {

    int totalRejected = 0;
    @OverRide
    public int reportRejected() {
        return totalRejected;
    }

    @OverRide
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
