import java.util.Scanner;

public class Main_2480 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int[] diceArray = {A,B,C};

        int max = Integer.MIN_VALUE;
        input.close();
        for (int i = 0 ; i < diceArray.length ; i++) {
            max = Math.max(max, diceArray[i]);
        }

        if (A==B) {
            if (B==C) {
                System.out.println(10000+(A*1000));
            }
            else if (B!=C) {
                System.out.println(1000+(A*100));
            }
        } 

        else if (A!=B) {
            if (B==C) {
                System.out.println(1000+(B*100));
            }

            else if (A==C) {
                System.out.println(1000+(A*100));
            }

            else {
                System.out.println(max*100);
            }
        }


    }
}
