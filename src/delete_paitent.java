import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class delete_paitent implements ActionListener, MouseListener{
	int buttonpresscount =0;
	JFrame frame = new JFrame();

	JLabel label_back =new JLabel();
	
	JButton update_btn = new JButton("Delete by Searching");
	JButton all_btn = new JButton("Delete By Choosing");
	JButton search_btn = new JButton("Search");
	JButton save_btn = new JButton("Delete selected details");
	JButton refresh_btn = new JButton("Refresh");
	
	JTextField text = new JTextField();
	JPanel panel_main = new JPanel();
	JPanel panel_up = new JPanel();
	JPanel panel_up1 = new JPanel();
	JPanel panel_up12 = new JPanel();
	JPanel panel_up2 = new JPanel();
	
	
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
	int row ;
	int column ;
	String updated_value;
	

	delete_paitent(){
		
		
		all_btn.setBounds(40,140,200,50);
		all_btn.setFocusable(false);
		all_btn.addActionListener(this);
		all_btn.setVisible(true);
		all_btn.setBackground(Color.white);
		all_btn.addActionListener(this);
		all_btn.setBorder(new EtchedBorder(5));
		
		update_btn.setBounds(40,140,200,50);
		update_btn.setFocusable(false);
		update_btn.addActionListener(this);
		update_btn.setVisible(true);
		update_btn.setBackground(Color.white);
		update_btn.addActionListener(this);
		update_btn.setBorder(new EtchedBorder(5));
		
		save_btn.setBounds(40,140,200,50);
		save_btn.setFocusable(false);
		save_btn.addActionListener(this);
		save_btn.setVisible(true);
		save_btn.setBackground(Color.white);
		save_btn.addActionListener(this);
		save_btn.setBorder(new EtchedBorder(5));
		
		refresh_btn.setBounds(40,50,200,50);
		refresh_btn.setFocusable(false);
		refresh_btn.addActionListener(this);
		refresh_btn.setVisible(true);
		refresh_btn.setBackground(Color.white);
		refresh_btn.addActionListener(this);
		refresh_btn.setBorder(new EtchedBorder(5));
		
		search_btn.setBounds(350,100,100,50);
		search_btn.setFocusable(false);
		search_btn.addActionListener(this);
		search_btn.setVisible(true);
		search_btn.setBackground(Color.white);
		search_btn.addActionListener(this);
		search_btn.setBorder(new EtchedBorder(5));
		
		text.setBounds(10,100,300,50);
		text.setVisible(false);
		
		model_paitent.setColumnIdentifiers(headers_paitent);
		Paitent_table =new JTable(); 
		Paitent_table.setModel(model_paitent);
		Paitent_table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		Paitent_table.setFillsViewportHeight(true);
		Paitent_table.addMouseListener(this);
		
		JScrollPane table_paitent =new JScrollPane(Paitent_table);
		Paitent_table.setMinimumSize(new Dimension(800,23));
		
		
		panel_up.setBackground(new Color(152,56,26));
		panel_up.setBounds(0,0,250,200);
		panel_up.add(all_btn);
		panel_up.setVisible(true);
		panel_up.setLayout(new BorderLayout());
		
		panel_up1.setBackground(new Color(152,56,26));
		panel_up1.setBounds(250,0,250,200);
		panel_up1.add(update_btn);
		panel_up1.setVisible(true);
		panel_up1.setLayout(new BorderLayout());
		
		panel_up12.setBackground(new Color(152,56,26));
		panel_up12.setBounds(250,0,250,200);
		panel_up12.add(save_btn);
		panel_up12.add(refresh_btn);
		panel_up12.setVisible(false);
		panel_up12.setLayout(new BorderLayout());
		
		panel_up2.setBackground(new Color(152,56,26));
		panel_up2.setBounds(500,0,500,200);
		panel_up2.add(text);
		panel_up2.add(search_btn);
		panel_up2.setVisible(false);
		panel_up2.setLayout(new BorderLayout());
		
		panel_main.setLayout(new BorderLayout());
		panel_main.setVisible(true);
		panel_main.setBackground(new Color(100,58,29));
		panel_main.setBounds(0,200,1000,900);
		panel_main.add(table_paitent);
		
		
		ImageIcon image1 = new ImageIcon("backpatient.png");
		label_back.setIcon(image1);
	 	label_back.setBounds(0,0,1000,800);
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000,900);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.add(panel_main);
		frame.add(panel_up);
		frame.add(panel_up1);
		frame.add(panel_up2);
		frame.add(panel_up12);
		frame.add(label_back);

	}



int clicked =0;
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==all_btn) {
			clicked++;
			
			System.out.println(clicked);
			if(clicked ==1) {
			panel_up2.setVisible(false);
			panel_up12.setVisible(true);
			String query = "Select * from register ";
			
			dbOperation1 db2 = new dbOperation1();
			ResultSet rs = db2.select(query);
			
			try {
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
			
				}

				
			 }catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		panel_up1.setVisible(false);
		panel_up2.setVisible(false);
	
			}
			
		else {
			panel_up1.setVisible(false);
			panel_up2.setVisible(false);
			panel_up2.setVisible(false);
			panel_up12.setVisible(true);
			
		}}
		
		else if(e.getSource()==update_btn) {
			text.setVisible(true);
			panel_up2.setVisible(true);
			panel_up.setVisible(false);
			panel_up1.setVisible(false);
			panel_up12.setVisible(true);
		
		}
		else if(e.getSource()==search_btn) {
			if(text.getText().equals("")) {
				JOptionPane.showMessageDialog(frame,"Field Empty! please enter required Name");
				
			}
			long countlong =0;
			String query = "Select * from register where first_name = '"+text.getText()+"' ";
				dbOperation1 db1 = new dbOperation1();
				ResultSet rs = db1.select(query);
				
				
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

					
				
					}if(countlong <1 ) {
						JOptionPane.showMessageDialog(frame, "Data not  Found");
						 }
						 else {
							 JOptionPane.showMessageDialog(frame, "Data   Found");
						 }
					
						
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
			}
		}

				else if(e.getSource()==save_btn) {
					int a=Paitent_table.getSelectedRow();
					int b= Paitent_table.getSelectedColumn();
					 String c =  Paitent_table.getModel().getValueAt(a, b).toString();
						
					String query = "delete from register where id = '"+c+"'";
					dbOperation1 db1 = new dbOperation1();
					int ans = db1.delete(query);
					
					if (ans>0) {
							JOptionPane.showMessageDialog(panel_main, "delete successfully");
						
					}
					Paitent_table.removeRowSelectionInterval(a, b);
					}
				else if(e.getSource()== refresh_btn) {
					 DefaultTableModel dm = (DefaultTableModel) Paitent_table.getModel();
					 dm.getDataVector().removeAllElements();
					 dm.fireTableDataChanged();
					
					String query = "Select * from register ";
					
					dbOperation1 db2 = new dbOperation1();
					ResultSet rs = db2.select(query);
					
					try {
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
					
						}

						
					 }catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				}
	
		
	






	








@Override
public void mouseClicked(MouseEvent e) {

}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}




@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}




@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}




@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
public static void main (String[] args) {
	new delete_paitent();
}}