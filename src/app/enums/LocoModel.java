package app.enums;

import java.util.Vector;

public enum LocoModel {
	ELECTRIC("电力机车"), DIESEL("内燃机车");
	
	private final String name;
	
	private LocoModel(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
		for (LocoModel model : values()) {
			nameList.add(model.name);
		}
		return nameList;
	}
	
	public String getName() {
		return this.name;
	}
}
