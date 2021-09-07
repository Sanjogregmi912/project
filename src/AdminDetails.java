import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;



public class AdminDetails implements ActionListener {
    public static void main(String[] args) {
        JPanel AdminDetails_panel = new JPanel();

        JFrame frame = new JFrame("Admin Details");

        JLabel firstname_label = new JLabel();
        JLabel lastname_label = new JLabel();
        JLabel age_label = new JLabel();
        JLabel address_label = new JLabel();
        JLabel email_label = new JLabel();
        JLabel contact_label = new JLabel();
        JLabel adminid_label = new JLabel();
        JLabel username_label = new JLabel();
        JLabel password_label = new JLabel();

        JTextField firstname = new JTextField();
        JTextField lastname = new JTextField();
        JTextField age = new JTextField();
        JTextField address = new JTextField();
        JTextField contact = new JTextField();
        JTextField adminid = new JTextField();
        JTextField username = new JTextField();
        JTextField search = new JTextField();
        JTextField email = new JTextField();
        JPasswordField password = new JPasswordField();


        JButton update = new JButton("Update");
      


        new AdminDetails();{





            adminid_label.setBounds(40, 70, 100, 50);
            adminid_label.setText("Admin ID: ");

            adminid.setBounds(120, 80, 200, 30);


            firstname_label.setBounds(40, 120, 100, 50);
            firstname_label.setText("First Name:");

            firstname.setBounds(120, 130, 200, 30);


            lastname_label.setBounds(40, 170,100,50);
            lastname_label.setText("Last Name:");

            lastname.setBounds(120, 180, 200, 30);

            age_label.setBounds(40, 220, 100, 50);
            age_label.setText("Age:");

            age.setBounds(120, 230, 200, 30);

            address_label.setBounds(40, 270, 100, 50);
            address_label.setText("Address:");

            address.setBounds(120, 280, 200, 30);

            email_label.setBounds(40, 320, 100, 50);
            email_label.setText("Email:");

            email.setBounds(120, 330, 200, 30);


            contact_label.setBounds(40, 370, 300, 50);
            contact_label.setText("Contact:");

            contact.setBounds(120, 380, 200, 30);


            username_label.setBounds(40, 420, 300, 50);
            username_label.setText("Username  :");

            username.setBounds(120, 430, 200, 30);



            password_label.setBounds(40, 470, 300, 50);
            password_label.setText("Password :");

            password.setBounds(120, 480, 200, 30);

            update.setBounds(240, 580, 200, 30);
            
            

            
            update.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String firstName = firstname.getText();
                    String lastName = lastname.getText();
                    String Search = search.getText();
                    int Age = Integer.parseInt(age.getText());
                    age.setText(Integer.toString(Age));
                    String Address = address.getText();
                    String Contact = contact.getText();
                    String Adminid = (String) adminid.getText();
                    String Username = username.getText();
                    String Password = password.getText();
                    String age_VALIDATE = age.getText();
                    String validateall[] = new String[9];
                    validateall[1] = firstName;
                    validateall[2] = lastName;
                    validateall[3] = age_VALIDATE;
                    validateall[4] = Address;
                    validateall[6] = Contact;
                    validateall[7] = Adminid;
                    validateall[8] = Username;
                    validateall[9] = Search;

                }
            });


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

            mydetails_panel.add(firstname);
            mydetails_panel.add(lastname);
            mydetails_panel.add(search);
            mydetails_panel.add(age);
            mydetails_panel.add(address);
            mydetails_panel.add(email);
            mydetails_panel.add(contact);
            mydetails_panel.add(adminid);
            mydetails_panel.add(username);
            mydetails_panel.add(password);

            mydetails_panel.add(update);
            

            AdminDetails_panel.setBounds(0, 0, 1000, 800);
            AdminDetails_panel.setLayout(new BorderLayout());

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1000, 800);
            frame.setVisible(true);
            frame.setLayout(null);
            frame.add(AdminDetails_panel);
            frame.setLayout(new BorderLayout());


        }

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

