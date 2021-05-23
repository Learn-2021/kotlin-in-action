public class Majority {
    /**
     * 주어진 배열 a에서 가장 많이 등장하는 숫자를 반환한다.
     * 만약 결과가 두 개 이상일 경우 무작위로 반환한다.
     */
    public int solution(int[] a) {
        int n = a.length;
        int majority = -1;
        int majorityCount = 0;

        for (int i = 0; i < n; ++i) {
            //a에 등장하는 a[i]의 수를 센다.
            int v = a[i];
            int count = 0;
            for (int j = 0; j < n; ++j) {
                if (a[j] == v) {
                    ++count;
                }
            }
            // 지금까지 본 최대 빈도보다 많이 출현했다면 답을 갱신한다.
            if (count > majorityCount) {
                majorityCount = count;
                majority = v;
            }
        }
        return majority;
    }

    //A의 각 원소가 0부터 100사이의 값일 경우 가장 많이 등장하는 숫자를 반환한다.
    public int solution2(final int[] A) {
        int n = A.length;
        int[] count = new int[101];
        for (int i = 0; i < n; ++i) {
            count[A[i]]++;
        }

        //지금까지 확인한 숫자 중 빈도수가 제일 큰 것을 majority에 저장한다.
        int majority = 0;
        for (int i = 1; i <= 100; ++i) {
            if (count[i] > count[majority]) {
                majority = i;
            }
        }
        return majority;
    }

    public static void main(String[] args) {
        Majority majority = new Majority();
        int result = majority.solution(new int[]{1, 1, 1, 2, 2, 2, 2, 4, 4, 4, 5, 5, 5, 5});
        int result2 = majority.solution2(new int[]{1, 1, 1, 2, 2, 2, 2, 4, 4, 4, 5, 5, 5, 5});
        System.out.println(result);
        System.out.println(result2);
    }
}
