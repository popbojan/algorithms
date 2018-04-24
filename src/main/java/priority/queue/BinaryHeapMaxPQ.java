package priority.queue;

public class BinaryHeapMaxPG<Key extends Comparable<Key>> extends UnorderedMaxPQ {

    public BinaryHeapMaxPG(int capacity) {
        super(capacity);
    }

    public Key delMax(){
        Key max = (Key) pq[1];
        exchange(pq, 1, N--);
        sink(1);
        pq[N+1] = null; // prevent loitering
        return max;
    }

    public void myInsert(Key x) {
        super.insert(x);
//        pq[N++] =x;
        swim(N);
    }

    private void swim(int k){
        while(k > 1 && less(k/2, k)){
            exchange(pq, k, k/2);
            k = k/2;
        }
    }

    private void sink(int k){
        while(2*k <= N){
            int j = 2*k;
            if(j < N && less(j, j++)){
                j++;
            }
            if(!less(k, j)){
                break;
            }
            exchange(pq, k, j);
            k = j;
        }
    }
}
