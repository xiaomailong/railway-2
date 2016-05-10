package app.enums;

import java.util.Vector;

public enum LocoUnitType {
	TAI("机车台数(台)"), LIANG("车辆辆数(辆)");
	
	private final String name;
	
	private LocoUnitType(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
		for (LocoUnitType model : values()) {
			nameList.add(model.name);
		}
		return nameList;
	}
	
	public String getName() {
		return this.name;
	}
}
