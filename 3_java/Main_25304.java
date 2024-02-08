import java.util.Scanner;

public class Main_25304 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int X = input.nextInt();
        int N = input.nextInt();
        int sum = 0;

        

        for ( int i = 0 ; i < N ; i++ ) {
            int a = input.nextInt();
            int b = input.nextInt();
            sum = sum + (a*b);
        }

        if (sum == X) {System.out.println("Yes");}
        else {System.out.println("No");}
        
        input.close();
    }
}
