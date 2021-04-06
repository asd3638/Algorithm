package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class speedCamera {
    public static int solution(int[][] routes) {
        int answer = 1;
        List<Integer> cri = new ArrayList<>();

        Arrays.sort(routes, new Comparator<int[]>(){

            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
            
        });

        cri.add(routes[0][1]);
        for (int i = 1; i < routes.length; i++) {
            boolean ischanged = false;
            for (int j = 0; j < cri.size(); j++) {
                if (routes[i][0] > cri.get(j)) {
                    //하나라도 기준보다 큰게 있는 경우
                    answer++;
                    cri.clear();
                    cri.add(routes[i][1]);
                    ischanged = true;
                    break;
                }
            }
            if (!ischanged) {
                cri.add(routes[i][1]);
            }

        }
        return answer;
    }
    public static void main(String[] args) {
        int[][] routes = {{-2,-1}, {1,2}, {-3,0}};
        System.out.println(solution(routes) + "");
    }
}
