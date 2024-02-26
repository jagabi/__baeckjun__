import java.util.ArrayList;
import java.util.Scanner;

public class Main_10810 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        
        for ( int i = 0 ; i < N ; i++) {
            arr.add(i,0);
        }

        for ( int i = 0 ; i < M ; i++ ) {
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();
            
            for ( int j = A-1 ; j < B ; j++ ) {
                arr.set(j,C);
            }
            
        }

        in.close();

        for (int i = 0 ; i < arr.size() ; i++ )
        System.out.print( arr.get(i) + " ");
    }
}