package wcs_elemental_monsters;

public abstract class Monster {
	
	private String name;
	private int damage;
	private int life;
	private String type;
	
	public void takeHit(Monster opponent) {
		this.setLife(this.getLife()-opponent.getDamage());
		if (this.getLife() > 0) {
			System.out.println(this.getName() + " has " + this.getLife() + " lifepoints remaining.");
		} else {
			System.out.println(this.getName() + " is knocked out!");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getLife() {
		return life;
	}

	private void setLife(int life) {
		this.life = life;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Monster(String name, int damage, int life) {
		super();
		this.name = name;
		this.damage = damage;
		this.life = life;
		this.type = "normal";
	}

}
