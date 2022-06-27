import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 666;
        int idx = 0;

        while(true) {
            if(Integer.toString(num).contains("666")) idx++;
            if(idx==n) break;
            num++;
        }		
        System.out.println(num);
    }
}
