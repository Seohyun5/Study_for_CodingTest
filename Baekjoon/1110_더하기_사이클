import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	String str = br.readLine();
	StringBuffer sb = new StringBuffer();
		    
        if(str.length()==1) {
  	    sb.append("0").append(str);
	    str = String.valueOf(sb);
	}
	int n = Integer.parseInt(str);
	int cnt = 0;
		
	while(true) {
	    StringBuffer sb2 = new StringBuffer();
	    int a = n/10;
            int b = n%10;
            int c = a+b;
            sb2.append(b).append(c%10);
            
            String str2 = String.valueOf(sb2);
            cnt++;
            
            if(str.equals(str2)) break;
            else n = Integer.parseInt(str2);
	}
        
        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
    }
}
