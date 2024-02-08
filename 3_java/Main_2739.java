import java.util.Scanner;

public class Main_2739 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        input.close();
        for (int i = 1 ; i < 10 ; i++) {
            System.out.println(x + " * " + i + " = " + (x*i));
        }

    }
}
