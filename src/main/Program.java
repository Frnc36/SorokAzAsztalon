package main;

public class Program {

    public static void main(String[] args) {
        //Sor s = new Sor(4.5, 3.0, "fekete");
        //System.out.println(s.sorJellemzo());
        System.out.println("=== Sör Jellemzői ===");
        Asztal a = new Asztal();
        //a.felvesz(s);
        a.felvesz(new Sor(6.5, 2.5, "sötét")); //1. sör
        a.felvesz(new Sor(5.2, 3.1, "barna")); //2. sör
        a.felvesz(new Sor(4.5, 3.3, "világos")); //3. sör
        a.felvesz(new Sor(7.5, 6.5, "barna")); //4. sör

        System.out.println("");

        System.out.println("=== Asztal ===");
        a.megjelenites();

    }//main

}//class
