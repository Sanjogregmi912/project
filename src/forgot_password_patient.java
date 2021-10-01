import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class forgot_password_patient implements ActionListener {
 JFrame frame = new JFrame();
 JLabel label1 = new JLabel();
 JLabel label2 = new JLabel();
 JLabel label3 = new JLabel();
 JLabel label4 = new JLabel();
 JTextField number_text = new JTextField();
 JTextField username_text = new JTextField();
 JTextField password1_text = new JTextField();
 JTextField password2_text = new JTextField();
 
 JButton search = new JButton("Search ");
 JButton save = new JButton("save ");
 
 
	forgot_password_patient(){
		number_text.setBounds(220,20,200,50);
		username_text.setBounds(200,80,200,50);
		
		label1.setText("Please Input your Phone Number : ");
		label1.setBounds(10,20,300,40);
		
		label2.setText("Please Input your Username : ");
		label2.setBounds(10,70,300,40);
		
		label3.setText("Please type your new Password : ");
		label3.setBounds(10,270,300,40);
		label3.setVisible(false);
		password1_text.setBounds(250,270,200,50);
		password1_text.setVisible(false);
		
		label4.setText("Please Retype your new Password : ");
		label4.setBounds(10,350,300,40);
		label4.setVisible(false);
		password2_text.setBounds(250,350,200,50);
		password2_text.setVisible(false);
		
		search.setBounds(30,150,100,50);
		search.addActionListener(this);
		
		save.setBounds(230,450,100,50);
		save.addActionListener(this);
		save.setVisible(false);
		
		frame.setVisible(true);// make frame visible
		frame.setSize(600,600);//set x and y dimension 
		frame.setTitle("FORGOT PASSWORD");//set the title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit the application
		frame.setResizable(false);//prevent frame from resizeable
		frame.add(label1);
		frame.add(label2);
		frame.add(search);
		frame.add(label3);
		frame.add(label4);
		frame.add(password1_text);
		frame.add(password2_text);
		frame.add(number_text);
		frame.add(username_text);
		frame.add(save);
		frame.setLayout(new BorderLayout());
	}
	public static void main(String args[]) {
		new  forgot_password_patient();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
 if(e.getSource() == search) {
	 if(number_text.getText().equals("")&& username_text.getText().equals("") ) {
		 JOptionPane.showMessageDialog(frame, "You havenot entered your number and username ");
	 }
	 else {
	 String query = "Select * from register where contact ='"+number_text.getText()+"' and username = '"+username_text.getText()+"'";
	 dbOperation1 db =new dbOperation1();
	 ResultSet rs = db.select(query);
	 try {
		 if(rs.next()) {
			 JOptionPane.showMessageDialog(frame, "User found !!!");
			 label3.setVisible(true);
			 label4.setVisible(true);
			 password1_text.setVisible(true);
			 password2_text.setVisible(true);
			 save.setVisible(true);
		 }
		 else {
			 JOptionPane.showMessageDialog(frame, " User Not found !!!");
		 }
	 }
	 catch(SQLException e1) {
		 e1.printStackTrace();
	 }
	}
 }
 else if(e.getSource() == save) {
	 String sql = "update register set password='"+password1_text.getText()+"' where username ='"+username_text.getText()+"'";
	 dbOperation1 db = new dbOperation1();
	 int ans =db.update(sql);
	 if(ans!= 0) {
		 JOptionPane.showMessageDialog(frame, "Password has been Changed Successfully");
		 password1_text.setText("");
		 password2_text.setText("");
		 number_text.setText("");
		 username_text.setText("");
		 
	 }
	
 }
		
	}
}
