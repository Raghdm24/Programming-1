package Assignment8;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ArbTaker {
    
    private Person personalia;
    private int arbeidsTakerNr;
    private int ansettelseÅr;
    private int manedsLønn;
    private double skatteProsent;

    public ArbTaker(Person personalia, int arbeidsTakerNr, int ansettelseÅr, int manedsLønn, double skatteProsent){
        this.personalia= personalia;
        this.arbeidsTakerNr= arbeidsTakerNr;
        this.ansettelseÅr= ansettelseÅr;
        this.manedsLønn= manedsLønn;
        this.skatteProsent= skatteProsent;
    }
//get-metoder
    public Person getPersonalia(){
        return personalia;
    }
    public int getArbeidsTakerNr(){
        return arbeidsTakerNr;
    }
    public int getAnsettelseÅr(){
        return ansettelseÅr;
    }
    public int getMandeslønn(){
        return manedsLønn;
    }
    public double getSkatteProsent(){
        return skatteProsent;
    }

//set-metoder
    public void setManedsLønn(int manedsLønn){
        this.manedsLønn=manedsLønn;
    }
    public void setSkatteProsent(double skatteProsent){
        this.skatteProsent=skatteProsent;
    }

//operasjoner
    public double getKronerSkattPrMåned(int manedsLønn, double skatteProsent){
        double måndeligSkatt= (manedsLønn*skatteProsent)/100;
        return måndeligSkatt;
    }
    public double getBruttoLønnPrÅr(int manedsLønn){
        double bruttoLønnPrÅr= manedsLønn*12;
        return bruttoLønnPrÅr;
    }
    public double getSkatteTrekkPrÅr(int manedsLønn, double skatteProsent){
        double totalTrekkPrÅr= (manedsLønn*skatteProsent*10) + ((manedsLønn*skatteProsent)/2);
        return totalTrekkPrÅr;
    }
    public String getFullNavn(){
        return personalia.getLastName() + ", " + personalia.getFirstName();
    }
    public int getAlder(){
        int åretNå = new GregorianCalendar().get(Calendar.YEAR);
        int alder= åretNå - personalia.getYearOfBirth();
        return alder;
    }
    public int getAntallÅrAnsattenIBedriften(){
        int åretNå = new GregorianCalendar().get(Calendar.YEAR);
        return åretNå - ansettelseÅr;
    }
    public boolean getAnsattMerEnGittÅr( int inputÅr){
        return getAntallÅrAnsattenIBedriften() > inputÅr;
    }
    

}
