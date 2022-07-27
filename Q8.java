
public class Q8 {
	public void factorial_inc_for() {
		int num = (int) ((Math.random() * (7 - 1)) + 1);
		int fact = 1;
		System.out.println("Max :"+num);
		for (int i = 1;i<=num;i++) {
			fact *= i;
		}
		System.out.println("Factorial: "+fact);
		
		
	}
	public void factorial_dec_for() {
		int num = (int) ((Math.random() * (7 - 1)) + 1);
		int fact = 1;
		System.out.println("Max :"+num);
		for (int i = num;i>0;i--) {
			fact *= i;
		}
		System.out.println("Factorial: "+fact);
		
		
	}
	public void factorial_dec_while() {
		int num = (int) ((Math.random() * (7 - 1)) + 1);
		int fact = 1;
		System.out.println("Max :"+num);
		int i = num;
		while (i>0) {
			fact *= i;
			i--;
		}
		System.out.println("Factorial: "+fact);
		
		
	}
	public void factorial_inc_while() {
		int num = (int) ((Math.random() * (7 - 1)) + 1);
		int fact = 1;
		System.out.println("Max :"+num);
		int i = 1;
		while (i<=num) {
			fact *= i;
			i++;
		}
		System.out.println("Factorial: "+fact);
		
		
	}
		public static void main(String[] args) {
			Q8 q = new Q8();
			q.factorial_inc_for();
			q.factorial_dec_for();
			q.factorial_inc_while();
			
			q.factorial_dec_while();
		}

	

}
