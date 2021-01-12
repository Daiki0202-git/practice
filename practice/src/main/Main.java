package main;

import enemy.Matango;
import enemy.PoisonMatango;
import profession.Hero;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		char suffix = 40;
		Matango m = new Matango(suffix);
		PoisonMatango pm = new PoisonMatango(suffix);
		
		
		h.run();
		m.attack(h);
		pm.attack(h);
		
	}

	

}
