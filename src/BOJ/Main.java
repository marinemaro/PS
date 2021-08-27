package BOJ;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) map[i][j] = Integer.parseInt(st.nextToken());
        }

        int lo = 0;
        int hi = 10_000_000;
        int sec = 10_000_000;
        while(lo <= hi) {
            int mid = (lo+hi)/2;
            long total = 0;
            long cold = 0;
            for(int[] row : map)
                for(int com : row) {
                    total += com;
                    cold += Math.min(com, mid);
                }
            if(cold*2 >= total) {
                sec = mid;
                hi = mid-1;
            } else lo = mid+1;
        }
        System.out.println(sec);
    }
}

