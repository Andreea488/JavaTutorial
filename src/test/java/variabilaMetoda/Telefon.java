package variabilaMetoda;

import org.testng.annotations.Test;

public class Telefon {
    public String model;
    public String marca;
    public String culoare;
    public double pret;
    public String caracteristici;

    @Test
    public void testMethod(){
        prezentareTelefon("16 Pro Max","Iphone","negru",12.43,"stare buna");
        discountTelefon();
        System.out.println();
        prezentareTelefon("14 Pro Max","Iphone","negru",12.43,"in reparatii");
        System.out.println();
        prezentareTelefon("S24","Samsung","negru",12.43,"stare critica");
    }

    //metodele pot sau nu sa contina parametri
    //scopul parametrilor este sa defineasca intr un mode generic o anumita actiune
    //o metoda poate avea unul sau mai multi parametrii delimitati prin virgula
    //un parametru trebuie sa contina tipul de data si numele acesteia
    public void prezentareTelefon(String param1,String param2,String param3,double param4,String param5){
        model=param1;
        marca=param2;
        culoare=param3;
        pret=param4;
        caracteristici=param5;

        System.out.println("Modelul telefonului este "+model);
        System.out.println("Marca telefonului este "+marca);
        System.out.println("Culoarea telefonului este "+culoare);
        System.out.println("Pretul telefonului este "+pret);
        System.out.println("Caracteristicile telefonului sunt "+caracteristici);
    }

    //exemplu variabila locala
    public void discountTelefon(){
        int discount=10;
        System.out.println("pretul initial al telefonului este "+pret);
        double pretFinal=pret-(pret*discount)/100;
        System.out.println("noul pret al telefonului este "+pretFinal);

    }

}
