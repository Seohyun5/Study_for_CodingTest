import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char[] arr = new char[n.length()];
        for(int i=0; i<arr.length; i++) {
            arr[i] = n.charAt(i);
        }

        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i]<arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0; i<arr.length; i++) {
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }
}
