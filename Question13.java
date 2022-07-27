package Lab03;

import java.util.Random;

public class Question13 {
	static Random rand = new Random();
	static int firstRandInt = rand.nextInt(0, 10000);
	
	public static int numberOfDigits(int number) {
		 int counter = 0;
		 
		 int count = 0, num = number;
		 while (num != 0) {
		      num /= 10;
		      ++count;
		    }
		 
		return count;
		}
	
	public static  int rightDigitsQ10(int number) {
		 int rightDigit;
		 rightDigit = number % 10;
		 
		return rightDigit;
		}
	
	public static int leftDigitsQ11(int number)
    {
        
        while (number >= 10) 
        	number /= 10;
      
        return number;
    }
	
	public static int oppositOrderQ12(int number)
    {
        
		int num = number, reversed = 0;
	    
	    System.out.println("Original Number: " + num);

	    while(num != 0) {
	    
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;

	      num /= 10;
	    }
	    
	    return reversed;
    }
	
	public static int sumOfDigits(int number) {
		int  digit, sum = 0;  
		while(number > 0)  
		{  
	    
		digit = number % 10;  
		sum = sum + digit;  
		number = number / 10;  
		}  
		return sum;
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("number of digits [" + firstRandInt + " --> " + numberOfDigits(firstRandInt) +"]" );
		System.out.println("the first left digit [" + firstRandInt + " --> " + leftDigitsQ11(firstRandInt) +"]" );
		System.out.println("sum of the number’s digits  [" + firstRandInt + " --> " + sumOfDigits(firstRandInt)+"]" );
		System.out.println("opposite order of the number’s digits   [" + firstRandInt + " --> " + oppositOrderQ12(firstRandInt)+"]" );

	}

}
