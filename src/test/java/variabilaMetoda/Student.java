package variabilaMetoda;

import org.testng.annotations.Test;

public class Student {
    //acesta este un comentariu
    //clasa=sablon specific unei entitati care contine variabile si metode
    //intr un fisier java recunoastem o clasa dupa cuvantul "class"
    //o clasa trebuie sa aiba un nume
    //variabilele/metodele unei clase se regasesc intre acolade {}
    //intr un fisier java putem avea mai multe clase diferentiate prin nume
    //nu e o practica buna sa avem mai multe clase in java
    //variabila=proprietatea unei clase
    //variabilele pot fi de 2 feluri:globale si locale
    //variabila locala=variabila care este prezenta peste tot in fisierul java
    //variabila globala= public tipvariabila numevariabila
    //o variabila poate sau nu sa primeasca o valoare
    //variabila locala -care este prezenta doar in locul in care a fost definita
    //variabila locala= tipvariabila numevariabila
    //metoda= actiunea unei clase
    //metodele pot sa fie de 2 feluri: void si return
    //metoda void=metoda care afiseaza rezultatul codului scris
    //metoda void= public void numemetoda(){}

    public String nume;
    public String prenume;
    public int varsta;
    public String adresa;
    public double inaltime;
    public float greutate;
    public char sex;
    public boolean areBursa;

    @Test
    public void prezentareStudent() {
        nume = "Iurean";
        prenume = "Andreea";
        varsta = 37;
        adresa = "Str.Drumul Taberei C45 S78 Ap98";
        inaltime = 1.72;
        greutate = 57.9f;
        sex = 'F';
        areBursa = true;

        System.out.println("numele este " + nume);
        System.out.println("prenumele este " + prenume);
        System.out.println("varsta: " + varsta);
        System.out.println("adresa: " + adresa);
        System.out.println("inaltimea: " + inaltime);
        System.out.println("greutate: " + greutate);
        System.out.println("sex: " + sex);
        System.out.println("are bursa?: " + areBursa);





    }

}




