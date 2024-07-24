public class Star {
    public static void Printstar(int n) {
        for (int line = 1; line <= n; line++) {
            for (int num = 1; num <= line; num++) {
                System.out.print(num);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Printstar(5);
    }
}