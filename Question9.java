package Lab03;
import java.util.Random;

// Questions 9 - 10 - 

public class Question9 {
	static Random rand = new Random();
	static int firstRandInt = rand.nextInt(0, 10000);
	
	public  void printNumberOfDigits(int number) {
		 int counter = 0;
		 
		 int count = 0, num = number;
		 while (num != 0) {
		      num /= 10;
		      ++count;
		    }
		 
		System.out.println(count);
		}
	
	public static  void printRightDigitsQ10(int number) {
		 int rightDigit;
		 rightDigit = number % 10;
		 
		System.out.println(rightDigit);
		}
	
	public static void printLeftDigitsQ11(int number)
    {
        
        while (number >= 10) 
        	number /= 10;
      
        System.out.println(number);
    }
	
	public static void printoppositOrderQ12(int number)
    {
        
		int num = number, reversed = 0;
	    
	    System.out.println("Original Number: " + num);

	    while(num != 0) {
	    
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;

	      num /= 10;
	    }
	    
	    System.out.println("opposit Number: " + reversed);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstRandInt  );
		printRightDigitsQ10(firstRandInt  );
		System.out.println(1 / 10 );
	}

}
