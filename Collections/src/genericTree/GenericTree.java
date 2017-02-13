package genericTree;

public class GenericTree<T extends Comparable<T> >{
	
	public T value; 
	
	GenericTree lower;
	GenericTree greater;
	
	public GenericTree(T t) {
		this.value = t;
	}
	
	
	public String toString() {
		return "The value: " + value;
	}
	
	
	
	
	
	public boolean exists(T value) {
		GenericTree<T> t = this;
		while(t != null) {

			if( t.value.compareTo( value )==0) {
				return true;
			}

			else if( t.value.compareTo( value ) > 0 ) {
				t = t.lower;
			}
			else {
				t = t.greater;
			}			
		}
		
		return false;
	}
}