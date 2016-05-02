package app.enums;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

public enum BrakerType_2 {
    TYPE_1("各型机车制动机"),
    TYPE_2("客货车三通阀、GK型、120型制动机重车位"),
    TYPE_3("103型制动机重车位、104型制动机"),
    TYPE_4("GK型、120型制动机空车位"),
    TYPE_5("103型制动机空车位");
	
	private static Map<Integer, BrakerType_2> types = new TreeMap<Integer, BrakerType_2>();
	private final String name;
	
	static {
		int index = 0;
        for (BrakerType_2 type : BrakerType_2.values()) {
            types.put(++index, type);
        }
	}
	
	private BrakerType_2(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
    	Iterator<Entry<Integer, BrakerType_2>> typeItor = types.entrySet().iterator();
        while (typeItor.hasNext()) {
        	nameList.add(typeItor.next().getValue().name);
        }
        return nameList;
    }
}
