import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	int a = Integer.parseInt(st.nextToken());
	int b = Integer.parseInt(st.nextToken());
	int c = Integer.parseInt(br.readLine());

	if(b+c >= 60) {
		int x = (b+c)/60;
		int y = (b+c)%60;
		a = a+x;
		b = y;
		if(a>=24) a = a-24;
	}else b += c;

	System.out.println(a + " " + b);
    }
}
