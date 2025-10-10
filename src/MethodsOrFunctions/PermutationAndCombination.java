package MethodsOrFunctions;

public class PermutationAndCombination {

    public static double permutation(double a, double b) {
        double n_fact = 1;  double r_fact = 1;
        for (double i = a; i >= 1; i--) {
            n_fact *= a;
        }
            for (double j = b; j >= 1; j--)
                r_fact *= j;

        return n_fact / (n_fact - r_fact);
    }

    public static void main(String[] args) {
        System.out.println("Permutation = " +permutation(11, 5));
    }
}
