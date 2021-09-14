import java.util.Scanner;

public class App {
    static int countNumber(int ar[], int n) {

        int count = 1;
        int longestCount = 0;

        for (int i = 0; i < n - 1; i++) {
            if (ar[i] == 1) {

                if (ar[i] == ar[i + 1]) {
                    count = count + 1;
                    if (longestCount < count) {
                        longestCount = count;
                    }
                    ;
                } else if (ar[i] != ar[i + 1]) {
                    count = 1;
                }

                ;
            }
        }
        return longestCount;
    }

    public static void main(String[] args) {
        // declare scanner
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Input array length");

        try {
            n = input.nextInt();

            while (n <= 0 || n > 10000) {
                System.out.println("Can't input negative integer or can't exceed 10000");
                n = input.nextInt();
            }
            // declare array
            int[] ar = new int[n];
            System.out.println("Enter only 0 or 1");
            for (int i = 0; i < n; i++) {
                ar[i] = input.nextInt();
                while (ar[i] > 1 || ar[i] < 0) {
                    System.out.println("Can only input 0 or 1");
                    ar[i] = input.nextInt();
                }
                ;
            }
            System.out.print("Number of consecutive : ");
            System.out.println(countNumber(ar, n));
        } catch (Exception e) {
            System.out.println("Error.");
        } finally {
            input.close();
        }
    }
}