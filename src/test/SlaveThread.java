package test;

public class SlaveThread extends Thread {

	@Override
	public void run() {

		for (int j = 0; j < 50; j++) {
			System.out.println(getName() + " " + j);
			
			new MasterThread().say();
		}

	}
	
}
