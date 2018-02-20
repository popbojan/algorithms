package union.find;

public class PathCompressionWeightedQuickUnionUF extends WeightedQuickUnionUF {

    public PathCompressionWeightedQuickUnionUF(int N) {
        super(N);
    }

    protected int root(int i){
        while (i != id[i]){
            i = id[i];
        }
        return i;
    }
}
