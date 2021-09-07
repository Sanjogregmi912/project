import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class mainpage implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel =new JPanel();
	JLabel label_back = new JLabel();
	JLabel label_admin = new JLabel();
	JLabel label_doc = new JLabel();
	JLabel label_patient = new JLabel();
	JLabel label_choose = new JLabel();
	JButton admin_button = new JButton("Admin");
	JButton doc_button = new JButton("Doctor");
	JButton patient_button = new JButton("Patient");
 mainpage(){
		admin_button.setBounds(1200,240,200,40);
		admin_button.setFocusable(false);
		admin_button.setVisible(true);
		admin_button.setBorder(new EtchedBorder(10));
		admin_button.setForeground(Color.blue);
		admin_button.setBackground(Color.white);
		admin_button.addActionListener( this);
		
		doc_button.setBounds(1200,510,200,40);
		doc_button.setFocusable(false);
		doc_button.setVisible(true);
		doc_button.setBorder(new EtchedBorder(10));
		doc_button.setForeground(Color.blue);
		doc_button.setBackground(Color.white);
		doc_button.addActionListener( this);
		
		patient_button.setBounds(1200,750,200,40);
		patient_button.setFocusable(false);
		patient_button.setVisible(true);
		patient_button.setBorder(new EtchedBorder(10));
		patient_button.setForeground(Color.blue);
		patient_button.setBackground(Color.white);
		patient_button.addActionListener( this);
	 
		ImageIcon image0 = new ImageIcon("pl.png");
		label_choose.setIcon(image0);
	 	label_choose.setBounds(800,100,217,127);
		
		ImageIcon image = new ImageIcon("back12.png");
		label_back.setIcon(image);
	 	label_back.setBounds(0,0,1600,900);
	 	
		ImageIcon image1 = new ImageIcon("admin1.png");
		label_admin.setIcon(image1);
	 	label_admin.setBounds(1200,30,200,200);
	 	
		ImageIcon image12 = new ImageIcon("doc.jpg");
		label_doc.setIcon(image12);
	 	label_doc.setBounds(1200,300,200,200);
	 	
		ImageIcon image123 = new ImageIcon("paitent.jpg");
		label_patient.setIcon(image123);
	 	label_patient.setBounds(1200,550,200,200);
	 	
	 	panel.setBounds(0,0,1600,900);
	 	panel.setVisible(true);
	 	panel.add(patient_button);
	 	panel.add(admin_button);
	 	panel.add(doc_button);
	 	panel.add(label_choose);
	 	panel.add(label_patient);
	 	panel.add(label_doc);
	 	panel.add(label_admin);
	 	panel.add(label_back);
	 	
	 	panel.setLayout(new BorderLayout());
	 	
		ImageIcon image1234 = new ImageIcon("title.jpg");
		frame.setIconImage(image1234.getImage());
		frame.setSize(1600,900);
		frame.setVisible(true);
		frame.setTitle("Hospital Management System");
		frame.add(panel);
		
	
}

public static void main(String args[]) {
	new mainpage();
}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==admin_button) {
		new adminwindow();
	}
	else if (e.getSource()==doc_button) {
		new doctorwindow();
	}
	else if(e.getSource()== patient_button) {
		new paitentwindow();
	}
	
}
}
