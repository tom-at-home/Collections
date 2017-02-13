package ownSolution;

public class TreeMap {

	int value;
	TreeMap root = null;	
	TreeMap lower = null;	
	TreeMap greater = null;
	
	public void add(int value){
		
		if(this.root == null){
			this.root = new TreeMap();
			this.root.value = value;
		}
		else{
			TreeMap insert_pos = getProperLeaf(this.root, value);
			if(value < insert_pos.value){
				insert_pos.lower = new TreeMap();
				insert_pos.lower.value = value;
				System.out.println(insert_pos.lower.value + " hinzugefuegt zu " + insert_pos.value);
			}
			else if (value > insert_pos.value){
				insert_pos.greater = new TreeMap();
				insert_pos.greater.value = value;
				System.out.println(insert_pos.greater.value + " hinzugefuegt zu " + insert_pos.value);			
			}
		}
		
	}
	
	public TreeMap getProperLeaf(TreeMap curr_pos, int value){
		
		if(value < curr_pos.value){
			if(curr_pos.lower == null){
				return curr_pos;
			}
			else{
				return getProperLeaf(curr_pos.lower, value);
			}
		}
		else if(value > curr_pos.value){
			if(curr_pos.greater == null){
				return curr_pos;
			}
			else{
				return getProperLeaf(curr_pos.greater, value);
			}			
		}
		
		return curr_pos;
	}	
	
}
