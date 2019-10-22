

public class BinaryTree{
	
	Node root;
	Node OGroot;
	int count = 0; 

	String returnString = "";
	
	public BinaryTree(){
		OGroot = null;
		root = null;
	}

	public void resetString(){
		returnString = "";
	}
	
	public String getString(){
		return returnString;
	}
	
	//adds nodes to the binary tree
	public void insert(Node insert, Node root){
		//this condition  adds the node to the tree
		if(root == null){
			count += 1; 
			root = insert; 
			OGroot = root;
		} 
		else if(insert.getValue() > root.getValue()){
			if(root.getRightChild() == null){
				count += 1; 
				root.setRightChild(insert);
			}
			else{
				//recursive call. if the right child is null, then the node
      			//will be added there
				insert(insert, root.getRightChild());
			}
		}
		else{
			if(root.getLeftChild() == null){
				count += 1; 
				root.setLeftChild(insert);
			}
			else{
				insert(insert, root.getLeftChild());
			}
		}
	}
	
	public boolean isEmpty(){ 
		//the root is the first node added to the tree
		//if the tree has no root, the tree is empty
		if(OGroot == null){
			return true;
		}
		else{
			return false;
		}
	}
	
	/*groot is the acting root*/
	//this is not really used
	public Node search(int number, Node groot){
		Node returnNode;
		if(groot.getValue() == number){
			return groot;
		}
		else if(number > groot.getValue()){
			returnNode =  search(number, groot.getRightChild());
		}
		else{
			returnNode =  search(number, groot.getLeftChild());
		}
		return returnNode;
	}
	
	/*returns number of nodes in the tree*/
	public int countNodes(){
		return count;
	}
	
	
	//the following are all of the traversals
	public void inOrder(){
		if(OGroot == null){
			return;
		}
		inOrder(OGroot.getLeftChild());
		returnString = returnString +  OGroot.getValue() + " ";
		inOrder(OGroot.getRightChild());
	}
	
	/*Note: had to look inOrder up online*/
	public void inOrder(Node groot){
		if(groot == null){
			return;
		}
		inOrder(groot.getLeftChild());
		returnString = returnString +  groot.getValue() + " ";
		inOrder(groot.getRightChild());
	
	}
	
	public void preOrder(){
		if(OGroot == null){
			return;
		}
		returnString = returnString +  OGroot.getValue() + " ";
		preOrder(OGroot.getLeftChild());
		preOrder(OGroot.getRightChild());
	}
	
	public void preOrder(Node groot){
		if(groot == null){
			return;
		}
		returnString = returnString +  groot.getValue() + " ";
		preOrder(groot.getLeftChild());
		preOrder(groot.getRightChild());
		
	}
	
	public void postOrder(){
		if(OGroot == null){
			return;
		}
		postOrder(OGroot.getLeftChild());
		postOrder(OGroot.getRightChild());
		returnString = returnString +  OGroot.getValue() + " ";
	}
	
	public void postOrder(Node groot){
		if(groot == null){
			return;
		}
		postOrder(groot.getLeftChild());
		postOrder(groot.getRightChild());
		returnString = returnString +  groot.getValue() + " ";
		
	}
	
	public Node getOGroot(){
		return OGroot;
	}
	

}
