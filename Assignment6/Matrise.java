package Assignment6;


public class Matrise {
    int [][] matrise;

    public Matrise(int [][] matriseInput) {
        this.matrise = matriseInput;
    }

    public Matrise addMatrise( Matrise annenMatrise) {
        if(matrise.length != annenMatrise.matrise.length || matrise[0].length != annenMatrise.matrise[0].length) { // antall rader det samme? || antall kolonner det samme
            return null;                            //(metoden avsluttes)
        }

        int [][] resultat= new int[matrise.length][matrise[0].length];  //samme rader og kolonner som den matrisen vi definerte

        for(int i=0; i<matrise.length; i++) {
            for(int j=0; j<matrise[0].length; j++) {
                resultat[i][j] = matrise[i][j] + annenMatrise.matrise[i][j];
            }
        }

        return new Matrise(resultat);
    }

    public Matrise mulMatriser( Matrise annenMatrise) {
        if (matrise[0].length!= annenMatrise.matrise.length) {  //if kolonnr til den første= rader til den andre
            return null;
        }

        int[][] resultat= new int[matrise.length][annenMatrise.matrise[0].length];  //str. til produkt matrise er: [rader til første][kolon til den andre]

        for(int i=0; i<matrise.length; i++) {
            for(int j=0; j<annenMatrise.matrise[0].length; j++) {
                for(int k=0; k<matrise[0].length; k++) {
                    resultat[i][j] = resultat[i][j] + (matrise[i][k] * annenMatrise.matrise[k][j]);
                }
            }
        }
        return new Matrise(resultat);
    }

    public Matrise transponereMatrisen(){
        int [][] transponert= new int[matrise[0].length][matrise.length];  // Dimensjonene byttes
        for(int i=0; i<matrise.length; i++) {           //rader
            for(int j=0; j<matrise[0].length; j++) {    //kolonner
                transponert [j][i]= matrise[i][j];
            }
        }
        return new Matrise(transponert);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                sb.append(matrise[i][j]).append(" "); 
            }
            sb.append("\n"); 
        }
        return sb.toString(); 
    }
}

