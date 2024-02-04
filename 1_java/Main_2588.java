import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_2588 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int A = input.nextInt();
        int B = input.nextInt();

        String numStr = String.valueOf(B);

         List<Integer> digits = new ArrayList<>();
        for (int i = 0 ; i < numStr.length() ; i++ ) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            digits.add(digit);
        } 

        int Answer_1 = A*digits.get(digits.size()-1);
        int Answer_2 = A*digits.get(digits.size()-2);
        int Answer_3 = A*digits.get(digits.size()-3);

        System.out.println(Answer_1 + "\n" + Answer_2 + "\n" + Answer_3 + "\n" + (Answer_1 + 10*Answer_2 + 100*Answer_3));


        input.close();
    }
}
