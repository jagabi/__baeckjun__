import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        ArrayList<Integer> arr = new ArrayList<>();
        
        for ( int i = 1 ; i <= 30 ; i++ ) arr.add(i);

        for ( int i = 0 ; i < 28 ; i++ ) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            arr.remove(Integer.valueOf(N));
        }

        System.out.println(arr.get(0) +"\n" + arr.get(1));

        bw.flush();
        bw.close();
        br.close();

    }
}
