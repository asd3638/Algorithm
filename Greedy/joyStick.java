package Greedy;

public class joyStick { 
    public static int solution(String name) {
        int answer = 0;
        int wIndex = 0;

        while (true) {
            int rIndex = wIndex + 1;
            int rMove = 1;
            int lMove = name.length() - 1;

            answer += changeAlphabet(wIndex, name);
            System.out.println("" + answer);

            if (wIndex < name.length() - 1) {
                if (name.charAt(wIndex + 1) == 'A') {
                    lMove = wIndex;
                    for (int i = name.length() - 1; i > wIndex; i--) {
                        if (name.charAt(i) == 'A') {
    
                        } else {
                            lMove++;
                        }
                    }
                }
            }
            while (rIndex < name.length()) {
                if (name.charAt(rIndex) == 'A') {
                    rMove++;
                    rIndex++;
                } else {
                    break;
                }
            }
            if (rMove <= lMove) {
                //right
                wIndex += rMove;
                answer += rMove;
            } else {
                //left
                wIndex = name.length() - ((lMove - wIndex));
                answer += lMove;
            }
            if(wIndex == name.length()) {
                break;
            }
        }

        return answer - 1;
    }
    public static int changeAlphabet(int i, String name) {
        int up = name.charAt(i) - 'A';
        int down = 'Z' - name.charAt(i) + 1;
        
        if(up > down) {
            return down;
        } else {
            return up;
        } 
    }
    public static void main(String[] args) {
        String name = "JEROEN";
        int result = solution(name);
        System.out.println(result + "");
    }
}
