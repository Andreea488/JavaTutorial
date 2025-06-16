package teme;

public class Baschetbalist {

    public String nume;
    public String prenume;
    public int varsta;
    public String echipa;
    public int aniExperienta;
    public int puncteMarcate;
    public int campionate;

    public Baschetbalist(String nume, String prenume, int varsta, String echipa, int aniExperienta, int puncteMarcate, int campionate) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.echipa = echipa;
        this.aniExperienta = aniExperienta;
        this.puncteMarcate = puncteMarcate;
        this.campionate=campionate;
    }

    public void prezentareBaschetbalist() {
        System.out.println("Nume baschetbalist: " + nume);
        System.out.println("Prenume baschetbalist: " + prenume);
        System.out.println("Varsta este: " + varsta);
        System.out.println("Echipa din care a facut parte: " + echipa);
        System.out.println("Ani de experianta: " + aniExperienta);
        System.out.println("Puncte marcate: " + puncteMarcate);
        if (campionate > 0) {
            System.out.println("Numarul de inceput de campionate este: " + campionate);
        }
    }

    public void prezentareCampionate() {
        if (campionate < 1) {
            System.out.println("Numarul mediu de campionate este: " + campionate);
        }
        if (campionate >= 2) {
            System.out.println("Campioonate castigate:" + campionate);
        }
    }
}