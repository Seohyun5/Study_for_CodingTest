import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        int len = Math.max(a.length(), b.length()); //주어진 숫자 두 개의 길이가 다를 수 있다.
        int[] arrA = new int[len+1]; //자리올림이 될 수 있으므로 한자리를 더 만들어준다.
        int[] arrB = new int[len+1];

        for(int i=0, j=a.length()-1; j>=0; i++, j--) {
            arrA[i] = a.charAt(j)-'0';
        }
        for(int i=0, j=b.length()-1; j>=0; i++, j--) {
            arrB[i] = b.charAt(j)-'0';
        }

        for(int i=0; i<arrA.length-1; i++) {
            arrA[i+1] = arrA[i+1] + (arrA[i]+arrB[i])/10;
            arrA[i] = (arrA[i]+arrB[i]) % 10;
        }

        StringBuffer sb = new StringBuffer();
        int i = 0;
        if(arrA[arrA.length-1]==0) i = arrA.length-2; //가장 첫자리수가 0일 경우, 출력하지 않는다(int형이 아니고 String이기 때문에)
        else i = arrA.length-1;

        for(;i>=0; i--) {
            sb.append(arrA[i]);
        }
        System.out.println(sb);
    }	
}


// 어떻게 하면 좋을지 몰라서 결국 다른 사람의 풀이를 참고했다.
