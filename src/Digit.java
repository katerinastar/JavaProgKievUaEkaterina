public class Digit {
    public static int findDigit(int a){
        int count = 0;
        while (a != 0){
            a /= 10;
            count++;
        }
        return count;
    }
}
