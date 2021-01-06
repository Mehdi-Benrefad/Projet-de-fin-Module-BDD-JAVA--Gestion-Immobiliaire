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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import methodes.methodes;
import methodes.terrain;
import methodes.villa;

import javax.swing.JFrame;

public class listeterrain extends JDialog{
	
	public listeterrain(JFrame g,String title,boolean a) throws Exception {
		
		super(g,title,a);
		this.setSize(500,300);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	    this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	    
	    ArrayList<terrain> tab1=new ArrayList<terrain>();
	    tab1=methodes.liste_des_terrains();
	    Object [][] data = new Object[tab1.size()][9] ;
		 
		  for(int i=0;i<tab1.size();i++) 
		  {
			  for(int j=0;j<5;j++) 
			  {
				  switch(j) 
				  {
				  case 0 : data[i][j]=tab1.get(i).getPrix();
				  break;
				  case 1 : data[i][j]=(String)tab1.get(i).getAdresse();
				  break;
				  case 2 : data[i][j]=(String)tab1.get(i).getVille();
				  break;
				  case 3 :data[i][j]=(String)tab1.get(i).getSuperficie();
				  break;
				  case 4 : data[i][j]=(String)tab1.get(i).getType();
				  break;
				 
				 
				  }
			  }
		  }
		  
		  
		  String titre[]={"prix","Adresse","ville","superficie","Type" };
		  JTable tabRes = new JTable(data,titre);
	    
	   
	    
	    this.add(new JScrollPane(tabRes));
		this.setVisible(true);
	}
}