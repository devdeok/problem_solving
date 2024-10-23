package baekjoon.Q1932;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[][] triangle;
    static Integer[][] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine()); // 삼각형 크기

        triangle = new int[n][n];
        result = new Integer[n][n];


        // 삼각형 트라이앵글 만들기
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");

            for(int j=0; j<i+1; j++){
                triangle[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        // 마지막 값 저장
        for(int i=0; i<n;i++){
            result[n-1][i] = triangle[n-1][i];
        }

        System.out.println(dp(0,0));
    }

    static int dp(int depth, int index){
        // 마지막
        if(depth == n-1) return result[depth][index];
        
        // 탐색되지 않은 값
        if(result[depth][index] == null){
            result[depth][index] = Math.max(dp(depth+1, index), dp(depth+1, index+1)) + triangle[depth][index];
        }

        return result[depth][index];
    }
}