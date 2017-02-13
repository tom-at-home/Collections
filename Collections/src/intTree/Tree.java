package intTree;

public class Tree{
	int value;
	
	Tree lower; 
	Tree greater;
	
	
	public Tree(int value) {
		this.value = value;
	}
		
	
	public int exists( int value ) {
		Tree tmp = this;
		int i = 0;
		
		while( tmp != null ) {
			
			if(tmp.value < value) {
				tmp = tmp.lower;
				i++;
				continue;
			}
			
			else if(tmp.value > value) {				
				tmp = tmp.greater;
				i++;
				continue;
			}
			
			else {
				return i;
			}
			
		}		
		
		return -1;		
	}
	
	
	public boolean add( int value ) {
		Tree tmp = this;
		
		while( tmp != null ) {
			if(tmp.value < value) {
				if(tmp.lower == null) {
					tmp.lower = new Tree( value );
					return true;					
				}
				tmp = tmp.lower;
				continue;
			}
			else if(tmp.value > value) {
				if(tmp.greater == null) {
					tmp.greater = new Tree( value );
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
	
}