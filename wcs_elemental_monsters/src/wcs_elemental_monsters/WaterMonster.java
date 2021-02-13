package wcs_elemental_monsters;

public class WaterMonster extends Monster {

	public WaterMonster(String name, int damage, int life) {
		super(name, damage, life);
		this.setType("water");
	}
	
	@Override
	public void takeHit(Monster opponent) {
		int rememberDamage = opponent.getDamage();
		if ("grass".equals(opponent.getType())) opponent.setDamage(rememberDamage * 2);
		if("fire".equals(opponent.getType())) opponent.setDamage(rememberDamage / 2);		
		super.takeHit(opponent);
		opponent.setDamage(rememberDamage);
	}
}
