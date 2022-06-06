import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";

        while((str = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(str);			
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(a+b);
        }
    }	
}


// EOF(End Of File) : 더이상 읽을 수 있는 데이터가 없는 것을 나타내는 용어
// BufferedReader를 받은 문자열이 null이 아닌 경우에만 while문을 진행한다.
