import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_10811 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i < N ; i++) arr[i] = i+1;


        for ( int i = 0 ; i < M ; i++ ) {
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            if (B == A) {}

            else {
                for ( int j = 0 ; j < (B-A+1)/2 ; j++ ) {
                    int temp = arr[B-1-j];
                    arr[B-1-j] = arr[A-1+j];
                    arr[A-1+j] = temp;
                }
            }
        }

        for( int i = 0 ; i < N ; i++) {
            bw.write(String.valueOf(arr[i] + " "));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
