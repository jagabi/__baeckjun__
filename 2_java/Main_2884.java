import java.util.Scanner;

public class Main_2884 {

    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hour = input.nextInt();
        int min = input.nextInt();
        int totalMin = hour*60+min;

        int alarm = totalMin-45;

        if (alarm>=0) {
            System.out.println(alarm/60 + " " + alarm%60);
        } 
        else {
            System.out.println(((1440+alarm)/60)+" "+((1440+alarm)%60));
        }
        input.close();


    }
}
