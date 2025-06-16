package teme;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CarteRetete {


    @Test
    public void carteDeRetete() {
        Map<String, List<String>> retete = new LinkedHashMap<>();
        retete.put("Caramel", Arrays.asList("350g zahar", "370ml frisca lichida","70g glucoza", "100g unt", "100g ciocolata alba"));
        retete.put("Crema finisare", Arrays.asList("400g unt la temp camerei", "400g zahar pudra","1 kg de crema de branza","esenta /aroma vanilie","ganaj de ciocolata alba 1 la 2 (2 parti de cioco si o parte frisca)" ));
        retete.put("Clatite", Arrays.asList("2 oua","125ml apa", "125ml lapte","125gr faina","15g zahar", "15ml ulei"));
        for (String key : retete.keySet()) {
            System.out.println("Reteta este pentru: " + key);
            System.out.println("Ingredientele din reteta sunt: " + retete.get(key));
        }
    }
}
