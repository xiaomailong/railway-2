package app.enums;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

public enum LocoType_3 {
    TYPE_1("SS1型电力机车"),
    TYPE_2("SS3型电力机车"),
    TYPE_3("SS4型电力机车"),
    TYPE_4("SS7型电力机车"),
    TYPE_5("SS8型电力机车"),
    TYPE_6("6K型电力机车"),
    TYPE_7("8G型电力机车"),
    TYPE_8("DF型内燃机车"),
    TYPE_9("DF4型(货、客)内燃机车"),
    TYPE_10("DF4B型(货、客)内燃机车"),
    TYPE_11("DF4C型(货)内燃机车"),
    TYPE_12("DF7D型内燃机车"),
    TYPE_13("DF8型内燃机车"),
    TYPE_14("DF11型内燃机车"),
    TYPE_15("ND5型内燃机车"),
    TYPE_16("ND2型内燃机车"),
    TYPE_17("DFH3型内燃机车"),
    TYPE_18("DF8C(交)型内燃机车");
	
	private static Map<Integer, LocoType_3> types = new TreeMap<Integer, LocoType_3>();
	private final String name;
	
	static {
		int index = 0;
        for (LocoType_3 type : LocoType_3.values()) {
            types.put(++index, type);
        }
	}
	
	private LocoType_3(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
    	Iterator<Entry<Integer, LocoType_3>> typeItor = types.entrySet().iterator();
        while (typeItor.hasNext()) {
        	nameList.add(typeItor.next().getValue().name);
        }
        return nameList;
    }
}
