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

public class liste_appartement_personalisee extends JDialog{
	
	double x;
	double y;
	String s;
	
	public liste_appartement_personalisee(JFrame g,String title,boolean a,double x,double y,String s) throws Exception {
		
		super(g,title,a);
		this.x=x;
		this.y=y;
		this.s=s;

		
		this.setSize(500,300);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	    this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	    	
	    	//liste des appartements
		    ArrayList<appartement> tab3=new ArrayList<appartement>();
		    tab3=methodes.liste_des_appartements_personnalisee(x,y,s);
		    Object [][] data3 = new Object[tab3.size()][9] ;
			 
			  for(int i=0;i<tab3.size();i++) 
			  {
				  for(int j=0;j<9;j++) 
				  {
					  switch(j) 
					  {
					  case 0 : data3[i][j]=(Double)tab3.get(i).getPrix();
					  break;
					  case 1 : data3[i][j]=(String)tab3.get(i).getVille();
					  break;
					  case 2 : data3[i][j]=(String)tab3.get(i).getSuperficie();
					  break;
					  case 3: data3[i][j]=(String)tab3.get(i).getAdresse();
					  break;
					  case 4 :data3[i][j]=(int)tab3.get(i).getNbrechambres();
					  break;
					  case 5 : data3[i][j]=(int)tab3.get(i).getNumeetage();
					  break;
					  case 6 : data3[i][j]=(int)tab3.get(i).getNbrecuisines();
					  break;
					  case 7 : data3[i][j]=(int)tab3.get(i).getNbrebains();
					  break;
					  case 8 : data3[i][j]=(int)tab3.get(i).getNbretoilettes();
					  break;
					 
					  }
				  }
			  }
			  
			  
			  String titre3[]={"prix","ville","superficie","Adresse","nombre de chambres","numero d etages","nombre de cuisines","nombre de bains","nombre de toilletes" };
			  JTable tabRes3 = new JTable(data3,titre3);

			    this.add(new JScrollPane(tabRes3));
		    
	    	

		this.setVisible(true);
	}
}
