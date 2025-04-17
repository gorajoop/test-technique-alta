package fr.altaprofits.exercice.vehicule;

import fr.altaprofits.exercice.Point;

public class Bateau implements Vehicule{
    private static Integer idIndex = 0;
    private final String refBateau;
    private Point position;

    public Bateau() {
        position = new Point(0, 0);
        refBateau = "B-" + ++idIndex;
    }

    @Override
    public Integer getId() {
        return idIndex;
    }

    @Override
    public String getType() {
        return "Bateau";
    }

    @Override
    public void seDeplace(int x, int y) {
        navigue(new Point(x, y));
    }

    @Override
    public boolean peutVoler() {
        return false;
    }

    @Override
    public boolean peutNaviguer() {
        return true;
    }

    @Override
    public boolean peutRouler() {
        return false;
    }

    private void navigue(Point destination) {
        System.out.printf("Véhicule de type bateau (Ref : %s), se déplace de la position %s vers %s\n", refBateau, position, destination);
        position = destination;
    }



}
