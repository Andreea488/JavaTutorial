package teme;

import org.testng.annotations.Test;

public class Tema1 {

    //1. Hello World
    public String mesaj;

    //2. Varsta ta (numar)
    public int varsta;

    //3. Numele si prenumele pe 2 randuri
    public String nume;
    public String prenume;

    //4. Adauga la "Salut" caracterul "M" la final
    public String Salut;

    //5. Adauga la "Hello" caracterul "H" la inceput
    public String Hello;

    //6. Adauga la "Ana are mere,pere,prune" dupa fiecare vocala de la finalul cuvantului caracterul "Z"
    public String text;
    public char caracterZ;
    public String dupaFiecareVocala;

    //7. Adauga la toate rezultatele obtinute " Poti pleca acasa dupa ce iti verific munca!"
    public String textFinal;

    //8. Afisam in consola salariul unui angajat daca acesta are prenumele Andrei;
    public int salariu;
    public String prenumeAngajat;

    //9. Afisam in consola ID de angajat si Departamentul din care face parte un angajat daca numele acestuia este "Popescu"
    public int IDangajat;
    public String departament;
    public String numeAngajat;

   //10. Utilizand o metoda cu parametrii afisati numarul unui departament daca acesta este mai mare de 287;
    public int numarDepartament;

    //  Rezultatul corect este: {rezultatul}
    public boolean rezultatCorect;

//    public int Ecuatie;
//    double rezultatFinal;

    @Test
    public void tema1(){
        parteTema1();
        ecuatieConsola();
        afisareNrdepartament(287,290);
        afisarePopescu();
    }
    public void parteTema1() {
        mesaj="Hello World";
        varsta=37;
        nume="Popescu";
        prenume="Ana";
        Salut="SalutM";
        Hello="HHello";
        text="Ana are mere,pere,prune";
        caracterZ='Z';
        dupaFiecareVocala="Ana are mere,pere,prune";
        textFinal=" Poti pleca acasa dupa ce iti verific munca!";
        salariu=3000;
        prenumeAngajat="Andrei";
        IDangajat=10;
        departament="IT";
        numeAngajat="Popescu";
        numarDepartament=287;
        rezultatCorect=true;

        System.out.println("Mesajul de inceput este: " + mesaj+"." + textFinal);
        System.out.println("Varsta ta este: " + varsta +"." + textFinal);
        System.out.println("Numele unui angajat este: "+ nume+"." + textFinal);
        System.out.println("Prenumele unui angajat este: "+ prenume+"." + textFinal);
        System.out.println("Se adauga la final de Salut un M: "+ Salut+"." + textFinal);
        System.out.println("Se adauga un H la inceput de Hello: "+ Hello+"." + textFinal);
        System.out.println("Textul principal este: " + text+"." + textFinal);
        System.out.println("Se adauga Z dupa fiecare vocala din textul principal: "+"A"+caracterZ+"n"+caracterZ + "a"+caracterZ+"r"+"e"+caracterZ + "me"+caracterZ+"re"+caracterZ +","+"pe"+caracterZ+"re"+caracterZ +","+ "pru"+caracterZ+"ne"+caracterZ+"." + textFinal);
        System.out.println("Se adauga dupa fiecare rezultat la final textul: " +textFinal);
        System.out.println("Salariul angajatului este: " +salariu+"." + textFinal);
        System.out.println("Prenumele angajatului este: " +prenumeAngajat+"." + textFinal);
        System.out.println("Id-ul angajatului este: " +IDangajat+"." + textFinal);
        System.out.println("Departamentul din care face parte este: " +departament+"." + textFinal);
        System.out.println("Numele angajatului este: " +numeAngajat+"." + textFinal);
        System.out.println("Numarul departamentului este: " +numarDepartament+"." + textFinal);
        System.out.println("Rezultatul este corect: "+ rezultatCorect);
    }

    //9. Afisam in consola ID de angajat si Departamentul din care face parte un angajat daca numele acestuia este "Popescu"
//public void afisareDate(){}
    public void afisarePopescu(){
        if (numeAngajat=="Popescu"){
            System.out.println("Afisam ID angajat: " + IDangajat + " si nume angajat: "+ numeAngajat + " si departament: " + departament );
        }
    }

    //10. Utilizand o metoda cu parametrii afisati numarul unui departament daca acesta este mai mare de 287;
    public void afisareNrdepartament(int nrdepartament1, int nrdepartament2){
        if(nrdepartament1<nrdepartament2){
            System.out.println("Numarul departamentului mai mare de 287 este: "+ nrdepartament2);
        }

        }

//! BONUS !
    //Afisati in consola rezultatul ecuatiei:[2+(3*4)-3]/3 ?
//  Rezultatul corect este: {rezultatul}
    public void ecuatieConsola(){
        double rezultatFinal=(2d+(3*4)-3)/3;
        System.out.println("S-a afisat rezultatul ecuatiei:" + rezultatFinal);
    }
}



