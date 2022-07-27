
import java.lang.Math;
public class Q7 {
	
public void factorial() {
	int num = (int) ((Math.random() * (7 - 1)) + 1);
	int fact = 1;
	System.out.println("Max :"+num);
	for (int i = 1;i<=num;i++) {
		fact *= i;
	}
	System.out.println("Factorial: "+fact);
	
	
}
	public static void main(String[] args) {
		Q7 q = new Q7();
		q.factorial();
	}

}
