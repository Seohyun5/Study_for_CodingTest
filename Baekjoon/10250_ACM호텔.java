import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int cnt = 1;
            int h2 = 0;

            while(true) {
                if(h>=n) {
                    h2 = n;
                    w = 1;
                    break;
                }else if(h*(cnt+1)>=n) {
                    h2 = n-(h*cnt);
                    w = cnt+1;
                    break;
                }
                cnt++;
            }

            System.out.print(h2);
            System.out.printf("%02d \n", w);
        }
    }
}
