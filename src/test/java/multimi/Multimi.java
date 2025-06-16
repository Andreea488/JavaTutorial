package multimi;

import org.testng.annotations.Test;

import java.lang.module.FindException;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class Multimi {
    //multimi= array- merge cu lenght, list(arraylist), -merge cu size, map

    @Test
    public void testMethod() {
        //colegiCurs();
        //multimeFructe();
        //multimeFructeLista();
        //colegiCurs();
        //obiectiveTuristice();
        //obiectiveTuristiceV2();
        //obiectiveTuristiceV3();
        obiectiveTuristiceV4();
    }
    //afisam numele colegilor de la curs
    public void colegiCurs() {
        String[] colegi = new String[10];
        colegi[0] = "Mihai";
        colegi[1] = "Alex";
        colegi[2] = "Roxana";
        colegi[3] = "Radu";
        colegi[4] = "Virgil";

        //String[] colegi = {"Mihai", "Alex", "Roxana", "Radu", "Virgil"};
        for (int index = 0; index < colegi.length; index++) {
            System.out.println("numele colegului este: " + colegi[index]);
        }
    }

    public void colegiCursV2(){
        List<String> colegi=new ArrayList<>();
        colegi.add("Andrei");
        colegi.add("Maria");
        colegi.add("Ion");
        for (int index=0; index<colegi.size(); index++){
            System.out.println("COlegii de la curs sunt: "+ colegi.get(index));
        }
    }

    //afisam o multime de fructe
    public void multimeFructe() {
        String[] fruct = new String[3];
        fruct[0] = "mar";
        fruct[1] = "para";
        fruct[2] = "strugure";
        fruct[3] = "mango";
        for (int index = 0; index < fruct.length; index++) {
            System.out.println("Fructele sunt: " + fruct[index]);
        }
    }

    //afisam o multime de fructe -V2 lista
    public void multimeFructeLista() {
        List<String> fructe = new ArrayList<>();
        fructe.add("mar");
        fructe.add("para");
        fructe.add("strugure");
        fructe.add("mango");
        for (int index = 0; index < fructe.size(); index++) {
            System.out.println("Fructele sunt: " + fructe.get(index));
        }
    }

    //afisam niste obiective turistice alaturi de orasele in care se afla
    //map= key-value, key este unic
    public void obiectiveTuristice(){
        Map<String,String> obiective=new HashMap<>();
        obiective.put("Paris","Turn Effel");
        obiective.put("Constanta","Casino");
        obiective.put("Brasov","Piata");
        obiective.put("Roma","Panteon");
        obiective.put("Barcelona","Sagrada");
        obiective.put("Berlin", "Zid");
        for (String key: obiective.keySet()){
            System.out.println("orasul curent este: " + key );
            System.out.println("obiectivul din oras este: " + obiective.get(key));
        }
    }
    public void obiectiveTuristiceV2() {
        Map<String, String> obiective = new LinkedHashMap<>();
        obiective.put("Paris", "Turn Effel");
        obiective.put("Constanta", "Casino");
        obiective.put("Brasov", "Piata");
        obiective.put("Roma", "Panteon");
        obiective.put("Barcelona", "Sagrada");
        obiective.put("Berlin", "Zid");
        for (String key : obiective.keySet()) {
            System.out.println("orasul curent este: " + key);
            System.out.println("obiectivul din oras este: " + obiective.get(key));
        }
    }
    public void obiectiveTuristiceV3() {
        Map<String, List<String>> obiective = new LinkedHashMap<>();
        obiective.put("Paris",Arrays.asList("Turn Efel", "S.Elise","Luvru"));
        obiective.put("Constanta",Arrays.asList("Casino","Biserica" ));
        obiective.put("Brasov", Arrays.asList("Piata", "Biserica Neagra"));
        obiective.put("Roma",Arrays.asList ("Panteon","Coloseum"));
        obiective.put("Barcelona",Arrays.asList ("Sagrada","Casa Batalo"));
        obiective.put("Berlin",Arrays.asList ("Zid","Catedrala"));
        for (String key : obiective.keySet()) {
            System.out.println("orasul curent este: " + key);
            System.out.println("obiectivele din oras este: " + obiective.get(key));
        }
    }
    public void obiectiveTuristiceV4(){
        Map<String, Map<String, List<String>>> obiective=new LinkedHashMap<>();

        Map<String, List<String>> oraseobiectiveFranta = new LinkedHashMap<>();
        oraseobiectiveFranta.put("Paris",Arrays.asList("Turn Efel", "S.Elise","Luvru"));
        oraseobiectiveFranta.put("Lyon",Arrays.asList("Casino","Biserica" ));
        oraseobiectiveFranta.put("Nice", Arrays.asList("Piata", "Biserica Neagra"));

        Map<String, List<String>> oraseobiectiveItalia = new LinkedHashMap<>();
        oraseobiectiveItalia.put("Roma",Arrays.asList("Turn Efel", "S.Elise","Luvru"));
        oraseobiectiveFranta.put("Milano",Arrays.asList("Casino","Biserica" ));
        oraseobiectiveItalia.put("Nice", Arrays.asList("Piata", "Biserica Neagra"));

        Map<String, List<String>> oraseobiectiveSpania = new LinkedHashMap<>();
       oraseobiectiveSpania.put("Barcelona",Arrays.asList("Turn Efel", "S.Elise","Luvru"));
       oraseobiectiveSpania.put("Madrid",Arrays.asList("Casino","Biserica" ));
       oraseobiectiveSpania.put("Seville", Arrays.asList("Piata", "Biserica Neagra"));

       obiective.put("Franta", oraseobiectiveFranta);
       obiective.put("Italia", oraseobiectiveItalia);
       obiective.put("Spania", oraseobiectiveSpania);
        for (Map.Entry<String, Map<String, List<String>>> taraEntry : obiective.entrySet()) {
            String tara = taraEntry.getKey();
            //System.out.println("Țara: " + tara);

            Map<String, List<String>> orase = taraEntry.getValue();
            for (Map.Entry<String, List<String>> orasEntry : orase.entrySet()) {
                String oras = orasEntry.getKey();
                // System.out.println("  Oraș: " + oras);

                List<String> obiectiveOras = orasEntry.getValue();
                for (String obiectiv : obiectiveOras) {
                    // System.out.println("    - " + obiectiv);
                    System.out.println("Țara: " + tara +"  Oraș: " + oras +" Obiectiv:  " + obiectiv );

                }
            }
        }
    }

    }
