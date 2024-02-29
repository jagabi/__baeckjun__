import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Double> arr = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        for ( int i = 0 ; i < N ; i++ ) {
            arr.add(Double.parseDouble(st.nextToken()));
        }

        double max = arr.stream().max(Comparator.naturalOrder()).get();

        for ( int i = 0 ; i < N ; i++ ) {
            if ( arr.get(i) < max ) {
                arr.set(i,((arr.get(i)*100)/max));
            }
            else arr.set(i, 100.0);
        }

        double sum = 0;
        for ( int i = 0 ; i < arr.size() ; i++ ) sum += arr.get(i);

        double average = sum/arr.size();

        bw.write(String.valueOf(average));        

        bw.flush();
        bw.close();
        br.close();
    }
}