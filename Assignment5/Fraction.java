package Assignment5;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){        //konstruktør 1
        if(denominator == 0){
            throw new IllegalArgumentException("Denominator cannot be 0");  //blir kastet bare hvis nevneren er null 
        }
        this.numerator= numerator;      
        this.denominator= denominator;
    }

    public Fraction(int numerator){                        //konstruktør 2
        this.numerator= numerator;
        this.denominator= 1;
    }

    // (Sum/Sub) felles nevner blir brukt

    //summere-metode
    public void Summation(Fraction other){                  // Fraction other ---> klasse navn + other --> for å si at en annen objekt skal være parameter i den.
        this.numerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);
        this.denominator = this.denominator * other.denominator;
        System.out.println( this.numerator + "/" + this.denominator );
    }

    //subtrahere-metode
    public void Substraction(Fraction other){
        this.numerator = (this.numerator * other.denominator) - (other.numerator * this.denominator);
        this.denominator = this.denominator * other.denominator;
        System.out.println(this.numerator + "/" + this.denominator);
    }

    //multiplisere-metode
    public void Multiply(Fraction other){
        this.numerator = this.numerator * other.numerator;
        this.denominator = this.denominator * other.denominator;
        System.out.println(this.numerator + "/" + this.denominator);
    }

    //dividere-metode
    public void Divide(Fraction other){
        if (other.numerator==0)
        {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        this.numerator = this.numerator * other.denominator;
        this.denominator = this.denominator * other.numerator;
        System.out.println(this.numerator + "/" + this.denominator);
    }

}
