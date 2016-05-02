package app.enums;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

public enum LocoVehicleType {
	TYPE_1("内燃和电力机车"),
	TYPE_2("滚动轴承货车"),
    TYPE_3("滑动轴承货车");
	
	private static Map<Integer, LocoVehicleType> types = new TreeMap<Integer, LocoVehicleType>();
	private final String name;
	
	static {
		int index = 0;
        for (LocoVehicleType type : LocoVehicleType.values()) {
            types.put(++index, type);
        }
	}
	
	private LocoVehicleType(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
    	Iterator<Entry<Integer, LocoVehicleType>> typeItor = types.entrySet().iterator();
        while (typeItor.hasNext()) {
        	nameList.add(typeItor.next().getValue().name);
        }
        return nameList;
    }
	
	public String getName() {
		return this.name;
	}
}
