package BOJ;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(a);

        int lo = 0;
        int hi = n-1;
        int A = lo;
        int B = hi;
        int before = Math.abs(a[A]+a[B]);
        while(lo < hi) {
            int abs = Math.abs(a[lo]+a[hi]);
            if(abs < before) {
                before = abs;
                A = lo;
                B = hi;
            }
            if(a[lo]+a[hi]==0) break;
            else if(a[lo]+a[hi] < 0) lo++;
            else hi--;
        }

        System.out.println(a[A]+" "+a[B]);
    }
}
