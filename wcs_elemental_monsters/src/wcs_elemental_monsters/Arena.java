package wcs_elemental_monsters;

import java.util.Scanner;

public class Arena {
	
	private static Scanner s = new Scanner(System.in);

	private static Monster askMonster() {
		char x = ' ';
		do {
			System.out.println("Welches Monster wählst du (fF: Fire, wW: Water, gG: Gras, xX: quit):");
			x = s.next().charAt(0);
			if ((x == 'f') || (x == 'F')) {
				return new FireMonster( "Your Firemonster Rahma", fetchDamage(), fetchLife());
			}
			if ((x == 'w') || (x == 'W')) {
				return new WaterMonster("Your Watermonster Dada", fetchDamage(), fetchLife());
			}
			if ((x == 'g') || (x == 'G')) {
				return new GrassMonster("Your Grassmonster Nuru", fetchDamage(), fetchLife());
			}
		} while (!(x == 'x' || x == 'X'));

		return null;
	}

	private static int fetchLife() {
		int minLife = 15;
		int maxLife = 20;

		return minLife + (int) Math.round(Math.random() * (maxLife - minLife));
	}

	private static int fetchDamage() {
		int minDamage = 2;
		int maxDamage = 5;

		return minDamage + (int) Math.round(Math.random() * (maxDamage - minDamage + 1));
	}

	public static void main(String[] args) {
		Monster player = askMonster();
		do {
			int monsterTypes = 3;
			Monster[] monsterCage = { new FireMonster("Firemonster Bibi", fetchDamage(), fetchLife()),
					new WaterMonster("Watermonster FiFi", fetchDamage(), fetchLife()),
					new GrassMonster("Grassmonter ChiChi", fetchDamage(), fetchLife()), };

			Monster opponent = null;

			if (player != null) {
				int monsterSelector = (int) (Math.random() * monsterTypes);
				opponent = monsterCage[monsterSelector];

				System.out.println();
				System.out.println("Next match: " + player.getName() + " (" + player.getLife() + "L/"
						+ player.getDamage() + "D) vs. " + opponent.getName() + " (" + opponent.getLife() + "L/"
						+ opponent.getDamage() + "D)");
				while (player.getLife() > 0 && opponent.getLife() > 0) {
					System.out.println("----------------------------------------------------------");
					opponent.takeHit(player);
					player.takeHit(opponent);
				}
			}
			System.out.println();
			System.out.println("          **********************************");
			if (player.getLife() > 0) {
				System.out.println("          * " + player.getName() + " won!    *");
			} else {
				System.out.println("          * " + player.getName() + " lost!   *");
			}
			System.out.println("          **********************************");
			System.out.println();
			player = askMonster();
		} while (player != null);
		s.close();
	}
}
