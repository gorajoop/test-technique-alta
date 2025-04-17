package fr.altaprofits.exercice.vehicule;

import fr.altaprofits.exercice.Point;

public class Avion implements Vehicule {
    private static Integer idIndex = 0;
    private final String refAvion;
    private Point position;

    public Avion() {
        position = new Point(0, 0);
        refAvion = "A-" + ++idIndex;
    }

    @Override
    public Integer getId() {
        return idIndex;
    }

    @Override
    public String getType() {
        return "Avion";
    }

    @Override
    public void seDeplace(int x, int y) {
        vole(new Point(x, y));
    }

    @Override
    public boolean peutVoler() {
        return true;
    }

    @Override
    public boolean peutNaviguer() {
        return false;
    }

    @Override
    public boolean peutRouler() {
        return false;
    }

    private void vole(Point destination) {
        System.out.printf(
                "Véhicule de type avion (Ref : %s), se déplace de la position %s vers %s\n",
                refAvion, position, destination);
        position = destination;
    }

}
