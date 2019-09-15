package places;

import people.*;

public abstract class Place {

	private int id;
	private String name;
	private int population;
	private NPC ruler;	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public int getId() {
		return id;
	}
	public NPC getRuler() {
		return ruler;
	}
	public void setRuler(NPC ruler) {
		this.ruler = ruler;
	}
	
}
