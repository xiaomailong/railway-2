package app.enums;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

public enum DieselLocoType_2 {
    TYPE_1("DF型内燃机车"),
    TYPE_2("DF4(货、客)型内燃机车"),
    TYPE_3("DF4B(货、客)型内燃机车"),
    TYPE_4("DF4C(货、客)型内燃机车"),
    TYPE_5("DF7D型内燃机车"),
    TYPE_6("DF8型内燃机车"),
    TYPE_7("DF11型内燃机车"),
    TYPE_8("ND5型内燃机车"),
    TYPE_9("ND2型内燃机车"),
    TYPE_10("DFH3型内燃机车"),
    TYPE_11("DF8C型内燃机车");
	
	private static Map<Integer, DieselLocoType_2> types = new TreeMap<Integer, DieselLocoType_2>();
	private final String name;
	
	static {
		int index = 0;
        for (DieselLocoType_2 type : DieselLocoType_2.values()) {
            types.put(++index, type);
        }
	}
	
	private DieselLocoType_2(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
    	Iterator<Entry<Integer, DieselLocoType_2>> typeItor = types.entrySet().iterator();
        while (typeItor.hasNext()) {
        	nameList.add(typeItor.next().getValue().name);
        }
        return nameList;
    }
}
