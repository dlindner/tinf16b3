package de.dhbw.tinf16b3.initial;

import java.util.Arrays;
import java.util.List;

public final class Main {

	private Main() {
		super();
	}
	
	public static void main(String[] arguments) {
		final K�sesp�tzle sp�tzle = new K�sesp�tzle();
		final D�ner yufka = new D�ner();
		final List<Essen> speisen = Arrays.asList(sp�tzle, yufka);
		
		sp�tzle.verspeise();
		yufka.verspeise();
		for (Essen each : speisen) {
			each.verspeise();
		}
//		speisen.forEach(Essen::verspeise);
		
		final M�lleimer m�ll = new M�lleimer();
		m�ll.wirfWeg(sp�tzle);
		m�ll.wirfWeg(yufka);
		for (Essen each : speisen) {
			m�ll.wirfWeg(each);
		}
//		speisen.forEach(m�ll::wirfWeg);
		
	}
}
