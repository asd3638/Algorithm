package SKILL.Greedy;

import java.util.PriorityQueue;

public class connectIsland {
    static class Edge implements Comparable<Edge> {
        int from, to, cost;
        
        Edge (int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }

    static int[] parent;
    static PriorityQueue<Edge> adj;

    public static int solution(int n, int[][] costs) {
        parent = new int[n];
        adj = new PriorityQueue<Edge>();
        int totalCnt = 0;

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < costs.length; i++) {
            Edge edge = new Edge(costs[i][0], costs[i][1], costs[i][2]);
            adj.offer(edge);
        }
        while (!adj.isEmpty()) {
            Edge edge = adj.poll();
            if (find(edge.from) == find(edge.to)) {
                continue;
            } else {
                union(find(edge.from), find(edge.to));
                totalCnt += edge.cost;
            }
        }

        return totalCnt;
    }
    public static int find(int n) {
        if (parent[n] == n) {
            return n;
        }
        //부모와 자식의 값이 같은 것이 나올때까지 재귀로 찾아가고
        //나오면 그 값으로 바꿔준다.
        return parent[n] = find(parent[n]);
    }
    public static void union(int a, int b) {
        parent[find(b)] = find(a);
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] costs = {{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};

        System.out.println(solution(n, costs) + "");
    }
}
