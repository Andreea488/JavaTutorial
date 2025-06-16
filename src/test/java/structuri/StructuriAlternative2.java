package structuri;

import org.testng.annotations.Test;

public class StructuriAlternative2 {
   @Test
    public void testMethod(){
       zileSaptamana(4);
       zileSaptamana(9);
       cosFructe("mar");
       cosFructe("cireasa");

   }

   //afisam o zi a saptamanii in functie de cifra introdusa
    public void zileSaptamana(int zi){
       switch (zi){
           case 1:
               System.out.println("astazi este luni");
               break;
           case 2:
               System.out.println("astazi este marti");
               break;
           case 3:
               System.out.println("astazi este miercuri");
               break;
           case 4:
               System.out.println("astazi este joi");
               break;
           case 5:
               System.out.println("astazi este vineri");
               break;
           case 6:
               System.out.println("astazi este sambata");
               break;
           case 7:
               System.out.println("astazi este duminica");
               break;
           default:
               System.out.println("nu exista aceasta zi din saptamana");
       }
    }

    //afisam un fruct specific dintr un cos cu fructe

    public void  cosFructe(String fruct){
       switch (fruct){
           case "mar":
               System.out.println("in cosul cu fructe este un mar");
               break;
           case "para":
               System.out.println("in cosul cu fructe este o para");
               break;
           case "struguri":
               System.out.println("in cosul cu fructe sunt struguri");
               break;
           default:
               System.out.println("nu avem fructe in cos");
       }
    }
}
