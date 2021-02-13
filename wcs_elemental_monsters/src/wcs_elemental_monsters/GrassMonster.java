package wcs_elemental_monsters;

public class GrassMonster extends Monster {

	public GrassMonster(String name, int damage, int life) {
		super(name, damage, life);
		this.setType("grass");
	}
	
	@Override
	public void takeHit(Monster opponent) {
		int rememberDamage = opponent.getDamage();
		if ("fire".equals(opponent.getType())) opponent.setDamage(rememberDamage * 2);
		if("water".equals(opponent.getType())) opponent.setDamage(rememberDamage / 2);		
		super.takeHit(opponent);
		opponent.setDamage(rememberDamage);
	}
}
