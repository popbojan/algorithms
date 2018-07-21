package video.examples.sort;

public class ShellSort extends Sort {

    @Override
    public void sort(Comparable[] a) {
        int N = a.length;

        int h = 1;

        while (h < N / 3) {
            h = 3 * h + 1;  // 3x+1 increment sequence
        }

        while (h >= 1) {
            // h-video.examples.sort the array
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exchange(a, j, j - h);
                }
            }
            h = h / 3;  // move to next increment
        }
    }
}
