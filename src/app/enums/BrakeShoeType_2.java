package app.enums;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

public enum BrakeShoeType_2 {
    TYPE_1("中磷闸瓦"),
    TYPE_2("高磷闸瓦"),
    TYPE_3("低摩合成闸瓦"),
    TYPE_4("高摩合成闸瓦"),
    TYPE_5("盘形制动合成闸片");
	
	private static Map<Integer, BrakeShoeType_2> types = new TreeMap<Integer, BrakeShoeType_2>();
	private final String name;
	
	static {
		int index = 0;
        for (BrakeShoeType_2 type : BrakeShoeType_2.values()) {
            types.put(++index, type);
        }
	}
	
	private BrakeShoeType_2(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
    	Iterator<Entry<Integer, BrakeShoeType_2>> typeItor = types.entrySet().iterator();
        while (typeItor.hasNext()) {
        	nameList.add(typeItor.next().getValue().name);
        }
        return nameList;
    }
}
