package Hash;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

public class bestelbum {
    public static int[] solution(String[] g, int[] p) {
        //결과 출력할 arraylist
        List<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> totalCount = new HashMap<>();
        HashMap<String, HashMap<Integer, Integer>> index = new HashMap<String, HashMap<Integer, Integer>>();
        
        for (int i = 0; i < g.length; i++) {
            if (totalCount.containsKey(g[i])) {
                totalCount.put(g[i], totalCount.get(g[i]) + p[i]);
                index.get(g[i]).put(i, p[i]);
                continue;
            }
            HashMap<Integer, Integer> idxPlay = new HashMap<>();
            totalCount.put(g[i], p[i]);
            idxPlay.put(i, p[i]);
            index.put(g[i], idxPlay);
        }
        List<String> keySet = new ArrayList<>(totalCount.keySet());
        Collections.sort(keySet, (o1, o2) -> totalCount.get(o2).compareTo(totalCount.get(o1)));

        for (String key: keySet) {
            List<Integer> idxSet = new ArrayList<>(index.get(key).keySet());
            Collections.sort(idxSet, (o1, o2) -> index.get(key).get(o2).compareTo(index.get(key).get(o1)));
            answer.add(idxSet.get(0));
            if (idxSet.size() > 1) {
                answer.add(idxSet.get(1));
            }
        }
        int[] answer_int = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            answer_int[i] = answer.get(i);
        }

        return answer_int;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        int[] listist;
        listist = solution(genres, plays);

        for (int i = 0; i < listist.length; i++) {
            bw.write("\n" + listist[i]);
        }
        bw.flush();
        bw.close();
    }
}
