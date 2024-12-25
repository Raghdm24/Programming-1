package Assignment6;

public class Question3 {
    public static void main(String[] args) {

        int[][] data1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] data2 = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        int[][] data3 = {
                {1, 1, 1},
                {1, 1, 1},
        };

        // Oppretter Matrise-objekter
        Matrise matrise1 = new Matrise(data1);
        Matrise matrise2 = new Matrise(data2);
        Matrise matrise3 = new Matrise(data3);


        //Addisjon
        Matrise sum = matrise1.addMatrise(matrise3);
        if(sum!= null){             // addisjonen var vellykket og at resultatet er en gyldig matrise.
            System.out.println("Summen av matrise 1 og 2 er:" + sum );
        }else {
            System.out.println("Addisjon er ikke mulig");
        }

        //multiplikasjon
        Matrise produkt= matrise1.addMatrise(matrise2);
        if(produkt!= null){
            System.out.println("Produktet av matrise 1 og 2 er:" + produkt);
        }else {
            System.out.println("Multiplikasjon er ikke mulig");
        }

        //Test av transponering
        Matrise transponering= matrise1.transponereMatrisen();
        System.out.println("Transponert matrise 1 er:"+ transponering);

    }
}
