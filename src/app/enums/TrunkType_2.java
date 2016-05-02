package app.enums;

import java.util.Vector;

public enum TrunkType_2 {
	TYPE_1("25t轴重重载货车，120型制动机，踏面制动重车位"),
	TYPE_2("25t轴重重载货车，120型制动机，踏面制动空车位"),
	TYPE_3("18t轴重快速行邮车辆，120型制动机，踏面制动重车位"),
	TYPE_4("18t轴重快速行邮车辆，120型制动机，踏面制动空车位"),
	TYPE_5("特快行邮车辆，盘形制动重车位"),
	TYPE_6("特快行邮车辆，盘形制动空车位"),
	TYPE_7("标记载重61t货车、120型、103型制动机、踏面制动重车位"),
	TYPE_8("标记载重61t货车、120型、103型制动机、踏面制动空车位"),
	TYPE_9("标记载重50t及其以上（包括载重40t的冷藏车）、GK型、120型、103型制动机、踏面制动重车位"),
	TYPE_10("标记载重50t及其以上（包括载重40t的冷藏车）、GK型、120型、103型制动机、踏面制动空车位");
	
	private final String name;
	
	private TrunkType_2(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
		for (TrunkType_2 model : values()) {
			nameList.add(model.name);
		}
		return nameList;
	}
	
	public String getName() {
		return this.name;
	}
}
