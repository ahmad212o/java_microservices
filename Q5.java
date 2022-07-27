
public class Q5 {
	public void even_numbers() {
		int a = (int) (Math.random()*101);
		for (int i = 0; i <= a;i+=2) {
			System.out.print(i+",");
		}
		
}
	public static void main(String args[]) {
		Q5 q = new Q5();
		q.even_numbers();
	}

}

