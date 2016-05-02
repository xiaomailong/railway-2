package app.enums;

import java.util.Vector;

public enum TrunkType {
	TYPE_1("滚动轴承货车"),
	TYPE_2("滑动轴承货车"),
	TYPE_3("空货车(不分车型)"),
	TYPE_4("油罐车专列(重车)");
	
	private final String name;
	
	private TrunkType(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
		for (TrunkType model : values()) {
			nameList.add(model.name);
		}
		return nameList;
	}
	
	public String getName() {
		return this.name;
	}
}
