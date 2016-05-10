package app.enums;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

public enum ReducePressureType {
    PRESSURE_1("50kPa"),
    PRESSURE_2("60kPa"),
    PRESSURE_3("70kPa"),
    PRESSURE_4("80kPa"),
    PRESSURE_5("90kPa"),
    PRESSURE_6("100kPa"),
    PRESSURE_7("110kPa"),
    PRESSURE_8("120kPa"),
    PRESSURE_9("130kPa"),
    PRESSURE_10("140kPa"),
    PRESSURE_11("150kPa"),
    PRESSURE_12("160kPa"),
    PRESSURE_13("170kPa");
	
	private static Map<Integer, ReducePressureType> types = new TreeMap<Integer, ReducePressureType>();
	private final String name;
	
	static {
		int index = 0;
        for (ReducePressureType type : ReducePressureType.values()) {
            types.put(++index, type);
        }
	}
	
	private ReducePressureType(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
    	Iterator<Entry<Integer, ReducePressureType>> typeItor = types.entrySet().iterator();
        while (typeItor.hasNext()) {
        	nameList.add(typeItor.next().getValue().name);
        }
        return nameList;
    }
}
