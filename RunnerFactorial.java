import java.util.Scanner;
public class RunnerFactorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        if (number >= 0){
            System.out.println(number + "! = " + Factorial.findFactorial(number));
        }
        else {
            System.out.println("Error");
        }

    }
}
