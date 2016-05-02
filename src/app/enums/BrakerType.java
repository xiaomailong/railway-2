package app.enums;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

public enum BrakerType {
    TYPE_1("K1及K2型制动机"),
    TYPE_2("GK型制动机重车位"),
    TYPE_3("GK型制动机空车位"),
    TYPE_4("120型制动机重车位"),
    TYPE_5("120型制动机空车位"),
    TYPE_6("103型制动机重车位"),
    TYPE_7("103型制动机空车位"),
    TYPE_8("L3型、GL3型关闭附加风缸、104型"),
    TYPE_9("机车各型分配阀");
	
	private static Map<Integer, BrakerType> types = new TreeMap<Integer, BrakerType>();
	private final String name;
	
	static {
		int index = 0;
        for (BrakerType type : BrakerType.values()) {
            types.put(++index, type);
        }
	}
	
	private BrakerType(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
    	Iterator<Entry<Integer, BrakerType>> typeItor = types.entrySet().iterator();
        while (typeItor.hasNext()) {
        	nameList.add(typeItor.next().getValue().name);
        }
        return nameList;
    }
}
