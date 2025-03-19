package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;
import edu.kis.vh.nursery.fiforhymer;
import edu.kis.vh.nursery.hanoirhymer;

public class defaultRhymersFactory implements rhymersfactory {

    @Override
    public defaultCountingOutRhymer GetStandardRhymer() {
        return new defaultCountingOutRhymer();
    }

    @Override
    public defaultCountingOutRhymer GetFalseRhymer() {
        return new defaultCountingOutRhymer();
    }

    @Override
    public defaultCountingOutRhymer GetFIFORhymer() {
        return new fiforhymer();
    }

    @Override
    public defaultCountingOutRhymer GetHanoiRhymer() {
        return new hanoirhymer();
    }

}
