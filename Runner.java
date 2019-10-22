import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Runner{
	static BinaryTree sprout;

	public static void main(String[] args) throws IOException{
		sprout = new BinaryTree();
	
		createInterface();
	}
	
	
	public static void createInterface() throws IOException{
		JFrame frame = new JFrame("BinaryTree");

		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(20, 60, 180, 20);
		
		JLabel label1 = new JLabel("");
		label1.setBounds(200, 125, 240, 20);
		JLabel label2 = new JLabel("");
		label2.setBounds(200, 205, 240, 20);
		JLabel label3 = new JLabel("");
		label3.setBounds(200, 290, 240, 20);
		
		JButton add = new JButton("Add number");
		add.setBounds(225, 30, 120, 60);
		
		JTextField value = new JTextField(10);
		value.setBounds(70, 30, 150, 20);
		
		JButton preorder = new JButton("Preorder");
		preorder.setBounds(10, 125, 140, 50);
		
		add.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				    selectionButtonPressed();
				  }

			private void selectionButtonPressed() {
				/*the following conditions are necessary
				 * in making sure that the value can be
				 * analyzed using the binary tree object*/
				boolean truefalse = true; 
				if(value.getText().isEmpty()){
					truefalse = false;
					label.setText("Please enter a value");
				}
				if(value.getText().length() > 3){
					truefalse = false;
					label.setText("No more than 3 digits");
				}
				for(int i = 0; i<value.getText().length(); i++){
					if(Character.isAlphabetic(value.getText().charAt(i))){
						truefalse = false;
						label.setText("It can't be a letter");
					}
				}
				if(truefalse){
					Node newnode = new Node();
					newnode.setValue(Integer.parseInt(value.getText()));
					sprout.insert(newnode, sprout.getOGroot());
					label.setText("The value has been added!");
				}	
				label1.setText("");
				label2.setText("");
				label3.setText("");
			}

			public void actionPerformed1(ActionEvent e) {
				
				
			} 
				} );
		
		
		preorder.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				    selectionButtonPressed();
				  }

			private void selectionButtonPressed() {
				//this action cannot be done if the tree is empty
				if(sprout.isEmpty()){
					label1.setText("The list is empty!");
				}
				else{
					sprout.resetString();
					sprout.preOrder();
					label1.setText(sprout.getString());
				}
				label2.setText("");
				label3.setText("");
			}

			public void actionPerformed1(ActionEvent e) {
				
				
			} 
				} );
		
		
		JButton postorder = new JButton("Postorder");
		postorder.setBounds(10, 200, 140, 50);
		
		postorder.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				    selectionButtonPressed();
				  }

			private void selectionButtonPressed() {
				//this action cannot be done if the tree is empty
				if(sprout.isEmpty()){
					label2.setText("The list is empty!");
				}
				else{
					sprout.resetString();
					sprout.postOrder();
					label2.setText(sprout.getString());
				}
				label1.setText("");
				label3.setText("");
			}

			public void actionPerformed1(ActionEvent e) {
				
				
			} 
				} );
		
		
		
		JButton inorder = new JButton("Inorder");
		inorder.setBounds(10, 275, 140, 50);
		
		inorder.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				    selectionButtonPressed();
				  }

			private void selectionButtonPressed() {
				//this action cannot be done if the tree is empty
				if(sprout.isEmpty()){
					label3.setText("The list is empty!");
				}
				else{
					sprout.resetString();
					sprout.inOrder();
					label3.setText(sprout.getString());
				}
				label1.setText("");
				label2.setText("");
			}

			public void actionPerformed1(ActionEvent e) {
				
				
			} 
				} );
		
		
		
		panel.add(preorder); panel.add(postorder); panel.add(inorder);
		panel.add(label1); panel.add(label2); panel.add(label3); 
		panel.add(value); panel.add(add); panel.add(label);
		 
		panel.setBackground(Color.pink);
		
		frame.add(panel);
		frame.setSize(350, 350);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	
	}


}
