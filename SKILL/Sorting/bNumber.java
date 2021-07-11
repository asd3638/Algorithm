package SKILL.Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class bNumber {
    public static String solution (int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            arr[i] = String.valueOf(numbers[i]);
        }     
        Arrays.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                //우선 순위는 음수값을 리턴하는 애가 가진다.
                return (s2 + s1).compareTo(s1 + s2);
            }
        });   
        if (arr[0].equals("0")) {
            return "0";
        }
        for (String s : arr) {
            answer += s;
        }
        return answer;
    }
    
    public static void main(String[] args) {
        int[] numbers = new int[]{0, 00, 0, 0};
        String answer = solution(numbers);
        System.out.println(answer);
    }
}
