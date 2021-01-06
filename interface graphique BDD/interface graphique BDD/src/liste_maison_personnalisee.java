import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import methodes.appartement;
import methodes.maison;
import methodes.methodes;
import methodes.terrain;
import methodes.villa;

import javax.swing.JFrame;

public class liste_maison_personnalisee extends JDialog{
	
	double x;
	double y;
	String s;
	
	
	public liste_maison_personnalisee(JFrame g,String title,boolean a,double x,double y,String s) throws Exception {
		
		super(g,title,a);
		this.x=x;
		this.y=y;
		this.s=s;
		
		
		this.setSize(500,300);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	    this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	    
	    
	    	
	    	
	    	//liste des maisons
		    ArrayList<maison> tab2=new ArrayList<maison>();
		    tab2=methodes.liste_des_maisons_personnalisee(x,y,s);
		    Object [][] data2 = new Object[tab2.size()][9] ;
			 
			  for(int i=0;i<tab2.size();i++) 
			  {
				  for(int j=0;j<9;j++) 
				  {
					  switch(j) 
					  {
					  case 0 : data2[i][j]=(Double)tab2.get(i).getPrix();
					  break;
					  case 1 : data2[i][j]=(String)tab2.get(i).getVille();
					  break;
					  case 2 : data2[i][j]=(String)tab2.get(i).getSuperficie();
					  break;
					  case 3: data2[i][j]=(String)tab2.get(i).getAdresse();
					  break;
					  case 4 :data2[i][j]=(int)tab2.get(i).getNbrechambres();
					  break;
					  case 5 : data2[i][j]=(int)tab2.get(i).getNbreetages();
					  break;
					  case 6 : data2[i][j]=(int)tab2.get(i).getNbrecuisines();
					  break;
					  case 7 : data2[i][j]=(int)tab2.get(i).getNbrebains();
					  break;
					  case 8 : data2[i][j]=(int)tab2.get(i).getNbretoilettes();
					  break;
					 
					  }
				  }
			  }
			  
			  
			  String titre2[]={"prix","ville","superficie","Adresse","nombre de chambres","nombre d etages","nombre de cuisines","nombre de bains","nombre de toilletes" };
			  JTable tabRes2 = new JTable(data2,titre2);
		    
		    this.add(new JScrollPane(tabRes2));
	   
		this.setVisible(true);
	}
}
