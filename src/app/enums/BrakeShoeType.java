package app.enums;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

public enum BrakeShoeType {
    TYPE_1("中磷闸瓦"),
    TYPE_2("高磷闸瓦"),
    TYPE_3("低摩合成闸瓦"),
    TYPE_4("高摩合成闸瓦和闸片");
	
	private static Map<Integer, BrakeShoeType> types = new TreeMap<Integer, BrakeShoeType>();
	private final String name;
	
	static {
		int index = 0;
        for (BrakeShoeType type : BrakeShoeType.values()) {
            types.put(++index, type);
        }
	}
	
	private BrakeShoeType(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
    	Iterator<Entry<Integer, BrakeShoeType>> typeItor = types.entrySet().iterator();
        while (typeItor.hasNext()) {
        	nameList.add(typeItor.next().getValue().name);
        }
        return nameList;
    }
}
