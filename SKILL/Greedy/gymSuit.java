package SKILL.Greedy;


public class gymSuit {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }
        
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (((lost[i] - reserve[j]) == -1) || ((lost[i] - reserve[j]) == 1)) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] lost = {1, 2, 3, 4, 5, 6, 7};
        int[] reserve = {1, 2, 3};
        System.out.println(solution(7, lost, reserve) + "");
    }
}
