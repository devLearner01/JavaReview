import java.util.ArrayList;

public class Player implements ISavable{

	

	private String name;
	private int hitPoints;
	private int strength;
	private String weapon;
	
	
	//Constructor
	public Player() {
		
		this.name = "";
		this.hitPoints = 0;
		this.strength = 0;
		this.weapon = "";
	}
	
	public Player( String name, int hitPoints, int strength, String weapon ) {
		super();
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
		this.weapon = weapon;
	}
	
	
	@Override
	public ArrayList<Object> getValues() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void populate( ArrayList<Object> values ) {
		// TODO Auto-generated method stub
		
	}

	
}
