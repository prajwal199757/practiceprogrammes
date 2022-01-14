package practiceprogrammes;

class Hi extends Thread
{
public void run()
{
	for(int i=0;i<5;i++)
	{
		System.out.println("hii");	
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}

class Hello extends Thread
{
public void run()
{
	for(int i=0;i<5;i++)
	{
		System.out.println("hello");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}

public class Programme1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hi h1 = new Hi();
		Hello h2=new Hello();
		h1.start();
		h2.start();
	}

}
