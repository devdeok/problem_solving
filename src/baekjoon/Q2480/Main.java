package baekjoon.Q2480;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 엔터로 구분해서 입력 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 백준 문제는 입력을 띄어쓰기로 구분하는 경우가 있기 때문에 StringTokenizer 사용
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 1, 2, 3, 4, 5, 6
        int[] diceList = {0,0,0,0,0,0};

        while(st.countTokens() != 0){
            int index = Integer.parseInt(st.nextToken()) - 1;
            diceList[index] = diceList[index] + 1;
        }

        int result = 0;
        for(int i = 0; i < diceList.length; i++){

            if (diceList[i] == 2){
                result = (1000 + (i+1) * 100);
                break;
            }else if(diceList[i] == 3){
                result = (10000 + (i+1) * 1000);
                break;
            }else if(diceList[i] == 1){
                result = (i+1) * 100;
            }
        }

        System.out.println(result);

        bw.flush();

        return ;
    }
}
