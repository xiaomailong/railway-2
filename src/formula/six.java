/**
 * 
 */
package formula;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 *
 */
public class six {
    public enum Type {
        TYPE_1("韶山1,3,4型", "2.25", "0.0190", "0.000320"),
        TYPE_2("韶山7型", "1.40", "0.0038", "0.000348"),
        TYPE_3("韶山8型", "1.02", "0.0035", "0.000426"),
        TYPE_4("6K型", "3.25", "0.0092", "0.000308"),
        TYPE_5("8G型", "2.55", "0.0083", "0.000212"),
        TYPE_6("东风4,4B,4C,7D型", "2.28", "0.0293", "0.000178"),
        TYPE_7("东风8型", "2.40", "0.0022", "0.000391"),
        TYPE_8("东风11型", "0.86", "0.0054", "0.000218"),
        TYPE_9("东风型", "2.93", "0.0073", "0.000271"),
        TYPE_10("ND5型", "1.31", "0.0167", "0.000391"),
        TYPE_11("ND2型", "2.98", "0.0202", "0.000033"),
        TYPE_12("DFH3型", "2.40", "0.0095", "0.000673"),
        TYPE_13("DF8c(交)型", "1.14", "0.0003", "0.000369"),
        TYPE_14("前进型", "0.70", "0.0243", "0.000673"),
        TYPE_15("建设型", "0.74", "0.0168", "0.007");
        
    	private final String modelName;
    	private final String coefficient_1;
    	private final String coefficient_2;
    	private final String coefficient_3;
    	private static Map<Integer, Type> types = new TreeMap<Integer, Type>();
    	
    	static {
    	    int index = 0;
            for (Type type : Type.values()) {
                types.put(++index, type);
            }
    	}
    	
        private Type(String modelName, String coefficient_1, String coefficient_2, String coefficient_3) {
            this.modelName = modelName;
            this.coefficient_1 = coefficient_1;
            this.coefficient_2 = coefficient_2;
            this.coefficient_3 = coefficient_3;
        }
        
        public String getModelName() {
            return this.modelName;
        }
        
        public static String getModelChoices() {
            StringBuilder modelChoices = new StringBuilder();
            Iterator<Entry<Integer, Type>> typeItor = types.entrySet().iterator();
            while (typeItor.hasNext()) {
                Entry<Integer, Type> typeEntry = typeItor.next();
                modelChoices.append(typeEntry.getKey());
                modelChoices.append(" - ");
                modelChoices.append(typeEntry.getValue().getModelName());
                modelChoices.append("\n");
            }
            return modelChoices.toString();
        }
        
        public static Type fromVaule(int value) {
            return types.get(value);
        }
        
        public BigDecimal calc(BigDecimal speed) {
            BigDecimal resistence = new BigDecimal(this.coefficient_1);
            if (TYPE_12 == this) {
                resistence = resistence.subtract(speed.multiply(new BigDecimal(this.coefficient_2)));
            } else {
                resistence = resistence.add(speed.multiply(new BigDecimal(this.coefficient_2)));
            }
            return resistence.add(speed.multiply(speed).multiply(new BigDecimal(this.coefficient_3)));
        }
    }
    
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("请输入参数：速度v 车型m\n"
                    + "其中车型m有如下选择：\n"
                    + Type.getModelChoices());
            System.exit(1);
        }
        try {
            BigDecimal speed = new BigDecimal(args[0]);
            int model = Integer.parseInt(args[1]);
            BigDecimal result = Type.fromVaule(model).calc(speed);
            System.out.println("单位基本阻力是：" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
