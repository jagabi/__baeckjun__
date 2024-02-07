import java.util.Scanner;

public class Main_2525 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hour = input.nextInt();
        int min = input.nextInt();
        int work = input.nextInt();

        int totalMin = hour*60 + min + work;

        if (totalMin<1440) {
            System.out.println((totalMin/60)+" "+(totalMin%60));
        }
        else {
            System.out.println(((totalMin-1440)/60)+" "+(totalMin%60));
        }

        input.close();



    }
}