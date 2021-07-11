package SKILL.ExhaustiveSearch;

import java.util.ArrayList;
import java.util.List;

public class mathexam {
    public static int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] result = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % 5]) {
                result[0]++;
            }
            if (answers[i] == two[i % 8]) {
                result[1]++;
            }
            if (answers[i] == three[i % 10]) {
                result[2]++;
            }
        }
        int max = Math.max(result[0], Math.max(result[1], result[2]));
        List<Integer> list = new ArrayList<>();

        if(max == result[0])
            list.add(1);
        if(max == result[1])
            list.add(2);
        if(max == result[2])
            list.add(3);
        
        int[] a = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i);
        }

        return a;
    }
    public static void main(String[] args) {
        int[] answers = new int[]{1, 2, 3, 4, 5};
        int[] result = solution(answers);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
