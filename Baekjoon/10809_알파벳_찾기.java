import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
        StringBuffer sb = new StringBuffer();
		int[] arr = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		
		for(int i=0; i<s.length(); i++) {
			int idx = s.charAt(i)-97;
			if(arr[idx]==-1) arr[idx]=i;
		}
        
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]).append(' ');
		}
		System.out.println(sb);
	}
  
  
  /* =====가장 처음 풀이=====
  public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int[] arr = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		
		for(int i=0; i<s.length(); i++) {
			if(arr[s.charAt(i)-97]==-1) arr[s.charAt(i)-97]=i;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
  
  =====> 다른 사람들의 풀이보다 속도가 현저히 느렸다. 144ms.
  */
  
  
  /* =====두 번 째 풀이=====
  public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
    StringBuffer sb = new StringBuffer();
		int[] arr = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		
		for(int i=0; i<s.length(); i++) {
			if(arr[s.charAt(i)-97]==-1) arr[s.charAt(i)-97]=i;
		}
		
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i] + " ");
		}
		System.out.println(String.valueOf(sb));
	}
  
  =====> StringBuffer를 사용하니 속도가 조금 빨라졌다. 140ms. 하지만 여전히 느렸다.
         if(arr[s.charAt(i)-97]==-1) arr[s.charAt(i)-97]=i; 이 부분의 s.charAt(i)-97을 변수에 저장해서 썼더니 124ms로 훨씬 줄어들었다.
         s의 길이만큼 반복문을 돌리는데 그 와중에 메소드를 두 번씩이나 실행하니 속도가 느린 거였다.
  */
  
}
