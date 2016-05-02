package app.enums;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

public enum ElectricLocoType_2 {
    TYPE_1("SS1、SS3、SS6型电力机车"),
    TYPE_2("SS3B、SS6B型电力机车"),
    TYPE_3("SS4、SS4G、SS4B型电力机车"),
    TYPE_4("SS7型电力机车"),
    TYPE_5("SS7E、SS9型电力机车"),
    TYPE_6("SS8型电力机车"),
    TYPE_7("DJ1型电力机车"),
    TYPE_8("6K型电力机车"),
    TYPE_9("8G型电力机车"),
    TYPE_10("8K型电力机车");
	
	private static Map<Integer, ElectricLocoType_2> types = new TreeMap<Integer, ElectricLocoType_2>();
	private final String name;
	
	static {
		int index = 0;
        for (ElectricLocoType_2 type : ElectricLocoType_2.values()) {
            types.put(++index, type);
        }
	}
	
	private ElectricLocoType_2(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
    	Iterator<Entry<Integer, ElectricLocoType_2>> typeItor = types.entrySet().iterator();
        while (typeItor.hasNext()) {
        	nameList.add(typeItor.next().getValue().name);
        }
        return nameList;
    }
}
