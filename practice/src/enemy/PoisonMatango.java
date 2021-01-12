package enemy;

import profession.Hero;

public class PoisonMatango extends Matango{

	int poisonCount = 5;

	public PoisonMatango(char suffix) {
		super(suffix);
	}
	public void attack(Hero h) {
		if (this.poisonCount > 0) {
			int dmg = h.hp / 5;
			h.hp -= dmg;
			System.out.println(dmg + "ポイントのダメージ");
			this.poisonCount--;
		}
	}

}
