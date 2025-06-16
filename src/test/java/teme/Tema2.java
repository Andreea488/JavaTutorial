package teme;

import org.testng.annotations.Test;

public class Tema2 {

    @Test
    public void tema2() {

        //setCuvantDa();
        //primeleNumere();
        //numarulMaimare(15,20);
        //numarulMaimic(4.5d, 3.25d);
        // numereParesiImpare(1,10);
        //numerePare();
        //numereDivizibile(1,20);
        //primeleNNumereDivizibileCu5(0, 50, 5);
        //suma(235,10);
        //sumaNumerelor(0, 10);
        produsulNumerelor(1,5);
    }

    //1. Afisam in consola de 5 ori cuvantul "DA" pe acelasi rand cu un spatiu intre;
    public String cuvantDa;
    public String spatiu;

    public void setCuvantDa() {
        cuvantDa = "DA";
        spatiu = " ";
        System.out.println("Afisam in consola de 5 ori cuvantul DA pe acelasi rand cu un spatiu intre: " + cuvantDa + spatiu + cuvantDa + spatiu + cuvantDa + spatiu + cuvantDa + spatiu + cuvantDa);
    }

    //2. Afisam in consola primele 3 numere de la 1 la 3;
    public void primeleNumere() {
        for (int index = 1; index <= 3; index++) {
            System.out.println("Primele 3 numere: " + index);
        }
    }

    //3. Afisam in consola numarul cel mai mare dintre 15 si 20; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
    public void numarulMaimare(int numar1, int numar2) {
        if (numar1 > numar2) {
            System.out.println("Numarul mai mare dintre " + numar1 + " si " + numar2 + " este " + numar1);
        } else {
            System.out.println("Numarul mai mare dintre " + numar1 + " si " + numar2 + " este " + numar2);
        }
    }

    //4. Afisam in consola numarul cel mai mic dintre 4.5 si 3.25; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
    public void numarulMaimic(double numar1, double numar2) {
        if (numar1 < numar2) {
            System.out.println("Numarul mai mare dintre " + numar1 + " si " + numar2 + " este " + numar1);
        } else {
            System.out.println("Numarul mai mare dintre " + numar1 + " si " + numar2 + " este " + numar2);
        }
    }

    //5. Afisam in consola numerele pare si numerele impare pana la 10 (utilizam "for");
    public void numereParesiImpare(int inceput, int sfarsit) {
        for (int index = inceput; index <= sfarsit; index++) {
            if (index % 2 == 0) {
                System.out.println("Numarul " + index + " este par");
            } else {
                System.out.println("Numarul " + index + " este impar");
            }
        }
    }

    //6. Afisam in consola doar numerele pare pana la 10 (utilizam "for");
    public void numerePare() {
        for (int index = 1; index <= 10; index++) {
            if (index % 2 == 0) {
                System.out.println("Numerele pare sunt: " + index);
            }
        }
    }

    //7. Afisam in consola numerele divizibile cu 5; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
    public void numereDivizibile(int inceput, int sfarsit) {
        for (int index = inceput; index <= sfarsit; index++) {
            if (index % 5 == 0) {
                System.out.println("Numerele divizibile cu 5 sunt: " + index);
            }
        }
    }

    //8. Afisam in consola primele 3 numere dibizibile cu 5; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
    public void primeleNNumereDivizibileCu5(int inceput, int sfarsit, int n) {
        int counter = 0;
        for (int index = inceput; index <= sfarsit; index++) {
            if (index % 5 == 0) {
                System.out.println("primele 3 numere divizibile cu 5: " + index);
                counter++;
            }
            if (counter == n) {
                break;
            }
        }

    }
    //9. Afisam in consola suma a doua numere 235 si 10; Se vor declara variabile LOCALE;
    public void suma(int numar1, int numar2) {
        int suma = numar1 + numar2;
        System.out.println("Suma este: " + suma);

    }

    //10. Afisam in consola suma numerelor pana la 10 (int suma=0); Se vor declara variabile LOCALE;
    public void sumaNumerelor(int ineput, int sfarsit) {
        int suma = 0;
        for (int index = 0; index <= 10; index++) {
            suma = suma + index;
        }
        System.out.println("Suma numerelor este: " + suma);
    }
//11. Afisam in consola produsul numerelor pana la 5; Se vor declara variabile LOCALE;
public void produsulNumerelor(int inceput, int sfarsit){
        int produsul=1;
        for (int index= 1; index<=5; index++) {
            produsul = produsul * index;
        }
    System.out.println("produsul este: "+ produsul);
        }
}



