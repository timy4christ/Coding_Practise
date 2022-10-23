class MyThread extends Thread{ // no freedom to extend any other class
	
	MyThread(){ }

	MyThread(String name){
		super(name);
	}
	
	public void run(){ //throws InterruptedException not allowed it must be handled in the code
		
		System.out.println(getName() + " started");
		try{
			for(int i=1; i<5; i++){
				System.out.println(getName() + " Loop" + i);
				Thread.sleep(1000);
			}
		}
		
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
		
		System.out.println(getName() + " ended");
	}
}


class UserDefinedThreadExtendsThreadClass{
	
	public static void main(String[] args){
		
		try {
			System.out.println(Thread.currentThread().getName() + " started");

			MyThread t1 = new MyThread("Thread1");
			t1.start();

			for(int i=1; i<5; i++){
				System.out.println(Thread.currentThread().getName() + " Loop" + i);
			}

			MyThread t2 = new MyThread("Thread2");
			t2.start();
		
		
			t1.join(); // tells main to wait till t1 completes its task
			t2.join();
			// t1.sleep(1500); // This doesnt do much because this only pauses the end of main Thread
		}
		
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
		
		
		System.out.println(Thread.currentThread().getName() + " ended");
	}
	
	
	
}