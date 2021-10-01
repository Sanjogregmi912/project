import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;



public class filechooser  implements ActionListener{
	JLabel label = new JLabel("no file selected");
	JFrame frame = new JFrame("File Choose");
	JButton save_btn = new JButton("save");
	JButton add_btn = new JButton("Open");
	JPanel panel =new JPanel();
	JFileChooser f1 = new JFileChooser(); 
	
	filechooser(){

		

		
		
		
		
		save_btn.setBounds(150,10,100,30);
		save_btn.addActionListener(this);
		
		add_btn.setBounds(10,10,100,30);
		add_btn.addActionListener(this);
		
		
		label.setBounds(150,100,300,40);
		
		
		panel.add(add_btn);
		panel.add(save_btn);
		panel.add(label);
		panel.setBounds(0,0,400,400);
		panel.setVisible(true);
		panel.setLayout( new BorderLayout());

	
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.add(panel);
	}
		
		
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == save_btn) {
			JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
			j.setAcceptAllFileFilterUsed(false);
			j.setDialogTitle("select a .pdf file");
			FileNameExtensionFilter  restrict  = new FileNameExtensionFilter("Only .pdf files", "pdf");
			j.addChoosableFileFilter(restrict);
			
			int r = j.showSaveDialog(null);
			if(r == JFileChooser.APPROVE_OPTION ) {
				 label.setText(j.getSelectedFile().getAbsolutePath());
			}
			else
				label.setText("the user cancelled the operation");
			
		}
		else if(e.getSource() == add_btn) {
			 JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
			 j.setAcceptAllFileFilterUsed(false);
			  j.setDialogTitle("Select a .pdf file");
	            FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only .pdf files", "pdf");
	            j.addChoosableFileFilter(restrict);
	            int r = j.showOpenDialog(null);
	            // if the user selects a file
	            if (r == JFileChooser.APPROVE_OPTION) {
	                // set the label to the path of the selected file
	                label.setText(j.getSelectedFile().getAbsolutePath());
	            }
	            // if the user cancelled the operation
	            else
	                label.setText("the user cancelled the operation");
	        }
	            
		}
		
	
	public static void main(String [] args) {
		new filechooser();
	}
	}


