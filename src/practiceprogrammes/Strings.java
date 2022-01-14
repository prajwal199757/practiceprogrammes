package practiceprogrammes;

public class Strings {

	public static void main(String[] args) {
	int[] a=new int[] {7, 10, 4, 3, 20, 15} ;
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if (a[j]<a[j+1])
				 {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				 }
			}
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
		
	System.out.println(a[2]);
		
	}

}
