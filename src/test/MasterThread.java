package test;

public class MasterThread extends Thread {

	@Override
	public void run() {

		System.out.println(getName());

		new SlaveThread().start();

		System.out.println(getName() + " OK!");

	}

	public void say() {

		System.out.println("called");

	}

}
