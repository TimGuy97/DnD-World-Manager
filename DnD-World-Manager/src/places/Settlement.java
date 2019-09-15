package places;

import java.util.*;

public class Settlement extends Place {

	//building ID
	private HashMap<Integer, BuildingPurposeEnum> buildings;

	public HashMap<Integer, BuildingPurposeEnum> getBuildings() {
		return buildings;
	}

	public void setBuildings(HashMap<Integer, BuildingPurposeEnum> buildings) {
		this.buildings = buildings;
	}
}
