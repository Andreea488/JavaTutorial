package tema3Flori;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class FloareTest {

    @Test
    public void testMethod(){
        List<String> intretinereZamioculcas= Arrays.asList("Udare rara", "ferite de lumina directa a soarelui", "curatare", "ingrasamant");
        Zamioculcas zamioculcas = new Zamioculcas("Zamioculcas zamiifolia", "tot timpul anului", false, true, true, "verde", 1, "Africa", intretinereZamioculcas);
        zamioculcas.prezentareZamioculcas();
        System.out.println();

        List<String> intretinereBrandusa = Arrays.asList("Udare rara", "ferite de lumina directa a soarelui" ,"floare de munte");
        Brandusa brandusa = new Brandusa("Brandusa Crocus", "Primavara si toamna", true, true, true, "multicolora", 90, "Balcani si Romania", intretinereBrandusa);
        brandusa.prezentareBrandusa();
        System.out.println();

        List<String> intretinereMargareta = Arrays.asList("Udare rara", "creste oriunde", "floare de camp", "fara ingrijiri speciale");
        Margareta margareta = new Margareta("Margareta Anthemis", "Primavara", true, true, true, "multicolor", 100, "Regiunea Mediterana si Asia", intretinereMargareta);
        margareta.prezentareMargareta();
        System.out.println();

        List<String> intretinereOrhidee = Arrays.asList("Udare rara", "Curatare", "Ferite de lumina directa a soarelui", "ingrasamant", "in functie de specie");
        Orhidee orhidee = new Orhidee("Orhidee Phalaenopsis", "Primavara si vara", false, true, true, "multicolora", 60, "Asia", intretinereOrhidee);
        orhidee.prezentareOrhidee();
        System.out.println();

        List<String> intretinereTrandafir = Arrays.asList("Udare regulata", "curatare periodica", "la soare", "ingrasamant");
        Trandafir trandafir = new Trandafir("Trandafir Teahibrid","Primavara si toamna", true, false, true, "multicolora", 100, "Franta", intretinereTrandafir);
        trandafir.inmultire= "butasi";
        trandafir.prezentareTrandafir();

    }
}
