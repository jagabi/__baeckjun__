import java.util.Scanner;

public class Main_2753 {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);

        int y = year.nextInt();
        
        year.close();

        if (y%4==0) {
            if (y%100!=0) {
                System.out.println("1");
            }
            if (y%100==0) {
                if (y%400!=0) {
                    System.out.println("0");
                }
                else {
                    System.out.println("1");
                }
            }
        }

        else {
            System.out.println("0");
        }


    }
}
