package video.examples.queue;

public class FixedCapacityQueueOfStrings {

    protected String[] q;
    protected int index = 0;
    protected int headIndex = 0;
    protected int tailIndex = 0;

    public FixedCapacityQueueOfStrings(int capacity) {
        q = new String[capacity];
    }

    public void enqueue(String item) {
        if (isEmpty()) {
            headIndex = index + 1;
        }
        index++;
        q[index] = item;
        tailIndex = index;
    }

    public String dequeue() {
        String result = q[headIndex];
        q[headIndex] = null;
        if (headIndex == tailIndex) {
            index = 0;
            headIndex = 0;
        } else {
            headIndex++;
        }
        return result;
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public void pirntArray() {
        for (int i = 1; i < q.length; i++) {
            System.out.println(q[i]);
        }
        System.out.println("Index: " + index);
    }
}
