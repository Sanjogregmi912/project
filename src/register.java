import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import javax.swing.ImageIcon;
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

public class register implements ActionListener {
	Font font = new Font("Times New Roman",Font.PLAIN,18);
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
	JLabel label_back = new JLabel();

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
	

	
	register(){
		toplabel.setBounds(0,0,400,50);
		toplabel.setText("Kindly Fill Your Appropirate Detail ");
		toplabel.setFont(new Font(null,Font.PLAIN,26));
		toplabel.setForeground(Color.black);
		
		firstname_label.setBounds(100,30,100,50);
		firstname_label.setText("First Name:");
		firstname_label.setFont(font);
		
		firstname.setBounds(90,70,200,30);

		
		lastname_label.setBounds(500,30,100,50);
		lastname_label.setText("Last Name:");
		lastname_label.setFont(font);
		
		lastname.setBounds(500,70,200,30);

		
		age_label.setBounds(95,100,100,50);
		age_label.setText("Age:");
		age_label.setFont(font);
		
		age.setBounds(95,140,200,30);
		
		
		gender_label.setBounds(500,100,100,50);
		gender_label.setText("Gender:");
		gender_label.setBackground(null);
		
		male.setBounds(560,120,70,20);
		male.addActionListener(this);
		male.setBackground(null);
		
		female.setBounds(630,120,100,20);
		female.addActionListener(this);
		female.setBackground(null);
		
		Address_label.setBounds(95,160,100,50);
		Address_label.setText("Address:");
		Address_label.setFont(font);
		
		address.setBounds(95,200,500,30);
		
		Department_label.setBounds(600,400,100,50);
		Department_label.setText("Department:");
		Department_label.setFont(font);
		
		department.setBounds(600,440,100,30);
		department.addActionListener(this);
		
		Time_label.setBounds(350,400,300,50);
		Time_label.setText("Time of registration:");
		Time_label.setFont(font);
		
		Currenttime();
		
		
		
		Contact_label.setBounds(95,225,300,50);
		Contact_label.setText("Contact:");
		Contact_label.setFont(font);
		
		contact.setBounds(95,260,200,30);
		
		
		time_to_visit.setBounds(95,400,300,50);
		time_to_visit.setText("Time To Visit:");
		time_to_visit.setFont(font);
		
		set_time.setBounds(95,440,200,30);
		
		
		user_name.setBounds(95,280,300,50);
		user_name.setText("Username  :");
		user_name.setFont(font);
		
		Username.setBounds(95,320,200,30);
		
		password_label.setBounds(95,340,300,50);
		password_label.setText("Password :");
		password_label.setFont(font);
		
		password.setBounds(95,380,200,30);
	
		
		show_password.setBounds(570,370,150,30);
		show_password.addActionListener(this);
		
		
		confirm_password_label.setBounds(350,340,200,30);
		confirm_password_label.setText("Confirm Password : ");
		confirm_password_label.setFont(font);
		
		confirm_password.setBounds(350,380,200,30);
		ImageIcon image1234 = new ImageIcon("sub.png");
		submit.setIcon(image1234);
		submit.setEnabled(true);
		submit.setBackground(Color.white);
		submit.setBounds(250,500,160,30);
		
	
		submit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				String firstName = firstname.getText();
				String lastName = lastname.getText();
				int Age = Integer.parseInt(age.getText());
				age.setText(Integer.toString(Age));

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

				

					String sql = "insert into register"
							+"(first_name,last_name,age,address,department"
							+ ",time_Of_registration,contact,time_to_visit,username,password)"
							+ " values('"+firstName+"','"+lastName+"','"+Age+"','"+Address+"','"+Department+"','"+time_of_regis+"','"+Contact+"'"
							+ ",'"+time_to_visit+"','"+username+"','"+Password+"')";
				dbOperation1 db = new dbOperation1();
				int ans = db.insert(sql);
				if (ans>0) {
					JOptionPane.showMessageDialog(frame, "user created successfully");
				}
				
			}});
		
		

		ImageIcon image1 = new ImageIcon("regback.jpg");
		label_back.setIcon(image1);
	 	label_back.setBounds(0,0,1000,800);
		
		
		Register_panel.add(toplabel);
		Register_panel.add(lastname_label);
		Register_panel.add(age_label);
		Register_panel.add(gender_label);
		Register_panel.add(Address_label);
		Register_panel.add(Contact_label);
		Register_panel.add(Department_label);
		Register_panel.add(firstname_label);
		Register_panel.add(Time_label);
		Register_panel.add(time_to_visit);
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
		Register_panel.add(Time);
		Register_panel.add(contact);
		Register_panel.add(set_time);
		Register_panel.add(Username);
		Register_panel.add(password);
		Register_panel.add(show_password);
		Register_panel.add(confirm_password);
		
		Register_panel.add(submit);
		
		Register_panel.add(label_back);
		
		Register_panel.setBounds(0,0,1000,800);
		Register_panel.setLayout(new BorderLayout());
		
		
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(1000,800);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.add(Register_panel);
		frame.setLayout(new BorderLayout());
}
	public void Currenttime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		Time.setText(dtf.format(now));
		Time.setBounds(350,435,200,30);
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
		else if (e.getSource()== set_time) {
			System.out.println(set_time.getSelectedItem());
			
		}
		else if (show_password.isSelected()) {
			password.setEchoChar((char)0);
			confirm_password.setEchoChar((char)0);
					
		}
		


		
		else {
			password.setEchoChar('*');
			confirm_password.setEchoChar('*');
		}

	}

public static void main(String args[]) {
	new register();
}
}
