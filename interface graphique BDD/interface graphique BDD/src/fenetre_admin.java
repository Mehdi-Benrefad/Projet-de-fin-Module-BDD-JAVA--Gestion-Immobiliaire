

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class fenetre_admin extends JDialog{
	
	
	public fenetre_admin(JFrame g,String title,boolean a) {
		super(g,title,a);
		this.setSize(new Dimension(800,500));
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.setLayout(new GridLayout(4,4,5,5));
		
		String titre[]= {"inserer villa","inserer maison","inserer appartement","inserer terrain","modifier villa","modifier maisoon","modifier appartement","modifier terrain","supprimer villa","supprimer maison","supprimer appartement","supprimer terrain"};
		JButton tableButtons[]=new JButton[titre.length];
		
		for(int i=0;i<tableButtons.length;i++) 
		{
			
			tableButtons[i]=new JButton(titre[i]);
		}
		
		
		for(int i=0;i<tableButtons.length;i++) 
		{
			this.add(tableButtons[i]);
		}
		
		
		
		tableButtons[0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				try {
					new inservilla(null,"insertion de la nouvelle villa",true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		});
		
		tableButtons[1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				try {
					new insermaison(null,"Iinsertion de la nouvelle maison",true);
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		});
		
		tableButtons[2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				new inserappartement(null,"Insertion de la nouvelle appartement",true);
				
			}
			
		});
		
		tableButtons[3].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
			
				try {
					new inserterrain(null,"Insertion du nouveau terrain",true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
		
		tableButtons[4].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					new modifvilla(null,"Modification villa",true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
		
		tableButtons[5].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					new modifmaison(null,"Modification maison",true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
		
		tableButtons[6].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					new modifappartement(null,"Modification apprtement",true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
		
		tableButtons[7].addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					new modifterrain(null,"Modification terrain",true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			
		});
		
		tableButtons[8].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					new suppressionvilla(null,"Supression Villa",true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			
		});
		
		tableButtons[9].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					new suppressionmaison(null,"Suppression Maison",true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			
		});
		
		tableButtons[10].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					new suppressionappartement(null,"Suppression appartement",true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
		
		tableButtons[11].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					new suppressionterrain(null,"Suppression Terrain",true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			
		});
		
		
		this.setVisible(true);
	}
}
