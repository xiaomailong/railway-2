package app.enums;

import java.util.Vector;

public enum TrunkOrBus {
	TRUNK("货物列车"), BUS("高速客运专线");
	
	private final String name;
	
	private TrunkOrBus(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
		for (TrunkOrBus model : values()) {
			nameList.add(model.name);
		}
		return nameList;
	}
	
	public String getName() {
		return this.name;
	}
}
