import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            StringBuffer sb = new StringBuffer();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            for(int j=0; j<s.length(); j++) {
                String s2 = String.valueOf(s.charAt(j));
                sb.append(s2.repeat(r));
            }
            System.out.println(sb);
        }
    }
}
