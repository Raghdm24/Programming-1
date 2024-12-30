package Assignment10.Question2;

import java.util.ArrayList;
import java.util.List;

public class Meny {
    List<Rett> meny;  
                      
    public Meny() {
        meny = new ArrayList<Rett>(); 
    }
    public void setAddRett(Rett rett) {
        meny.add(rett);
    }
    public List<Rett> getRetter() {
        return meny;
    }
    public int getTotalPrisMeny(){
        int totalPrisMeny = 0;
        for(Rett rett : meny) {
            totalPrisMeny += rett.getPris();
        }
        return totalPrisMeny;
    }

    @Override
    public String toString() {
        StringBuilder finalTekst = new StringBuilder();
        finalTekst.append("Meny:\n");
        for(Rett rett : meny) {
            finalTekst.append("- ").append(rett.getNavn()).append(": ").append(rett.getPris()).append(" kr");
        }

        finalTekst.append("TotalPris: ").append(getTotalPrisMeny()).append(" kr");
        return finalTekst.toString();

    }
}
