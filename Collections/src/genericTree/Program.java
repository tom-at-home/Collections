package genericTree;

public class Program {

	public static void main(String[] args) {
		
		GenericTree<Double> tree = new GenericTree<>( 44.0 );
		tree.add(10.0);
		tree.add(15.0);
		tree.add(14.0);
		tree.add(9.0);
		tree.add(7.0);
		
		
		System.out.println( tree.exists( 6.0 ) ) ;
		
	}
}