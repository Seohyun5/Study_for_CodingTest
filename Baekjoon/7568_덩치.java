import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] size = new int[n][2]; //키와 몸무게를 입력할 2차원 배열
        int[] rank = new int[n]; //등수를 입력할 배열
        for(int i=0; i<rank.length; i++) {
            rank[i] = 1; //등수 디폴트 값은 1
        }

        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            size[i][0] = Integer.parseInt(st.nextToken()); //키
            size[i][1] = Integer.parseInt(st.nextToken()); //몸무게
        }

        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if(size[i][0]>size[j][0] && size[i][1]>size[j][1]) {
                    rank[j]++; //키가 작은 쪽이 등수가 밀린다.
                }else if(size[i][0]<size[j][0] && size[i][1]<size[j][1]) {
                    rank[i]++; //몸무게가 적은 쪽이 등수가 밀린다.
                }
            }
        }

        for(int i=0; i<rank.length; i++) {
            bw.write(rank[i] + " ");
        }
        bw.flush();
        bw.close();
    }	
}
