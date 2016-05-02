package app.enums;

import java.util.Vector;

public enum RampDirection {
	UP("上坡道"), DOWN("下坡道");
	
	private final String name;
	
	private RampDirection(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
		for (RampDirection model : values()) {
			nameList.add(model.name);
		}
		return nameList;
	}
	
	public String getName() {
		return this.name;
	}
}
