package baekjoon.Q9095;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 엔터로 구분해서 입력 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
        int[] dp = new int[12]; // dp를 사용할 배열

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        // 4 7 10
        for(int i = 4 ; i <= 11; i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
//            System.out.println("index : " + i + " / value :" + dp[i]);
        }

        for(int j = 0; j<T; j++){
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp[n]);
        }


        bw.flush();
    }
}