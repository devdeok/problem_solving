package baekjoon.Q2839;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 엔터로 구분해서 입력 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 백준 문제는 입력을 띄어쓰기로 구분하는 경우가 있기 때문에 StringTokenizer 사용
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // N kg맞추기
        // 주어진 봉투는 3kg과 5kg, 정확한 kg 못맞출 경우 -1반환
        int N = Integer.parseInt(st.nextToken());

        int[] dp = new int[N+1];

        if(N>=3) dp[3] = 1;
        if(N>=5) dp[5] = 1;

        for(int i=6; i<=N;i++){
            // 5의 배수부터 처리
            if(i%5 == 0) dp[i] = dp[i-5] + 1;
            // 5의 배수가 아니면 3의 배수인지 확인
            else if (i%3 == 0) dp[i] = dp[i-3] +1;
            else {
                if(dp[i-3] != 0 && dp[i-5]!=0)
                    dp[i] = Math.min(dp[i-3], dp[i-5]) +1;
            }
        }

        if(dp[N] == 0){
            System.out.println("-1");
            return;
        }
        System.out.println(dp[N]);
    }
}