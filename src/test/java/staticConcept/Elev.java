package staticConcept;

public class Elev {

    //static reprezinta o modalitate prin care putem accesa o variabila/metoda dintr-o clasa
    //in momentul cand folosim acest keyword nu mai este nevoie sa facem un obiect
    //putem considera acest concept ca fiind proprietatea comuna pt toate obiectele

    public String nume;
    public String prenume;
    public static String scoala = "Liceul Mihai Eminescu";
    public static int nrEcuson=0;

    public Elev(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
        nrEcuson++;

    }
    public void prezentareElev(){
        System.out.println("Numele elevului este: "+ nume);
        System.out.println("Prenumele elevului este: "+ prenume);
        System.out.println("Scoala unde invata: "+ scoala);
        System.out.println("Numarul ecusonului este: "+nrEcuson);
    }
}
