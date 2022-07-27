package Lab03;


public class Question2 {
	
	public static void printHelloWorldFoorLoopIncrement() {
		
		for(int i = 0; i < 10; i++){
			System.out.println("Hello World");

		}
	}
	
	public static void printHelloWorldFoorLoopDecrement() {
		
		for(int i = 10; i > 0; i--){
			System.out.println("Hello World");
		}
	}
	
	public static void printHelloWorldWhileLoopIncrement() {
		
		int i =0;
		while(i < 10) {
			System.out.println("Hello World");
			i++;
		}

	}
	
	public static void printHelloWorldWhileLoopDecrement() {
		
		int i =10;
		while(i > 0) {
			System.out.println("Hello World");
			i--;
		}
		
	}
	
	
	
}
