package SCPC._6th.tryout;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/*
   As the name of the class should be Solution , using Solution.java as the filename is recommended.
   In any case, you can execute your program by running 'java Solution' command.
 */
class _01_다이어트 {
    static List<Integer> Answer;
    public static void main(String args[]) throws Exception	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int t=1; t<=T; t++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int[] A = new int[N];
            int[] B = new int[N];

            st = new StringTokenizer(br.readLine());
            for(int i=0; i<N; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                B[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(A);
            Arrays.sort(B);
            int min_sum=0;
            for(int n=0; n<K; n++) {
                min_sum = Math.max(A[n]+B[K-1-n], min_sum);
            }
            System.out.println("Case #"+t);
            System.out.println(min_sum);
        }
    }
}