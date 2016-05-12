package app.enums;

import java.util.Vector;

public enum LoadType {
	HIGHEST_LOAD("最高负荷"), PARTIAL_LOAD("部分负荷");
	
	private final String name;
	
	private LoadType(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
		for (LoadType model : values()) {
			nameList.add(model.name);
		}
		return nameList;
	}
	
	public String getName() {
		return this.name;
	}
}
