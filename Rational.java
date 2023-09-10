import java.math.BigInteger;

public class Rational {
    private BigInteger numerator;
    private BigInteger denominator;

    public Rational() {
        this(BigInteger.ZERO, BigInteger.ONE);
    }

    public Rational(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = numerator.gcd(denominator);
        this.numerator = numerator.divide(gcd);
        this.denominator = denominator.divide(gcd);
    }

    public BigInteger getNumerator() {
        return numerator;
    }

    public BigInteger getDenominator() {
        return denominator;
    }

    public Rational add(Rational other) {
        BigInteger n = numerator.multiply(other.denominator).add(other.numerator.multiply(denominator));
        BigInteger d = denominator.multiply(other.denominator);
        return new Rational(n, d);
    }

    public Rational subtract(Rational other) {
        BigInteger n = numerator.multiply(other.denominator).subtract(other.numerator.multiply(denominator));
        BigInteger d = denominator.multiply(other.denominator);
        return new Rational(n, d);
    }

    public Rational multiply(Rational other) {
        BigInteger n = numerator.multiply(other.numerator);
        BigInteger d = denominator.multiply(other.denominator);
        return new Rational(n, d);
    }

    public Rational divide(Rational other) {
        BigInteger n = numerator.multiply(other.denominator);
        BigInteger d = denominator.multiply(other.numerator);
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
