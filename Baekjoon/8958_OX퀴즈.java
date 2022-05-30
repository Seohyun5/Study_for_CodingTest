import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int idx = 0;

        for(int i=0; i<n; i++) {
            String str = br.readLine();
            for(int j=0; j<str.length(); j++) {
                if(str.charAt(j)=='O') {
                    idx++;
                    sum += idx;
                }else idx = 0;
            }

            System.out.println(sum);
            sum = 0;
            idx = 0;
        }
    }
}


/* =====처음 풀이(168ms)=====
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	int n = Integer.parseInt(br.readLine());
	int sum = 0;
	int idx = 0;
		
	for(int i=0; i<n; i++) {
            String[] arr = br.readLine().split("");
            for(int j=0; j<arr.length; j++) {
            	if(arr[j].equals("O")) {
                    idx++;
                    sum += idx;
            	}else idx = 0;
            }
            bw.write(sum + "\n");
            sum = 0;
            idx = 0;
	}
	bw.flush();
	bw.close();
}
*/


/* =====두 번 째 풀이(152ms)=====
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	int sum = 0;
	int idx = 0;
		
	for(int i=0; i<n; i++) {
            String[] arr = br.readLine().split("");
            for(int j=0; j<arr.length; j++) {
                if(arr[j].equals("O")) {
                    idx++;
                    sum += idx;
                }else idx = 0;
            }
            System.out.println(sum);
            sum = 0;
            idx = 0;
	}
}

// BufferedWriter를 System.out.println으로 바꿨고 속도가 빨라졌지만 여전히 불만족스러웠다.
// 아무래도 split이 속도 느리게 만드는 주범일 것 같아서 고민하다가 배열에 넣지 않고 charAt을 사용해 하나하나 확인하는 식으로 바꿨더니 속도가 128ms까지 줄었다!

*/
