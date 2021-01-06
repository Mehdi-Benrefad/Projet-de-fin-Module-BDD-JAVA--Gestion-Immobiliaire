
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
 
public class paneau_arriereplan extends JPanel {
  public void paintComponent(Graphics g){
    try {
      Image img = ImageIO.read(new File("ressources\\arriereplan.jpg"));
     /* g.drawImage(img, 0, 0, this);*/
      //Pour une image de fond
      g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    } catch (IOException e) {
      e.printStackTrace();
      
     
      
     
    }                
  }               
}









