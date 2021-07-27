package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _18_InsertInterval {
    public static int[][] insert(int[][] intervals, int[] newIntervals) {
        List<List<Integer>> answer = new ArrayList<>();
        int i = 0;
        //list -> array
        for (int j = 0; j < intervals.length; j++) {
            answer.add(Arrays.stream(intervals[j])
                    .boxed()
                    .collect(Collectors.toList()));
        }
        answer.add(Arrays.stream(newIntervals)
                .boxed()
                .collect(Collectors.toList()));
        answer.sort(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(0) - o2.get(0);
            }
        });
        while (i <  answer.size()) {
            if (i != answer.size() - 1 && answer.get(i).get(1) >= answer.get(i + 1).get(0)) {
                List<Integer> tmpList = new ArrayList<>();
                tmpList.add(answer.get(i).get(0));
                tmpList.add(Math.max(answer.get(i).get(1), answer.get(i + 1).get(1)));
                answer.remove(i);
                answer.remove(i);
                answer.add(i, tmpList);
            } else {
                i++;
            }
        }
        int[][] answerList = new int[answer.size()][2];

        for (int k = 0; k < answer.size(); k++) {
            int[] tmpInt = new int[]{answer.get(k).get(0), answer.get(k).get(1)};
            answerList[k] = tmpInt;
        }

        return answerList;
    }

    public static void main(String[] args) {
        int [][] intervals = new int[][]{{1,2},{3, 5},{6, 7},{8, 10}, {12, 16}};
        int [] newIntervals = new int[]{4, 8};
        insert(intervals, newIntervals);
    }
}
