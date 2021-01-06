import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
public class rechercheparcategorie extends JDialog{
	
	
	paneau_arriereplan co =new paneau_arriereplan();
	
	public rechercheparcategorie(JFrame g,String title,boolean a) throws Exception {
		
		super(g,title,a);
		this.setSize(1260,680);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	    this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	  
	    
	    GridLayout gl=new GridLayout(4,2);
	      gl.setHgap(5);
	      gl.setVgap(5);
	      co.setLayout(gl);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					new listevilla(null,"Liste des villas",true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print("click");
			}
		});
		lblNewLabel.setIcon(new ImageIcon("ressources\\villa.png"));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
		co.add(lblNewLabel);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					new listemaison(null,"Liste des maisons",true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon("ressources\\maison.png"));
		lblNewLabel_1.setHorizontalAlignment(JLabel.CENTER);
		co.add(lblNewLabel_1);
		
		JLabel lblvilla = new JLabel("villa");
		lblvilla.setForeground(new Color(153, 0, 51));
		lblvilla.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 18));
		lblvilla.setHorizontalAlignment(JLabel.CENTER);
		co.add(lblvilla);
		
		JLabel lblmaison = new JLabel("maison");
		lblmaison.setForeground(new Color(153, 0, 51));
		lblmaison.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 18));
		lblmaison.setBounds(201, 381, 111, 27);
		lblmaison.setHorizontalAlignment(JLabel.CENTER);
		co.add(lblmaison);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					new listeappartement(null,"Liste des appartements",true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon("ressources\\appartement.png"));
		lblNewLabel_2.setBounds(912, 40, 161, 171);
		lblNewLabel_2.setHorizontalAlignment(JLabel.CENTER);
		co.add(lblNewLabel_2);
		
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					new listeterrain(null,"Liste des terrains",true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon("ressources\\terrain.png"));
		lblNewLabel_3.setBounds(191, 235, 160, 170);
		lblNewLabel_3.setHorizontalAlignment(JLabel.CENTER);
		co.add(lblNewLabel_3);
		
		JLabel lblappt = new JLabel("appartement");
		lblappt.setForeground(new Color(153, 0, 51));
		lblappt.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 18));
		lblappt.setHorizontalAlignment(JLabel.CENTER);
		co.add(lblappt);
		
		JLabel lblterrain = new JLabel("terrain");
		lblterrain.setForeground(new Color(153, 0, 51));
		lblterrain.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 18));
		lblterrain.setHorizontalAlignment(JLabel.CENTER);
		co.add(lblterrain);
		
		
		this.setLayout(new BorderLayout());
		this.add(co,BorderLayout.CENTER);
		
		this.setVisible(true);
	}
}
