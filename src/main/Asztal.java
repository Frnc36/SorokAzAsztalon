package main;

import java.util.Arrays;

public class Asztal {

    private int darab;
    private static final int MAXSOR = 4;
    private Sor[] sorok;

    public Asztal() {
        this.darab = 0;
        sorok = new Sor[MAXSOR];
    }

    public Asztal(Sor sor) {

    }

    public Asztal(Sor[] sorok) {
        this.sorok = sorok;
    }

    public int getDarab() {
        return darab;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + this.darab;
        hash = 61 * hash + Arrays.deepHashCode(this.sorok);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Asztal other = (Asztal) obj;
        if (this.darab != other.darab) {
            return false;
        }
        return Arrays.deepEquals(this.sorok, other.sorok);
    }

    @Override
    public String toString() {
        return "Asztal{" + "darab=" + darab + ", sorok=" + sorok + '}';
    }

    public void felvesz(Sor sor) {
        if (darab < MAXSOR) {
            sorok[darab] = sor;
            darab++;
            System.out.println(darab + ". " + sor.sorJellemzo());
        } else {
            System.out.println("Csak 4 sör lehet");
        }
    }

    public void megjelenites() {
        /*  switch(darab) {
            case 0: System.out.print("    "); break;
         */
        if (darab > 4) {
            System.out.println("Nincs hely az asztalon.");
        } else {
            switch (darab) {
                case 0:
                    System.out.println(darab + " sor az asztalon.");
                    System.out.println("|   |");
                    System.out.println("|   |");
                    break;
                case 1:
                    System.out.println(darab + " sor az asztalon.");
                    System.out.println("|o  |");
                    System.out.println("|   |");
                    break;
                case 2:
                    System.out.println(darab + " sor az asztalon.");
                    System.out.println("|o o|");
                    System.out.println("|   |");
                    break;
                case 3:
                    System.out.println(darab + " sor az asztalon.");
                    System.out.print("|o o|\n|o  |\n");
                    break;
                case 4:
                    System.out.println(darab + " sor az asztalon.");
                    System.out.print("|o o|\n");
                    System.out.print("|o o|\n");
                    System.out.println("Az asztal tele.");
                    break;
                default:
                    System.out.println("????");
            }
        }

    }

}//class
