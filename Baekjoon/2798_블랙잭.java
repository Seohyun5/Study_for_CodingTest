import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[100];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        int answer = 0;
        for(int i=0; i<n-2; i++) {
            for(int j=i+1; j<n-1; j++) {
                for(int k=j+1; k<n; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if(sum<=m && answer<sum) {
                        answer = sum;
                    }
                }
            }
        }

        System.out.println(answer);
    }	
}


// 반복문을 쓰면 될 것 같다고 생각은 했는데 3중일 거라고는 생각을 못했다. 그리고 거기서 더이상 생각이 안 나서 결국 다른 사람의 풀이를 참고했다.
