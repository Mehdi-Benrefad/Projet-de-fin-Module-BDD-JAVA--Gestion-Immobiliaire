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

public class liste_terrain_personnalisee extends JDialog{
	
	double x;
	double y;
	String s;
	
	public liste_terrain_personnalisee(JFrame g,String title,boolean a,double x,double y,String s) throws Exception {
		
		super(g,title,a);
		this.x=x;
		this.y=y;
		this.s=s;
		
		this.setSize(500,300);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	    this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	    
	   
	    	
	    	//liste des terrains
		    ArrayList<terrain> tab4=new ArrayList<terrain>();
		    tab4=methodes.liste_des_terrains_personnalisee(x,y,s);
		    Object [][] data4 = new Object[tab4.size()][9] ;
			 
			  for(int i=0;i<tab4.size();i++) 
			  {
				  for(int j=0;j<5;j++) 
				  {
					  switch(j) 
					  {
					  case 0 : data4[i][j]=tab4.get(i).getPrix();
					  break;
					  case 1 : data4[i][j]=(String)tab4.get(i).getAdresse();
					  break;
					  case 2 : data4[i][j]=(String)tab4.get(i).getVille();
					  break;
					  case 3 :data4[i][j]=(String)tab4.get(i).getSuperficie();
					  break;
					  case 4 : data4[i][j]=(String)tab4.get(i).getType();
					  break;
					 
					 
					  }
				  }
			  }
			  
			  
			  String titre4[]={"prix","Adresse","ville","superficie","Type" };
			  JTable tabRes4 = new JTable(data4,titre4);
		    
		   
		    
		    this.add(new JScrollPane(tabRes4));
	    	
		this.setVisible(true);
	}
}
