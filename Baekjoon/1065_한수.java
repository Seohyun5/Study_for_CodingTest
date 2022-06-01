import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
		
        for(int i=1; i<=n; i++) {
            if(i<=99) cnt++;
            else {
                int a = i/100;
                int b = (i/10)%10;
                int c = i%10;
                if(b-a==c-b) cnt++;
            }
        }

        System.out.println(cnt);
    }
}
