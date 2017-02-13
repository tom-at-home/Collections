package intTree;

public class Program {

	public static void main(String[] args) {
		Tree t = new Tree(6);
		
		t.add(9);
		t.add(4);
		t.add(19);
		t.add(29);
		
		
		System.out.println(""+  t.exists(29) ) ;
		
	}
}