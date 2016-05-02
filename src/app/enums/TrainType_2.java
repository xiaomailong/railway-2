package app.enums;

import java.util.Vector;

public enum TrainType_2 {
	TYPE_1("旅客列车"),
	TYPE_2("货物列车"),
	TYPE_3("机车单机"),
	TYPE_4("电空制动的旅客列车"),
	TYPE_5("P65A型棚车组成的行包快运列车"),
	TYPE_6("编组22-24辆的行包专列");
	
	private final String name;
	
	private TrainType_2(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
		for (TrainType_2 model : values()) {
			nameList.add(model.name);
		}
		return nameList;
	}
	
	public String getName() {
		return this.name;
	}
}
