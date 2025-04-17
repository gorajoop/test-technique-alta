package fr.altaprofits.exercice.vehicule;

import fr.altaprofits.exercice.Point;

public class Moto implements Vehicule {
    private static Integer idIndex = 0;
    private final String refMoto;
    private Point position;

    public Moto() {
        position = new Point(0, 0);
        refMoto = "M-" + ++idIndex;
    }

    @Override
    public Integer getId() {
        return idIndex;
    }

    @Override
    public String getType() {
        return "Moto";
    }

    @Override
    public void seDeplace(int x, int y) {
        roule(new Point(x, y));
    }

    @Override
    public boolean peutVoler() {
        return false;
    }

    @Override
    public boolean peutNaviguer() {
        return false;
    }

    @Override
    public boolean peutRouler() {
        return true;
    }

    private void roule(Point destination) {
        System.out.printf(
                "Véhicule de type moto (Ref : %s), se déplace de la position %s vers %s\n", refMoto,
                position, destination);
        position = destination;
    }
}
