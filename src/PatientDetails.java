
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class PatientDetails implements ActionListener {

  
        JPanel PatientDetails_panel = new JPanel();

        JFrame frame = new JFrame("Patient Details");

        JLabel firstname_label = new JLabel();
        JLabel lastname_label = new JLabel();
        JLabel age_label = new JLabel();
        JLabel address_label = new JLabel();
        JLabel department_label = new JLabel();
        JLabel contact_label = new JLabel();
        JLabel timetovisit_label = new JLabel();
        JLabel username_label = new JLabel();
        JLabel password_label = new JLabel();
        JLabel search_label = new JLabel();
        JLabel label_back12 = new JLabel();
        

        JTextField firstname = new JTextField();
        JTextField lastname = new JTextField();
        JTextField age = new JTextField();
        JTextField address = new JTextField();
        JTextField contact = new JTextField();
        JTextField timetovisit = new JTextField();
        JTextField username = new JTextField();
        JTextField search = new JTextField();
        JTextField department = new JTextField();
        JTextField password = new JTextField();


        JButton update = new JButton("Update");
        JButton search_btn = new JButton("search");
        JButton save_btn = new JButton("Save");
        JButton back_button = new JButton("Back");



         PatientDetails() {
		


 			back_button.setBounds(500,580,150,40);
 			back_button.setFocusable(false);
 			back_button.addActionListener(this);
 			back_button.setBorder(new EtchedBorder(10));
 			back_button.setForeground(Color.black);
 			back_button.setBackground(Color.LIGHT_GRAY);
 			back_button.addActionListener( this);

            firstname_label.setBounds(40, 70, 100, 50);
            firstname_label.setText("First Name:");

            firstname.setBounds(120, 80, 200, 30);
            firstname.setEditable(false);
            firstname.setForeground(Color.black);

            search_label.setBounds(40,0,100,50);
            search_label.setText("Search: ");

            search.setBounds(120,10,100,30);

            lastname_label.setBounds(40, 120,100,50);
            lastname_label.setText("Last Name:");

            lastname.setBounds(120, 130, 200, 30);
            lastname.setEditable(false);

            age_label.setBounds(40, 170, 100, 50);
            age_label.setText("Age:");

            age.setBounds(120, 180, 200, 30);
            age.setEditable(false);
            address_label.setBounds(40, 220, 100, 50);
            address_label.setText("Address:");

            address.setBounds(120, 230, 200, 30);
            address.setEditable(false);
            department_label.setBounds(40, 270, 100, 50);
            department_label.setText("Department:");

            department.setBounds(120, 280, 200, 30);
            department.setEditable(false);


            contact_label.setBounds(40, 320, 300, 50);
            contact_label.setText("Contact:");

            contact.setBounds(120, 330, 200, 30);
            contact.setEditable(false);
            timetovisit_label.setBounds(40, 370, 300, 50);
            timetovisit_label.setText("Time To Visit:");

            timetovisit.setBounds(120, 380, 200, 30);
            timetovisit.setEditable(false);
            username_label.setBounds(40, 420, 300, 50);
            username_label.setText("Username  :");

            username.setBounds(120, 430, 200, 30);
            username.setEditable(false);


            password_label.setBounds(40, 470, 300, 50);
            password_label.setText("Password :");

            password.setBounds(120, 480, 200, 30);
            password.setEditable(false);
            
            
            update.setBounds(240, 580, 200, 30);
            update.addActionListener(this);
            update.setBorder(new EtchedBorder(10));
            update.setForeground(Color.blue);
            update.setBackground(Color.white);
            update.addActionListener( this);
            
            
            search_btn.setBounds(250, 10, 100, 30);
            search_btn.addActionListener(this);
            search_btn.setFocusable(false);
            search_btn.setBorder(new EtchedBorder(10));
            search_btn.setForeground(Color.blue);
            search_btn.setBackground(Color.white);
            search_btn.addActionListener( this);
            
            
            
            save_btn.setBounds(100, 580, 100, 30);
            save_btn.addActionListener(this);
            save_btn.setFocusable(false);
            save_btn.setVisible(false);
            save_btn.setBorder(new EtchedBorder(10));
            save_btn.setForeground(Color.blue);
            save_btn.setBackground(Color.white);
            save_btn.addActionListener( this);
           
            
 
    		ImageIcon image101 = new ImageIcon("backmydeatilsadmin.jpg");
    		label_back12.setIcon(image101);
    		label_back12.setBounds(0,0,1000,800);
    		label_back12.setVisible(true);

            PatientDetails_panel.add(lastname_label);
            PatientDetails_panel.add(age_label);
            PatientDetails_panel.add(address_label);
            PatientDetails_panel.add(contact_label);
            PatientDetails_panel.add(department_label);
            PatientDetails_panel.add(firstname_label);
            PatientDetails_panel.add(search_label);
            PatientDetails_panel.add(timetovisit_label);
            PatientDetails_panel.add(username_label);
            PatientDetails_panel.add(password_label);

            PatientDetails_panel.add(firstname);
            PatientDetails_panel.add(lastname);
            PatientDetails_panel.add(search);
            PatientDetails_panel.add(age);
            PatientDetails_panel.add(address);
            PatientDetails_panel.add(department);
            PatientDetails_panel.add(contact);
            PatientDetails_panel.add(timetovisit);
            PatientDetails_panel.add(username);
            PatientDetails_panel.add(password);

            PatientDetails_panel.add(update);
            PatientDetails_panel.add(search_btn);
            PatientDetails_panel.add(save_btn);
            PatientDetails_panel.add(back_button);
            PatientDetails_panel.add(label_back12);
            PatientDetails_panel.setBounds(0, 0, 1000, 800);
            PatientDetails_panel.setLayout(new BorderLayout());

            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setSize(1000, 800);
            frame.setLayout(null);
            frame.setVisible(true);
            frame.add(PatientDetails_panel);
            frame.setLayout(new BorderLayout());


        }


    		
    	
        public static void main(String[] args) {
        	new PatientDetails();

    }
int clicked = 0;
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == search_btn) {
			clicked++;
			if (clicked==1) {
			if(search.getText().equals("")) {
				JOptionPane.showMessageDialog(frame, "there is nothing to search");
			}
			String query = "Select * from register where first_name ='"+search.getText()+"'";
			dbOperation1 db =new dbOperation1();
			ResultSet rs =db.select(query);
			try {
				while (rs.next()) {
					firstname.setText(rs.getString("first_name")) ;
					lastname.setText(rs.getString("last_name"));
					age.setText(rs.getString("age"));
					address.setText(rs.getString("address"));
					department.setText(rs.getString("department"));
					contact.setText(rs.getString("contact"));
					timetovisit.setText(rs.getString("time_to_visit"));
					username.setText(rs.getString("username"));
					password.setText(rs.getString("password"));
				
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			
			}
		}
		}
		else if(e.getSource()==update) {

			firstname.setEditable(true);
			lastname.setEditable(true);
			age.setEditable(true);
			address.setEditable(true);
			department.setEditable(true);
			contact.setEditable(true);
			timetovisit.setEditable(true);
			username.setEditable(true);
			password.setEditable(true);
			save_btn.setVisible(true);
			
				
			
			
		}
		else if(e.getSource()==save_btn) {
            String firstName = firstname.getText();
            String lastName = lastname.getText();
            int Age = Integer.parseInt(age.getText());
            age.setText(Integer.toString(Age));
            String Address = address.getText();
            String Department =department.getText();
            String Contact = contact.getText();
            String time_to_visit = (String) timetovisit.getText();
            String Username = username.getText();
            String Password = password.getText();
			String sql = "update register set first_name ='"+firstName+"',last_name='"+lastName+"',age='"+Age+"',address='"+Address+"',department='"+Department+"',contact='"+Contact+"',time_to_visit='"+time_to_visit+"',username='"+Username+"',password='"+Password+"'where first_name ='"+search.getText()+"'";
			dbOperation1 db = new dbOperation1();
			int ans =db.update(sql);
			if(ans != 0) {
				JOptionPane.showMessageDialog(frame, "Data Updated Successfully");
			}

			}
		else if(e.getSource() == back_button) {
			frame.setVisible(false);
		
	}
	}
}
