package thread;

public class SyncBlockExample extends Thread {

	private SyncBlockExample sync;
	public SyncBlockExample()
	{
		
	}
	public SyncBlockExample(SyncBlockExample sync)
	{
		this.sync = sync;
	}
	
	public void run()
	{
		sync.dysplay(sync);
	}
	public void dysplay(SyncBlockExample x)
	{
		synchronized(x){
		for (int i=0;i<11;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}}
	}
	public static void main(String[] args) {
		SyncBlockExample s1 = new SyncBlockExample();
		SyncBlockExample s2 = new SyncBlockExample(s1);
		SyncBlockExample s3 = new SyncBlockExample(s1);
		s3.start();
		s2.start();
	}

}
