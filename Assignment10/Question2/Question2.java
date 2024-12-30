package Assignment10.Question2;

import java.util.List;

public class Question2 {
    public static void main(String[] args) {

        MenyRegister menyRegister = new MenyRegister();

        // Registrere noen retter
        Rett rett1 = new Rett("Bruschetta", "forrett", 90, "Tomater, basilikum, brød");
        Rett rett2 = new Rett("Lasagne", "hovedrett", 150, "Pasta, kjøtt, ost");
        Rett rett3 = new Rett("Tiramisu", "dessert", 80, "Kaffe, mascarpone, kakao");

        menyRegister.setAddRett(rett1);
        menyRegister.setAddRett(rett2);
        menyRegister.setAddRett(rett3);

        Meny meny1= new Meny();
        meny1.setAddRett(rett1);
        meny1.setAddRett(rett2);
        System.out.println("------------");
        System.out.println(meny1.getRetter()); //
        System.out.println("-------------");

        menyRegister.setAddMeny(meny1);
        System.out.println(menyRegister); //
        System.out.println("------------");

        //Hente en rett ved navn
        Rett hentetRett= menyRegister.getRettVedGittNavn("Lasagne");
        System.out.println("Henter rett" + hentetRett.getNavn() + ", pris: " + hentetRett.getPris());

        //Hente alle retter av type "forrett"
        List<Rett> forretter= menyRegister.getRetterByType("forrett");
        System.out.println("Forretter");
        for(Rett rett: forretter){
            System.out.println("- " + rett.getNavn() + ", pris: " + rett.getNavn());
        }

        List<Meny> menyerIMaks= menyRegister.getMenyerByPrice(100,300);
        System.out.println("Menyer med totalpris mellom 100 og 300: ");
        for(Meny meny: menyerIMaks){
            System.out.println(meny);
        }


    }
}
