import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static int d(int n) {
		int sum = n;
		while(n>0) {
			sum += n%10;
			n = n/10;
		}
		return sum;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean not[] = new boolean[10001];
        
		for(int i=1; i<=10000; i++) {
			int j = d(i);
			if(j<=10000) not[j] = true;
		}
		for(int i=1; i<=10000; i++) {
			if(not[i]==false) bw.write(i + "\n");
		}
		bw.flush();
		bw.close();
	}
}
