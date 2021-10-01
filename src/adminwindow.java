	import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
	import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;
public class adminwindow  implements ActionListener{
	 Font font1 = new Font("Times New Roman",Font.PLAIN,24);
		JPanel panel_main= new JPanel();
		JPanel panel_login = new JPanel();
		JPanel dashboard_panel = new JPanel();
		JPanel option_panel = new JPanel();
		JPanel Total_doct_panel = new JPanel();
		JPanel mydetails_panel = new JPanel();
		JPanel Panel_paitentdetail = new JPanel();
		JPanel Panel_doct_opt = new JPanel();
		
		
		JTextField user_text = new JTextField();
		JTextField pass_text = new JTextField();
		
		JFrame frame = new JFrame();
		
		
		JLabel label = new JLabel();
		JLabel User_label = new JLabel();
		JLabel pass_label = new JLabel();
		JLabel user = new JLabel(); 
		JLabel welcome = new JLabel();
		JLabel label_back =new JLabel();
		JLabel label_back2 =new JLabel();
		JLabel label_back21 =new JLabel();
		
		
		//this is for admin my details
		JLabel firstname_label = new JLabel();
	      JLabel lastname_label = new JLabel();
	      JLabel age_label = new JLabel();
	        JLabel address_label = new JLabel();
	        JLabel email_label = new JLabel();
	        JLabel contact_label = new JLabel();
	        JLabel adminid_label = new JLabel();
	        JLabel username_label = new JLabel();
	        JLabel password_label = new JLabel();
	        
	        JTextField firstname_mydetails = new JTextField();
	        JTextField lastname_mydetails = new JTextField();
	        JTextField age_mydetails = new JTextField();
	        JTextField address_mydetails = new JTextField();
	        JTextField contact = new JTextField();
	        JTextField adminid = new JTextField();
	        JTextField username = new JTextField();
	        JTextField search = new JTextField();
	        JTextField email_mydetails = new JTextField();
	        JTextField password = new JTextField();
		
	        JButton update = new JButton("Update");
	        JButton save_btn = new JButton("Save"); 
		
		JButton register_button = new JButton("Sign Up");
		JButton login_button = new JButton("Login");
		JButton back_button = new JButton("  Back");
 		JButton Dashboard_btn = new JButton("Dashboard");
		JButton paitentdetail_btn = new JButton("Patient Details");
		JButton total_doctor_btn= new JButton("Doctors Details");
		JButton mydetails_btn = new JButton("My details");
		JButton Systemusers_btn = new JButton("System users");
		JButton Logout_btn = new JButton("Logout");
		JButton add_doc = new JButton("Add New Doctor");
		JButton add_patient = new JButton("Add New Patient");
		String up= "Update Paitent";
		JButton update_patient = new JButton("Update Paitent  details");
		JButton Update_doctor = new JButton("Update Doctor Details");
		JButton delete_doctor =new JButton("Delete Doctor Details");
		JButton delete_patient = new JButton("Delete Patient Patient");
		
		
		// table showing doctor details
		
		 JTable doctor_table = new JTable();
		String headers[] = {"Doctor id","First Name","Last Name","Age","Address","Department","Phone Number","Username","Password"};
		DefaultTableModel model = new DefaultTableModel();
		String doc_id=" ";
		String fname=" ";
		String lname=" ";
		String age=" ";
		String department="";
		String address=" ";
		String pnum=" ";
		String email=" ";
		String usern=" ";
		String pass=" ";
		
		
		
		// table showing patient details
		
