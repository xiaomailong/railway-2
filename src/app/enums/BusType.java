package app.enums;

import java.util.Vector;

public enum BusType {
	TYPE_1("21、22型客车"), TYPE_2("25B、25G型客车"), TYPE_3("快速单层客车"), TYPE_4("快速双层客车");
	
	private final String name;
	
	private BusType(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
		for (BusType model : values()) {
			nameList.add(model.name);
		}
		return nameList;
	}
	
	public String getName() {
		return this.name;
	}
}
