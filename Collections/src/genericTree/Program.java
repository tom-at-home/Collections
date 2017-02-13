package genericTree;

public class Program {

	public static void main(String[] args) {
		
		GenericTree<Double> tree = new GenericTree<>( 44.0 );
		
		
		
		System.out.println( tree.exists( 44.0 ) ) ;
		
	}
}