package app.enums;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;
import java.util.Map.Entry;

import app.formula.Six.Type;

public enum LocoType {
    TYPE_1("国产各型电力机车"),
    TYPE_2("6K型电力机车"),
    TYPE_3("8G型电力机车"),
    TYPE_4("国产各型电传动内燃机车"),
    TYPE_5("ND5型内燃机车");
	
	private static Map<Integer, LocoType> types = new TreeMap<Integer, LocoType>();
	private final String name;
	
	static {
		int index = 0;
        for (LocoType type : LocoType.values()) {
            types.put(++index, type);
        }
	}
	
	private LocoType(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
    	Iterator<Entry<Integer, LocoType>> typeItor = types.entrySet().iterator();
        while (typeItor.hasNext()) {
        	nameList.add(typeItor.next().getValue().name);
        }
        return nameList;
    }
}
