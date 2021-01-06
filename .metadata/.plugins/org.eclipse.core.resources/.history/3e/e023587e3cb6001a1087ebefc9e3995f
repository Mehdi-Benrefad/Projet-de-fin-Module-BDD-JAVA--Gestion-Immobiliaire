import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;


public class recherchepersonnalisee extends JDialog{
	
	JPanel ty4=new JPanel();
	JLabel categorie=new JLabel("entrer la categorie immobiliere:");
	JTextField cat =new JTextField("villa",20);
	
	JPanel ty2=new JPanel();
	JLabel min=new JLabel("etrer le prix minimum:");
	JTextField prixmin =new JTextField("100",20);
	
	JPanel ty3=new JPanel();
	JLabel max=new JLabel("entrer le prix maxixum:");
	JTextField prixmax =new JTextField("100000",20);
	
	JPanel ty1=new JPanel();
	JLabel ville=new JLabel("etrer la ville  :");
	JTextField villeselect =new JTextField("casa",10);
	
	JButton continuer =new JButton("continuer");
	
	paneau_arriereplan co =new paneau_arriereplan();
	
	public recherchepersonnalisee(JFrame g,String title,boolean a) throws Exception {
		
		super(g,title,a);
		this.setSize(500,300);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	    this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	    
	    continuer.addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent arg0) {
				   try {
					   double x,y;
					   String s=villeselect.getText();
					   String t=categorie.getText();
					   x=(double)Integer.parseInt(prixmin.getText());
					   y=(double)Integer.parseInt(prixmax.getText());;
				//	new listerecherchepersonnalisee(null,"Liste de la recherche personnalisee", true,x,y,s,t);
					
					if(t=="villa") {
						new liste_villa_personnalisee(null,"Liste des villas de la recherche personnalisee", true,x,y,s);
					}
					
					else if(t=="maison"){
						new liste_maison_personnalisee(null,"Liste des maisons de la recherche personnalisee", true,x,y,s);
					}
					else if(t=="appartement") {
						new liste_appartement_personalisee(null,"Liste des appartements de la recherche personnalisee", true,x,y,s);
					}
					else if(t=="terrain") {
						new liste_terrain_personnalisee(null,"Liste des terrains de la recherche personnalisee", true,x,y,s);
					}
					else {
						JOptionPane jop=new JOptionPane();
				    	jop.showMessageDialog(null, "CHOIX DE CATEGORIE INVALIDE","CHOIX DE CATEGORIE INVALIDE",JOptionPane.ERROR_MESSAGE);
					}
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					JOptionPane error=new JOptionPane();
					error.showMessageDialog(null,"veuillez inserer des donnees valides","ERREUR!", JOptionPane.ERROR_MESSAGE);
				}
			   }
	    });
	    
	    ty1.add(ville);
	    ty1.add(villeselect);
	    
	   ty2.add(min);
	   ty2.add(prixmin);
	   
	   ty3.add(max);
	   ty3.add(prixmax);
	   
	   ty4.add(categorie);
	   ty4.add(cat);
	    
	    co.add(ty1);
	    co.add(ty2);
	    co.add(ty3);
	    co.add(ty4);
	    co.add(continuer);
	    
	    this.add(co);
	    
		this.setVisible(true);
	}
}
