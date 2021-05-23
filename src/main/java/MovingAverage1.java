import java.util.ArrayList;
import java.util.List;

public class MovingAverage1 {
    public List<Double> solution(double[] a, int m) {
        List<Double> ret = new ArrayList<>();
        int n = a.length;

        for (int i = m-1; i < n; ++i) {
            //a[i]까지의 이동 평균 값 구하기
            double partialSum = 0;
            for (int j = 0; j < m; ++j) {
                partialSum += a[i - j];
            }

            ret.add(partialSum / m);
        }
        return ret;
    }

    public List<Double> solution2(double[] a, int m) {
        List<Double> ret = new ArrayList<>();
        int n = a.length;

        double partialSum = 0;

        for (int i = 0; i < m-1; ++i) {
            partialSum += a[i];
        }
        for (int i = m-1; i < n; ++i) {
            partialSum += a[i];
            ret.add(partialSum / m);
            partialSum -= a[i-m+1];
        }

        return ret;
    }

    public static void main(String[] args) {
        MovingAverage1 movingAverage1 = new MovingAverage1();
        List<Double> solution = movingAverage1.solution2(new double[]{3.5, 3.5, 3.5, 3.6, 3.5}, 6);
        System.out.println(solution);
    }
}
