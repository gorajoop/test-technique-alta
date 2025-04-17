package fr.altaprofits.exercice;

import fr.altaprofits.exercice.vehicule.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.HashSet;


public class Hangar {
	// Contient tous les véhicules
	private HashSet<Vehicule> vehicules = new HashSet<>();


	public HashSet<Vehicule> getVehicules() {
		return vehicules;
	}

	public void entre(Vehicule v) {
		vehicules.add(v);
	}

	public long nombreDeVehiculesDansAeroport() {
		return vehicules.stream().filter(Vehicule::peutVoler).count();
	}

	public long nombreDeVehiculesDansGarage() {
		return vehicules.stream().filter(Vehicule::peutRouler).count();
	}

	public long nombreDeVehiculeDansPort() {
		return (int) vehicules.stream().filter(Vehicule::peutNaviguer).count();
	}

	public long nombreDeVehiculeDansHangar() {
		return vehicules.size();
	}

	private void imprimerDansConsole(Vehicule v) {
		System.out.println("Vehicule de type " + v.getType());
		System.out.println(v);
	}

	private void imprimerDansFichier(Vehicule v, File f) throws IOException {
		PrintStream printStream = new PrintStream(Files.newOutputStream(f.toPath(),
												  StandardOpenOption.CREATE,
												  StandardOpenOption.APPEND));
		printStream.println("Vehicule de type " + v.getType());
		printStream.println(v);
	}

	public void imprimerToutDansConsole() {
		for (Vehicule v : vehicules)
			imprimerDansConsole(v);
	}

	public void imprimerToutDansFichier(File f) throws IOException {
		for (Vehicule v : vehicules)
			imprimerDansFichier(v, f);
	}

	public long nombreDeVehiculesCapablesDeVoler() {
		return vehicules.stream().filter(Vehicule::peutVoler).count();
	}

	public long nombreDeVehiculesCapablesDeRouler() {
		return vehicules.stream().filter(Vehicule::peutRouler).count();
	}

	public long nombreDeVehiculesCapablesDeNaviguer() {
		return vehicules.stream().filter(Vehicule::peutNaviguer).count();
	}


}
