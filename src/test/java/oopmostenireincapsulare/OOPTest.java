package oopmostenireincapsulare;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class OOPTest {

    @Test
    public void testMethod(){
        List<String> dotariExterioareLogan= Arrays.asList("Senzori parcare", "camera video", "jante 18");
        Dacia Logan = new Dacia("Dacia", "Logan", "alb", 100, 10000, dotariExterioareLogan);
        Logan.prezentareComandaDacia();
        System.out.println();

        List<String> dotariInterioareF1= Arrays.asList("incalzire in scaune", "bord de piele", "jante 18");
        List<String> dotariExterioareF1= Arrays.asList("camera video", "jante 18");
        McLaren F1= new McLaren("McLaren","F1", "albastru", 300, 50000, dotariInterioareF1, dotariExterioareF1);
        F1.prezentareComandaMcLaren();
        F1.pret=10;
        F1.culoare="negru";
        F1.prezentareComandaMcLaren();

    }
}
