import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class Main_10818 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for ( int i = 0 ; i < N ; i++ ) {
            list.add(in.nextInt());
        }

        in.close();

        int max = list.stream().max(Comparator.naturalOrder()).get();
        int min = list.stream().min(Comparator.naturalOrder()).get();

        System.out.println(min + " " + max);
    }
}