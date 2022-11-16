public class Fibo {
    public static void main(String[] args) {
        int n = 10, firstn = 0, secn = 1;
        System.out.println("The fibonacci series of " + n + "number is: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(firstn + ", ");
            int nextn = firstn + secn;
            firstn = secn;
            secn = nextn;
        }
    }
}
