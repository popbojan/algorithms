package union.find;

public class QuickUnionUF extends UF {

    public QuickUnionUF(int N){
        super(N);
    }

    @Override
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    protected int root(int i){
        while (i != id[i]){
            i = id[i];
        }
        return i;
    }
}
