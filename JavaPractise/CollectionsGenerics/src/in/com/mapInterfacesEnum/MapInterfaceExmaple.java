package in.com.mapInterfacesEnum;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MapInterfaceExmaple {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Zohaib",34);
        map.put("Neha",22);
        map.put("Nazi",3);
        map.put("Vikki",88);
        map.put("Lollipop",67);

        for (String s : map.keySet()) {
            System.out.printf("%s : %s\n", s,map.get(s));
        }
    }
}
