package Lab03;
import java.util.Random;

public class question4 {

	 Random rand = new Random();
	 int firstRandInt = rand.nextInt();
	 int secondRandInt = rand.nextInt();
	 
	 public  void printNumbers() {
		 if (firstRandInt > secondRandInt) {
			 int temp = firstRandInt;
			 firstRandInt = secondRandInt;
			 secondRandInt = temp;
		 }
		
		 for (int i = firstRandInt; i <= secondRandInt; i++) {
				System.out.println(i);
			}
		}
}
