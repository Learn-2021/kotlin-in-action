public class Recursive {
    public static void main(String[] args) {
        Recursive r = new Recursive();
        int forloop = r.sum(10);
        int recursive = r.recursiveSum(10);
        System.out.println(forloop);
        System.out.println(recursive);
    }
    int sum(int n) {
        int ret = 0;
        for (int i = 0; i <= n; i++) {
            ret += i;
        }
        return ret;
    }

    int recursiveSum(int n) {
        return n == 1 ? 1 : n + recursiveSum(n-1);
    }
}
