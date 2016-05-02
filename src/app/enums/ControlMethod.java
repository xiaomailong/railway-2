package app.enums;

import java.util.Vector;

public enum ControlMethod {
	METHOD_1("重联线操纵"), METHOD_2("分别操纵");
	
	private final String name;
	
	private ControlMethod(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
		for (ControlMethod model : values()) {
			nameList.add(model.name);
		}
		return nameList;
	}
	
	public String getName() {
		return this.name;
	}
}
