
public class Q6 {
	public void max_den() {
		int max = (int) (Math.random()*101);
		int den = (int) (Math.random()*101);
		for (int i =0 ; i<=max;i++) {
			if(i%den == 0) {
			System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Q6 q = new Q6();
		q.max_den();

	}

}
