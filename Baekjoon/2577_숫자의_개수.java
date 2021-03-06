import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = a*b*c;
		
        String str = String.valueOf(d);
        String[] arr = new String[str.length()];
        for(int i=0; i<str.length(); i++) {
            arr[i] = str.substring(i, i+1);
        }
		
        int[] arr2 = new int[str.length()];
        for(int i=0; i<arr.length; i++) {
            arr2[i] = Integer.parseInt(arr[i]);
        }
		
        for(int i=0; i<10; i++) {
            int cnt = 0;
            for(int j=0; j<arr2.length; j++) {
                if(arr2[j]==i) cnt++; 
            }
            bw.write(cnt + "\n");
        }
        bw.flush();
        bw.close();
    }
}


// 배열에 넣을 때, split보다 substring을 쓰는 게 메모리를 조금 덜 차지하긴 하지만, 속도는 140ms로 같았다.
