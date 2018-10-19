package de.dhbw.tinf16b3.initial;

import java.util.Arrays;
import java.util.List;

public final class Main {

	private Main() {
		super();
	}
	
	public static void main(String[] arguments) {
		final Käsespätzle spätzle = new Käsespätzle();
		final Döner yufka = new Döner();
		final List<Essen> speisen = Arrays.asList(spätzle, yufka);
		
		spätzle.verspeise();
		yufka.verspeise();
		for (Essen each : speisen) {
			each.verspeise();
		}
//		speisen.forEach(Essen::verspeise);
		
		final Mülleimer müll = new Mülleimer();
		müll.wirfWeg(spätzle);
		müll.wirfWeg(yufka);
		for (Essen each : speisen) {
			müll.wirfWeg(each);
		}
//		speisen.forEach(müll::wirfWeg);
		
	}
}
