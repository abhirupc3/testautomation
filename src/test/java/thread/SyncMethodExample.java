package thread;

public class SyncMethodExample extends Thread {

	private SyncMethodExample sync;
	public SyncMethodExample()
	{
		
	}
	public SyncMethodExample(SyncMethodExample sync)
	{
		this.sync = sync;
	}
	
	public void run()
	{
		sync.dysplay();
	}
	public synchronized void dysplay()
	{
		for (int i=0;i<11;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		SyncMethodExample s1 = new SyncMethodExample();
		SyncMethodExample s2 = new SyncMethodExample(s1);
		SyncMethodExample s3 = new SyncMethodExample(s1);
		s3.start();
		s2.start();
	}

}
