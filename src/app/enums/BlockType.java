package app.enums;

import java.util.Vector;

public enum BlockType {
	SEMI_AUTO("半自动闭塞"), FULL_AUTO("自动闭塞");
	
	private final String name;
	
	private BlockType(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
		for (BlockType model : values()) {
			nameList.add(model.name);
		}
		return nameList;
	}
	
	public String getName() {
		return this.name;
	}
}
