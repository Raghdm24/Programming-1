package Assignment5;

public class Question2 {
    public static void main(String[] args) {

        MyRandom randomGenerator =new MyRandom();

        System.out.println("Tester nesteHeltall");
        for( int i =0; i<10;  i++){
            int helTall= randomGenerator.nesteHeltall(10,20);
            System.out.println("Tilfeldig heltall: "+helTall);
        }

        System.out.println("\nTester nesteDesimalTall");
        for( int i =0; i<10;  i++){
            double desimalTall= randomGenerator.nesteDesimaltall(0.5,5.5);
            System.out.println("Tilfeldig desimalTall: "+desimalTall);

        }

    }
}
