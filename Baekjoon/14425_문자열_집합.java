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
		HashMap<String, Integer> hm = new HashMap<>();
		String[] arr = new String[n];
		int answer = 0;
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			hm.put(str, 1);
			arr[i] = str;
		}
		
		for(int i=0; i<m; i++) {
			String str = br.readLine();
			hm.put(str, hm.getOrDefault(str, 0) + 1);
		}
		
		for(int i=0; i<n; i++) {
			answer += hm.get(arr[i]);
		}
		answer -= n;
		System.out.println(answer);
	}
}



/* =====첫 번 째 풀이(2780ms)=====
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] arr = new String[n];
        int answer = 0;

        for(int i=0; i<n; i++) {
          `arr[i] = br.readLine();
        }

        for(int i=0; i<m; i++) {
            String str = br.readLine();
            for(int j=0; j<n; j++) {
                if(arr[j].equals(str)) {
                    answer++;
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}
*/
