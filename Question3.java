package Lab03;
import java.util.Random;

public class Question3 {
	
	Random rand = new Random();
	 int randInt = rand.nextInt();
	
	public  void printNumbers() {
		for (int i = 1; i <= randInt; i++) {
			System.out.println(i);
		}
	}
	
	

}
