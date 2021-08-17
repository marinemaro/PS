package BOJ;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] in = br.readLine().split(" ");
        int[] a = new int[n];
        int lo = 1;
        int hi = 0;
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(in[i]);
            hi = Math.max(hi, a[i]);
        }
        int total = Integer.parseInt(br.readLine());
        int ans = 0;
        while(lo<=hi) {
            int mi = (lo+hi)/2;
            int sum = 0;
            for(int i=0; i<n; i++) sum += Math.min(a[i], mi);
            if(sum > total) hi = mi-1;
            else {
                ans = Math.max(ans, mi);
                lo = mi+1;
            }
        }
        System.out.println(ans);
    }
}
