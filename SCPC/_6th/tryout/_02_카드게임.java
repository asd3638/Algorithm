package SCPC._6th.tryout;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class _02_카드게임 {
    static int Answer;

    public static void main(String args[]) throws Exception	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for(int test_case = 0; test_case < T; test_case++) {



            System.out.println("Case #"+(test_case+1));
            System.out.println(Answer);
        }
    }
}
