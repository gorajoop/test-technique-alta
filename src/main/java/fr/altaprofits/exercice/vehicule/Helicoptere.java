package fr.altaprofits.exercice.vehicule;

import fr.altaprofits.exercice.Point;

public class Helicoptere implements Vehicule {
    private static Integer idIndex = 0;
    private final String refHelico;
    private Point position;

    public Helicoptere() {
        position = new Point(0, 0);
        refHelico = "H-" + ++idIndex;
    }

    @Override
    public Integer getId() {
        return idIndex;
    }

    @Override
    public String getType() {
        return "Helicoptere";
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
                "Véhicule de type hélicoptère (Ref : %s), se déplace de la position %s vers %s\n",
                refHelico, position, destination);
        position = destination;
    }
}
