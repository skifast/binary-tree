

public class Node{
	/*getter and setter methods to access node information*/
	
	Node rightChild;
	Node leftChild;
	int value;
	
	public Node(){
		this.rightChild = null;
		this.leftChild = null;
		this.value = 0;
	}
	public Node(Node rightChild, Node leftChild, int value){
		this.rightChild = rightChild;
		this.leftChild = leftChild;
		this.value = value;
	}
	
	public Node getRightChild(){
		return rightChild;
	}
	
	public void setRightChild(Node node){
		this.rightChild = node;
	}
	
	public Node getLeftChild(){
		return leftChild;
	}
	
	public void setLeftChild(Node node){
		this.leftChild = node;
	}
	
	public int getValue(){
		return value;
	}
	
	public void setValue(int num){
		this.value = num;
	}
	
	
}
