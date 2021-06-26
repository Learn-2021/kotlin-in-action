package swExpertAcademy;

import java.util.*;

/**
 *  당신은 세계 최고의 기업인 사성의 입사 시험 담당자다.
 *  입사 시험은 단 한 번의 프로그래밍 대회로 이루어진다.
 *  시험에 참가하는 N명의 참가자에게 1부터 N까지 번호가 붙고 그들은 T개의 문제를 통해 경쟁한다.
 *
 *  문제에 부분 점수는 없다. 따라서 참가자는 어떤 문제를 풀거나 풀지 못한다.
 *  각 문제는 해당 문제를 풀지 못한 사람의 수를 점수로 가진다. 때문에 대회가 끝나야 점수가 결정된다.
 *
 *  참가자의 등수는 (자신보다 많은 점수를 획득한 참가자의 수) + (같은 점수를 획득했지만 더 많은 문제를 푼 참가자의 수) + (자신과 같은 점수를 획득하고, 같은 수의 문제를 풀었지만 번호가 더 작은 참가지의 수) + 1로 결정된다.
 *
 *  당신 친구 지학이는 번호 P번으로 입사 시험에 참가했다.
 *  지학이는 대회의 복잡한 배점 방식에 혼란이 와서 본인의 점수를 계산하지 못하고 있다.
 *  대회의 채점 결과가 주어졌을 때 지학이의 점수와 등수를 계산하라.
 *
 *  [ 입력 ]
 *      첫 번째 줄에 테스트 케이스의 수 Tc
 *
 *      각 테스트의 첫 줄에는 N, T, P가 공백으로 주어진다.
 *      N: 참가자의 수
 *      T: 문제의 수
 *      P: 지학의 번호
 *      (1 ≤ P ≤ N ≤ 2000, 1 ≤ T  2000)
 *
 *      다음 N 줄에는 대회 참가자들이 문제를 풀었는지 못 풀었는지 여부가 주어진다.
 *
 *      K번째 줄은 번호가 K인 참가자 정보를 나타낸다. 각 줄에는 T개의 공백으로 구분된 정수들은 모두 0이나 1의 값을 가지며,
 *      이 중 i번째 정수 값이 0일 경우, 참가자가 i번 문제를 풀지 못한 것이고, 1일 경우 참가자가 i번 문제를 푼 것이다.
 *
 *  [ 출력 ]
 *      각 테스트 케이스마다 '#x'(x는 테스트케이스 번호를 의미)를 출력하고,
 *      각 테스트케이스마다 지학이의 최종 점수와 등수를 공백으로 구분해서 출력한다.
 */
public class Sassung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Tc = sc.nextInt(); // Tc: 테스트케이스의 수

        for (int i = 1; i <= Tc; i++) {
            int N = sc.nextInt(); // 참가자의 수
            int T = sc.nextInt(); // 문제의 수
            int P = sc.nextInt(); // 지학의 번호

            //TODO [참가자 번호: { 0, 0, 1 }]
            Map<Integer, List<Integer>> info = new HashMap<>();
            for(int j = 1; j <= N; j++) {
                List<Integer> corrects = new ArrayList<>();
                for (int k = 0; k < T; k++) {
                    //각 문제의 정답 여부를 저장한다. ex) ["N번 참가자" : {"true", "false", "true", ...}]
                    corrects.add(sc.nextInt());
                }
                info.put(j, corrects);
            }

            System.out.println("#"+i+" "+" ");
            info.forEach((w, b) -> {
                System.out.println(w);
                System.out.println(b);
            });
        }
    }
}
