package abstractizareExemplu;

public class RestaurantMixt extends Restaurant implements RestaurantVeganInterface, RestaurantNonVeganInterface{
    public RestaurantMixt(String nume, String adresa) {
        super(nume, adresa);
    }

    @Override
    public void meniu() {
        System.out.println("Tipul meniului este non vegan");
    }

    @Override
    public void servireBurger() {
        System.out.println("La restaurant se serveste burger");
    }

    @Override
    public void servireHumus() {

    }

}
