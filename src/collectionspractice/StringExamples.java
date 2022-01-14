package collectionspractice;

public class StringExamples {
    public static void main(String[] args) {
        String s3=new String("prajwal");
        for (int i=0;i<s3.length();i++)
        {
            if(s3.charAt(i)=='w')
            {
                s3=s3.replace(s3.charAt(i),'a');
            }

            System.out.println(s3.charAt(i));

        }



    }
}
