
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
        home.setVisible(true);
        home.setTitle(LojaDepartamento.getNomeLoja());
//        
//        ArrayList<Usuario> users = Serializacao.read(LojaDepartamento.getConfiguracao().getArquivoUsuarios());
//        
//        for(Usuario i: users) System.out.println(i);
    }
}
