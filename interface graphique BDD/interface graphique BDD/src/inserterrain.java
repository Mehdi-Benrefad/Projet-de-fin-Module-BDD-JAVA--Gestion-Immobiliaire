import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import methodes.*;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class inserterrain extends JDialog{
	
	public inserterrain(JFrame g,String title,boolean a) {
		super(g,title,a);
		this.setSize(new Dimension(800,300));
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		paneau_arriereplan p=new paneau_arriereplan();
		p.setLayout(new GridLayout(6,2,5,5));
		
		
		
		//JLabels
		JLabel prix=new JLabel("           Prix");
		JLabel ville=new JLabel("           ville");
		JLabel superficie=new JLabel("           superficie");
		JLabel adresse=new JLabel("           adresse");
		JLabel type =new JLabel("           type");
		
		
		//JTextFiels
		
		JTextField prixselect =new JTextField();
		JTextField villeselect =new JTextField();
		JFormattedTextField superficieselect =new JFormattedTextField(NumberFormat.getIntegerInstance());
		JTextField adresseselect =new JTextField();
		JTextField typeselect =new JTextField();
		
		
		
		
		//bouton inserer
				JButton inserer=new JButton("inserer");
				inserer.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						try {
						double pr=(double)Integer.parseInt(prixselect.getText());
						String vi=villeselect.getText();
						String su=superficieselect.getText();
						String ad=adresseselect.getText();
						String ty=typeselect.getText();
						
							methodes.inserer_dans_terrain((float) pr,ad,vi,su,ty);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							JOptionPane error=new JOptionPane();
							error.showMessageDialog(null,"veuillez inserer des donnees valides","ERREUR!", JOptionPane.ERROR_MESSAGE);
						}
						
					}
				});
		
		
		
		
		p.add(prix);
		p.add(prixselect);
		p.add(ville);
		p.add(villeselect);
		p.add(superficie);
		p.add(superficieselect);
		p.add(adresse);
		p.add(adresseselect);
		p.add(type);
		p.add(typeselect);
		p.add(inserer);
		
		
		this.add(p);
		this.setVisible(true);
		
	}

}
