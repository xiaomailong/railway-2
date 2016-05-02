package app.enums;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

public enum DieselLocoType_3 {
    TYPE_1("DF型内燃机车"),
    TYPE_2("DF2型内燃机车"),
    TYPE_3("DF4型内燃机车"),
    TYPE_4("DF4B、DF4C型内燃机车"),
    TYPE_5("DF4D型内燃机车"),
    TYPE_6("DF4E(双节)型内燃机车"),
    TYPE_7("DF5、DF7型内燃机车"),
    TYPE_8("DF7B型内燃机车"),
    TYPE_9("DF7C型内燃机车"),
    TYPE_10("DF7D型内燃机车"),
    TYPE_11("DF8型内燃机车"),
    TYPE_12("DF8B型内燃机车"),
    TYPE_13("DF11型内燃机车"),
    TYPE_14("DF11G(双节)型内燃机车"),
    TYPE_15("DFH2型内燃机车"),
    TYPE_16("DFH3型内燃机车"),
    TYPE_17("DFH5型内燃机车"),
    TYPE_18("BJ型内燃机车"),
    TYPE_19("ND2型内燃机车"),
    TYPE_20("ND3型内燃机车"),
    TYPE_21("ND5型内燃机车"),
    TYPE_22("NY6、NY7型内燃机车");
	
	private static Map<Integer, DieselLocoType_3> types = new TreeMap<Integer, DieselLocoType_3>();
	private final String name;
	
	static {
		int index = 0;
        for (DieselLocoType_3 type : DieselLocoType_3.values()) {
            types.put(++index, type);
        }
	}
	
	private DieselLocoType_3(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
    	Iterator<Entry<Integer, DieselLocoType_3>> typeItor = types.entrySet().iterator();
        while (typeItor.hasNext()) {
        	nameList.add(typeItor.next().getValue().name);
        }
        return nameList;
    }
}
