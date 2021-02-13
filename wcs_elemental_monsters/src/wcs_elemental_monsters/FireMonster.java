package wcs_elemental_monsters;

public class FireMonster extends Monster {
	
	public FireMonster(String name, int damage, int life) {
		super(name, damage, life);
		this.setType("fire");
	}
	
	@Override
	public void takeHit(Monster opponent) {
		int rememberDamage = opponent.getDamage();
		if ("water".equals(opponent.getType())) opponent.setDamage(rememberDamage * 2);
		if("grass".equals(opponent.getType())) opponent.setDamage(rememberDamage / 2);		
		super.takeHit(opponent);
		opponent.setDamage(rememberDamage);
	}	

}
