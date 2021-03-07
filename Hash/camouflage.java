import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import java.util.*;
import java.util.Map.Entry;

public class camouflage {
    public static int solution(String[][] clothes) {
        HashMap<String, Integer> clothesHash = new HashMap<String, Integer>();
        for (int i = 0; i < clothes.length; i++) {
            if (clothesHash.containsKey(clothes[i][1])) {
                clothesHash.put(clothes[i][1], clothesHash.get(clothes[i][1]) + 1);
            } else {
                clothesHash.put(clothes[i][1], 1);
            }
        }
        int answer = 1;

        for (Entry<String, Integer> entry : clothesHash.entrySet()) {
            answer *= (entry.getValue() + 1);
        } 
        
        return answer - 1;
    }

    public static void main(String[] args) throws IOException {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("" + solution(clothes));
        bw.flush();
        bw.close();
    }
}
