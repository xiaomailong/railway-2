package app.enums;

import java.util.Vector;

public enum ShuntingOperType {
	TYPE_1("出入段"), TYPE_2("途中调车作业");
	
	private final String name;
	
	private ShuntingOperType(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
		for (ShuntingOperType model : values()) {
			nameList.add(model.name);
		}
		return nameList;
	}
	
	public String getName() {
		return this.name;
	}
}
