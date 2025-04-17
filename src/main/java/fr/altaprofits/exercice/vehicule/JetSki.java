package fr.altaprofits.exercice.vehicule;

import fr.altaprofits.exercice.Point;

public class JetSki implements Vehicule {
    private static Integer idIndex = 0;
    private final String refJetSki;
    private Point position;

    public JetSki() {
        position = new Point(0, 0);
        refJetSki = "J-" + ++idIndex;
    }

    @Override
    public Integer getId() {
        return idIndex;
    }

    @Override
    public String getType() {
        return "JetSki";
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
        System.out.printf(
                "Véhicule de type jet-ski (Ref : %s), se déplace de la position %s vers %s\n",
                refJetSki, position, destination);
        position = destination;
    }
}
