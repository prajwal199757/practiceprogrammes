package collectionspractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        Map<Integer,String> h1=new HashMap<Integer,String>();
//        Map<Integer,String> h1=new LinkedHashMap<Integer,String>();
//        Map<Integer,String> h1=new TreeMap<Integer,String>();
//        String s1="prajwal";

        h1.put(5,"prajwal");
        h1.put(2,"sagar");
        h1.put(3,"ananth");
        h1.put(7,"veeru");

        for (Map.Entry<Integer,String> entry:h1.entrySet()
             ) {
            Integer key = entry.getKey();
            if (key==3)
            {
                entry.setValue("anki");
            }
           String value = entry.getValue();
            System.out.println("key"+key+"value"+value);
//        Set<Map.Entry<Integer, String>> entryset = h1.entrySet();
//        Iterator<Map.Entry<Integer, String>> itr = entryset.iterator();
//        while (itr.hasNext())
//        {
//            Map.Entry<Integer, String> entry = itr.next();
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }

//        HashMap<String, String> hashmap = new HashMap<String, String>();
//        hashmap.put("Key1", "Value1");
//        hashmap.put("Key2", "Value2");
//        System.out.println("Iterating or looping map using entrySet and Iterator");
//        // Iterating or looping using entrySet() method
//        Set<Map.Entry<String, String>> entrySet1 = hashmap.entrySet();
//        Iterator<Map.Entry<String, String>> entrySetIterator = entrySet1.iterator();
////        Iterator<Map.Entry<String, String>> entrySetIterator = hashmap.iterator();
//        while (entrySetIterator.hasNext()) {
//            Map.Entry entry = entrySetIterator.next();
//            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
    }}

