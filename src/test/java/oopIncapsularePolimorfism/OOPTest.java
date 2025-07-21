package oopIncapsularePolimorfism;

import org.openqa.selenium.bidi.log.Log;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OOPTest {


    @Test
    public void testMethod() {
        List<String> dotariExterioareLogan = Arrays.asList("Senzori parcare", "camera video", "jante 18");
        Dacia Logan = new Dacia("Dacia", "Logan", "alb", 100, 10000, dotariExterioareLogan);
        Logan.prezentareComandaDacia();
        System.out.println();

//        Logan.model = "Sandero";
//        Logan.culoare = "Rosu";
//        Logan.pret = 10;
//        Logan.dotariExterioare = new ArrayList<>();

        Logan.setCuloare("Rosu");
        Logan.setModel("Sandero");

        Logan.prezentareComandaDacia();
        Logan.pornesteMotor();
        System.out.println();
        Logan.procesarePlata();
        Logan.procesarePlata(true);
        Logan.procesarePlata(10);

//         System.out.println();

//        Logan.setCuloare("Rosu");
//        Logan.setModel("Sandero");
//        //      Logan.setDotariExterioare();

//        Logan.procesarePlata(true);
//        Logan.procesarePlata(10);

//        List<String> dotariInterioareF1 = Arrays.asList("incalzire in scaune", "bord de piele", "jante 18");
//        List<String> dotariExterioareF1 = Arrays.asList("camera video", "jante 18");
//        McLaren mclarenf1= new McLaren("McLaren", "F1", "albastru", 300, 50000, dotariInterioareF1, dotariExterioareF1);
//
//        mclarenf1.prezentareComandaMcLaren();
//        mclarenf1.pornesteMotor();

//        F1.prezentareComandaMcLaren();
//        F1.pret=10;
//        F1.culoare="negru";
//        F1.prezentareComandaMcLaren();
//
    }

}
