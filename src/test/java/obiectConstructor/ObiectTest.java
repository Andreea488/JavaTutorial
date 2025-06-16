package obiectConstructor;

import org.testng.annotations.Test;

public class ObiectTest {


    @Test
    public void testMethod() {
        Masina andreeaAudi = new Masina("Audi", "A4", "10L/100km",
                "rosu", 250, 3000, "60.000km");
        andreeaAudi.prezentareComandaMasina();
        andreeaAudi.taxaGreutate();
        System.out.println();

        Masina andreeaMercedes = new Masina("Mercedes", "CLS", "8L/100km",
                "verde", 200, 5000, "100.000km");
        andreeaMercedes.prezentareComandaMasina();
        andreeaMercedes.culoare="Gri";
        andreeaMercedes.model="Sclass";
        andreeaMercedes.prezentareComandaMasina();
        andreeaMercedes.taxaGreutate();
        System.out.println();

        Masina andreeaOpel = new Masina("Opel", "Corsa", "10L/100km",
                "negru", 100, 2000, "100.000km", 8000);
        andreeaOpel.prezentareComandaMasina();
        andreeaOpel.taxaGreutate();


    }
}