		JTable Paitent_table = new JTable();
		String headers_paitent[]= {"Paitent id","First Name","Last Name","Age","Address",
				"Consulting Department","Time Of Register","Contact No","Perferred Time To Visit ","Username","Password"};
		DefaultTableModel model_paitent = new DefaultTableModel();
		String p_id ="";
		String firstname ="";
		String lastname ="";
		String page ="";
		String Paddress ="";
		String p_department ="";
		String p_time_of_regis ="";
		String p_contact ="";
		String p_time_of_visit ="";
		String p_username ="";
		String p_password ="";
		adminwindow(){
			//this is for admin my details

            adminid_label.setBounds(40, 70, 100, 50);
            adminid_label.setText("Admin ID: ");

            adminid.setBounds(120, 80, 200, 30);
            adminid.setVisible(false);
            adminid.setEditable(false);


            firstname_label.setBounds(40, 120, 100, 50);
            firstname_label.setText("First Name:");

            firstname_mydetails.setBounds(120, 130, 200, 30);
            firstname_mydetails.setVisible(false);
            firstname_mydetails.setEditable(false);


            lastname_label.setBounds(40, 170,100,50);
            lastname_label.setText("Last Name:");

            lastname_mydetails.setBounds(120, 180, 200, 30);
            lastname_mydetails.setVisible(false);
            lastname_mydetails.setEditable(false);

            age_label.setBounds(40, 220, 100, 50);
            age_label.setText("Age:");

            age_mydetails.setBounds(120, 230, 200, 30);
            age_mydetails.setVisible(false);
            age_mydetails.setEditable(false);

            address_label.setBounds(40, 270, 100, 50);
            address_label.setText("Address:");

            address_mydetails.setBounds(120, 280, 200, 30);
            address_mydetails.setVisible(false);
            address_mydetails.setEditable(false);

            email_label.setBounds(40, 320, 100, 50);
            email_label.setText("Email:");

            email_mydetails.setBounds(120, 330, 200, 30);
            email_mydetails.setVisible(false);
            email_mydetails.setEditable(false);


            contact_label.setBounds(40, 370, 300, 50);
            contact_label.setText("Contact:");

            contact.setBounds(120, 380, 200, 30);
            contact.setVisible(false);
            contact.setEditable(false);

            username_label.setBounds(40, 420, 300, 50);
            username_label.setText("Username  :");

            username.setBounds(120, 430, 200, 30);
            username.setVisible(false);
            username.setEditable(false);



            password_label.setBounds(40, 470, 300, 50);
            password_label.setText("Password :");

            password.setBounds(120, 480, 200, 30);
            password.setVisible(false);
            password.setEditable(false);

            update.setBounds(240, 580, 200, 30);
            update.addActionListener(this);
            update.setBorder(new EtchedBorder(10));
            update.setForeground(Color.blue);
            update.setBackground(Color.white);
            update.addActionListener( this);

            save_btn.setBounds(100, 580, 100, 30);
             save_btn.addActionListener(this);
            save_btn.setFocusable(false);
             save_btn.setVisible(false);
            save_btn.setBorder(new EtchedBorder(10));
             save_btn.setForeground(Color.blue);
             save_btn.setBackground(Color.white);
             save_btn.addActionListener( this);
            
			// this above section is for my details admin section
			
			user_text.setBounds(450,250,200,40);
			
			
			pass_text.setBounds(450,350,200,40);
			
			ImageIcon image = new ImageIcon("back.jpg");
			back_button.setIcon(image);
			back_button.setBounds(10,40,100,50);
			back_button.setFocusable(false);
			back_button.addActionListener(this);

			
			register_button.setBounds(550,450,100,50);
			register_button.setFocusable(false);
			register_button.addActionListener(this);
			register_button.setBorder(new EtchedBorder(10));
			register_button.setForeground(Color.black);
			register_button.setBackground(Color.CYAN);
			register_button.setFont(font1);
			
			login_button.setBounds(400,450,100,50);
			login_button.setFocusable(false);
			login_button.addActionListener(this);
			login_button.setVisible(true);
			login_button.setBorder(new EtchedBorder(10));
			login_button.setForeground(Color.black);
			login_button.setBackground(Color.orange);
			login_button.setFont(font1);
			
			Dashboard_btn.setBounds(20,20,200,50);
			Dashboard_btn.setFocusable(false);
			Dashboard_btn.addActionListener(this);
			Dashboard_btn.setVisible(false);
			Dashboard_btn.setBorder(new EtchedBorder(5));
			Dashboard_btn.setForeground(Color.black);
			Dashboard_btn.setBackground(Color.white);
			Dashboard_btn.setFont(font1);

			paitentdetail_btn.setBounds(20,80,200,50);
			paitentdetail_btn.setFocusable(false);
			paitentdetail_btn.addActionListener(this);
			paitentdetail_btn.setVisible(false);
			paitentdetail_btn.setBorder(new EtchedBorder(5));
			paitentdetail_btn.setForeground(Color.black);
			paitentdetail_btn.setBackground(Color.white);
			paitentdetail_btn.setFont(font1);
			
			total_doctor_btn.setBounds(20,140,200,50);
			total_doctor_btn.setFocusable(false);
			total_doctor_btn.addActionListener(this);
			total_doctor_btn.setVisible(false);
			total_doctor_btn.setBorder(new EtchedBorder(5));
			total_doctor_btn.setForeground(Color.black);
			total_doctor_btn.setBackground(Color.white);
			total_doctor_btn.setFont(font1);
			
			
			mydetails_btn.setBounds(20,200,200,50);
			mydetails_btn.setFocusable(false);
			mydetails_btn.addActionListener(this);
			mydetails_btn.setVisible(false);
			mydetails_btn.setBorder(new EtchedBorder(5));
			mydetails_btn.setForeground(Color.black);
			mydetails_btn.setBackground(Color.white);
			mydetails_btn.setFont(font1);
			
			Logout_btn.setBounds(20,260,200,50);
			Logout_btn.setFocusable(false);
			Logout_btn.addActionListener(this);
			Logout_btn.setVisible(false);
			Logout_btn.setBorder(new EtchedBorder(5));
			Logout_btn.setForeground(Color.black);
			Logout_btn.setBackground(Color.white);
			Logout_btn.setFont(font1);
			
			
			add_doc.setBounds(1350,80,150,50);
			add_doc.setFocusable(false);
			add_doc.addActionListener(this);
			add_doc.setVisible(false);
			add_doc.setBorder(new EtchedBorder(5));
			add_doc.setForeground(Color.black);
			add_doc.setBackground(Color.white);
			
			
			
			add_patient.setBounds(1350,80,150,50);
			add_patient.setFocusable(false);
			add_patient.addActionListener(this);
			add_patient.setVisible(false);
			add_patient.setBorder(new EtchedBorder(5));
			add_patient.setForeground(Color.black);
			add_patient.setBackground(Color.white);
		
			
			
			
			update_patient.setBounds(1350,140,200,50);
			update_patient.setFocusable(false);
			update_patient.addActionListener(this);
			update_patient.setVisible(false);
			update_patient.setBorder(new EtchedBorder(5));
			update_patient.setForeground(Color.black);
			update_patient.setBackground(Color.white);
			
			
			
			delete_patient.setBounds(1350,200,200,50);
			delete_patient.setFocusable(false);
			delete_patient.addActionListener(this);
			delete_patient.setVisible(false);
			delete_patient.setBorder(new EtchedBorder(5));
			delete_patient.setForeground(Color.black);
			delete_patient.setBackground(Color.white);
			
			
			
			
			Update_doctor.setBounds(1350,140,200,50);
			Update_doctor.setFocusable(false);
			Update_doctor.addActionListener(this);
			Update_doctor.setVisible(false);
			Update_doctor.setBorder(new EtchedBorder(5));
			Update_doctor.setForeground(Color.black);
			Update_doctor.setBackground(Color.white);
			
			
			
			delete_doctor.setBounds(1350,200,200,50);
			delete_doctor.setFocusable(false);
			delete_doctor.addActionListener(this);
			delete_doctor.setVisible(false);
			delete_doctor.setBorder(new EtchedBorder(5));
			delete_doctor.setForeground(Color.black);
			delete_doctor.setBackground(Color.white);
			
			
			
			
			User_label.setBounds(300,250,200,30);
			User_label.setText("Username:");
			User_label.setFont(new Font(null,Font.PLAIN,25));
			
			pass_label.setBounds(300,350,200,30);
			pass_label.setText("Password:");
			pass_label.setFont(new Font(null,Font.PLAIN,25));
			
			welcome.setBounds(10,10,400,30);
			
			model.setColumnIdentifiers(headers);
			
		
			doctor_table = new JTable();
			doctor_table.setModel(model);
			doctor_table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
			doctor_table.setFillsViewportHeight(true);

			JScrollPane table_doctor =new JScrollPane(doctor_table);
			table_doctor.setMinimumSize(new Dimension(800,23));		
			
			dashboard_panel.setBounds(250,0,1400,900);
			dashboard_panel.setBackground(Color.white);
			
			ImageIcon image123 = new ImageIcon("opt.png");
			label_back21.setIcon(image123);
		 	label_back21.setBounds(0,0,1600,900);
			
			
			option_panel.setBounds(0,0,250,900);
			option_panel.setBackground(Color.blue);
			option_panel.add(Dashboard_btn);
			option_panel.add(paitentdetail_btn);
			option_panel.add(total_doctor_btn);
			option_panel.add(mydetails_btn);
			option_panel.add(Logout_btn);
			option_panel.add(label_back21);
			option_panel.setLayout(new BorderLayout());
			
			model_paitent.setColumnIdentifiers(headers_paitent);
			
			Paitent_table.setModel(model_paitent);
			Paitent_table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
			Paitent_table.setFillsViewportHeight(true);
			
			
			JScrollPane table_paitent =new JScrollPane(Paitent_table);



			
			Panel_paitentdetail.setBounds(250,0,1100,900);
			Panel_paitentdetail.setBackground(Color.cyan);
			Panel_paitentdetail.setLayout(new BorderLayout());
			Panel_paitentdetail.add(table_paitent);
		
			
			Total_doct_panel.setLayout(new BorderLayout());
			Total_doct_panel.setBounds(250,0,1100,900);
			Total_doct_panel.setBackground(Color.green);
			Total_doct_panel.add(table_doctor);
			
			ImageIcon image101 = new ImageIcon("mydetail back.png");
			label_back21.setIcon(image101);
			label_back21.setBounds(0,0,1400,900);
			label_back21.setVisible(true);
			
			mydetails_panel.setBounds(250,0,1400,900);
			mydetails_panel.setBackground(Color.white);
			
            mydetails_panel.add(lastname_label);
            mydetails_panel.add(age_label);
            mydetails_panel.add(address_label);
            mydetails_panel.add(contact_label);
            mydetails_panel.add(email_label);
            mydetails_panel.add(firstname_label);
           
            mydetails_panel.add(adminid_label);
            mydetails_panel.add(email_label);
            mydetails_panel.add(username_label);
            mydetails_panel.add(password_label);

            mydetails_panel.add(firstname_mydetails);
            mydetails_panel.add(lastname_mydetails);
            mydetails_panel.add(search);
            mydetails_panel.add(age_mydetails);
            mydetails_panel.add(address_mydetails);
            mydetails_panel.add(email_mydetails);
            mydetails_panel.add(contact);
            mydetails_panel.add(adminid);
            mydetails_panel.add(username);
            mydetails_panel.add(password);

            mydetails_panel.add(update);
            mydetails_panel.add(save_btn);
            mydetails_panel.add(label_back21);
            mydetails_panel.setLayout(new BorderLayout());
            
			
			ImageIcon image1 = new ImageIcon("backadmin.jpg");
			label_back.setIcon(image1);
		 	label_back.setBounds(0,0,1000,900);
			
			panel_login.setBackground(Color.red);
			panel_login.setBounds(0,0,800,1000);
			panel_login.add(back_button);
			panel_login.add(register_button);
			panel_login.add(User_label);
			panel_login.add(user_text);
			panel_login.add(pass_label);
			panel_login.add(pass_text);
			panel_login.add(login_button);
			panel_login.add(label_back);
			panel_login.setLayout(new BorderLayout());
			

			ImageIcon image12 = new ImageIcon("adminback1.jpg");
			label_back2.setIcon(image12);
		 	label_back2.setBounds(0,0,1600,900);
			
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.setSize(800,1000);
			frame.setVisible(true);
			frame.setLayout(null);
			
			frame.add(panel_login);
			frame.add(Panel_doct_opt);
			frame.add(add_doc);
			frame.add(add_patient);
			frame.add(update_patient);
			frame.add(Update_doctor);
			frame.add(delete_doctor);
			frame.add(delete_patient);
			
			

		}
		int clicked =0;
		int clicked_doc =0;
		int clicked_paitent= 0;
		@Override
		public void actionPerformed(ActionEvent e) {
			
		
				 if (e.getSource() == register_button) {
				admin_register regis =new admin_register();
			}
			else if (e.getSource()==login_button) {
	
				String username_user = user_text.getText();
				String password_user = pass_text.getText();
				String query = "Select * from admin where username='"+username_user+"' and password = '"+password_user+"'";
			
				dbOperation1 db = new dbOperation1();
			
				ResultSet rs = db.select(query);
			
			
				
				try { 
					if(rs.next()) {
						JOptionPane.showMessageDialog(frame, "login Successfull");
						frame.remove(panel_login);
						Dashboard_btn.setVisible(true);
						Logout_btn.setVisible(true);
						mydetails_btn.setVisible(true);
						paitentdetail_btn.setVisible(true);
						total_doctor_btn.setVisible(true);
						add_patient.setVisible(false);
						update_patient.setVisible(false);
						Update_doctor.setVisible(false);
						delete_doctor.setVisible(false);
						delete_patient.setVisible(false);
						
						frame.setSize(1600,900);
						frame.add(dashboard_panel);
						frame.add(Panel_paitentdetail);
						frame.add(Total_doct_panel);
						frame.add(option_panel);
						frame.add(mydetails_panel);
						frame.add(Panel_doct_opt);
						dashboard_panel.add(user);
						user.setText(username_user);
						user.setBounds(50,30,400,50);
					}
					else {
						JOptionPane.showMessageDialog(panel_login,"incorrect username or password");
						frame.add(panel_login);
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				

				
				
			}
			else if (e.getSource()==total_doctor_btn ) {
				
				clicked_doc++;
				dashboard_panel.setVisible(false);
				Panel_paitentdetail.setVisible(false);
				Total_doct_panel.setVisible(true);
				option_panel.setVisible(true);
				mydetails_panel.setVisible(false);
				Panel_doct_opt.setVisible(true);
				add_doc.setVisible(true);
				add_patient.setVisible(false);
				update_patient.setVisible(false);
				Update_doctor.setVisible(true);
				delete_doctor.setVisible(true);
				delete_patient.setVisible(false);
				frame.add(label_back2);
				if(clicked_doc ==1) {
				String query = "Select * from doc ";
				
				dbOperation1 db1 = new dbOperation1();
				ResultSet rs = db1.select(query);
				
				try {
					int i=0;
					while(rs.next()){
						 doc_id=rs.getString("doc_id");
						 fname=rs.getString("first_name") ;
						 lname=rs.getString("last_name");
						 age=rs.getString("age");
						 address=rs.getString("address");
						 department=rs.getString("department");
						 pnum=rs.getString("contact");
						 usern=rs.getString("username");
						 pass=rs.getString("password");
					model.addRow(new Object[] {doc_id,fname,lname,age,address,department,pnum,usern,pass});
					i++;
					}

					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			}
			else if (e.getSource()==paitentdetail_btn ) {
				clicked_paitent++;
				dashboard_panel.setVisible(false);
				Panel_paitentdetail.setVisible(true);
				Total_doct_panel.setVisible(false);
				option_panel.setVisible(true);
				mydetails_panel.setVisible(false);
				add_doc.setVisible(false);
				add_patient.setVisible(true);
				update_patient.setVisible(true);
				Update_doctor.setVisible(false);
				delete_doctor.setVisible(false);
				delete_patient.setVisible(true);
				if(clicked_paitent==1) {
				String query = "Select * from register ";
				
				dbOperation1 db2 = new dbOperation1();
				ResultSet rs = db2.select(query);
				
				try {
					int i=0;
					while(rs.next()){
						 p_id=rs.getString("id");
						 firstname=rs.getString("first_name") ;
						 lastname=rs.getString("last_name");
						 page=rs.getString("age");
						 Paddress=rs.getString("address");
						 p_department=rs.getString("department");
						 p_time_of_regis=rs.getString("time_Of_registration");
						 p_contact=rs.getString("contact");
						 p_time_of_visit=rs.getString("time_to_visit");
						 p_username=rs.getString("username");
						 p_password=rs.getString("password");
					model_paitent.addRow(new Object[] {p_id,firstname ,lastname ,page ,Paddress ,p_department ,p_time_of_regis ,p_contact ,p_time_of_visit ,p_username ,p_password });
					i++;
					}

					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
			}
			else if (e.getSource()== mydetails_btn) {
				dashboard_panel.setVisible(false);
				Panel_paitentdetail.setVisible(false);
				Total_doct_panel.setVisible(false);
				option_panel.setVisible(true);
				mydetails_panel.setVisible(true);
				Panel_doct_opt.setVisible(false);
				add_doc.setVisible(false);
				add_patient.setVisible(false);
				update_patient.setVisible(false);
				Update_doctor.setVisible(false);
				delete_doctor.setVisible(false);
				delete_patient.setVisible(false);
				// thsi is inside the panel 
				String query = "Select * from admin where username ='"+user_text.getText()+"'";
				dbOperation1 db =new dbOperation1();
				ResultSet rs =db.select(query);
				try {
					while (rs.next()) {
						adminid.setText(rs.getString("adminid"));	
						firstname_mydetails.setText(rs.getString("first_name")) ;
						lastname_mydetails.setText(rs.getString("last_name"));
						age_mydetails.setText(rs.getString("age"));
						address_mydetails.setText(rs.getString("address"));
						email_mydetails.setText(rs.getString("email"));
						contact.setText(rs.getString("phone_num"));
						username.setText(rs.getString("username"));
						password.setText(rs.getString("password"));
					
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					
				}
				adminid.setVisible(true);
				firstname_mydetails.setVisible(true);
				lastname_mydetails.setVisible(true);
				age_mydetails.setVisible(true);
				address_mydetails.setVisible(true);
				email_mydetails.setVisible(true);
				contact.setVisible(true);
				username.setVisible(true);
				password.setVisible(true);
				
		}		
			else if (e.getSource()== Dashboard_btn) {
			dashboard_panel.setVisible(true);
			Panel_paitentdetail.setVisible(false);
			Total_doct_panel.setVisible(false);
			option_panel.setVisible(true);
			mydetails_panel.setVisible(false);
			Panel_doct_opt.setVisible(false);
			add_doc.setVisible(false);
			add_patient.setVisible(false);
			update_patient.setVisible(false);
			Update_doctor.setVisible(false);
			delete_doctor.setVisible(false);
			delete_patient.setVisible(false);
	}
			
			else if (e.getSource()== Logout_btn) {
		int reply =	JOptionPane.showConfirmDialog(dashboard_panel, "Do you want to logout","Its sad to see you go", JOptionPane.YES_NO_OPTION);
				if( reply == JOptionPane.YES_OPTION) {
			frame.remove(Panel_paitentdetail);
			frame.remove(Total_doct_panel);
			frame.remove(option_panel);
			frame.remove(dashboard_panel);
			frame.remove(mydetails_panel);
			frame.setSize(800,1000);
			frame.add(panel_login);
			panel_login.setVisible(true);
			add_doc.setVisible(false);
			add_patient.setVisible(false);
			update_patient.setVisible(false);
			Update_doctor.setVisible(false);
			delete_doctor.setVisible(false);
			delete_patient.setVisible(false);
			user_text.setText("");
			pass_text.setText("");
			
		}else {
			dashboard_panel.setVisible(true);
			Panel_paitentdetail.setVisible(false);
			Total_doct_panel.setVisible(false);
			option_panel.setVisible(true);
			mydetails_panel.setVisible(false);
			Panel_doct_opt.setVisible(false);
			add_doc.setVisible(false);
			add_patient.setVisible(false);
			update_patient.setVisible(false);
			Update_doctor.setVisible(false);
			delete_doctor.setVisible(false);
			delete_patient.setVisible(false);
			
			
		}
		
				
			}
			else if (e.getSource()== add_doc) {
				new Add_doct();
			

			}
			else if (e.getSource()==add_patient) {
				new register();
			}
			else if(e.getSource()==Update_doctor) {
				new DoctorDetails();
			}
			else if (e.getSource()== delete_doctor){
				new update_doc();
			}
			else if(e.getSource()==back_button) {
				frame.setVisible(false);
			}
		
		else if(e.getSource()==delete_patient) {
			new delete_paitent();
			
		}
		else if(e.getSource() == update_patient) {
			new PatientDetails();
		}
		else if(e.getSource()==update) {
			save_btn.setVisible(true);
			adminid.setEditable(false);
			firstname_mydetails.setEditable(true);
			lastname_mydetails.setEditable(true);
			age_mydetails.setEditable(true);
			address_mydetails.setEditable(true);
			email_mydetails.setEditable(true);
			contact.setEditable(true);
			username.setEditable(true);
			password.setEditable(true);

		}
				 
		else if(e.getSource()==save_btn) {
			clicked++;
			if(clicked ==1) {
	           String firstName = firstname_mydetails.getText();
	            String lastName = lastname_mydetails.getText();
	            int Age = Integer.parseInt(age_mydetails.getText());
	            age_mydetails.setText(Integer.toString(Age));
	            String Email = email_mydetails.getText();
	            String Address = address_mydetails.getText();
	            String Contact = contact.getText();
	            String Username = username.getText();
	            String Password = password.getText();
				String sql = "update admin set first_name ='"+firstName+"',last_name='"+lastName+"',age='"+Age+"',email='"+Email+"',address='"+Address+"',phone_num='"+Contact+"',username='"+Username+"',password='"+Password+"'";
				dbOperation1 db = new dbOperation1();
				int ans =db.update(sql);
				if(ans != 0) {
					JOptionPane.showMessageDialog(frame, "Data Updated Successfully");
				}
				
		}
			}

		}
		public static void main(String args[]) {
			new adminwindow();
		}
		}
		



