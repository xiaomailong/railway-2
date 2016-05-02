package app.enums;

import java.util.Vector;

public enum TrainBrakingType {
	TYPE_1("机车及客车闸瓦制动"), TYPE_2("客车盘型制动及踏面制动"), TYPE_3("货车闸瓦制动");
	
	private final String name;
	
	private TrainBrakingType(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
		for (TrainBrakingType model : values()) {
			nameList.add(model.name);
		}
		return nameList;
	}
	
	public String getName() {
		return this.name;
	}
}
