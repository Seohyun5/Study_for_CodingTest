import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			sum += str.charAt(i)-'0';
		}
        System.out.println(sum);
	}
  
  
  /* =====가장 처음 풀이=====
  public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			int a = Integer.parseInt(str.substring(i, i+1));
			sum += a;
		}
		
		bw.write(sum + "\n");
		bw.flush();
		bw.close();
	}
  
  =====> 가장 처음에 내 방식대로 풀었는데 다른 사람들의 풀이보다 속도가 훨씬 느렸다.
         다른 사람들은 120ms인데 이 풀이는 144ms...
  */
  
  
  /* =====두 번 째 풀이=====
  public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			sum += str.charAt(i)-'0';
		}
		
		bw.write(sum + "\n");
		bw.flush();
		bw.close();
	}
  
  =====> 그래서 substring() 말고 charAt()을 써보았다. 하지만 속도는 똑같았다.
         그 후, 다른 사람의 풀이를 참고해서 BufferedWriter가 아닌 System.out.println()으로 바꿨더니 속도가 훨씬 빨라졌다.
         원래 Scanner()와 System.out.println()을 쓰다가 다른 사람들이 전부 BufferedReader/Writer를 쓰는 걸 보고 바꿨는데 이 문제에선 System.out.println이 훨씬 빨랐다.
         출력할 값이 별로 없어서 그런 걸까...? 찾아봐도 BufferedReader/Writer의 속도가 더 빠르다는 말 밖에 보이지 않는다.
  */
  
}
