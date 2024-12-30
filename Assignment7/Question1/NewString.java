package Assignment7;

//For Question 1
public class NewString{
    private String tekst;     

    public NewString(String tekst){   
        this.tekst = tekst;
    }

    
    public String getForkortning(){
        String[] ord= tekst.split(" "); 
        StringBuilder forkortelse= new StringBuilder();  

        for(String ordet: ord ){     
            if(ordet.length()>0){    
                forkortelse.append(ordet.charAt(0));
            }
        }
        return forkortelse.toString();                          
    }

    public String getFjernTegn(){
        StringBuilder nyTekst= new StringBuilder();              
        int indeks= tekst.indexOf("e");                          

        while(indeks!=-1){                                       

            nyTekst.append(tekst.substring(0,indeks));            
            tekst= tekst.substring(indeks+1);           
            indeks= tekst.indexOf("e");

        }

        nyTekst.append(tekst);                                     
        return nyTekst.toString();

    }
}
