
package loja;

//import java.util.ArrayList;
import javax.swing.ImageIcon;
import model.LojaDepartamento;
import view.IUHome;

/**
 *
 * @author karol
 */
public class Main {
    
    public static void main(String[] args){
        IUHome home = new IUHome();
        ImageIcon img = new ImageIcon("./src/view/assets/loja.png");
        home.setIconImage(img.getImage());
        home.setLocationRelativeTo(null);
        home.setTitle(LojaDepartamento.getNomeLoja());
        home.setVisible(true);
        
    }
}
