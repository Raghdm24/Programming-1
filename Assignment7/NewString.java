package Assignment7;


public class NewString{
    private String tekst;     //Gjør objektvariabelen immutabel

    public NewString(String tekst){   //string i parameteren er input fra usern
        this.tekst = tekst;
    }

    //metode for forkotning:
    public String getForkortning(){
        String[] ord= tekst.split(" "); //deler opp teksten i ord
        StringBuilder forkortelse= new StringBuilder();  //StringBuilder er en klasse som er mutabel(kan endres på)

        for(String ordet: ord ){     //for each-item loop (for hver ordet i ord)
            if(ordet.length()>0){    //at det faktisk er et ord
                forkortelse.append(ordet.charAt(0));
            }
        }
        return forkortelse.toString();                          //returnerer forkortelsen som en string
    }

    public String getFjernTegn(){
        StringBuilder nyTekst= new StringBuilder();              //علشان اضيف اول باول بس اشيل كل حرف e
        int indeks= tekst.indexOf("e");                          //finne den første 'e'

        while(indeks!=-1){                                       // while det finnes fortsatt 'e'

            nyTekst.append(tekst.substring(0,indeks));            //indeks not included
            tekst= tekst.substring(indeks+1);           //(indeks+1: til slutten liksom)
            indeks= tekst.indexOf("e");

        }

        //legg til resten av teksten som ikke inneholder 'e'
        nyTekst.append(tekst);                                     //når det ikke finnes mer e, skal den legge den siste teksten i NyTekst her
        return nyTekst.toString();

    }
}
