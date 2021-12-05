package Collection_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMappgm {
    public static void main(String[] args) {
                Map<Integer,String> map= new LinkedHashMap<>();
                map.put(101,"Neethu");
                map.put(102,"Pauly");
                map.put(103,"Anu");
                map.put(104,"arun");

                map.putIfAbsent(105,"Akshay");

                System.out.println(map);
                System.out.println(map.get(104));

                map.remove(101);
                map.remove(103,"Anu");

                for(Map.Entry<Integer,String> i:map.entrySet()){
                    System.out.println(i.getKey()+"--->"+i.getValue());
                }
    }
}