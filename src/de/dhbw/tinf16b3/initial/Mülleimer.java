package de.dhbw.tinf16b3.initial;

public class Mülleimer extends Object {

	public Mülleimer() {
		super();
	}
	
	public void wirfWeg(Essen speise) {
		System.out.println("[4] Das ist doch noch gut!");
	}
	
	public void wirfWeg(Käsespätzle mitKäse) {
		System.out.println("[5] Alles vom Teller kratzen!");
	}
	
	public void wirfWeg(Döner mitTüte) {
		System.out.println("[6] Der war eh zu billig.");
	}
}
