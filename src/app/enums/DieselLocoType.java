package app.enums;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

public enum DieselLocoType {
    TYPE_1("DF4(货)型内燃机车"),
    TYPE_2("DF4(客)型内燃机车"),
    TYPE_3("DF4B(货)型内燃机车"),
    TYPE_4("DF4B(客)型内燃机车"),
    TYPE_5("DF4C(货)型内燃机车"),
    TYPE_6("DF8型内燃机车"),
    TYPE_7("DF11型内燃机车"),
    TYPE_8("DF7D型内燃机车(单节)"),
    TYPE_9("ND5型内燃机车"),
    TYPE_10("ND2型内燃机车"),
    TYPE_11("DFH3型内燃机车");
	
	private static Map<Integer, DieselLocoType> types = new TreeMap<Integer, DieselLocoType>();
	private final String name;
	
	static {
		int index = 0;
        for (DieselLocoType type : DieselLocoType.values()) {
            types.put(++index, type);
        }
	}
	
	private DieselLocoType(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
    	Iterator<Entry<Integer, DieselLocoType>> typeItor = types.entrySet().iterator();
        while (typeItor.hasNext()) {
        	nameList.add(typeItor.next().getValue().name);
        }
        return nameList;
    }
}
