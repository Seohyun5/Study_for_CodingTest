import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n==0) System.out.println(1);
        else {
            int answer = factorial(n);
            System.out.println(answer);
        }
    }

    public static int factorial(int n) {
        int answer = 0;
        if(n==1) return 1;
        return n*(factorial(n-1));
    }	
}
