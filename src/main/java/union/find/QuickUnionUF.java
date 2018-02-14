package union.find;

public class QuickUnionUF extends UF{

    public QuickUnionUF(int N){
        super(N);
    }

    @Override
    public void union(int p, int q) {

    }

    @Override
    public boolean connected(int p, int q) {
        return false;
    }
}
