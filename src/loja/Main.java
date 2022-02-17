
package loja;

//import java.util.ArrayList;
import model.LojaDepartamento;
//import model.Usuario;
//import serializacao.Serializacao;

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
        
    }
}
