public class TaylorSeries {

    private static double power = 1;
    private static double fact = 1;
    private static double factN = 1;

    private static double taylorSeries(int x, int n){
        if(n == 0){
            return 1;
        }
        power *= x;
        fact *= factN++;
        double term = power / fact;

        return taylorSeries(x, n - 1) + term;
    }

    public static void main(String[] args) {
        System.out.println(taylorSeries(3, 10));
    }
}
