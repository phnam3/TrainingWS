package fractions;

public class Fraction {
    private Integer numerator;
    private Integer denominator;

    public Fraction(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    public Integer getNumerator() {
        return numerator;
    }

    public void setNumerator(Integer numerator) {
        this.numerator = numerator;
    }

    public Integer getDenominator() {
        return denominator;
    }

    public void setDenominator(Integer denominator) {
        this.denominator = denominator;
    }

    public Integer GCD(Integer num, Integer deno){
        if(num%deno == 0){
            return deno;
        }
        return GCD(deno, num%deno);
    }

    public void reduce(){
        Integer gcd = GCD(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    public Fraction add(Fraction two){
        Integer newNum = numerator * two.getDenominator() + denominator* two.getNumerator();
        Integer newDeno = denominator * two.getDenominator();
        return new Fraction(newNum, newDeno);
    }

    public Fraction sub(Fraction two){
        Integer newNum = numerator * two.getDenominator() - denominator * two.getNumerator();
        Integer newDeno = denominator * two.getDenominator();
        return new Fraction(newNum, newDeno);
    }

    public Fraction mul(Fraction two){
        Integer newNum = numerator * two.getNumerator();
        Integer newDeno = denominator * two.getDenominator();
        return new Fraction(newNum, newDeno);
    }

    public Fraction div(Fraction two){
        Integer newNum = numerator * two.getDenominator();
        Integer newDeno = denominator * two.getNumerator();
        return new Fraction(newNum, newDeno);
    }

    public void display(){
        System.out.println(numerator + "/" + denominator);
    }
}
