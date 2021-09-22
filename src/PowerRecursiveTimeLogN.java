public class PowerRecursiveTimeLogN {

    private static int pow(int m, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 != 0) {
            return m * pow(m * m, n / 2);
        }

        return pow(m * m, n / 2);
    }

    public static void main(String[] args) {
        System.out.println(pow(3, 4));
    }
}
