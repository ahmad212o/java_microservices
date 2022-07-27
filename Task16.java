public class Task16 {

	
	//Task14 palindrome 
	public void isPalindrome() {
		int num = (int)(Math.random() * 100000);
		System.out.println(num);
		char[] number = Integer.toString(num).toCharArray();
		
		for(int i = 0, j = number.length-1; j > i; i++, j--) {
			if(j == i) {
				System.out.println("the number "+ num + " is Polindrom");
			}
			if(number[i] != number[j])
			{
				System.out.println("the number "+ num + " is NOT Polindrom");
				break;
			}
		}
	}
	
	//Task15 Boom
	public void boom() {
		
		for(int i = 1; i <= 100; i++) {
			if(i % 7 == 0) {
				System.out.println("Boom");
			}			
			else if(Integer.toString(i).contains("7")) {
				System.out.println("Boom");
			}
			else {
				System.out.println(i);
			}
		}
		
	}
	
	
	
	
	//Task16 Fibonacci Set
	public void Task1() {
		int[] res = new int [40];
		res[0] = 1;
		res[1] = 1;
		
		for(int i = 0; i < 40; i++) {
			if(i == 0 || i == 1) {
				System.out.println(res[i]);
			}
			else {
				res[i] = res[i-1] + res[i-2];
				System.out.println(res[i]);
			}
		}
	}
	public void Task2() {
		int index = (int)(Math.random() * (40-1) + 1);
		int[] res= new int [index];
		res[0] = 1;
		res[1] = 1;
		for(int i = 2; i < index; i++) {
				res[i] = res[i-1] + res[i-2];
			}
		System.out.println(res[6]);
		System.out.println(res[8]);
	}
	public void Task3() {
		int index = (int)(Math.random() * (50-10) + 10);
		int[] res= new int [index];
		res[0] = 1;
		res[1] = 1;
		for(int i = 0; i < index; i++) {
			if(i == 0 || i == 1) {
				System.out.println(res[i]);
			}
			else {
				res[i] = res[i-1] + res[i-2];
				System.out.println(res[i]);
			}
		}
	}

	
	// Task 17 
	public void Task4() {
		char[] arr = {'a','b','c','a','b','d','r','c'};
		int count = 0, aCount = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 'a') {
				count++;
				aCount++;
			}
			else if(arr[i] == 'c') {
				count++;
			}
		}
		System.out.printf("count of a = %d \ncount of a or c = %d",aCount, count);
		
	}
	public void Task5() {
		String name = "John Bryce";
		char[] res = name.toCharArray();
		int count = 0;
		for(int i = 0; i < res.length; i++) {
			if(res[i] == 'h') {
				count++;
			}
		}
		System.out.println("number of h inside the name = "+ count);
	}
	public void Task6() {
		String str = "Sara Shara Shir Cameach";
		char[] res = str.toLowerCase().toCharArray();
		int vowelsCount = 0;
		for(int i = 0; i < res.length; i++) {
			if(res[i] == 'a' 
					|| res[i] == 'e' 
					|| res[i] == 'i' 
					|| res[i] == 'o' 
					|| res[i] == 'u') {
				vowelsCount++;
			}
				
		}
		System.out.println("the number of Vowels = " + vowelsCount);
		
	}



}
