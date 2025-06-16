package teme;

public class Fotbalist {

    public String nume;
    public String prenume;
    public int varsta;
    public String echipa;
    public int numarTricou;
    public String tara;
    public int aniExperienta;
    public int numarMeciuri;
    public int goluri;
    public int campionate;

    public Fotbalist(String nume, String prenume, int varsta, String echipa, int numarTricou, String tara, int aniExperienta, int numarMeciuri, int goluri, int campionate) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.echipa = echipa;
        this.numarTricou = numarTricou;
        this.tara = tara;
        this.aniExperienta = aniExperienta;
        this.numarMeciuri = numarMeciuri;
        this.goluri = goluri;
        this.campionate = campionate;
    }

    public void prezentarFotbalist() {
        System.out.println("Numele sportivului este: " + nume);
        System.out.println("Prenumele sportivului este: " + prenume);
        System.out.println("Varsta este: " + varsta);
        System.out.println("Echipa din care a facut parte: " + echipa);
        System.out.println("Numar tricou: " + numarTricou);
        System.out.println("Tara: " + tara);
        System.out.println("Total ani de experienta: " + aniExperienta);
        System.out.println("Numarul de meciuri: " + numarMeciuri);
        System.out.println("Numarul de goluri: " + goluri);
        if (campionate > 0) {
            System.out.println("Numarul de inceput de campionate este: " + campionate);

        }
    }

    public void prezentareCampionate() {
        if (campionate < 4) {
            System.out.println("Numarul mediu de campionate este: " + campionate);
        }
        if (campionate>=4) {
            System.out.println("Este primul din istoria fotbalului cu campionate: " + campionate);
        }
    }
}
