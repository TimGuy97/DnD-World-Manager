package world;

import java.util.*;

import people.*;

public class World {

	// fields
	static int id = 0;
	static ArrayList<NPC> npcList = new ArrayList<NPC>();
	
	// number of NPCs to generate
	static int numNPCs = 2;
	
	/**
	 * Run World (Just tests for now)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// generate above number of NPCs
		for(int i = 0; i < numNPCs; i++) {
			generateNPC(npcList);
		}
		
		//list those NPCs
		displayNPCs(npcList);
	}
	
	/**
	 * Generates a single random NPC.
	 * @param	npcList - This is an ArrayList
	 * 			of all existing NPCs to 
	 * 			append the new NPC to
	 */
	public static void generateNPC(ArrayList<NPC> npcList) {
		Random r = new Random();
		String name = "Guy";
		RacesEnum race = RacesEnum.HUMAN;
		ClassesEnum charClass = ClassesEnum.PEASANT;
		AlignmentsEnum alignment = AlignmentsEnum.TN;
		int str = r.nextInt(20)+1;
		int dex = r.nextInt(20)+1;
		int con = r.nextInt(20)+1;
		int intel = r.nextInt(20)+1;
		int wis = r.nextInt(20)+1;
		int cha = r.nextInt(20)+1;
		int maxHp = r.nextInt(20)+1;
		int currentHp = maxHp;
		ArrayList<SkillProfEnum> proficiencies =new ArrayList<SkillProfEnum>(); 
		HashMap<Integer, RelationshipsEnum> associations = new HashMap<Integer, RelationshipsEnum>();
		associations.put(1,RelationshipsEnum.AQUAINTANCE);
		associations.put(2,RelationshipsEnum.MOTHER);
		associations.put(3,RelationshipsEnum.FRIEND);
		NPC npc = new NPC(id, name, race, charClass, alignment, str, dex, con, intel, wis, cha, maxHp, currentHp, proficiencies, associations);
		npcList.add(npc);
		id++;
	}
	
	/**
	 * Generates a new NPC based on user input.
	 * @param 	npcList - This is an ArrayList
	 * 			of all existing NPCs to
	 * 			append the new NPC to
	 */
	public static void createNPC(ArrayList<NPC> npcList) {
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		RacesEnum race = RacesEnum.HUMAN;
		ClassesEnum charClass = ClassesEnum.PEASANT;
		AlignmentsEnum alignment = AlignmentsEnum.TN;
		int str = sc.nextInt();
		int dex = sc.nextInt();
		int con = sc.nextInt();
		int intel = sc.nextInt();
		int wis = sc.nextInt();
		int cha = sc.nextInt();
		int maxHp = sc.nextInt();
		int currentHp = maxHp;
		
		System.out.println("Is this NPC proficient in any skills? (bool)");
		boolean skillsDone = sc.nextBoolean();
		System.out.println("Does this NPC have any associations? (bool)");
		boolean associationsDone = sc.nextBoolean();
		
		ArrayList<SkillProfEnum> proficiencies =new ArrayList<SkillProfEnum>();
		while(!skillsDone) {
			System.out.println("Add skill:");
			proficiencies.add(SkillProfEnum.valueOf(sc.next()));
			System.out.println("More skills?");
			skillsDone = sc.nextBoolean();
		}
		
		HashMap<Integer, RelationshipsEnum> associations = new HashMap<Integer, RelationshipsEnum>();
		ArrayList<NPC> temp = new ArrayList<NPC>();

		while(!associationsDone) {
			boolean npcFound = false;
			
			System.out.println("Add association (NPC ID):");
			int npcId = sc.nextInt();
			
			System.out.println("Enter relationship");
			 RelationshipsEnum relationship = (RelationshipsEnum.valueOf(sc.next()));
			
			for(NPC n:npcList) {
				if(n.getId()==npcId) {
					associations.put(npcId, relationship);
					
					//for adding created NPC to other NPC's relationships
					temp.add(n);
					npcFound = true;
				}
			}
			if(!npcFound) {
				System.out.println("No such NPC exists");
			}
			
			System.out.println("More associations?");
			associationsDone = sc.nextBoolean();
		}
		/*
		ArrayList<NPC> associations = new ArrayList<NPC>();
		ArrayList<RelationshipsEnum> relationships = new ArrayList<RelationshipsEnum>();
		
		
		while(!associationsDone) {
			boolean npcFound = false;
			
			System.out.println("Add association:");
			int npcId = sc.nextInt();
			
			for(NPC n:npcs) {
				if(n.getId()==npcId) {
					associations.add(n);
					System.out.println("Enter relationship");
					relationships.add(RelationshipsEnum.valueOf(sc.next()));
					//add created NPC to other NPC's relationships
					temp.add(n);
					npcFound = true;
				}
			}
			if(!npcFound) {
				System.out.println("No such NPC exists");
			}
			
			System.out.println("More associations?");
			associationsDone = sc.nextBoolean();
		}
		*/
		NPC npc = new NPC(id, name, race, charClass, alignment, str, dex, con, intel, wis, cha, maxHp, currentHp, proficiencies, associations);
		
		sc.close();
		
		//for new NPCs
		HashMap<Integer, RelationshipsEnum> tempAssociation;		
		//add NPC to other NPC's associations
		for(int i = 0; i < temp.size(); i++) {
			tempAssociation = temp.get(i).getAssociations();
			tempAssociation.put(npc.getId(), npc.getAssociations().get(temp.get(i).getId()));
			// TODO add logic for husband/wife and other non-identical relationships
			temp.get(i).setAssociations(tempAssociation);
		}
		
		npcList.add(npc);
		id++;
	}
	
	/**
	 * 
	 * @param	npcList - This is an ArrayList
	 * 			of all existing NPCs to display
	 */
	public static void displayNPCs(ArrayList<NPC> npcList) {
		for(NPC npc:npcList) {
			System.out.println(npc.toString());
		}
		System.out.println("=====================================================================");

	}
}
