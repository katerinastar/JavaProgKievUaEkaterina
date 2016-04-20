public class Multiplicator {
    public static int mul(int x, int y){
        int acc = 0;
        for (int i = 0; i < y; i++){
            acc = add(acc, x);
        }
        return acc;
    }

    private static int add(int x, int y){
        return x + y;
    }
}
