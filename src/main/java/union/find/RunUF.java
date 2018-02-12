package union.find;

import java.io.IOException;

public class RunUF {

    public static void main(String[] args) throws IOException {
        System.out.println("RunUF has started");
        int N = System.in.read();
        UF uf = new UF(N);
        while (System.in.available() > 0)
        {
             int p = System.in.read();
             int q = System.in.read();
             if (!uf.connected(p, q))
             {
                 uf.union(p, q);
                 System.out.println(p + "" + q);
             }
        }
    }
}
