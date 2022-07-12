import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> hm = new HashMap<>();

        for(int i=0; i<n; i++) {
            hm.put(st.nextToken(), 1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<m; i++) {
            String key = st.nextToken();
            hm.put(key, hm.getOrDefault(key, 0)-1);
            if(hm.get(key)==0) sb.append(1 + " ");
            else if(hm.get(key)==-1) sb.append(0 + " ");
        }
        System.out.println(sb);
    }	
}
