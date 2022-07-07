import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        HashMap<String, Integer> hm = new HashMap<>();
        int n = 1;

        while(n<=str.length()) {
            for(int i=0; i+n<=str.length(); i++) {
                String x = str.substring(i, i+n);
                hm.put(x, 1);
            }
            n++;
        }
        System.out.println(hm.size());
    }
}
