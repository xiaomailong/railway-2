package app.enums;

import java.util.Vector;

public enum TrainType {
	BUS("旅客列车"), TRUNK("货物列车");
	
	private final String name;
	
	private TrainType(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
		for (TrainType model : values()) {
			nameList.add(model.name);
		}
		return nameList;
	}
	
	public String getName() {
		return this.name;
	}
}
