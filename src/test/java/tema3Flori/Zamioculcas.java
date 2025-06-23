package tema3Flori;

import java.util.List;

public class Zamioculcas extends Floare {

    public List<String> intretinere;
    public Zamioculcas(String tip, String sezon, boolean deGradina, boolean salbatica, boolean perena, String culoare, int nrSpecii, String provenienta, List<String> intretinere) {
        super(tip, sezon, deGradina, salbatica, perena, culoare, nrSpecii, provenienta);
        this.intretinere = intretinere;
    }
    public void prezentareZamioculcas(){
        prezentareFloare();
        System.out.println("Intretinerea se face prin: ");
        for (int i=0; i< intretinere.size(); i++){
            System.out.println(i + ". " + intretinere.get(i));
        }
    }
}
