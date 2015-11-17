package test;

/**
 * 主线程等待子线程结束后关闭
 * 
 * @author sunyunjie
 *
 */
public class ThreadSyncTest {

	private static int flag = 0;

	public static void main(String[] args) {

		new Thread1().start();
		new Thread2().start();
		
	}

	static class Thread1 extends Thread {
		@Override
		public void run() {
			System.out.println(getName() + " is started");
			while (flag != 1) {
				
			}
			flag = 0;
			System.out.println(getName() + " is back");
		}
	}

	static class Thread2 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println(getName() + " " + i);
			}
			flag = 1;
		}
	}

}
