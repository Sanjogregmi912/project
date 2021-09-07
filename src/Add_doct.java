import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Add_doct implements ActionListener{

JPanel Register_panel = new JPanel();
	
	JFrame frame = new JFrame();
	
	
	JLabel firstname_label = new JLabel();
	JLabel lastname_label = new JLabel();
	JLabel age_label = new JLabel();
	JLabel gender_label = new JLabel();
	JLabel toplabel = new JLabel();
	JLabel Address_label = new JLabel();
	JLabel Department_label = new JLabel();
	JLabel Time_label = new JLabel();
	JLabel Contact_label = new JLabel();
	JLabel time_to_visit = new JLabel();
	JLabel user_name = new JLabel();
	JLabel password_label = new JLabel();
	JLabel confirm_password_label = new JLabel();

	JTextField firstname = new JTextField();
	JTextField lastname = new JTextField();
	JTextField age = new JTextField();
	JTextField address = new JTextField();
	JTextField Time = new JTextField();
	JTextField contact = new JTextField();
	JTextField Username = new JTextField();
	JPasswordField password = new JPasswordField();
	JPasswordField confirm_password = new JPasswordField();
	
	
	JButton submit = new JButton("Submit");
	
	JRadioButton male = new JRadioButton("Male");
	JRadioButton female = new JRadioButton("Female");
	
	String[] department_option = {"Select Here","OPD","Surgical","Dental"};
	String[] time_option = {" Select Your preferable Time ","9:12","1:4"};
	
	JComboBox department = new JComboBox(department_option);
	JComboBox set_time = new JComboBox(time_option); 
	
	JCheckBox show_password = new JCheckBox("Show Password");
	JCheckBox finish = new JCheckBox("Please Complete the Registration Form by selecting this");

	
	Add_doct(){
		toplabel.setBounds(0,0,400,50);
		toplabel.setText("Kindly Fill Your Appropirate Detail ");
		toplabel.setFont(new Font(null,Font.PLAIN,25));
		
		firstname_label.setBounds(40,50,100,50);
		firstname_label.setText("First Name:");
		
		firstname.setBounds(120,70,200,30);
		
		lastname_label.setBounds(500,50,100,50);
		lastname_label.setText("Last Name:");
		
		lastname.setBounds(590,70,200,30);

		
		age_label.setBounds(40,100,100,50);
		age_label.setText("Age:");
		
		age.setBounds(90,120,200,30);
		
		
		gender_label.setBounds(500,100,100,50);
		gender_label.setText("Gender:");
		
		male.setBounds(600,120,70,20);
		male.addActionListener(this);
		
		female.setBounds(670,120,100,20);
		female.addActionListener(this);
		
		Address_label.setBounds(200,150,100,50);
		Address_label.setText("Address:");
		
		address.setBounds(280,160,500,30);
		
		Department_label.setBounds(40,200,100,50);
		Department_label.setText("Department:");
		
		department.setBounds(130,200,100,30);
		department.addActionListener(this);
		

		
		
		Contact_label.setBounds(40,250,300,50);
		Contact_label.setText("Contact:");
		
		contact.setBounds(100,260,200,30);
		
		
	
		
	
		
		
		user_name.setBounds(40,360,300,50);
		user_name.setText("Username  :");
		
		Username.setBounds(110,370,200,30);
		
		password_label.setBounds(400,350,300,50);
		password_label.setText("Password :");
		
		password.setBounds(470,370,200,30);
	
		
		show_password.setBounds(670,370,150,30);
		show_password.addActionListener(this);
		
		
		confirm_password_label.setBounds(370,410,200,30);
		confirm_password_label.setText("Confirm Password : ");
		
		confirm_password.setBounds(500,410,200,30);
		submit.setEnabled(true);
		
		
		submit.setBounds(250,500,200,30);
		
		finish.setBounds(240,450,500,30);
		finish.addActionListener(this);
		submit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				String firstName = firstname.getText();
				String lastName = lastname.getText();
				int Age = Integer.parseInt(age.getText());
				age.setText(Integer.toString(Age));
				String Gender1= male.getText();
				String Gender2 = female.getText();
				String Address = address.getText();
				String Department = (String) department.getSelectedItem();
				String time_of_regis = Time.getText();
				String Contact = contact.getText();
				String time_to_visit = (String) set_time.getSelectedItem();
				String username = Username.getText();
				String Password =confirm_password.getText();
				String age_VALIDATE = age.getText();
				String validateall[] =  new String[12];
				validateall[1]= firstName;
				validateall[2] = lastName;
				validateall[3] = age_VALIDATE;
				validateall[4]=Address;
				validateall[5] = time_of_regis;
				validateall[6]=Contact;
				String url = "jdbc:mysql://127.0.0.1:3306/paitent";
				String user = "root";
				String PAssword= "sheisurs";
				

					String sql = "insert into doc"
							+"(first_name,last_name,age,address,department"
							+ ",contact,username,password)"
							+ " values('"+firstName+"','"+lastName+"','"+Age+"','"+Address+"','"+Department+"'"
							+ ",'"+Contact+"','"+username+"','"+Password+"')";
				dbOperation1 db = new dbOperation1();
				int ans = db.insert(sql);
				if (ans>0) {
					JOptionPane.showMessageDialog(frame, "user created successfully");
				}
				
			}});
		
		


		
		
		Register_panel.add(toplabel);
		Register_panel.add(lastname_label);
		Register_panel.add(age_label);
		Register_panel.add(gender_label);
		Register_panel.add(Address_label);
		Register_panel.add(Contact_label);
		Register_panel.add(Department_label);
		Register_panel.add(firstname_label);
	
		
		Register_panel.add(user_name);
		Register_panel.add(password_label);
		Register_panel.add(confirm_password_label);
		
		Register_panel.add(firstname);
		Register_panel.add(lastname);
		Register_panel.add(age);
		Register_panel.add(address);
		
		Register_panel.add(male);
		Register_panel.add(female);
		Register_panel.add(department);
	
		Register_panel.add(contact);
		
		Register_panel.add(Username);
		Register_panel.add(password);
		Register_panel.add(show_password);
		Register_panel.add(confirm_password);
		
		Register_panel.add(submit);
		Register_panel.add(finish);
		
		Register_panel.setBounds(0,0,1000,800);
		Register_panel.setLayout(new BorderLayout());
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000,800);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.add(Register_panel);
		frame.setLayout(new BorderLayout());
}

	
	
	

		
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==male) {
			System.out.println(" Male");
			
		}
		else if (e.getSource()== female) {
			System.out.println(" Female");
		}
		else if(e.getSource()== department ) {
			System.out.println(department.getSelectedItem());
		

			
		}
		else if (show_password.isSelected()) {
			password.setEchoChar((char)0);
			confirm_password.setEchoChar((char)0);
					
		}else if(finish.isSelected()) {
			submit.setEnabled(true);
		} 

		


		
		else {
			password.setEchoChar('*');
			confirm_password.setEchoChar('*');
		}

	}

}
