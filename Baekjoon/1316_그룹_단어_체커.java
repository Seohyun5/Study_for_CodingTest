import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;

        for(int i=0; i<n; i++) {
            String str = br.readLine();
            int[] arr = new int[26]; //새로운 단어가 들어올 때마다 알파벳 개수를 체크하기 위한 배열을 새로 선언해줘야 한다. 값이 쌓이는 것을 방지하기 위함.
            char prev = 0;

            for(int j=0; j<str.length(); j++) {
                if(str.length()==1) {
                    ans++;
                    break;
                }

                if(prev!=str.charAt(j)) {
                    prev = str.charAt(j);
                    arr[str.charAt(j)-97]++;
                    if(arr[str.charAt(j)-97]>1) break;
                }
                if(j==str.length()-1) ans++; //그룹 단어가 아니어서 break 되지 않은 경우이기 때문에 ans 카운트해준다.
            }
        }		
        System.out.println(ans);
    }	
}
