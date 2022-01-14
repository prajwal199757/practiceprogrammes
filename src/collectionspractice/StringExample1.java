package collectionspractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringExample1 {
    public static void main(String[] args) {
        String s1="prajwal";
        Map<Character,Integer> m1=new HashMap<>();
        List<Integer> l1=new ArrayList<>();
        for (int i=0;i<s1.length();i++)
        {
            Character c=s1.charAt(i);
            if(m1.containsKey(c))
            {
               int count=m1.get(c);
               count=count+1;
               m1.put(c,count);
            }
            else
            {
                m1.putIfAbsent(c,1);
            }

        }
        for ( Map.Entry<Character,Integer> entry:m1.entrySet()
             ) {
//            Character key = entry.getKey();
            Integer value = entry.getValue();

            l1.add(value);
        }
        System.out.println(l1);
        Collections.reverse(l1);
        System.out.println(l1);
        Integer max=l1.indexOf(0);

    }


}
