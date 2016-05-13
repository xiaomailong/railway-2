package app.enums;

import java.util.Vector;

public enum YesOrNoType {
	YES("有"), NO("没有");
	
	private final String name;
	
	private YesOrNoType(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
		for (YesOrNoType model : values()) {
			nameList.add(model.name);
		}
		return nameList;
	}
	
	public String getName() {
		return this.name;
	}
}
