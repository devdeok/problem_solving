package baekjoon.Q1149;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 엔터로 구분해서 입력 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N+1];

        for(int i =0; i <= N ; i++){
            String[] rgb = br.readLine().split(" ");

            for(int j=0; j<rgb.length;j++)
                System.out.println("rgb : " + rgb[j]);

        }
    }
}
