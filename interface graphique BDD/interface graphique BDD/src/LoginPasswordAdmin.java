import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPasswordAdmin extends JDialog{
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	paneau_arriereplan p=new paneau_arriereplan();
	loginpassconn q=new loginpassconn();
	
	public LoginPasswordAdmin(JFrame g,String title,boolean a) {
		 
		super(g,title,true);
		this.setSize(new Dimension(435,275));
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.setModal(false);
	
	JTextField login = new JTextField();
	login.setPreferredSize(new Dimension(129,34));
	
	JPasswordField pass = new JPasswordField();
	pass.setPreferredSize(new Dimension(129,34));
	
	JButton btnconnec = new JButton(" Se Connecter ");
	
	
	btnconnec.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			new fenetre_admin(null,"Fenetre Admin",true);
			dispose();
		}
	});
	
	
	
	JLabel lb1 = new JLabel("Saisissez votre Login       :");
	JLabel lb2 = new JLabel("Saisissez votre mot de passe:");
	
	p1.add(lb1);
	p1.add(login);
	
	p2.add(lb2);
	p2.add(pass);
	
	p.add(p1);
	p.add(p2);
	q.add(btnconnec);
	p.add(q);
	
	this.add(p);
	this.setVisible(true);
	}
}
