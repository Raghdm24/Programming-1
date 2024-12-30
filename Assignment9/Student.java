

package Assignment9;

public class Student {
    private String navn;
    private int antOppgGodkjent;

    public Student(String navn, int antOppgGodkjent){
        this.navn= navn;
        this.antOppgGodkjent= antOppgGodkjent;
    }

    public String getNavn(){
        return navn;
    }
    public int getAntOppgGodkjent(){
        return antOppgGodkjent;
    }
    public void økAntOppgGodkjent(int øking){
        antOppgGodkjent+= øking;
    }
    public String toString(){
        return "Students Navn: " + navn + "Antall oppgaver: " + antOppgGodkjent;
    }
    
}
