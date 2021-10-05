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

public class update_doc implements ActionListener, MouseListener{
	
	JFrame frame = new JFrame();

	JLabel label_back =new JLabel();
	JLabel label_up1 = new JLabel();
	JLabel Label_up2 =new JLabel();
	JLabel Label_up3 =new JLabel();
	JLabel Label_up4 =new JLabel();
	
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
	
	int row ;
	int column ;
	String updated_value;
	

	update_doc(){
		
		
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
		
		refresh_btn.setBounds(40,140,200,50);
		refresh_btn.setFocusable(false);
		refresh_btn.addActionListener(this);
		refresh_btn.setVisible(false);
		refresh_btn.setBackground(Color.white);
		refresh_btn.addActionListener(this);
		refresh_btn.setBorder(new EtchedBorder(5));
		
		search_btn.setBounds(350,100,100,50);
		search_btn.setFocusable(false);
		search_btn.addActionListener(this);
		search_btn.setVisible(false);
		search_btn.setBackground(Color.white);
		search_btn.addActionListener(this);
		search_btn.setBorder(new EtchedBorder(5));
		
		text.setBounds(10,100,300,50);
		text.setVisible(false);
		
		
		model.setColumnIdentifiers(headers);
		
		
		
		doctor_table = new JTable();
		doctor_table.setModel(model);
		doctor_table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		doctor_table.setFillsViewportHeight(true);
		 doctor_table.addMouseListener(this);

		
		
		JScrollPane table_doctor =new JScrollPane(doctor_table);
		table_doctor.setMinimumSize(new Dimension(800,23));		
		
		ImageIcon image100 = new ImageIcon("a3up.jpg");
		label_up1.setIcon(image100);
		label_up1.setBounds(0,0,250,200);
		
		
		panel_up.setBounds(0,0,250,200);
		panel_up.add(all_btn);
		panel_up.add(refresh_btn);
		panel_up.setVisible(true);
		panel_up.add(label_up1);
		panel_up.setLayout(new BorderLayout());
		
		ImageIcon image200 = new ImageIcon("a2up.jpg");
		Label_up2.setIcon(image200);
		Label_up2.setBounds(0,0,250,200);
	
		panel_up1.setBounds(250,0,250,200);
		panel_up1.add(update_btn);
		panel_up1.setVisible(true);
		panel_up1.add(Label_up2);
		panel_up1.setLayout(new BorderLayout());
		
		ImageIcon image400 = new ImageIcon("a2up.jpg");
		Label_up4.setIcon(image400);
		Label_up4.setBounds(0,0,250,200);
		Label_up4.setVisible(true);
		
		panel_up12.setBounds(250,0,250,200);
		panel_up12.add(save_btn);
		panel_up12.add(Label_up4);
		panel_up12.setVisible(false);
		
		panel_up12.setLayout(new BorderLayout());
		
		ImageIcon image300 = new ImageIcon("a4up.jpg");
		Label_up3.setIcon(image300);
		Label_up3.setBounds(0,0,500,200);
		
		panel_up2.setBackground(new Color(152,56,26));
		panel_up2.setBounds(500,0,500,200);
		panel_up2.add(text);
		panel_up2.add(search_btn);
		panel_up2.setVisible(true);
		panel_up2.add(Label_up3);
		panel_up2.setLayout(new BorderLayout());
		
		panel_main.setLayout(new BorderLayout());
		panel_main.setVisible(true);
		panel_main.setBackground(new Color(100,58,29));
		panel_main.setBounds(0,200,1000,900);
		panel_main.add(table_doctor);
		
		
		ImageIcon image1 = new ImageIcon("backpatient.png");
		label_back.setIcon(image1);
	 	label_back.setBounds(0,0,1000,800);
		
		
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
			all_btn.setVisible(false);
			refresh_btn.setVisible(true);
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
		panel_up1.setVisible(false);
		panel_up2.setVisible(false);
	
				
			}
			else {
				panel_up1.setVisible(false);
				panel_up2.setVisible(false);
				panel_up2.setVisible(false);
				panel_up12.setVisible(true);
			}
				
			}
		else if(e.getSource()==update_btn) {
			search_btn.setVisible(true);
			text.setVisible(true);
			all_btn.setVisible(false);
			refresh_btn.setVisible(true);
			panel_up2.setVisible(true);
			panel_up.setVisible(true);
			panel_up1.setVisible(false);
			panel_up12.setVisible(true);
			Label_up4.setVisible(true);
		
		}
		else if(e.getSource()==search_btn) {
			if(text.getText().equals("")) {
				
				JOptionPane.showMessageDialog(frame,"Field Empty! please enter required Name");
				
			}
			clicked++;
			if(clicked ==1) {
			long countlong =0;
			String query = "Select * from doc where first_name = '"+text.getText()+"' ";
				dbOperation1 db1 = new dbOperation1();
				ResultSet rs = db1.select(query);
				
				
				try {

					for ( ;rs.next();) {
						countlong = rs.getLong(1);
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
		}
				else if(e.getSource()==save_btn) {
					
					int a=doctor_table.getSelectedRow();
					int b= doctor_table.getSelectedColumn();
					 String c =  doctor_table.getModel().getValueAt(a, b).toString();
						
					String query = "delete from doc where doc_id = '"+c+"'";
					dbOperation1 db1 = new dbOperation1();
					int ans = db1.delete(query);
					
					if (ans>0) {
							JOptionPane.showMessageDialog(panel_main, "delete successfully");
						
					}
					}
				else if(e.getSource()==refresh_btn) {
					 DefaultTableModel dm = (DefaultTableModel) doctor_table.getModel();
					 dm.getDataVector().removeAllElements();
					 dm.fireTableChanged(null);
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
	
		
	
public static void main (String [] args) {
	new update_doc();
}





	








@Override
public void mouseClicked(MouseEvent e) {

	 row = doctor_table.rowAtPoint(e.getPoint());
	 column = doctor_table.columnAtPoint(e.getPoint());
	 return;
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
}