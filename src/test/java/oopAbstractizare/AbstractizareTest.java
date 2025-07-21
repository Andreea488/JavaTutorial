package oopAbstractizare;

import org.testng.annotations.Test;

public class AbstractizareTest {

    @Test
    public void methodTest(){
        AngajatFullTime alex = new AngajatFullTime("Dorha", "Alex", 30, "Endava");
        alex.mergeInConcediu();

        AngajatPartTime alexs = new AngajatPartTime("Dorha22", "Alexs", 29,  "patron");
        alexs.mergeInConcediu();
    }
}
