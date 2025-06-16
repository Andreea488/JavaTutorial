package teme;

public class Tenisman {


    public String nume;
    public String prenume;
    public int varsta;
    public int aniExperienta;
    public int nrTrofee;
    public boolean joacaDublu;
    public int titluri;

    public Tenisman(String nume, String prenume, int varsta, int aniExperienta, int nrTrofee, boolean joacaDublu, int titluri) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.aniExperienta = aniExperienta;
        this.nrTrofee = nrTrofee;
        this.joacaDublu = joacaDublu;
        this.titluri=titluri;
    }

    public void prezentareTenisman() {
        System.out.println("Numele este: " + nume);
        System.out.println("Prenumele este: " + prenume);
        System.out.println("Varsta este: " + varsta);
        System.out.println("Ani de experienta: " + aniExperienta);
        System.out.println("Numarul de trofee este de: " + nrTrofee);
        System.out.println("Joaca la dublu: " + joacaDublu);
        if (titluri > 5) {
            System.out.println("Numarul de titluri castigate in primii 3 ani este: " + titluri);
        }
    }

    public void prezentareTitluri() {
        if (5 < titluri && titluri <= 20) {
            System.out.println("In 10 ani de cariera a castigat: " + titluri);
        }

        if (titluri > 20) {
            System.out.println("Total titluri in cariera: " + titluri);
        }
    }
}


