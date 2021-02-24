import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class marathon {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> participantHash = new HashMap<String, Integer>();
        for (int i = 0; i < participant.length; i++) {
            if (participantHash.containsKey(participant[i])) {
                participantHash.replace(participant[i], participantHash.get(participant[i]) + 1);
            } else {
                participantHash.put(participant[i], 1);
            }
        }

        for (int i = 0; i < completion.length; i++) {
            if (participantHash.containsKey(completion[i])) {
                participantHash.replace(completion[i], participantHash.get(completion[i]) - 1);
            }
        }
        answer = getKey(participantHash, 1);

        return answer;
    }

    public static <K, V> K getKey(Map<K, V> map, V value) {

        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] p = new String []{"kim", "ji", "hye", "min", "min"};
        String[] c = new String []{"kim", "ji", "hye", "min"};

        bw.write(solution(p, c));
        bw.flush();
        bw.close();
    }
}