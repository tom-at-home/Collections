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
	
	public boolean add( T value ) {
		GenericTree<T> tmp = this;
		
		while( tmp != null ) {
			if(tmp.value.compareTo(value) > 0) {
				if(tmp.lower == null) {
					tmp.lower = new GenericTree( value );
					return true;
				}
				tmp = tmp.lower;
				continue;
			}
			else if(tmp.value.compareTo(value) < 0) {
				if(tmp.greater == null) {
					tmp.greater = new GenericTree( value );
					return true;
				}
				tmp = tmp.greater;
				continue;
			}
			
			else {
				break;
			}			
		}		
		
		return false;
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