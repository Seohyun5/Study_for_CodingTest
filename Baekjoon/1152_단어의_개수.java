import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.trim();
        if(str.equals("")) System.out.println(0);
        else {
            String[] arr = str.split(" ");
            System.out.println(arr.length);
        }
    }
}


// split을 써서 너무 느려진 것 같길래 StringTokenizer로 바꿔봤는데 더 느렸다. 어떻게 해야하지?
