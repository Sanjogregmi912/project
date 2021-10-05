import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;

public class doctorwindow  implements ActionListener {
	Font font = new Font("Roboto",Font.PLAIN,18);
	JFrame frame = new JFrame();
	JLabel label_add = new JLabel("no file selected");
	JButton save_btn = new JButton("save");
	
	JPanel Panel_paitent = new JPanel();
	JPanel panel= new JPanel();
	JPanel dashboard_panel = new JPanel();
	JPanel option_panel = new JPanel();
	JPanel routine_panel = new JPanel();
	JPanel report_panel = new JPanel();
	

	JLabel label = new JLabel();
	JLabel User_label = new JLabel();
	JLabel pass_label = new JLabel();
	JLabel success = new JLabel("success");
	JLabel user = new JLabel();
	JLabel label_back =new JLabel();
	JLabel label_back21 =new JLabel();
	
	
	JButton login_button = new JButton("Login");
	JButton forgot_button = new JButton("Forgot Password");
	JButton Dashboard_btn = new JButton("Dashboard");
	JButton todaypaitent_btn = new JButton("Today's Paitent");
	JButton Routine_btn= new JButton("My Details");
	JButton Report_btn = new JButton("Report");
	JButton Logout_btn = new JButton("Logout");
	JButton back_button = new JButton("Logout");
	
	JTextField user_text = new JTextField();
	JTextField pass_text = new JTextField();
	// doctor my details

    JLabel firstname_label = new JLabel();
    JLabel lastname_label = new JLabel();
    JLabel age_label = new JLabel();
    JLabel address_label = new JLabel();
    JLabel department_label = new JLabel();
    JLabel contact_label = new JLabel();
    JLabel doctorid_label = new JLabel();
    JLabel username_label = new JLabel();
    JLabel password_label = new JLabel();
    JLabel label_back12 = new JLabel();
    

    JTextField firstname = new JTextField();
    JTextField lastname = new JTextField();
    JTextField age = new JTextField();
    JTextField address = new JTextField();
    JTextField contact = new JTextField();
    JTextField doctorid = new JTextField();
    JTextField username = new JTextField();
    JTextField department = new JTextField();
    JTextField password = new JTextField();


    JButton update = new JButton("Edit Details");
   
    JButton save = new JButton("Save");
    JButton send_btn = new JButton("Send Report To Paitent");
    // table to show todays patient
	JTable Paitent_table = new JTable();
	String headers_paitent[]= {"Paitent id","first Name","last Name","Age","Address",
			"Consulting Department","Time Of Register","Contact No","Time To Visit "};
	DefaultTableModel model_paitent = new DefaultTableModel();
	String p_id ="";
	String first_name_="";
	String last_name_ ="";
	String page ="";
	String Paddress ="";
	String p_department ="";
	String p_time_of_regis ="";
	String p_contact ="";
	String p_time_of_visit ="";
	String p_username ="";
	String p_password ="";
	// report panel 
	
	Font font1 = new Font("Roboto",Font.PLAIN,18);

    JLabel lbl_heading = new JLabel();
    JLabel search_label = new JLabel();
    JLabel sresult_label = new JLabel();
    JTextField search = new JTextField();
    JTextField sresult = new JTextField();
    JButton btn_search = new JButton("Search");
    JButton btn_add = new JButton("Add");
    // file chooser
    // for change password
	JButton change_pass_btn = new JButton("Change Your Password ");

	JLabel profile = new JLabel();
	JLabel new_pass = new JLabel("Type Your New Password here : ");
	JLabel new_pass1 = new JLabel("Type Your New Password here : ");
	JTextField change_pass1 = new JTextField();
	JTextField change_pass2 = new JTextField();
	JButton save_changes = new JButton("Save Changes ");
    

