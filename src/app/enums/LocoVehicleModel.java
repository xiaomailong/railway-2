package app.enums;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

public enum LocoVehicleModel {
	ELECTRIC("电力机车"),
	DIESEL("内燃机车"),
    BUS("客车"),
    TRUNK("货车"),
    EMU("动车组");
	
	private static Map<Integer, LocoVehicleModel> types = new TreeMap<Integer, LocoVehicleModel>();
	private final String name;
	
	static {
		int index = 0;
        for (LocoVehicleModel type : LocoVehicleModel.values()) {
            types.put(++index, type);
        }
	}
	
	private LocoVehicleModel(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
    	Iterator<Entry<Integer, LocoVehicleModel>> typeItor = types.entrySet().iterator();
        while (typeItor.hasNext()) {
        	nameList.add(typeItor.next().getValue().name);
        }
        return nameList;
    }
	
	public String getName() {
		return this.name;
	}
}
