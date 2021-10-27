package Task16;

import org.apache.commons.math3.primes.Primes;

public class Main {
    public static void main(String[] args) {
        for (String arg : args) {
            try {
                int number = Integer.parseInt(arg);
                if (Primes.isPrime(number)) {
                    System.out.println(number + " - prime");
                } else {
                    System.out.println(number + " - not prime");
                }
            } catch (NumberFormatException ex) {
                System.out.println(arg + " - not a number");
            }
        }
    }
}
