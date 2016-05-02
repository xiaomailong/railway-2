package app.enums;

import java.util.Vector;

public enum BrakingRatioType {
	TYPE_1("轴制动率"), TYPE_2("车辆制动率"), TYPE_3("列车制动率");
	
	private final String name;
	
	private BrakingRatioType(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
		for (BrakingRatioType model : values()) {
			nameList.add(model.name);
		}
		return nameList;
	}
	
	public String getName() {
		return this.name;
	}
}
