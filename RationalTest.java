
    import java.util.Scanner;
import java.math.BigInteger;

public class RationalTest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the first rational number (numerator denominator): ");
            BigInteger num1 = input.nextBigInteger();
            BigInteger den1 = input.nextBigInteger();
            Rational rational1 = new Rational(num1, den1);

            System.out.print("Enter the second rational number (numerator denominator): ");
            BigInteger num2 = input.nextBigInteger();
            BigInteger den2 = input.nextBigInteger();
            Rational rational2 = new Rational(num2, den2);

            Rational sum = rational1.add(rational2);
            Rational difference = rational1.subtract(rational2);
            Rational product = rational1.multiply(rational2);
            Rational quotient = rational1.divide(rational2);

            System.out.println(rational1 + " + " + rational2 + " = " + sum);
            System.out.println(rational1 + " - " + rational2 + " = " + difference);
            System.out.println(rational1 + " * " + rational2 + " = " + product);
            System.out.println(rational1 + " / " + rational2 + " = " + quotient);

            double decimalValue = rational2.getNumerator().doubleValue() / rational2.getDenominator().doubleValue();
            System.out.println(rational2 + " is " + decimalValue);
        }
    }
}


