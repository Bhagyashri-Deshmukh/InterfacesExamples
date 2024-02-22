package interfaces;

//example 1
public class FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("New Thread Created.");
			}
		}).start();
	}

}

//example 2
 class FunctionalInterfaceTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Thread(()->{
			System.out.println("This is a lambda expression to create new object.");
		}).start();
	}

}