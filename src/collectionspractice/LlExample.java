package collectionspractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LlExample {
    public static void main(String[] args) {
        Person p1=new Person(1,"prajwal","bangalore");
        Person p2=new Person(2,"amit","chennai");
        Person p3=new Person(3,"bharath","kolkata");
        List<Person> l1=new ArrayList<>();
        l1.add(p1);
        l1.add(p2);
        l1.add(p3);
//
        Iterator<Person> itr = l1.iterator();
        while (itr.hasNext())
        {
            Person o = itr.next();
            System.out.println(o.getId());

        }


//        System.out.println(l1);
//        for (Person ele:l1
//             ) {
//            if (ele.getId()==1)
//            {
//                ele.setName("pramod");
//            }
//            System.out.println(ele);
//        }

    }
}
