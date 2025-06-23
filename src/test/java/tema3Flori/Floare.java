package tema3Flori;

public class Floare {

    public String tip;
    public String sezon;
    public boolean deGradina;
    public boolean salbatica;
    public boolean perena;
    public String culoare;
    public int nrSpecii;
    public String provenienta;


    public Floare(String tip, String sezon, boolean deGradina, boolean salbatica, boolean perena, String culoare, int nrSpecii, String provenienta) {
        this.tip = tip;
        this.sezon = sezon;
        this.deGradina = deGradina;
        this.salbatica = salbatica;
        this.perena = perena;
        this.culoare = culoare;
        this.nrSpecii = nrSpecii;
        this.provenienta = provenienta;
    }

    public void prezentareFloare(){
        System.out.println("Tipul florii este: "+ tip);
        System.out.println("Sezonul inflorii: " + sezon);
        System.out.println("Este floare de gradina? " + deGradina);
        System.out.println("Este floare salbatica? " + salbatica);
        System.out.println("Culoarea este: " + culoare);
        System.out.println("Numarul aproximativ de specii: " + nrSpecii);
        System.out.println("Provenienta florii: "+ provenienta);
    }
}
