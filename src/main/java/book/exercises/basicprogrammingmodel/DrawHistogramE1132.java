package book.exercises.basicprogrammingmodel;

/**
 * Got a lot of help form github olegkamuz
 * https://github.com/olegkamuz/algorithms-sedgewick-wayne/
 */
public class DrawHistogramE1132 {

    private final int ONE = 1;
    double[] stream;
    int N;
    double l;
    double r;

    public DrawHistogramE1132(double[] stream, int N, double l, double r) {
        this.stream = stream;
        this.N = N;
        this.l = l;
        this.r = r;
    }

    public void draw() {

        int[] count = getCountOfNumbersThatFallInEachOfNIntervals(stream, getIntervals(N, l, r), N);
        for (int i = 0; i < count.length; i++) {
            System.out.println(count[i]);
        }
    }

    public int[] getCountOfNumbersThatFallInEachOfNIntervals(double[] stream, double[] intervals, int N){
        int[] count = new int[N];
        for(int i =0; i<N-1; i++){
            int counterPerInterval = 0;
            for(int j =0; j<stream.length; j++){
                if(stream[j] >= intervals[i] && stream[j] <= intervals[i+1]){
                    counterPerInterval++;
                }
            }
            count[i] = counterPerInterval;
        }
        return count;
    }

    public double[] getIntervals(int N, double l, double r) {
        double[] intervals = getIntervalsFrom(N, l, r);
        for (int i = 0; i < intervals.length; i++) {
            System.out.println(intervals[i]);
        }
        return intervals;
    }

    private double[] getIntervalsFrom(int N, double l, double r) {
        double range = (l > r) ? (l - r) : (r - l);
        double rangeStart = (l > r) ? r : l;
        double steps = N - ONE; // always one less than the total amount of numbers
        double step = range / steps;
        double[] intervals = new double[N];
        intervals[0] = rangeStart;
        for (int i = 1; i < N; i++) {
            intervals[i] = rangeStart + step;
            rangeStart = intervals[i];
        }
        return intervals;
    }
}
