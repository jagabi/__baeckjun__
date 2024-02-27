import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;


public class Main_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Boolean> arr = new ArrayList<>();
        int sum = 0;

        for (int i = 0 ; i < 42 ; i++) arr.add(false);

        for (int i = 0 ; i < 10 ; i++) {
            int N = Integer.parseInt(br.readLine())%42;
            arr.set(N,true);
        }

        for (int i = 0 ; i < arr.size() ; i++) if (arr.get(i) == true) sum += 1;

        bw.write(String.valueOf(sum));


        bw.flush();
        bw.close();
        br.close();


    }
}
