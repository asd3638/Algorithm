package Greedy;

import java.util.Arrays;


public class savaBoat {
    public static int solution(int[] people, int limit) {
        int answer = 0;
        int i = 0;
        int j;
        Arrays.sort(people);
        for (j = people.length - 1; j == i; j--) {
            if (people[j] + people[i] <= limit) {
                answer++;
            } else {
                answer++;
                i++;
            }

        }
        return answer;
    }
    public static void main(String[] args) {
        int[] people = {160, 150, 140, 60, 50, 40};
        int limit = 200;
        System.out.println(solution(people, limit));
    }
    
}
