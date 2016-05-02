package app.enums;

import java.util.Vector;

public enum EmuType {
	TYPE_1("先锋号电动车组"), TYPE_2("中原之星号电动车组"), TYPE_3("中华之星号高速电动车组"), TYPE_4("CRH1动车组"), TYPE_5("CRH2动车组"), TYPE_6(
			"CRH3动车组"), TYPE_7("CRH5动车组");

	private final String name;

	private EmuType(String name) {
		this.name = name;
	}

	public static Vector<String> getNameList() {
		Vector<String> nameList = new Vector<String>();
		for (EmuType model : values()) {
			nameList.add(model.name);
		}
		return nameList;
	}

	public String getName() {
		return this.name;
	}
}
