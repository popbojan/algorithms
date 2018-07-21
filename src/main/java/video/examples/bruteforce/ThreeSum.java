package video.examples.bruteforce;

public class ThreeSum {

    public int count(int[] a)
    {
        int N = a.length;
        int count = 0;
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                for(int k=j+1; k<N; k++){
                    System.out.print("a[i]:["+a[i]+"] a[j]: ["+a[j]+"] a[k]: ["+a[k]+"] ");
                    System.out.print("\n");
                    if(a[i] + a[j] + a[k] == 10){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
