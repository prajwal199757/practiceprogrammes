package Arrays;

import java.util.HashSet;
import java.util.Set;

public class Programme1 {
    public static void main(String[] args) {
        String s1="i.like.this.program.very.much";
        StringBuilder s2=new StringBuilder();
        String[] s3 = (s1.split("\\."));
        for (int i=s3.length-1;i>=0 ;i--)
        {
            s2=s2.append(s3[i]);


        }
        System.out.println(s2);



    }
}
