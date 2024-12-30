package Assignment9;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        OppgaveOversikt oversikt= new OppgaveOversikt();
        boolean running = true;

        while (running) {
            System.out.println("\n------Meny-----"
            + "\n1.Legg til ny student"
            + "\n2.Øk antall godkjente oppgaver for student"
            + "\nVis antall godkjente oppgaver for en student"
            + "\n4.Skriv ut hele oversikten"
            + "\n5.Avslutt"
            + "\nVelg et alternativ: ");


            int valg= input.nextInt();
            input.nextLine();

            switch (valg) {
                case 1->{

                    System.out.println("Skriv inn studentens navn: ");
                    String navn= input.nextLine();
                    System.out.println("Skriv inn antall oppgaver som allerede er godkjente: ");
                    int antOppgGodkjent= input.nextInt();
                    Student nyStudent= new Student(navn, antOppgGodkjent);
                    oversikt.SetNewStudent(nyStudent);
                    System.out.println("Student lagt til: " + navn);
                }
                
                case 2 ->{
                    System.out.print("Skriv inn studentens navn: ");
                    String navn = input.nextLine();
                    Student student = finnStudent(oversikt, navn);
                    if (student != null) {
                        System.out.print("Hvor mange oppgaver skal økes? ");
                        int øking = input.nextInt();
                        oversikt.setØkOppgForBestemtStudent(student, øking);
                        System.out.println("Oppgaver oppdatert for " + navn);
                    } else {
                        System.out.println("Student ikke funnet.");
                    }
                }
                
                case 3 -> { // Vis antall godkjente oppgaver for en student
                    System.out.print("Skriv inn studentens navn: ");
                    String navn = input.nextLine();
                    Student student = finnStudent(oversikt, navn);
                    if (student != null) {
                        int antOppgGodkjent = oversikt.getAntOppForBestemtStudent(student);
                        System.out.println(navn + " har fått godkjent " + antOppgGodkjent + " oppgaver.");
                    } else {
                        System.out.println("Student ikke funnet.");
                    }
                }
                case 4 -> { // Skriv ut hele oversikten
                    System.out.println(oversikt);
                }
                case 5 -> { // Avslutt programmet
                    running = false;
                    System.out.println("Program avsluttet.");
                }
                default -> System.out.println("Ugyldig valg. Prøv igjen.");
            }

                
            }
            input.close();
        }

        private static Student finnStudent(OppgaveOversikt oversikt, String navn) {
            for (Student student : oversikt.studenter) { // Tilgang til studenter-listen direkte
                if (student.getNavn().equalsIgnoreCase(navn)) {
                    return student;
                }
            }
            return null;
        }


    }
    

