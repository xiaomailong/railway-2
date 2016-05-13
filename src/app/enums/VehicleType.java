package app.enums;

import java.util.Vector;

public enum VehicleType {
	TYPE_1("21、22型客车"),
	TYPE_2("25B、25G型客车"),
	TYPE_3("快速单层客车"),
	TYPE_4("快速双层客车"),
	TYPE_5("滚动轴承货车"),
	TYPE_6("滑动轴承货车"),
	TYPE_7("空货车(不分车型)"),
	TYPE_8("油罐车专列(重车)");
	
	private final String name;
	
	private VehicleType(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
		for (VehicleType model : values()) {
			nameList.add(model.name);
		}
		return nameList;
	}
	
	public String getName() {
		return this.name;
	}
}
