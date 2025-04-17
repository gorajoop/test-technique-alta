package fr.altaprofits.exercice;

import fr.altaprofits.exercice.animal.*;
import fr.altaprofits.exercice.vehicule.*;

import java.io.File;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        Hangar hangar = new Hangar();

        Moto moto1 = new Moto();
        Avion avion1 = new Avion();
        Avion avion2 = new Avion();
        Helicoptere helico1 = new Helicoptere();
        JetSki jetSki1 = new JetSki();
        Hydravion hydravion = new Hydravion();

        hangar.entre(moto1);
        hangar.entre(avion1);
        hangar.entre(avion2);
        hangar.entre(helico1);
        hangar.entre(jetSki1);
        hangar.entre(hydravion);

        hangar.imprimerToutDansConsole();
        hangar.imprimerToutDansFichier(new File("/tmp/hangar.txt"));

        System.out.println(
                "Nombre de v�hicule dans le hangar : " + hangar.nombreDeVehiculeDansHangar());
        System.out.println(
                "Nombre de v�hicule dans l'a�roport : " + hangar.nombreDeVehiculesDansAeroport());
        System.out.println(
                "Nombre de v�hicule dans le garage : " + hangar.nombreDeVehiculesDansGarage());
        System.out.println(
                "Nombre de v�hicule dans le port : " + hangar.nombreDeVehiculeDansPort());

        avion1.seDeplace(10, 30);
        avion1.seDeplace(30, 60);
        avion2.seDeplace(25, 55);
        helico1.seDeplace(23, 11);
        jetSki1.seDeplace(3, 9);
        hydravion.seDeplace(10,20);


        Ferme ferme = new Ferme();

        Cheval cheval1 = new Cheval();
        Poisson poisson1 = new Poisson();
        Canard canard1 = new Canard();

        ferme.ajouterAnimal(cheval1);

        ferme.ajouterAnimal(cheval1);
        ferme.ajouterAnimal(poisson1);
        ferme.ajouterAnimal(canard1);

        ferme.imprimerTousLesAnimauxDansConsole();

        System.out.println("Nombre d'animaux dans la ferme : " + ferme.nombreDAnimauxDansFerme());
        System.out.println(
                "Nombre d'animaux capables de voler : " + ferme.nombreDAnimauxCapablesDeVoler());
        System.out.println(
                "Nombre d'animaux capables de se déplacer sur/dans l'eau : " + ferme.nombreDAnimauxCapablesDeSeDeplacerSurEau());

        Environnement environnement = new Environnement(ferme, hangar);

        System.out.println("Nombre d'éléments Naviguant dans Environnement: "+environnement.nombreDElementsCapablesDeNaviguer());
        System.out.println("Nombre d'éléments Volant dans Environnement: "+environnement.nombreDElementsCapablesDeVoler());
        System.out.println("Nombre d'éléments Roulant dans Environnement: "+environnement.nombreDElementsCapablesDeRouler());

    }


}
