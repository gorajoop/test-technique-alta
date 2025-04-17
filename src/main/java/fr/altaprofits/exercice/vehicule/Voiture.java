package fr.altaprofits.exercice.vehicule;

import fr.altaprofits.exercice.Point;

public class Voiture implements Vehicule{
    private static Integer idIndex = 0;
    private final String refVoiture;
    private Point position;

    public Voiture() {
        position = new Point(0, 0);
        refVoiture = "V-" + ++idIndex;
    }

    @Override
    public Integer getId() {
        return idIndex;
    }

    @Override
    public String getType() {
        return "Voiture";
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
        System.out.printf("Véhicule de type voiture (Ref : %s), se déplace de la position %s vers %s\n", refVoiture, position, destination);
        position = destination;
    }
}
