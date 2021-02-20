package Dijkstra;

import java.io.IOException;

public class example {
    public static int INF = 1000000000;

    public static void dijkstra(int[][] a) {
        int[] d = new int[6];
        boolean[] v = {false, false, false, false, false, false};
        int min;
        int min_node = 0;

        d = a[0];
        v[0] = true;
        min = INF;

        for (int k = 0; k < d.length; k++) {
            //min은 계속 초기화 해줘야 min_node 계산 가능
            min = INF;
            for (int i = 1; i < d.length; i++) {
                //이미 거쳐간 노드는 다시 선택하지 않게 !v[i] 해주는 것 중요
                if (d[i] < min && !v[i]) {
                    min = d[i];
                    min_node = i;
                }
            }
    
            for (int i = 0; i < d.length; i++) {
                if (a[0][i] >= a[min_node][i] + min) {
                    //만약 거쳐가는게 더 최단거리면 갱신
                    d[i] = a[min_node][i] + min;
                }
            }
            v[min_node] = true;
        }

        for(int i = 0; i < d.length; i++){
            System.out.print(d[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        //뭐든지 값이 작으면 갱신하는 알고리즘이기 때문에 초기값은 inf로 잡는게 좋다.
        int[][] a = {
            {0, 2, 5, 1, INF, INF},
            {2, 0, 3, 2, INF, INF},
            {5, 3, 0, 3, 1, 5},
            {1, 2, 3, 0, 1, INF},
            {INF, INF, 1, 1, 0, 2},
            {INF, INF, 5, INF, 2, 0},
        };
        dijkstra(a);
    }
}