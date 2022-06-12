import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int i=a; i<=b; i++) {
            if(i==2) {
                sum +=i;
                min = i;
            }
          
            for(int j=2; j<i; j++) {
                if(i%j==0) break;
                if(j+1==i) {
                    sum += i;
                    if(min>i) min = i;
                }
            }
        }
      
        if(sum==0) System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
