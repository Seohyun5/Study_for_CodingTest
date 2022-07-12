import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hm = new HashMap<>();
        HashMap<String, Integer> hm2 = new HashMap<>();
        String x = "";
        String y = "";

        for(int i=0; i<3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String key1 = st.nextToken();
            hm.put(key1, hm.getOrDefault(key1, 0) + 1);
            String key2 = st.nextToken();
            hm2.put(key2, hm2.getOrDefault(key2, 0) + 1);
        }

        for(String key : hm.keySet()) {
            Integer value = hm.get(key);
            if(value==1) x = key; 
        }

        for(String key : hm2.keySet()) {
            Integer value = hm2.get(key);
            if(value==1) y = key;
        }

        System.out.println(x + " " + y);
    }
}
