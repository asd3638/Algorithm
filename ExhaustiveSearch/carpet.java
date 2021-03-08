package ExhaustiveSearch;

public class carpet {
    public static int[] solution (int brown, int yellow) {
        int[] answer = new int[2];
        for (int i = 1; i <= yellow; i++) {
            int j = yellow / i;
            if (i > j) {
                break;
            }
            if ((4 + (i * 2) + (j * 2)) == brown) {
                answer[0] = j + 2;
                answer[1] = i + 2;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] result = solution(10, 2);
        for (int i : result){
            System.out.println(i + " ");
        }
    }
}
