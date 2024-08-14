import java.util.*;
class Totient {
    public static int Phi(int n) {
        int result = n;
        // check for all the prime factors of n and substract heir multiples from result
        for (int p = 2; p * p <= n; p++) {
            if (n % p == 0) {
                // p is a prime factor of n
                while (n % p == 0) {
                    // remove all muliples of p from n
                    n /= p;
                }
                result -= result / p;
            }
        }
        if (n > 1) {
            result -= result / n;
        }
        return result;
        }
    }

public class Euler_phi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        Totient totient = new Totient();
        int phi_n = totient.Phi(n);
        System.out.println(" Totient of n is " + phi_n);
        sc.close();
    }
}