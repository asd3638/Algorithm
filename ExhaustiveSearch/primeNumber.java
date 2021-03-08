package ExhaustiveSearch;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class primeNumber {
    static HashSet<Integer> ansSet = new HashSet<>();

    public static void permutation(int[] arr, int depth, int n, int k) {
        if (depth == k) {
            String checkNum = "";
            for (int i = 0; i < k; i++) {
                checkNum = checkNum + arr[i];
            }
            if(isPrime(Integer.parseInt(checkNum))) {
                ansSet.add(Integer.parseInt(checkNum));
            }
        }
        for (int i = depth; i < n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, k);
            swap(arr, depth, i);
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static boolean isPrime(int num) {
        if (num == 1 || num == 0) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0 && num != 2) {
                return false;
            }
        }
        return true;
    }
    public static int solution(String numbers) {
        int[] intNumbers = Stream.of(numbers.split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = 1; i <= numbers.length(); i++) {
            permutation(intNumbers, 0, numbers.length(), i);
        }
        return ansSet.size();
    }
    public static void main(String[] args) {
        String numbers = "172645";
        int answer = solution(numbers);
        System.out.println(answer + "");
    }
    
}