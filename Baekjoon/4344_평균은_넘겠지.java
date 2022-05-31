import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int c = Integer.parseInt(br.readLine());
				
		for(int i=0; i<c; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] score = new int[n];
			int sum = 0;
			for(int j=0; j<n; j++) {
				int x = Integer.parseInt(st.nextToken());
				sum += x;
				score[j] = x;
			}
			double avg = (double)sum/n;
			int cnt = 0;
			for(int j=0; j<n; j++) if(score[j]>avg) cnt++;
			String answer = String.format("%.3f", ((double)cnt/n)*100);
			bw.write(answer + "%" + "\n");
		}
		bw.flush();
		bw.close();
	}
}
