package Assignment10.Question1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrangementRegister {
  private ArrayList<Arrangement> arrangements; //dette oppretter en dynamisk liste
  // arrangements er en dynamisk liste som lager objekter av typen Arrangement


  //kostruktør
  public ArrangementRegister() {
    arrangements = new ArrayList<>(); //arrangements = new ArrayList<>(); initialiserer arrangements-attributtet med en ny, tom ArrayList.
  }

  // (1) registere nytt arrangemant
  public void setArrangement(Arrangement arrangement) {
    arrangements.add(arrangement);
  }

  //(2)Å finne alle arrangementer på et gitt sted
  public ArrayList<Arrangement> getArrangementsVedGittSted(String sted) {  //metode som returnerer en liste av de med riktig sted
    ArrayList<Arrangement> arrangementsVedGittSted = new ArrayList<>();  //ny liste til å putte inn
    for (Arrangement arrangement : arrangements) {      //for hver arrangement i arrangements
      if (arrangement.getArrSted().equals(sted)) {
        arrangementsVedGittSted.add(arrangement);  //add denne arrangementet i listen arrangementsVedGittSted
      }
    }
    return arrangementsVedGittSted;
  }

  //(3)Å finne alle arrangementer på en gitt dato
  public ArrayList<Arrangement> getArrangementsVedGittDato(long dato) {
    ArrayList<Arrangement> arrangementsVedGittDato = new ArrayList<>(); //ny liste til å putte inn
    for (Arrangement arrangement : arrangements) {
      if (arrangement.getArrTidspunkt() == dato) {
        arrangementsVedGittDato.add(arrangement);
      }
    }
    return arrangementsVedGittDato;
  }

  //(4)Å finne alle arrangementer innenfor et tidsintervall gitt ved to datoer. Listen skal
  //være sortert på tid.
  public ArrayList<Arrangement> getArrangementsInnenGitt2Datoer(long startDato, long endDato) {
    ArrayList<Arrangement> arrangementsInnenGitt2Datoer =
        new ArrayList<>(); //ny liste for å putte inn
    for (Arrangement arrangement : arrangements) {
      if (arrangement.getArrTidspunkt() >= startDato && arrangement.getArrTidspunkt() <= endDato) {
        arrangementsInnenGitt2Datoer.add(arrangement);
      }
    }
    //Sorter listen basert på ArrTidspunkt
    Collections.sort(arrangementsInnenGitt2Datoer,
        (a1, a2) -> Long.compare(a1.getArrTidspunkt(), a2.getArrTidspunkt()));

    return arrangementsInnenGitt2Datoer;

    //collection.sort(listensNavn, (obj1, obj2) -> Integer compare (obj1. , obj2.)
  }

  //(5)Å lage lister over alle arrangementer, sortert etter henholdsvis sted, type og
  //tidspunkt.
  //3-metoder

  //sortert sted
  public ArrayList<Arrangement> getArrangementsSortertSted() {
    ArrayList<Arrangement> sortByStedList =
        new ArrayList<>(arrangements);  //lager ny liste kopi av arrangements
    Collections.sort(sortByStedList,
        (a1, a2) -> a1.getArrSted().compareTo(a2.getArrSted())); //sorterer alfabetisk
    return sortByStedList;
  }

  //sorter type
  public ArrayList<Arrangement> getArrangementsSortertType() {
    ArrayList<Arrangement> sortByTypeList =
        new ArrayList<>(arrangements); //lager ny liste kopi av arrangements
    Collections.sort(sortByTypeList,
        (a1, a2) -> a1.getArrType().compareTo(a2.getArrType()));  //sorterer alfabetisk rekkefølge
    return sortByTypeList;
  }

  //sorter tidspunkt
  public ArrayList<Arrangement> getArrangementsSortertDato() {
    ArrayList<Arrangement> sortByDatoList = new ArrayList<>(arrangements);
    Collections.sort(sortByDatoList,
        (a1, a2) -> Long.compare(a1.getArrTidspunkt(), a2.getArrTidspunkt()));
    return sortByDatoList;
  }

  @Override
  public String toString() {
    // arrRegisterTekst, en tom tekst jeg legger til av klassen StringBuilder
    StringBuilder arrRegisterTeskt = new StringBuilder("Arrangementer:\n");
    for (Arrangement arrangement : arrangements) {
      arrRegisterTeskt.append(arrangement.getArrNummer()).append(": ");
      arrRegisterTeskt.append(arrangement.getArrName()).append("\n");
    }
    return arrRegisterTeskt.toString();
  }


}
