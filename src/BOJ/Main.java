package BOJ;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        long a = Integer.parseInt(in[0]);
        long b = Integer.parseInt(in[1]);
        long c = Integer.parseInt(in[2]);
        System.out.println(pow(a,b,c));
    }

    private static long pow(long a, long b, long c) {
        if(b==1) return a % c;
        if(b%2==0) {
            long v = pow(a, b/2, c);
            return (v%c) * (v%c) % c;
        }
        return (a%c) * (pow(a, b-1, c)%c) % c;
    }
}
