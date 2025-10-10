package OOP;

public class FractionClass {

    public static Fraction add2(Fraction f1, Fraction f2){
        f1.num = f1.num * f2.den + f1.den * f2.num;
        f1.den = f1.den * f2.den;
        return f1;
    }

    public static Fraction add(Fraction f1, Fraction f2){
        int numerator = f1.num * f2.den + f1.den*f2.num;
        int denominator = f1.den*f2.den;
        Fraction f3 = new Fraction(numerator, denominator);
        return f3;
    }

    public static Fraction multiply(Fraction f1, Fraction f2){
        int numerator = f1.num * f2.num;
        int denominator = f1.den * f2.den;
        Fraction f3 = new Fraction(numerator, denominator);
        return f3;
    }

    public static Fraction divide(Fraction f1, Fraction f2){
        int num = f1.num * f2.den;
        int den = f1.den * f2.num;
        Fraction f3 = new Fraction(num, den);
        return f3;
    }

    public static int gcd(int num, int den) {
        int min = Math.min(num, den);
        for (int i = min; i >= 1; i--) {
            if (num%i == 0 && den%i == 0) return i;
        }
        return min;
    }

    public static class Fraction{
        int num;
        int den;
        public Fraction(int num, int den){
            this.num = num;
            this.den = den;
            simplify();
        }
        public void simplify(){
            int hcf = gcd(num, den);
            num = num/hcf;
            den = den/hcf;
        }
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(35, 77);
        Fraction f2 = new Fraction(7, 3);
        Fraction f3 = add(f1, f2);
        Fraction f4 = multiply(f1, f2);
        Fraction f5 = divide(f1, f2);
        add2(f1, f2);
        System.out.println("F1: "+f1.num+"/"+ f1.den);
        System.out.println("F2: "+f2.num+"/"+ f2.den);
        System.out.println("Addition: "+f3.num+"/"+ f3.den);
        System.out.println("Multiply: "+f4.num+"/"+ f4.den);
        System.out.println("Division: "+f5.num+"/"+ f5.den);
        f1.simplify();
        System.out.println(f1.num+"/"+ f1.den);
    }
}
