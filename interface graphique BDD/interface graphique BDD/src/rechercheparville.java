import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class rechercheparville extends JDialog{
	
	JPanel ty1=new JPanel();
	
	JLabel ville=new JLabel("etrer la ville");
	
	
	JTextField villeselect =new JTextField("casa",10);
	
	JButton continuer =new JButton("continuer");
	
	paneau_arriereplan co =new paneau_arriereplan();
	
	public rechercheparville(JFrame g,String title,boolean a) throws Exception {
		
		super(g,title,a);
		this.setSize(500,300);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	    this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	    
	    
	    ty1.add(ville);
	    ty1.add(villeselect);
	    
	   continuer.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent arg0) {
			   String s=villeselect.getText();
			   try {
				new listerechercheparville(null,"Liste de la recherche par ville", true,s);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }

	   });
	    
	    co.add(ty1);
	    co.add(continuer);
	    this.add(co);
	    
		this.setVisible(true);
	}
}
