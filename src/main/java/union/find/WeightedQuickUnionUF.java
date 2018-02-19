package union.find;

public class WeightedQuickUnionUF extends QuickUnionUF {

    protected int[] size;

    public WeightedQuickUnionUF(int N) {
        super(N);
        size = new int[N];
        for (int i = 0; i < N; i++){
            size[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        if (i == j) {
            return;
        }
        if (size[i] < size[j]) {
            id[i] = j;
            size[j] += size[i];
        }
        else{
            id[j] = i;
            size[i] += size[j];
        }
    }
}
