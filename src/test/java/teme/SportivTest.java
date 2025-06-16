package teme;

import org.testng.annotations.Test;

public class SportivTest {


    @Test
    public void testMethod(){
    Fotbalist fotbalistSportiv= new Fotbalist("Hagi", "Gheorghe",60, "Steaua", 10, "Romania", 20, 697, 35, 7);
    fotbalistSportiv.prezentarFotbalist();
    fotbalistSportiv.prezentareCampionate();
        System.out.println();


        Tenisman tenismanSportiv= new Tenisman("Halep", "Simona", 33, 16, 25, true, 27);
        tenismanSportiv.prezentareTenisman();
        tenismanSportiv.prezentareTitluri();
        System.out.println();

        Baschetbalist baschetbalistSportiv= new Baschetbalist("Muresan", "Ghita", 54, "Universitatea Cluj", 10, 42, 3);
        baschetbalistSportiv.prezentareBaschetbalist();
        baschetbalistSportiv.prezentareCampionate();
    }

}



