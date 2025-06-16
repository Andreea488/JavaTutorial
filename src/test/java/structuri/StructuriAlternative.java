package structuri;

import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;
import org.testng.annotations.Test;

public class StructuriAlternative {

    //structuri alternative": If (conditie 1...conditie n) Then... Else, Switch...Case
    //putem avea mai multe conditii intre paranteze care se delimiteaza folosind operatorii logici: &&, ||, !
    //nu este obligatoriu ca un if sa aiba Else
    //putem adauga mai multe structuri de tip IF cu ajutorul lui Else folosind Else/ If

    @Test
    public void testMethod() {
//        celMaiMareNumar(56,78);
//        celMaiMareNumar(23,10);
//        celMaiMareNumar(10,79);
//        celMaiMareNumar(33,21);
//        celMaiMareNumar(-20,5);
//        celMaiMareNumar(1,1);
//        celMaiMareNumar(0,-1);
//        celMaiMareNumar(-70,-45);

//        numarPar(2);
//        numarPar(0);
//        numarPar(-1);
//        numarPar(7);
//        numarPar(-6);
//        numarPar(-3);
//        numarPar(1378325897);

//        numarParv2(2);
//        numarParv2(0);
//        numarParv2(-1);
//        numarParv2(7);
//        numarParv2(-6);
//        numarParv2(-3);
//        numarParv2(1378325897);

//        lungimeProla("12345678");
//        lungimeProla("1234567");
//        lungimeProla("123456789101112");
//        lungimeProla("1");
//        lungimeProla("123456789");
//        lungimeProla("1234567891234");
//        lungimeProla("12345678910111128");
//        lungimeProla("");

        // Test cases
        lungimeParolav2("Pa$$w0rd{}[]");  // ✅ Valid password
        lungimeParolav2("WeakPass");       // ❌ No number or special characters
        lungimeParolav2("Short1!");        // ❌ Too short (7 characters)
        lungimeParolav2("TOOLONGPASSWORD1!"); // ❌ Too long (exceeds 15 characters)
        lungimeParolav2("Valid@Pass99");   // ✅ Meets all criteria

    }

    //verificam care este numarul cel mai mare dintre 2 valori
    public void celMaiMareNumar(int nr1, int nr2) {
        if (nr1 > nr2) {
            System.out.println("cel mai mare numar dintre " + nr1 + " si " + nr2 + " este: " + nr1);
        } else {
            System.out.println("cel mai mare numar dintre " + nr1 + " si " + nr2 + " este: " + nr2);
        }
    }

    //verificam daca un nr este par
    //daca vrem sa lucram cu catul unei impartiri folosim / (divide)
    //daca vrem sa lucram cu restul unei impartiri folosim % (modulo)

    public void numarPar(int nr) {
        if (nr % 2 == 0) {
            System.out.println("numarul " + nr + " este par");
        } else {
            System.out.println("Numarul " + nr + " este impar");
        }
    }

    //verificam daca un nr este par si pozitiv
    public void numarParv2(int nr) {
        if (nr % 2 == 0) {
            if (nr > 0) {
                System.out.println("numarul " + nr + " este par si pozitiv");
            } else {
                System.out.println("Numarul " + nr + " este impar si negativ");
            }
        } else if (nr % 2 == 1) {
            if (nr > 0) {
                System.out.println("numarul " + nr + " este impar si pozitiv");
            } else {
                System.out.println("Numarul " + nr + " este impar si negativ");
            }

        } else {
            System.out.println("numarul este egal cu zero");

        }
    }

    //verificam daca lungimea unei parole(valori) este cuprinsa intre 8-15 caractere

    public void lungimeProla(String parola) {
        if (parola.length() >= 8 && parola.length() <= 15) {
            System.out.println("parola " + parola + " are lungimea 8 si 15 caractere");
        } else {
            System.out.println("parola " + parola + " nu are lungimea 8 si 15 caractere");
        }
    }

    //adaugam extra verificari legat de continutul parolei
    //aceste verificari se focuseaza pe faptul ca parola trebuie sa contina un caracter mare o cifra si un caracter special
    public void lungimeParolav2(String parola) {
        if (parola.length() >= 8 && parola.length() <= 15) {
            if (parola.matches(".*[0-9].*") && parola.matches(".*[!@#$%^&*()\"{}\\[\\] ||].*") && parola.matches(".*[A-Z].*")) {
                System.out.println("Parola  "+parola+" este validă și respectă toate criteriile.");
            } else {
                System.out.println("Parola "+parola+" trebuie să conțină cel puțin o cifră, un caracter special (!@#$%^&*()\"{}[]||) și o literă mare.");
            }
        } else {
            System.out.println("Parola "+parola+" nu are lungimea între 8 și 15 caractere.");
        }
    }
}

