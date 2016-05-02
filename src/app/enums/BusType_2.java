package app.enums;

import java.util.Vector;

public enum BusType_2 {
	TYPE_1("L3型、GL3型制动机(关闭附加风缸)、104型制动机、踏面制动"),
	TYPE_2("25型客车、104型、F8型制动机、踏面制动"),
	TYPE_3("104型、F8型制动机、盘型制动单层"),
	TYPE_4("104型、F8型制动机、盘型制动双层");
	
	private final String name;
	
	private BusType_2(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
		for (BusType_2 model : values()) {
			nameList.add(model.name);
		}
		return nameList;
	}
	
	public String getName() {
		return this.name;
	}
}
