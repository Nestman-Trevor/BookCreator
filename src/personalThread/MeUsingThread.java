package personalThread;

public class MeUsingThread implements Runnable{

	public void run()
	{
		char alphabet;
		for(alphabet = 'A'; alphabet <= 'z'; alphabet++)
		{
			System.out.println((alphabet));
		}
	}
	
	public static void main(String args[]) {
        (new Thread(new MeUsingThread())).start();
        for(int i = 1; i <= 100; i++)
        {
        	System.out.println(i);
        }
    }
}
