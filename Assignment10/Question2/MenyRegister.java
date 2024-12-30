package Assignment10.Question2;



import java.util.ArrayList;
import java.util.List;

public class MenyRegister {
    List<Rett> retter;
    List<Meny> menyer;

    public MenyRegister() {
        retter = new ArrayList<>();  
        menyer = new ArrayList<>();  
    }
    
    public void setAddRett(Rett rett) {
        retter.add(rett);
    }
    public Rett getRettVedGittNavn(String navnTilRett) {
        for (Rett rett : retter) {
            if (rett.getNavn().equals(navnTilRett)) {
                return rett;
            }
        }
        return null; //returner null hvis retten ikke finnes
    }
    public List<Rett> getRetterByType(String gittType) { //Dette betyr at listen vil inneholde objekter av typen Rett
        List<Rett> rettSammeType = new ArrayList<>();
        for (Rett rett : retter) {
            if(rett.getType().equals(gittType)) {
                rettSammeType.add(rett);
            }
        }
        return rettSammeType;
    }
    public void setAddMeny(Meny meny) {
        menyer.add(meny);
    }
    public List<Meny> getMenyerByPrice(int startPris, int endPris) {
        List<Meny> menyBasertPåPris = new ArrayList<>();
        for (Meny meny : menyer) {
            if(meny.getTotalPrisMeny()>=startPris && meny.getTotalPrisMeny() <= endPris) {
                menyBasertPåPris.add(meny);
            }
        }
        return menyBasertPåPris;
    }
}

