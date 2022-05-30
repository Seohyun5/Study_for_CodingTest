import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> s = new HashSet<>();
	
        for(int i=0; i<10; i++) {
            s.add(Integer.parseInt(br.readLine())%42);
        }
        System.out.println(s.size());
    }
}


/* =====처음 풀이=====
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	Set<Integer> s = new HashSet<>();
	
	for(int i=0; i<10; i++) {
		int n = Integer.parseInt(br.readLine());
		s.add(n%42);
	}
	
	bw.write(s.size() + "\n");
	bw.flush();
	bw.close();
}


// 144ms. 속도를 줄이기 위해 System.out.println으로 바꾸고, int n을 따로 선언하지 않고 HashSet에서 바로 바꾸어 계산하여 넣어주었다.

*/
