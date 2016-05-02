package app.enums;

import java.util.Vector;

public enum PressureType {
	P500("500kPa"), P600("600kPa");
	
	private final String name;
	
	private PressureType(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
		for (PressureType model : values()) {
			nameList.add(model.name);
		}
		return nameList;
	}
	
	public String getName() {
		return this.name;
	}
}
