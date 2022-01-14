package practiceprogrammes;

import java.util.Scanner;

public class ArraysPractice {
    void rotateAr(int[] arr)
    {
        int max=arr[0];
       for (int i=0;i<arr.length-1;i++)
       {
          if (arr[i]<arr[i+1])
          {
              max=arr[i+1];
          }
       }
        System.out.println(max);
    }
    void leftrotateArray(int[] arr,int n)
    {
        int temp;
        temp=arr[0];
        for (int i=0;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;

    }

    public static void main(String[] args) {
        int[] arr1 = {1,5,3,2};
        for (int i=0;i<arr1.length-1;i++)
        {
            if(arr1[i]>arr1[i+1])
            {
                int temp=arr1[i];
                arr1[i]=arr1[i+1];
                arr1[i+1]=temp;
            }
        }
        for (int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }





    }
}
