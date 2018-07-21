package video.examples.unionfind;

public abstract class UF {

    protected int[] id;

    public UF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++){
            id[i] = i;
        }
    }

    public abstract void union(int p, int q);

    public abstract boolean connected(int p, int q);

    public int find(int p) {
        return -1;
    }

    public int count() {
        return -1;
    }

    public int[] getIds(){
        return id;
    }

    public void printIdArray() {
        int[] id = getIds();
        for (int i = 0; i < id.length; i++) {
            System.out.println(id[i]);
        }
    }
}
