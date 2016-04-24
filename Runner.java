import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       int result = Digit.findDigit(number);

       System.out.println(number + "->" + result);
    }
}
