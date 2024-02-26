import java.util.Scanner;

public class Main_25314 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int X = input.nextInt();

        input.close();

        for ( int i = 0 ; i < X/4 ; i++ ) {
            System.out.print("long ");
        }

        System.out.print("int");


    }
}
