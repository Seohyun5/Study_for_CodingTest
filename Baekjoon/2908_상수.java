import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s1 = st.nextToken();
        String s2 = st.nextToken();

        String rev1 = new StringBuffer(s1).reverse().toString();
        String rev2 = new StringBuffer(s2).reverse().toString();
        int num1 = Integer.parseInt(rev1);
        int num2 = Integer.parseInt(rev2);

        if(num1>num2) System.out.println(num1);
        else System.out.println(num2);
    }	
}


/* =====첫 번 째 풀이(속도 160ms)=====
public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    String s1 = st.nextToken();
    String s2 = st.nextToken();
    String s3 = "", s4 = "";
    for(int i=2; i>=0; i--) {
        s3 += s1.charAt(i);
        s4 += s2.charAt(i);
    }
    int num1 = Integer.parseInt(s3);
    int num2 = Integer.parseInt(s4);
    if(num1>num2) System.out.println(num1);
    else System.out.println(num2);
}
*/
