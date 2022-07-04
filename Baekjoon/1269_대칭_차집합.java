import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        int cnt = 0;

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            String str = st.nextToken();
            hm.put(str, hm.getOrDefault(str, 0)+1);
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++) {
            String str = st.nextToken();
            hm.put(str, hm.getOrDefault(str, 0)+1);
        }

        for(String key:hm.keySet()) {
            if(hm.get(key) != 1) {
                cnt++;
            }
        }

        System.out.println((n-cnt) + (m-cnt));
    }
}
