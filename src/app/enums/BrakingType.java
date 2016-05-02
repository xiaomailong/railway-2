package app.enums;

import java.util.Vector;

public enum BrakingType {
	URGENT("紧急制动"), ORDINARY("常用制动");
	
	private final String name;
	
	private BrakingType(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
		for (BrakingType model : values()) {
			nameList.add(model.name);
		}
		return nameList;
	}
	
	public String getName() {
		return this.name;
	}
}
