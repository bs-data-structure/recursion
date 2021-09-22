public class Fibonacci {

    public static int[] storeFib;

    private static int fib(int n){
        if(n <= 1){
            return n;
        }

        int first = storeFib[n - 2];
        int second = storeFib[n - 1];
        if(first == -1){
            first = fib(n - 2);
        }
        if(second == -1){
            second = fib(n - 1);
        }
        storeFib[n] = first + second;
        return  storeFib[n];
    }

    public static void main(String[] args) {

        storeFib = new int[100];
        for (int i = 0; i < 100; i++){
            storeFib[i] = -1;
        }
        System.out.println(fib(10));
    }
}
