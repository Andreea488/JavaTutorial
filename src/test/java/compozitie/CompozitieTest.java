package compozitie;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class CompozitieTest {

    @Test
    public void testMethod(){

        Living livingAndreea = new Living("Camera de zi", 20, "Camera principala din casa", "Samsung Qled", "Canapeaua scumpa", "Masa scumpa si ea");

        Bucatarie bucatarieDeVara = new Bucatarie("Bucatarie de vara", 10, "Bucatarie pt facut mici", "Am aragaz", "am si televizor", "am un frigider mai vechi");
        Bucatarie bucatarieInterior = new Bucatarie("Bucatarie de vara", 15, "Bucatarie pt facut mici", "Am aragaz", "am si televizor", "am un frigider mai vechi");
        List<Bucatarie> bucatarieList = Arrays.asList(bucatarieDeVara, bucatarieInterior);

        Dormitor dormitorAndreea = new Dormitor("dormitor", 20, "dormitor principal", "pat XL", "televizor cu ps5", "nu detin fotoliu", "sunt deschisa la noptiera");
        Dormitor dormitorAndreea2 = new Dormitor("dormitor", 20, "dormitor principal", "pat XL", "televizor cu ps5", "nu detin fotoliu", "sunt deschisa la noptiera");
        List<Dormitor> dormitorList = Arrays.asList(dormitorAndreea, dormitorAndreea2);

        Baie baieExterioara = new Baie("baie exterioara", 5, "baie de serviciu", "nu am spatiu cada", "nu am cabina", "am wc");
        Baie baieInterioara =  new Baie("baie exterioara", 15, "baie interioara", " am spatiu cada", "nu am cabina", "am wc");
        List<Baie> baieList= Arrays.asList(baieInterioara, baieExterioara);

        Casa casaAndreea = new Casa(livingAndreea, bucatarieList, dormitorList, baieList);
        casaAndreea.prezentareGeneralaCasa();

    }
}
