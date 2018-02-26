package union.find;

public class PathCompressionWeightedQuickUnionUF extends WeightedQuickUnionUF {

    public PathCompressionWeightedQuickUnionUF(int N) {
        super(N);
    }

    @Override
    protected int root(int i){
        while (i != id[i]){
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }
}
