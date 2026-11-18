
public class Dragon extends Monster{
	private int attack;
	
	public Dragon(int attack) {
		this.attack=attack;
	}
	
	@Override
	public int calculateDamage() {
		return this.attack*2;
	}
}
