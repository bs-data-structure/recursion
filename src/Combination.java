public class Combination {

    private static int nCr(int n, int r){
        if(r == 0 || n == r){
            return 1;
        }
        return nCr(n-1, r-1) + nCr(n - 1, r);
    }

    public static void main(String[] args) {
        System.out.println(nCr(5, 3));
    }
}
