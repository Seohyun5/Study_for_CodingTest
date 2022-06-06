import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cnt = 0;

        for(int i=0; i<str.length(); i++) {
            if(i+1>=str.length()) {
                cnt++;
                break;
            }

            char c = str.charAt(i);
            char c2 = str.charAt(i+1);

            if(c=='c'&&c2=='=' || c=='c'&&c2=='-' || c=='d'&&c2=='-' || c=='l'&&c2=='j' || c=='n'&&c2=='j' || c=='s'&&c2=='=' || c=='z'&&c2=='=') {
                cnt++;
                i++;
            } else if(i+2<str.length() && c=='d' && c2=='z' && str.charAt(i+2)=='=') {
                cnt++;
                i+=2;
            } else {
                cnt++;
            }

            if(i==str.length()-2) {
                cnt++;
                break;
            }else if(i==str.length()-1) {
                break;
            }
        }

        System.out.println(cnt);
    }	
}
