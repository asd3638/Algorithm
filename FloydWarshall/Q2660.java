import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2660 {
    public static int[][] arr;
    public static int[] score;
    public static final int INF = 1000000000;
    public static int result = INF;
    public static int count = 0;

    public static void main(String[] args) throws NumberFormatException, IOException {
        
        //값 입력과 출력을 위한 버퍼 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        //입력 받은 학생 수 만큼의 2차원 배열 선언하기
        arr = new int[n + 1][n + 1];
        score = new int[n + 1];
        
        //플로이드 와샬 알고리즘의 기본 설정
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i != j) {
                    arr[i][j] = INF;
                }
            }
        }

        while (true) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == -1 && b == -1) {
                break;
            }

            arr[a][b] = arr[b][a] = 1;
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (arr[i][j] > arr[i][k] + arr[k][j]) {
                        arr[i][j] = arr[i][k] + arr[k][j];
                    }
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            score[i] = 0;
            for (int j = 1; j <= n; j++) {
                if (arr[i][j] != INF) {
                    score[i] = Math.max(score[i], arr[i][j]);
                }
            }
            if (score[i] < result) {
                result = score[i];
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (result == score[i]) {
                count++;
                sb.append(i + " ");
            }
        }

        bw.write(result + " " + count + "\n");

        String sb_str = sb.toString();

        bw.write(sb_str + "\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t"); // 열 출력
            }
            System.out.println(); // 행 출력
        }

        bw.flush();
        bw.close();
    }
}
