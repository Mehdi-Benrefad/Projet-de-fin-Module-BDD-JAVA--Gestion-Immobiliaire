
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MenuInterface extends JFrame {

	paneau_arriereplan co =new paneau_arriereplan();
	
	JMenuBar menuadmin=new JMenuBar();
	public MenuInterface() {

		JMenu admin=new JMenu("ADMIN");
		JMenuItem seconnecter=new JMenuItem("Se Connecter");
		admin.add(seconnecter);
		menuadmin.add(admin);
		this.setJMenuBar(menuadmin);
		
		admin.setMnemonic('A');
		seconnecter.setMnemonic('Z');
		
		seconnecter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new LoginPasswordAdmin(null,"Connection Admin",true);
				
			}
		});
		
		
		setTitle("MENU");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1260,680);
		
		 GridLayout gl=new GridLayout(4,2);
	      gl.setHgap(5);
	      gl.setVgap(5);
	      co.setLayout(gl);
	   	this.setLayout(new BorderLayout());
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					new rechercheparcategorie(null,"Recherche par categorie",true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		lblNewLabel.setIcon(new ImageIcon("ressources\\rechercheparcategorie.png"));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
		co.add(lblNewLabel);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					new rechercheparville(null,"Recherche par ville",true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon("ressources\\rechercheparville.png"));
		lblNewLabel_1.setHorizontalAlignment(JLabel.CENTER);
		co.add(lblNewLabel_1);
		
		JLabel lblcat = new JLabel("Recherche par categorie");
		lblcat.setForeground(new Color(153, 0, 51));
		lblcat.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 18));
		lblcat.setHorizontalAlignment(JLabel.CENTER);
		co.add(lblcat);
		
		JLabel lblville = new JLabel("Recherche par ville");
		lblville.setForeground(new Color(153, 0, 51));
		lblville.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 18));
		lblville.setBounds(201, 381, 111, 27);
		lblville.setHorizontalAlignment(JLabel.CENTER);
		co.add(lblville);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					new rechercheparprix(null,"echerche par prix",true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon("ressources\\rechercheparprix.png"));
	//	lblNewLabel_2.setBounds(912, 40, 161, 171);
		lblNewLabel_2.setHorizontalAlignment(JLabel.CENTER);
		co.add(lblNewLabel_2);
		
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					new recherchepersonnalisee(null,"Recherche personnslisee",true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon("ressources\\personnalisee.png"));
	//	lblNewLabel_3.setBounds(191, 235, 160, 170);
		lblNewLabel_3.setHorizontalAlignment(JLabel.CENTER);
		co.add(lblNewLabel_3);
		
		JLabel lblprix = new JLabel("Recherche par Prix");
		lblprix.setForeground(new Color(153, 0, 51));
		lblprix.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 18));
		lblprix.setHorizontalAlignment(JLabel.CENTER);
		co.add(lblprix);
		
		JLabel lblpers = new JLabel("Recherche Personnalisee");
		lblpers.setForeground(new Color(153, 0, 51));
		lblpers.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 18));
		lblpers.setHorizontalAlignment(JLabel.CENTER);
		co.add(lblpers);
		
	
		
		this.add(co,BorderLayout.CENTER);
		
		this.setVisible(true);
	}
	
	
	
	public static void main(String[] args) throws UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		
				try {
					MenuInterface frame = new MenuInterface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			
	}
}
