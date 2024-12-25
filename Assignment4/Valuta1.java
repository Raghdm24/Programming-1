package Assignment4;

public class Valuta1 {
    double amountFromUser;

    public Valuta1(double amountFromUser){      //constructor to get the amount from user
        this.amountFromUser= amountFromUser;
    }

    public double getNorwegianToDollar() {
        double NorwegianToDollar= amountFromUser*0.093;
        return NorwegianToDollar;
    }

    public double getNorwegianToEuro() {
        double NorwegianToEuro = amountFromUser*0.085;
        return NorwegianToEuro;
    }

    public double getNorwegianToSwedishKroner() {
        double NorwegianToSwedishKroner= amountFromUser*0.97;
        return NorwegianToSwedishKroner;
    }

    public double getDollarToNorwegian() {
        double DollarToNorwegian = amountFromUser*10.75;
        return DollarToNorwegian;
    }

    public double getEuroToNorwegian() {
        double EuroToNorwegian = amountFromUser*11.74;
        return EuroToNorwegian;
    }

    public double getSwedishKronerToNorwegian() {
        double SweetToNorwegian = amountFromUser*1.03;
        return SweetToNorwegian;
    }


    
}
