import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.toUpperCase();
        int[] arr = new int[26];

        for(int i=0; i<str.length(); i++) {
            arr[str.charAt(i)-65]++;
        }

        int max = -1;
        char ans = 0;
        for(int i=0; i<arr.length; i++) {
            if(max<arr[i]) {
                max = arr[i];
                ans = (char)(i+65);
            }else if(max==arr[i] && max!=0) {
                ans = '?';
            }
        }

        System.out.println(ans);
	  }
}


// 아스키코드를 생각 못하고 HashMap에 갯수 저장하고 뽑아내야겠다는 생각하다가 결국 실패하고 다른 사람 풀이 참고해서 아스키코드 사용했다. 그런데 속도가 너무 느리다.
