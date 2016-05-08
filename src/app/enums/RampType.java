package app.enums;

import java.util.Vector;

public enum RampType {
	LIMIT("有限制坡道"), UNLIMIT("无限制坡道");
	
	private final String name;
	
	private RampType(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
		for (RampType model : values()) {
			nameList.add(model.name);
		}
		return nameList;
	}
	
	public String getName() {
		return this.name;
	}
}