	doctorwindow(){
		//for report panel
        lbl_heading.setBounds(300,10,200,50);
        lbl_heading.setText("Report Upload");
        lbl_heading.setFont(font);
        
        
        search_label.setBounds(80, 90, 200, 50);
        search_label.setText("Search for Patient:");
        search_label.setFont(font1);
       
        
        search.setBounds(80, 140, 200, 30);
        search.setVisible(false);
      
       
        
        
        sresult_label.setBounds(80, 180, 200, 50);
        sresult_label.setText("Search Result:");
        sresult_label.setFont(font1);
      
        sresult.setBounds(80, 230, 400, 150);
        sresult.setVisible(false);
        sresult.setFont(font);
        sresult.setEditable(false);
       
        
        btn_search.setBounds(300, 140, 100, 30);
        btn_search.setFont(font1);
        btn_search.addActionListener(this);
        btn_search.setFocusable(false);
        btn_search.setVisible(false);
        
        btn_add.setBounds(300, 500, 100, 30);
        btn_add.setFont(font1);
        btn_add.addActionListener(this);
        btn_add.setFocusable(false);
        
		save_btn.setBounds(450,500,100,30);
		save_btn.addActionListener(this);
		save_btn.setFocusable(false);
		save_btn.setFont(font);
		
		send_btn.setBounds(450,600,300,30);
		send_btn.addActionListener(this);
		send_btn.setFocusable(false);
		send_btn.setFont(font);
		send_btn.setVisible(false);
		
		
		label_add.setBounds(550,500,400,400);
        
        
		//
		
		// doctor my details
		
		   doctorid_label.setBounds(40, 50, 100, 50);
           doctorid_label.setText("Doctor ID: ");
           doctorid_label.setFont(font);

           doctorid.setBounds(150, 60, 200, 30);
           doctorid.setEditable(false);
           doctorid.setVisible(false);


           firstname_label.setBounds(40, 100, 100, 50);
           firstname_label.setText("First Name:");
           firstname_label.setFont(font);

           firstname.setBounds(150, 110, 200, 30);
           firstname.setEditable(false);
           firstname.setVisible(false);

           lastname_label.setBounds(380, 100,100,50);
           lastname_label.setText("Last Name:");
           lastname_label.setFont(font);

           lastname.setBounds(490, 110, 200, 30);
           lastname.setEditable(false);
           lastname.setVisible(false);
           
           age_label.setBounds(40, 160, 100, 50);
           age_label.setText("Age:");
           age_label.setFont(font);

           age.setBounds(150, 170, 200, 30);
           age.setEditable(false);
           age.setVisible(false);
           
           address_label.setBounds(380, 160, 100, 50);
           address_label.setText("Address:");
           address_label.setFont(font);

           address.setBounds(490, 170, 250, 30);
           address.setEditable(false);
           address.setVisible(false);
           
           department_label.setBounds(40, 220, 100, 50);
           department_label.setText("Department:");
           department_label.setFont(font);

           department.setBounds(150, 230, 200, 30);
           department.setEditable(false);
           department.setVisible(false);


           contact_label.setBounds(40, 280, 300, 50);
           contact_label.setText("Contact:");
           contact_label.setFont(font);

           contact.setBounds(150, 290, 200, 30);
           contact.setEditable(false);
           contact.setVisible(false);

           username_label.setBounds(40, 340, 300, 50);
           username_label.setText("Username:");
           username_label.setFont(font);

           username.setBounds(150, 350, 200, 30);
           username.setEditable(false);
           username.setVisible(false);


           password_label.setBounds(40, 400, 300, 50);
           password_label.setText("Password:");
           password_label.setFont(font);

           password.setBounds(150, 410, 200, 30);
           password.setEditable(false);
           password.setVisible(false);

           
           save.setBounds(150, 580, 150, 30);
           save.setFont(font);
           save.addActionListener(this);
           save.setVisible(false);
           save.setFocusable(false);
           save.setBorder(new EtchedBorder(10));
           save.setForeground(Color.blue);
           save.setBackground(Color.white);

           update.setBounds(350, 580, 150, 30);
           update.setFont(font);
           update.addActionListener(this);
           update.setFocusable(false);
           update.setBorder(new EtchedBorder(10));
           update.setForeground(Color.blue);
           update.setBackground(Color.white);
           
		//doctor my details
		success.setText("success");
		success.setBounds(0,0,100,52);
		
		label.setBounds(300,10,500,50);
		label.setText("Please type your credentials");
		label.setFont(new Font(null,Font.PLAIN,25));
		label.setBackground(Color.green);
		label.setVisible(true);
		
		User_label.setBounds(300,250,200,30);
		User_label.setText("Username:");
		User_label.setFont(new Font(null,Font.PLAIN,25));
		
		
		pass_label.setBounds(300,350,200,30);
		pass_label.setText("Password");
		pass_label.setFont(new Font(null,Font.PLAIN,25));
		
		Dashboard_btn.setBounds(20,20,150,50);
		Dashboard_btn.setFocusable(false);
		Dashboard_btn.addActionListener(this);
		Dashboard_btn.setVisible(false);
		
		login_button.setBounds(550,450,150,50);
		login_button.setFocusable(false);
		login_button.addActionListener(this);
		login_button.setVisible(true);
		login_button.setBorder(new EtchedBorder(10));
		login_button.setForeground(Color.black);
		login_button.setBackground(Color.green);
		
		forgot_button.setBounds(750,450,150,50);
		forgot_button.setFocusable(false);
		forgot_button.addActionListener(this);
		forgot_button.setVisible(true);
		forgot_button.setBorder(new EtchedBorder(10));
		forgot_button.setForeground(Color.black);
		forgot_button.setBackground(Color.orange);
		
		
		todaypaitent_btn.setBounds(20,80,150,50);
		todaypaitent_btn.setFocusable(false);
		todaypaitent_btn.addActionListener(this);
		todaypaitent_btn.setVisible(false);
		todaypaitent_btn.setForeground(Color.black);
		todaypaitent_btn.setBackground(Color.white);
		
		Routine_btn.setBounds(20,140,150,50);
		Routine_btn.setFocusable(false);
		Routine_btn.addActionListener(this);
		Routine_btn.setVisible(false);
		Routine_btn.setForeground(Color.black);
		Routine_btn.setBackground(Color.white);
		
		Report_btn.setBounds(20,200,150,50);
		Report_btn.setFocusable(false);
		Report_btn.addActionListener(this);
		Report_btn.setVisible(false);
		Report_btn.setForeground(Color.black);
		Report_btn.setBackground(Color.white);

		
		

		Logout_btn.setBounds(20,260,150,50);
		Logout_btn.setFocusable(false);
		Logout_btn.addActionListener(this);
		Logout_btn.setVisible(false);
		Logout_btn.setForeground(Color.black);
		Logout_btn.setBackground(Color.white);
		
	
		back_button.setBounds(10,40,100,50);
		back_button.setFocusable(false);
		back_button.setText("Back");
		back_button.setBackground(Color.white);
		back_button.addActionListener(this);
		back_button.setLayout(new BorderLayout());
		
		
		user_text.setBounds(450,250,200,40);
	
		
		pass_text.setBounds(450,350,200,40);
		JLabel label_back212 = new JLabel();
		
		ImageIcon image123 = new ImageIcon("opt_back.jpg");
		label_back212.setIcon(image123);
	 	label_back212.setBounds(0,0,250,900);
		
		
		
		option_panel.setBounds(0,0,200,900);
		option_panel.setBackground(Color.blue);
		option_panel.add(Dashboard_btn);
		option_panel.add(todaypaitent_btn);
		option_panel.add(Routine_btn);
		option_panel.add(Report_btn);
		option_panel.add(Logout_btn);
		option_panel.add(label_back212);
		option_panel.setLayout(new BorderLayout());
		
		

		ImageIcon image101 = new ImageIcon("doc_dashboard.png");
		label_back21.setIcon(image101);
		label_back21.setBounds(0,0,1200,900);
		label_back21.setVisible(true);
		
		dashboard_panel.setBounds(200,0,1400,900);
		dashboard_panel.setBackground(Color.white);
		dashboard_panel.add(label_back21);
		
		model_paitent.setColumnIdentifiers(headers_paitent);
		
		Paitent_table.setModel(model_paitent);
		Paitent_table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		Paitent_table.setFillsViewportHeight(true);
		
		
		JScrollPane table_paitent =new JScrollPane(Paitent_table);
		Panel_paitent.setBounds(200,0,1400,900);
		
		Panel_paitent.setLayout(new BorderLayout());
		Panel_paitent.add(table_paitent);
		
		routine_panel.setBounds(200,0,1400,900);
		routine_panel.setBackground(Color.green);
		routine_panel.add(success);
		
		ImageIcon image11 = new ImageIcon("backdocmydetails.png");
		label_back12.setIcon(image11);
		label_back12.setBounds(0,0,1400,900);
		label_back12.setVisible(true);
		change_pass_btn.setBounds(900,320,300,40);
		change_pass_btn.addActionListener(this);
		change_pass1.setBounds(900,450,300,50);
		change_pass1.setVisible(false);
		change_pass2.setBounds(900,550,300,50);
		change_pass2.setVisible(false);
		new_pass.setBounds(700,450,300,30);
		new_pass.setVisible(false);
		new_pass1.setBounds(700,550,300,30);
		new_pass1.setVisible(false);
		save_changes.setBounds(900,650,200,50);
		save_changes.setVisible(false);
		save_changes.addActionListener(this);
		ImageIcon image10 = new ImageIcon("profile_doc.png");
		profile.setIcon(image10);
		profile.setBounds(900,0,300,300);
		profile.setVisible(true);
		
        routine_panel.add(lastname_label);
        routine_panel.add(age_label);
        routine_panel.add(address_label);
        routine_panel.add(contact_label);
        routine_panel.add(department_label);
        routine_panel.add(firstname_label);
        
        
        routine_panel.add(doctorid_label);
        routine_panel.add(username_label);
        routine_panel.add(password_label);

        routine_panel.add(firstname);
        routine_panel.add(lastname);
    
        routine_panel.add(age);
        routine_panel.add(address);
        routine_panel.add(department);
        routine_panel.add(contact);
        routine_panel.add(doctorid);
        routine_panel.add(username);
        routine_panel.add(password);

        routine_panel.add(update);
        routine_panel.add(save);
		routine_panel.add(profile);
		routine_panel.add(new_pass);
		routine_panel.add(new_pass1);
		routine_panel.add(change_pass2);
		routine_panel.add(save_changes);
		routine_panel.add(change_pass1);
		routine_panel.add(change_pass_btn);
        routine_panel.add(label_back12);
        routine_panel.setLayout(new BorderLayout());
        JLabel label_rep =new JLabel();
        
        
		ImageIcon image110 = new ImageIcon("back_report1.jpg");
		label_rep.setIcon(image110);
		label_rep.setBounds(0,0,1400,900);
		label_rep.setVisible(true);
		
		report_panel.setBounds(200,0,1400,900);
		report_panel.add(btn_add);
		report_panel.add(btn_search);
		report_panel.add(search);
		report_panel.add(sresult);
		report_panel.add(lbl_heading);
		report_panel.add(search_label);
		report_panel.add(sresult_label);
		report_panel.add(save_btn);
		report_panel.add(label_add);
		report_panel.add(send_btn);
		report_panel.add(label_rep);
		report_panel.setLayout(new BorderLayout());
		
		ImageIcon image1 = new ImageIcon("backdoc.png");
		label_back.setIcon(image1);
	 	label_back.setBounds(0,0,1000,800);
		
		
		panel.add(label);
		panel.add(User_label);
		panel.add(user_text);
		panel.add(pass_label);
		panel.add(pass_text);
		panel.setBounds(0,0,1000,900);
		panel.setBackground(Color.white);
		panel.add(back_button);
		panel.add(login_button);
		panel.add(forgot_button);
		panel.add(label_back);
		panel.setLayout(new BorderLayout());
		panel.setVisible(true);
	
		
		
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(1000,920);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.add(panel);
	
	
		
}
	 int clicked =0;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== login_button) {

			String username_user = user_text.getText();
			String password_user = pass_text.getText();
			String query = "Select * from doc where username='"+username_user+"' and password = '"+password_user+"'";
		
			dbOperation1 db = new dbOperation1();
		
			ResultSet rs = db.select(query);
		
		
			
			try { 
				if(rs.next()) {
					JOptionPane.showMessageDialog(frame, "login Successfull");
					frame.remove(panel);
					Dashboard_btn.setVisible(true);
					Logout_btn.setVisible(true);
					Report_btn.setVisible(true);
					todaypaitent_btn.setVisible(true);
					Routine_btn.setVisible(true);
					
					
					frame.setSize(1600,900);
					
					frame.add(dashboard_panel);
					frame.add(Panel_paitent);
					frame.add(routine_panel);
					frame.add(option_panel);
					frame.add(report_panel);
					
					dashboard_panel.add(user);
					user.setText(username_user);
					user.setBounds(50,30,400,50);
				}
				else {
					JOptionPane.showMessageDialog(panel,"incorrect username or password");
					frame.add(panel);
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
		else if(e.getSource()== Dashboard_btn) {
			dashboard_panel.setVisible(true);
			option_panel.setVisible(true);
			Panel_paitent.setVisible(false);
			report_panel.setVisible(false);
			routine_panel.setVisible(false);
			
		}
		else if(e.getSource()== todaypaitent_btn ) {
			clicked ++;
			dashboard_panel.setVisible(false);
			option_panel.setVisible(true);
			Panel_paitent.setVisible(true);
			report_panel.setVisible(false);
			routine_panel.setVisible(false);
			if(clicked ==1) {
			String query = "Select * from register ";
			
			dbOperation1 db2 = new dbOperation1();
			ResultSet rs = db2.select(query);
			
			try {
				
				while(rs.next()){
					 p_id=rs.getString("id");
					 first_name_ = rs.getString("first_name");
					 last_name_ = rs.getString("last_name");
					 page=rs.getString("age");
					 Paddress=rs.getString("address");
					 p_department=rs.getString("department");
					 p_time_of_regis=rs.getString("time_Of_registration");
					 p_contact=rs.getString("contact");
					 p_time_of_visit=rs.getString("time_to_visit");
					 p_username=rs.getString("username");
					 p_password=rs.getString("password");
				model_paitent.addRow(new Object[] {p_id,first_name_ ,last_name_ ,page ,Paddress ,p_department ,p_time_of_regis ,p_contact ,p_time_of_visit ,p_username ,p_password });
				}

				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}}
		}
		else if (e.getSource()== Routine_btn) {
			dashboard_panel.setVisible(false);
			option_panel.setVisible(true);
			Panel_paitent.setVisible(false);
			report_panel.setVisible(false);
			routine_panel.setVisible(true);
			doctorid.setVisible(true);
			firstname.setVisible(true);
			lastname.setVisible(true);
			 age.setVisible(true);
			 address.setVisible(true);
			department.setVisible(true);
			 contact.setVisible(true);
			username.setVisible(true);
			password.setVisible(true);
			String query = "Select * from doc where username ='"+user_text.getText()+"'";
			dbOperation1 db =new dbOperation1();
			ResultSet rs =db.select(query);
			try {
				while (rs.next()) {
					doctorid.setText(rs.getString("doc_id"));
					firstname.setText(rs.getString("first_name")) ;
					lastname.setText(rs.getString("last_name"));
					age.setText(rs.getString("age"));
					address.setText(rs.getString("address"));
					department.setText(rs.getString("department"));
					contact.setText(rs.getString("contact"));
					username.setText(rs.getString("username"));
					password.setText(rs.getString("password"));
				
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			
			}
			
		}
		else if (e.getSource()== Report_btn) {
			routine_panel.setVisible(false);
			dashboard_panel.setVisible(false);
			Panel_paitent.setVisible(false);
			report_panel.setVisible(true);
			option_panel.setVisible(true);
       	 	search.setVisible(true);
       	 	sresult.setVisible(true);
       	 	btn_search.setVisible(true);
       	 	btn_add.setVisible(true);
       	
		}
		
		
		else if(e.getSource()== Logout_btn) {
			int reply =	JOptionPane.showConfirmDialog(dashboard_panel, "Do you want to logout","Its sad to see you go", JOptionPane.YES_NO_OPTION);
			if( reply == JOptionPane.YES_OPTION) {
			frame.remove(routine_panel);
			frame.remove(dashboard_panel);
			frame.remove(Panel_paitent);
			frame.remove(report_panel);
			frame.remove(option_panel);
			frame.add(panel);
			frame.setSize(1000,900);
			panel.setVisible(true);
			user_text.setText("");
			pass_text.setText("");
			}
			else {
				dashboard_panel.setVisible(true);
				option_panel.setVisible(true);
				Panel_paitent.setVisible(false);
				report_panel.setVisible(false);
				routine_panel.setVisible(false);
			}
		
			
		}
		else if(e.getSource()==back_button) {
			frame.setVisible(false);
		}
		else if(e.getSource() == update) {
			doctorid.setEditable(false);
			firstname.setEditable(true);
			lastname.setEditable(true);
			age.setEditable(true);
			address.setEditable(true);
			department.setEditable(true);
			contact.setEditable(true);
			username.setEditable(true);
			password.setEditable(true);
			save.setVisible(true);
		}
		else if(e.getSource()== save) {
			
	           String firstName = firstname.getText();
	            String lastName = lastname.getText();
	            int Age = Integer.parseInt(age.getText());
	            age.setText(Integer.toString(Age));
	            String Address = address.getText();
	            String Contact = contact.getText();
	            String Username = username.getText();
	            String Password = password.getText();
	            String Department = department.getText();
	            String query = "update doc set first_name ='"+firstName+"',last_name='"+lastName+"',age='"+Age+"',address='"+Address+"',department='"+Department+"',contact='"+Contact+"',username='"+Username+"',password='"+Password+"'";
	            dbOperation1 db = new dbOperation1();
			int ans =db.update(query);
			if(ans != 0) {
				JOptionPane.showMessageDialog(frame, "Data Updated Successfully");
			}

		}
				
		else if(e.getSource()==btn_search) {
			long countlong=0;
			String query35 = "Select * from register where first_name ='"+search.getText()+"'";
			dbOperation1 db1 =new dbOperation1();
			ResultSet rs1 =db1.select(query35);
			try {
				for(;rs1.next();) {
					countlong = rs1.getLong(1);
					sresult.setText(rs1.getString("first_name"));
				
				}
				if(countlong <1) {
					JOptionPane.showMessageDialog(report_panel,"Patient Data Not Found");
				}
				else {
					JOptionPane.showMessageDialog(report_panel,"Patient Data Found");
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		else if(e.getSource()==btn_add) {
			send_btn.setVisible(true);
			 JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
			 j.setAcceptAllFileFilterUsed(false);
			  j.setDialogTitle("Select a .pdf file");
	            FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only .pdf files", "pdf");
	            j.addChoosableFileFilter(restrict);
	            int r = j.showOpenDialog(null);
	            // if the user selects a file
	            if (r == JFileChooser.APPROVE_OPTION) {
	                // set the label to the path of the selected file
	                label_add.setText(j.getSelectedFile().getAbsolutePath());
	            }
	            // if the user cancelled the operation
	            else
	                label_add.setText("the user cancelled the operation");
		
		} else if(e.getSource()== save_btn) {
			send_btn.setVisible(true);
			 JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

		        int returnValue = jfc.showOpenDialog(null);
		        // int returnValue = jfc.showSaveDialog(null);

		        if (returnValue == JFileChooser.APPROVE_OPTION) {
		            File selectedFile = jfc.getSelectedFile();
		            System.out.println(selectedFile.getAbsolutePath());
		            label_add.setText(selectedFile.getAbsolutePath());
		        }

		    
		}
		else if(e.getSource() == send_btn) {
			String report_add = label_add.getText();
			String Patient_name =search.getText();
			if(search.getText().equals("")){
				JOptionPane.showMessageDialog(report_panel, "Please enter Patient Name");
			}
			else{
			String query = "insert into report (paitent_name,report_address)"
					+ "values('"+Patient_name+"','"+report_add+"')";
			dbOperation1 db = new dbOperation1();
			int ans = db.insert(query);
			if(ans>0) {
				JOptionPane.showMessageDialog(frame, "Report added Successfully please tell paitent about it");
			}
			else {
				JOptionPane.showMessageDialog(frame, "Something went wrong");
			}
		}
	}
		else if(e.getSource()== forgot_button) {
			new forgot_password_doc();
		}
		else if(e.getSource() == change_pass_btn) {
			change_pass1.setVisible(true);
			change_pass2.setVisible(true);
			new_pass.setVisible(true);
			new_pass1.setVisible(true);
			save_changes.setVisible(true);
			
		}
		else if(e.getSource() == save_changes) {
			String Username = username.getText();
			String Password = password.getText();
			String query = "update doc set password = '"+change_pass1.getText()+"' where username = '"+Username +"' and password ='"+Password+"'";
			dbOperation1 db = new dbOperation1();
			int ans =db.update(query);
			if(ans != 0) {
				JOptionPane.showMessageDialog(frame, "password has been Successfully");
				frame.remove(routine_panel);
				frame.remove(dashboard_panel);
				frame.remove(Panel_paitent);
				frame.remove(report_panel);
				frame.remove(option_panel);
				frame.add(panel);
				frame.setSize(1000,900);
				panel.setVisible(true);
				user_text.setText("");
				pass_text.setText("");
				change_pass1.setText("");
				change_pass2.setText("");
			}
			}
		}
		
		
	
	
	public static void main(String [] args) {
		new doctorwindow();
	}
	}
