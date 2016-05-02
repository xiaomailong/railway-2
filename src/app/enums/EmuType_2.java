package app.enums;

import java.util.Vector;

public enum EmuType_2 {
	TYPE_1("内燃动车组(120-180km/h)，踏面制动"),
	TYPE_2("电力动车组(140-200km/h)，盘形制动");

	private final String name;

	private EmuType_2(String name) {
		this.name = name;
	}

	public static Vector<String> getNameList() {
		Vector<String> nameList = new Vector<String>();
		for (EmuType_2 model : values()) {
			nameList.add(model.name);
		}
		return nameList;
	}

	public String getName() {
		return this.name;
	}
}
