package edu.kis.vh.nursery.list;

public class intLinkedList {

    public static final int LIST_IS_EMPTY = -1;
    node last;
    int i;

    public void push(int i) {
        if (last == null)
            last = new node(i);
        else {
            last.next = new node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isItFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return LIST_IS_EMPTY;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return LIST_IS_EMPTY;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
