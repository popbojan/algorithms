package union.find;

public abstract class UF {

    public UF(int N) {
    }

    public abstract void union(int p, int q);

    public abstract boolean connected(int p, int q);

    public int find(int p) {
        return -1;
    }

    public int count() {
        return -1;
    }

    public abstract int[] getIds();
}
