package teme;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DestinatiedeConcediu {
    private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("d.MM.yyyy");

    public String tara;
    public String oras;
    public int buget;
    public double costuriSuplimentare;
    public String moneda;
    public String metodedePlata;
    public String mijlocdeTransport;
    public double distanta;
    public float distantaDeLaAeroportLaCazare;
    public String unitatedeMasura;
    public int numardeZile;
    public int numarPersoane;
    public String facilitatiCazare;
    public String ItinerariuExcursiiLaAlegere;
    public LocalDate dataPlecarii;
    public LocalDate dataIntoarcerii;
    public String DatadePlecaresiIntorcere;
    public boolean CuOferta;

    @Test
    public void prezentareConcediu(){
        tara="Spania";
        oras="Malaga";
        buget=1000;
        costuriSuplimentare=555.5;
        moneda="euro";
        metodedePlata="card";
        mijlocdeTransport="avion";
        distanta=2561.01;
        distantaDeLaAeroportLaCazare=8.5f;
        unitatedeMasura="km";
        numardeZile=7;
        numarPersoane=2;
        facilitatiCazare="wi-fi, parcare, masina de spalat, frigider";
        ItinerariuExcursiiLaAlegere="verifici pe internet locurile de vizitare";
        LocalDate departure   = LocalDate.of(2026, 6, 6);
        LocalDate returnDate  = LocalDate.of(2025, 6, 13);
        DatadePlecaresiIntorcere= "6.06.2026-13.06.2026";
        CuOferta=false;
        dataPlecarii    = LocalDate.of(2026, 6, 6);
        dataIntoarcerii = LocalDate.of(2026, 6, 13);

        System.out.println("tara:" + tara);
        System.out.println("oras: " + oras);
        System.out.println("buget: " + buget);
        System.out.println("costurile suplimentare sunt: " + costuriSuplimentare);
        System.out.println("moneda este in valuta: " + moneda);
        System.out.println("metoda de plata: " + metodedePlata);
        System.out.println("mijlocul de transport: " + mijlocdeTransport);
        System.out.println("distanta este: " + distanta);
        System.out.println("distanta de la aeroport la cazare este: " + distantaDeLaAeroportLaCazare);
        System.out.println("unitatea de masura: " + unitatedeMasura);
        System.out.println("numarul de zile alocat: " + numardeZile);
        System.out.println("calatoria este facuta pentru un numar de persoane: " + numarPersoane);
        System.out.println("facilitatile cerute pentru cazare: " + facilitatiCazare);
        System.out.println("itinerariul ales este in functie de: " + ItinerariuExcursiiLaAlegere);
        System.out.println("data plecarii: " + dataPlecarii);
        System.out.println("data intoarcerii: " + dataIntoarcerii);
        System.out.println("data de plecare si intoarcere: "+ DatadePlecaresiIntorcere);
        System.out.println("concediul s-a cautat cu oferta?: " + CuOferta);
        System.out.println("Data plecarii:    " + dataPlecarii.format(FMT));
        System.out.println("Data intoarcerii: " + dataIntoarcerii.format(FMT));
        System.out.println("Perioada:         " +
                        dataPlecarii.format(FMT) + "-" +
                        dataIntoarcerii.format(FMT) );
    }
}