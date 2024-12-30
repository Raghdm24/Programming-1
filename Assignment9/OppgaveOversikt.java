
package Assignment9;

import java.util.ArrayList;
public class OppgaveOversikt {

    ArrayList<Student> studenter;  // tabellen opprettes i konstruktøren
    private int antStud = 0;    // økes med 1 for hver ny student

    public OppgaveOversikt(){
        studenter = new ArrayList<>();
    }

    public int getAntStud(){
        return antStud;
    }
    public int getAntOppForBestemtStudent(Student student){
        return student.getAntOppgGodkjent();
    }
    public void SetNewStudent(Student nyStudent){
        studenter.add(nyStudent);
        antStud++;
    }
    public void setØkOppgForBestemtStudent(Student student, int øking){
        student.økAntOppgGodkjent(øking);
    }
    public String toString() {
        StringBuilder result = new StringBuilder("Oppgaveoversikt:\n");
        for (Student student : studenter) {
            result.append(student).append("\n");
        }
        return result.toString();
    }
    
}
