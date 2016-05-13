package app.enums;

import java.util.Vector;

public enum TractionType_2 {
	SINGLE("单机牵引"), MULTI("多机牵引"), OTHER("补机推送");
	
	private final String name;
	
	private TractionType_2(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
		for (TractionType_2 model : values()) {
			nameList.add(model.name);
		}
		return nameList;
	}
	
	public String getName() {
		return this.name;
	}
}
