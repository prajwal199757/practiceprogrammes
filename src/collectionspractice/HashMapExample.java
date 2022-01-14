package collectionspractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> s1 = new LinkedHashMap<Integer, String>();
        s1.put(1, "prajwal");
        s1.put(2, "sagar");
        s1.put(3, "samruddh");
        s1.put(4, "maharaj");
        s1.put(5, "ankit");
        s1.put(6, "ambika");

        Iterator<Map.Entry<Integer, String>> it = s1.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> data = it.next();

            System.out.println(data.getKey());
            System.out.println(data.getValue());
        }
    }}