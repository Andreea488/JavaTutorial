package oopAbstractizare;

public class Student{
    private String nume;
    private String prenume;
    private int varsta;

    public Student(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }
    public void prezentareStudent() {
        System.out.println("Numele studentului este " + nume);
        System.out.println("Prenumele studentului este " + prenume);
        System.out.println("Varsta studentului este " + varsta);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}

