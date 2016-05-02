package app.enums;

import java.util.Vector;

public enum TractionType {
	SINGLE("单机牵引"), MULTI("多机牵引");
	
	private final String name;
	
	private TractionType(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
		for (TractionType model : values()) {
			nameList.add(model.name);
		}
		return nameList;
	}
	
	public String getName() {
		return this.name;
	}
}
