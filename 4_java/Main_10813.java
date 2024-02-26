import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();

        for ( int i = 0 ; i < N ; i++ ) {
            arr.add(i+1);
        }

        for ( int i = 0 ; i < M ; i++ ) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int x = arr.get(A-1);
            int y = arr.get(B-1);

            arr.set(A-1, y);
            arr.set(B-1, x);
        }

        for ( int i = 0 ; i < arr.size() ; i++ ) System.out.print(arr.get(i) + " ");

        bw.flush();
        bw.close();
        br.close();
    }
}