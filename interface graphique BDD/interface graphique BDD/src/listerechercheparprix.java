import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import methodes.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import methodes.appartement;
import methodes.maison;
import methodes.methodes;
import methodes.terrain;
import methodes.villa;

import javax.swing.JFrame;

public class listerechercheparprix extends JDialog{
	double x;
	double y;
	
	public listerechercheparprix(JFrame g,String title,boolean a,double x,double y) throws Exception {
		
		super(g,title,a);
		this.x=x;
		this.y=y;
		this.setSize(1000,500);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	    this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	    
	    JTabbedPane onglet=new JTabbedPane();
	    
	  //Liste des villas 
	    ArrayList<villa> tab1=new ArrayList<villa>();
	    tab1=methodes.liste_des_villas_par_prix(x,y);
	    Object [][] data = new Object[tab1.size()][9] ;
		 
		  for(int i=0;i<tab1.size();i++) 
		  {
			  for(int j=0;j<9;j++) 
			  {
				  switch(j) 
				  {
				  case 0 : data[i][j]=(Double)tab1.get(i).getPrix();
				  break;
				  case 1 : data[i][j]=(String)tab1.get(i).getVille();
				  break;
				  case 2 : data[i][j]=(String)tab1.get(i).getSuperficie();
				  break;
				  case 3: data[i][j]=(String)tab1.get(i).getAdresse();
					  break;
				  case 4 :data[i][j]=(int)tab1.get(i).getNbrechambres();
				  break;
				  case 5 : data[i][j]=(int)tab1.get(i).getNbreetages();
				  break;
				  case 6 : data[i][j]=(int)tab1.get(i).getNbrecuisines();
				  break;
				  case 7 : data[i][j]=(int)tab1.get(i).getNbrebains();
				  break;
				  case 8 : data[i][j]=(int)tab1.get(i).getNbretoilettes();
				  break;
				 
				  }
			  }
		  }
		  
		  
		  String titre[]={"prix","ville","superficie","Adresse","nombre de chambres","nombre d etages","nombre de cuisines","nombre de bains","nombre de toilletes" };
		  JTable tabRes = new JTable(data,titre);
		  
		  JPanel A=new JPanel();
		  A.add(new JScrollPane(tabRes));
		  onglet.add("Liste des villas ",A);
	  //  this.add(tabRes);
	    /***************************************/
	    
	    
	    //liste des maisons
	    ArrayList<maison> tab2=new ArrayList<maison>();
	    tab2=methodes.liste_des_maisons_par_prix(x,y);
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
		  
		  
		  JPanel B=new JPanel();
		  B.add(new JScrollPane(tabRes2));
		  onglet.add("Liste des maisons ",B);
	  //  this.add(tabRes2);
	    /***************************************/
	    
	    
	    //liste des appartements
	    ArrayList<appartement> tab3=new ArrayList<appartement>();
	    tab3=methodes.liste_des_appartements_par_prix(x,y);
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
		  
		  JPanel C=new JPanel();
		  C.add(new JScrollPane(tabRes3));
		  onglet.add("Liste des appartements ",C);

		//    this.add(tabRes3);
	    
	    
	    /***************************************/
		    
		    //liste des terrains
		    ArrayList<terrain> tab4=new ArrayList<terrain>();
		    tab4=methodes.liste_des_terrains_par_prix(x,y);
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
		    
		   
			  
			  JPanel D=new JPanel();
			  D.add(new JScrollPane(tabRes4));
			  onglet.add("Liste des terrains ",D);
	//	    this.add(tabRes4);
		    
		    
		/**************************************/
			  
		
		
		this.add(onglet);
		
		this.setVisible(true);
	}
}