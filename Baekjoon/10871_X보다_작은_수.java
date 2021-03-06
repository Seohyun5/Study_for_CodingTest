import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	int n = Integer.parseInt(st.nextToken());
	int x = Integer.parseInt(st.nextToken());
        StringBuffer sb = new StringBuffer();
        
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
		int y = Integer.parseInt(st2.nextToken());
		if(y<x) sb.append(y + " ");
	}
        
	System.out.println(sb);
    }
}


// String 연산이 잦은 경우, StringBuffer와 StringBuilder를 사용하자
