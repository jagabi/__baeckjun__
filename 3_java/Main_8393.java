import java.util.Scanner;

public class Main_8393 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int sum = 0;
        input.close();


        for (int i = 1 ; i < n+1 ; i++ ) {
            sum = sum + i;
        }

        System.out.println(sum);

    }
}
