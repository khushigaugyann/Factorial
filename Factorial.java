import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n;
        double fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any no: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        sc.close();
    }
}
