import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            System.out.println(people(a,b));
        }
	  }
	
    public static int people(int k, int n) {
        if(k==0) return n;
        else if(n==1) return 1;
        return people(k,n-1)+people(k-1,n);
    }
}
