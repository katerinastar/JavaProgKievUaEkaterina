import java.util.Scanner;
public class RunnerFactorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        while (number < 0){
            System.out.println("Enter positive number!");
            number = sc.nextLong();
        }
        System.out.println(number + "! = " + Factorial.findFactorial(number));
    }
}
