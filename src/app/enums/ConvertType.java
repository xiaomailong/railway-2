package app.enums;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

public enum ConvertType {
    TYPE_1("原闸瓦（片）换算压力值"),
    TYPE_2("折算成铸铁闸瓦换算压力值"),
    TYPE_3("折算成高摩合成闸瓦换算压力值"),
    TYPE_4("折算成新高摩合成闸瓦换算压力值"),
    TYPE_5("折算成高摩合成闸片换算压力值");
	
	private static Map<Integer, ConvertType> types = new TreeMap<Integer, ConvertType>();
	private final String name;
	
	static {
		int index = 0;
        for (ConvertType type : ConvertType.values()) {
            types.put(++index, type);
        }
	}
	
	private ConvertType(String name) {
        this.name = name;
    }
	
	public static Vector<String> getNameList() {
    	Vector<String> nameList = new Vector<String>();
    	Iterator<Entry<Integer, ConvertType>> typeItor = types.entrySet().iterator();
        while (typeItor.hasNext()) {
        	nameList.add(typeItor.next().getValue().name);
        }
        return nameList;
    }
}
