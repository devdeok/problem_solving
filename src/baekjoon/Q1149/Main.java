package baekjoon.Q1149;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 엔터로 구분해서 입력 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] cost = new int[N][3];

        for(int i = 0; i < N ; i++){
            st = new StringTokenizer(br.readLine(), " ");

            cost[i][0] = Integer.parseInt(st.nextToken()); // R
            cost[i][1] = Integer.parseInt(st.nextToken()); // G
            cost[i][2] = Integer.parseInt(st.nextToken()); // B
        }

        for(int i = 1; i < N ; i++){
            cost[i][0] = cost[i][0] + Math.min(cost[i-1][1], cost[i-1][2]);
            cost[i][1] = cost[i][1] + Math.min(cost[i-1][0], cost[i-1][2]);
            cost[i][2] = cost[i][2] + Math.min(cost[i-1][0], cost[i-1][1]);
        }

        System.out.println(Math.min(cost[N-1][0], Math.min(cost[N-1][1], cost[N-1][2])));
    }
}
