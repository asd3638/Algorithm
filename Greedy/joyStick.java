package Greedy;

public class joyStick {
    public 
    public static int solution(String name) {
        int answer = 0;
        String betweenAnswer = "";
        for (int i = 0; i < name.length(); i++) {
            betweenAnswer += "A";
        }
        String between = name.substring(1, name.length() - 1);
        if (between.equals(betweenAnswer)) {

        }

        return answer;
    }
    public static void main(String[] args) {
        String test = "abcd" * 5;
        System.out.println(solution(test));
    }
}
