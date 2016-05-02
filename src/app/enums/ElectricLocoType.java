package app.enums;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

public enum ElectricLocoType {
    TYPE_1("SS1型电力机车"),
    TYPE_2("SS3型电力机车"),
    TYPE_3("SS4型电力机车"),
    TYPE_4("SS7型电力机车"),
    TYPE_5("SS8型电力机车"),
    TYPE_6("6K型电力机车"),
    TYPE_7("8G型电力机车");
	
	private static Map<Integer, ElectricLocoType> types = new TreeMap<Integer, ElectricLocoType>();
	private final String name;
	
	static {
		int index = 0;
        for (ElectricLocoType type : ElectricLocoType.values()) {
            types.put(++index, type);
        }
	}
	
	private ElectricLocoType(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
    	Iterator<Entry<Integer, ElectricLocoType>> typeItor = types.entrySet().iterator();
        while (typeItor.hasNext()) {
        	nameList.add(typeItor.next().getValue().name);
        }
        return nameList;
    }
}
