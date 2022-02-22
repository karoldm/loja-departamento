
package loja;

//import java.util.ArrayList;
import controller.ControladorVendas;
import model.LojaDepartamento;
import view.IUHome;

/**
 *
 * @author karol
 */
public class Main {
    
    public static void main(String[] args){
        IUHome home = new IUHome();
        home.setLocationRelativeTo(null);
        home.setTitle(LojaDepartamento.getNomeLoja());
        home.setVisible(true);
        
//        ControladorVendas controller = new ControladorVendas();;
//        System.out.println(controller.getVendas());
    }
}
