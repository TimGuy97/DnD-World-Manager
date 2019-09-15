package people;

import java.util.*;

public class NPC {
	private int id;
	private String name;
	private RacesEnum race;
	private ClassesEnum charClass;
	private AlignmentsEnum alignment;
	private int str;
	private int dex;
	private int con;
	private int intel;
	private int wis;
	private int cha;
	private int maxHp;
	private int currentHp;
	private ArrayList<SkillProfEnum> proficiencies;
	private HashMap<Integer, RelationshipsEnum> associations;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public RacesEnum getRace() {
		return race;
	}
	public void setRace(RacesEnum race) {
		this.race = race;
	}
	public ClassesEnum getCharClass() {
		return charClass;
	}
	public void setCharClass(ClassesEnum charClass) {
		this.charClass = charClass;
	}
	public AlignmentsEnum getAlignment() {
		return alignment;
	}
	public void setAlignment(AlignmentsEnum alignment) {
		this.alignment = alignment;
	}
	public int getStr() {
		return str;
	}
	public void setStr(int str) {
		this.str = str;
	}
	public int getDex() {
		return dex;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	public int getCon() {
		return con;
	}
	public void setCon(int con) {
		this.con = con;
	}
	public int getIntel() {
		return intel;
	}
	public void setIntel(int intel) {
		this.intel = intel;
	}
	public int getWis() {
		return wis;
	}
	public void setWis(int wis) {
		this.wis = wis;
	}
	public int getCha() {
		return cha;
	}
	public void setCha(int cha) {
		this.cha = cha;
	}
	public int getMaxHp() {
		return maxHp;
	}
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	public int getCurrentHp() {
		return currentHp;
	}
	public void setCurrentHp(int currentHp) {
		this.currentHp = currentHp;
	}
	public ArrayList<SkillProfEnum> getProficiencies() {
		return proficiencies;
	}
	public void setProficiencies(ArrayList<SkillProfEnum> proficiencies) {
		this.proficiencies = proficiencies;
	}
	public HashMap<Integer, RelationshipsEnum> getAssociations() {
		return associations;
	}
	public void setAssociations(HashMap<Integer, RelationshipsEnum> associations) {
		this.associations = associations;
	}

	public NPC(int id, String name, RacesEnum race, ClassesEnum charClass, 
			AlignmentsEnum alignment, int str, int dex, int con, int intel, 
			int wis, int cha, int maxHp, int currentHp, 
			ArrayList<SkillProfEnum> proficiencies, 
			HashMap<Integer, RelationshipsEnum> associations) {
		super();
		this.id = id;
		this.name = name;
		this.race = race;
		this.charClass = charClass;
		this.alignment = alignment;
		this.str = str;
		this.dex = dex;
		this.con = con;
		this.intel = intel;
		this.wis = wis;
		this.cha = cha;
		this.maxHp = maxHp;
		this.currentHp = currentHp;
		this.proficiencies = proficiencies;
		this.associations = associations;
	}
	
	public String toString() {
		String line0 = "=====================================================================";
		String line1 = "\nID: " + this.id + "\tName: " + this.name + "\tRace: " + this.race + "\tClass: " + this.charClass + "\tAlignment: " + this.alignment;
		String line2 = "\nStr: " + this.str + "\tDex: " + this.dex + "\tCon: " + this.con + "\tInt: " + this.intel + "\tWis: " + this.wis + "\tCha: " + this.cha;
		String line3 = "\nCurrent HP: " + this.currentHp + "\tMax HP: " + this.maxHp + "\tTo Hit Bonus: " + (this.str-10)/2;
		String line4 = "\nSkills: " + this.proficiencies;
		String line5 = "\nAssociations: " + this.associations.keySet() + "\tRelationships: " + this.associations.values();
		String line6 = "\nAssociations(HashMap): " + this.associations;
		return line0 + line1 + line2 + line3 + line4 + line5 + line6;
	}
}
