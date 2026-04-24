package main;

import java.util.Objects;

public class Sor {

    private double alkoholFok;
    private double mennyiseg; //dl
    private String tipus; //világos vagy barna

    public Sor(double alkoholFok, double mennyiseg, String tipus) {
        this.alkoholFok = alkoholFok;
        setMennyiseg(mennyiseg);
        setTipus(tipus);
    }

    public double getAlkoholFok() {
        return alkoholFok;
    }

    public double getMennyiseg() {
        return mennyiseg;
    }

    public String getTipus() {
        return tipus;
    }

    public void setMennyiseg(double mennyiseg) {
        if (mennyiseg >= 0 && mennyiseg <= 5.0) {
            this.mennyiseg = mennyiseg;
        } else {
            this.mennyiseg = 3.0;
        }
    }

    public void setTipus(String tipus) {
        if (tipus.equals("világos") || tipus.equals("barna")) {
            this.tipus = tipus;
        } else {
            this.tipus = "világos";
            System.err.println("HIBA: '" + tipus + "' nem érvényes típus.");
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.alkoholFok) ^ (Double.doubleToLongBits(this.alkoholFok) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.mennyiseg) ^ (Double.doubleToLongBits(this.mennyiseg) >>> 32));
        hash = 47 * hash + Objects.hashCode(this.tipus);
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
        final Sor other = (Sor) obj;
        if (Double.doubleToLongBits(this.alkoholFok) != Double.doubleToLongBits(other.alkoholFok)) {
            return false;
        }
        if (Double.doubleToLongBits(this.mennyiseg) != Double.doubleToLongBits(other.mennyiseg)) {
            return false;
        }
        return Objects.equals(this.tipus, other.tipus);
    }

    @Override
    public String toString() {
        return "Sor{" + "alkoholFok=" + alkoholFok + ", mennyiseg=" + mennyiseg + ", tipus=" + tipus + '}';
    }

    public String sorJellemzo() {
        return tipus + " sor " + alkoholFok + "% alkohol, " + mennyiseg + " dl";
    }

}//class
