package Assignment10.Question1;

public class Arrangement {
    private int ArrNummer;
    private String ArrName;
    private String ArrSted;
    private String ArrArrangør;
    private String ArrType;         //type (konsert/barneteater/foredrag)
    private long ArrTidspunkt;      //dato og klokkeslett

    public Arrangement(int ArrNummer, String ArrName,String ArrSted, String ArrArrangør ,String ArrType, Long ArrTidspunkt){
        this.ArrNummer = ArrNummer;
        this.ArrName = ArrName;
        this.ArrSted = ArrSted;
        this.ArrArrangør= ArrArrangør;
        this.ArrType = ArrType;
        this.ArrTidspunkt = ArrTidspunkt;
    }

    public int getArrNummer() {
        return ArrNummer;
    }
    public String getArrName() {
        return ArrName;
    }
    public String getArrSted() {
        return ArrSted;
    }
    public String getArrArrangør(){
        return ArrArrangør;
    }
    public String getArrType() {
        return ArrType;
    }
    public long getArrTidspunkt() {
        return ArrTidspunkt;
    }

    @Override
    public String toString() {
        return "Arrangement{" +
                "nummer=" + ArrNummer +
                ", navn=" + ArrName +
                ", sted=" + ArrSted +
                ", arrangør=" + ArrArrangør +
                ", type=" + ArrType +
                ", tid=" + ArrType +
                '}';
    }

    
}
