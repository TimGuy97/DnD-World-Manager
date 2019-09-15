package places;

import java.util.*;

import world.Faction;

public class Country extends Place {

	private ArrayList<Settlement> settlements;
	private HashMap<Country, DiplomacyEnum> relationships;
	private ArrayList<Faction> factions;
	
	public ArrayList<Settlement> getSettlements() {
		return settlements;
	}
	public void setSettlements(ArrayList<Settlement> settlements) {
		this.settlements = settlements;
	}
	public HashMap<Country, DiplomacyEnum> getRelationships() {
		return relationships;
	}
	public void setRelationships(HashMap<Country, DiplomacyEnum> relationships) {
		this.relationships = relationships;
	}
	public ArrayList<Faction> getFactions() {
		return factions;
	}
	public void setFactions(ArrayList<Faction> factions) {
		this.factions = factions;
	}
}
