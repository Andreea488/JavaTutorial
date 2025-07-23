package staticConcept;

import org.testng.annotations.Test;

public class StaticTest {

    @Test

    public void testMethod(){
        Elev Mihai= new Elev("Popescu", "Mihai");
        Mihai.prezentareElev();

       // Elev.scoala = "Scoala de muzica";

        Elev Andrei = new Elev("Ionescu", "Andrei");
        Andrei.prezentareElev();

        Elev Cosmin = new Elev("Moldovan","Cosmin");
        Cosmin.prezentareElev();

    }
}
