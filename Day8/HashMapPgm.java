package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapPgm {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>(5);
        map.put("English",40);
        map.put("Hindi",20);
        map.put("Maths",45);
        map.put("Science",31);
        map.put("History",70);
        for (Map.Entry<String,Integer> m:map.entrySet()){
            if (m.getValue()>50){
                System.out.println(m.getKey()+ "->"+ m.getValue());
                System.out.println("Secured A Grade in :"+ m.getKey());
            }
            else if (m.getValue()>=40 && m.getValue()<49){
                System.out.println(m.getKey()+ "->"+ m.getValue());
                System.out.println("Secured B Grade in :"+ m.getKey());
            }
            else if ((m.getValue()>=30 && m.getValue()<39)){
                System.out.println(m.getKey()+ "->"+ m.getValue());
                System.out.println("Secured C Grade in "+ m.getKey());
            }
            else {
                System.out.println("Failed in :"+ m.getKey());
            }

        }



    }
}
